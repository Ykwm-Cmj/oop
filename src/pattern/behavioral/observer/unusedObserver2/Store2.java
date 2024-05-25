package pattern.behavioral.observer.unusedObserver2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store2 {
    //db에서 긁어온 dto객체배열이라고 가정(final) -> 리스트 변환
    private static final List<Customer2> CUSTOMERS = Arrays.asList(
        new Customer2("010-1234-5678", true),
        new Customer2("010-9876-5432", false), // 알림 수신 여부 N
        new Customer2("010-1111-2222", true),
        new Customer2("010-3333-4444", false)  // 알림 수신 여부 N
    );

    private static final List<Customer2> BLACKLIST = new ArrayList<>();

    // 새로운 제품 출시시 알림 수신을 원하는 고객들에게 알림
    public void notifyCustomers(String product) {
        CUSTOMERS.stream()
                 .filter(Customer2::isInterestedInNewProduct)
                 .forEach(customer ->
                     customer.receiveNotification("New product '" + product + "' is released!")
                 );
        System.out.println("=====================================================");
        System.out.println("=====================================================");
    }

    // 새로운 제품 출시시 SMS로 알림 수신을 원하는 고객들에게 알림
    // 이떄 로직 구현에 신경을 너무 많이 써야 하다 보니, 실수로 수신여부 동의한 사람만 필터링하는 것을
    // 깜빡해버려서 전체 고객들에게 통지가 가버리는 크리티컬 이슈가 발생함!!!(응집도 낮고, 결합도가 높아서 발생한 문제)
    public void notifyCustomersViaSMS(String product) {
        CUSTOMERS.stream()
                 //.filter(Customer2::isInterestedInNewProduct)
                 .forEach(customer -> {
                     if (customer.isInterestedInNewProduct()) {
                         customer.receiveNotification("New product '" + product + "' is released!");
                     }else {
                         customer.receiveNotification("New product '" + product + "' is released!");
                         addToBlacklist(customer);
                     }
                 });
        System.out.println("=====================================================");
        System.out.println("=====================================================");
    }

    private void addToBlacklist(Customer2 customer) {
        BLACKLIST.add(customer);
        /* asList는 정적 리스트라 요소 추가 및 제거 불가 ->UnsupportedOperationException */
        //CUSTOMERS.remove(customer);
        
        // 동적 리스트로 변환
        List<Customer2> mutableCustomers = new ArrayList<>(CUSTOMERS); // 불변 리스트를 가변 리스트로 복사
        mutableCustomers.remove(customer); // 블랙리스트에 추가된 고객은 주 고객 리스트에서 제거
        // 이후 mutableCustomers가지고 로직 가공 가능

        System.out.println();
        System.out.println("adding blackList.... : " + customer.getPhoneNumber());
    }
}
