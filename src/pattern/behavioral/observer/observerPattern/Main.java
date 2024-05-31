package pattern.behavioral.observer.observerPattern;

public class Main {
    public static void main(String[] args) {

        // 가게 생성
        Store store = new Store();

        // 고객 생성 및 등록
        Customer customer1 = new Customer("010-1111-1111", false);
        Customer customer2 = new Customer("010-2222-2222", true);
        Customer customer3 = new Customer("010-3333-3333", false);
        Customer customer4 = new Customer("010-4444-4444", true);
        Customer customer5 = new Customer("010-5555-5555", true);

        store.registerObserver(customer1);
        store.registerObserver(customer2);
        store.registerObserver(customer3);
        store.registerObserver(customer4);
        store.registerObserver(customer5);

        // 가게에서 신제품 출시 알림
        store.releaseNewProduct("Smartphone");

        // 고객이 너무 진상이라 도중에 알림 보내지 않으려고 옵저버 제외 및 블랙리스트 추가
        store.removeObserver(customer2);

        // 변경사항 모든 옵저버에 적용
        store.notifyObservers("내용이 변경되었어요~~");
        
        // 다시 알림 발송
        store.releaseNewProduct("Tablet");
    }
}
