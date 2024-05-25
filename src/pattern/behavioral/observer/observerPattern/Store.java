package pattern.behavioral.observer.observerPattern;

import pattern.behavioral.observer.unusedObserver2.Customer2;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {
    private List<Observer> observers;
    private static final List<Observer> BLACKLIST = new ArrayList<>();

    public Store() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // removeObserver
        observers.remove(observer);
        
        // 블랙리스트 추가
        BLACKLIST.add(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // 신제품 출시시 알림을 보내는 메서드
    public void releaseNewProduct(String productName) {
        String message = "New product '" + productName + "' is Comming~";
        for (Observer observer : observers) {
            if(observer instanceof Customer) {
                Customer customer = (Customer) observer;

                if(customer.isInterestedInNotifications()) {
                    observer.update(message);
                }
//                }else{
//                    System.out.println("알림 수신 비동의한 고객은 공지하지 않아요~ : " + customer.getPhoneNumber());
//                }
            }

            System.out.println();
        }
    }
}