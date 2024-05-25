package pattern.behavioral.observer.unusedObserver;

import java.util.ArrayList;
import java.util.List;

public class Store1 {
    private List<Customer1> customers;

        public Store1() {
            customers = new ArrayList<>();
        }

        // 새로운 고객 등록
        public void registerCustomer(Customer1 customer) {
            customers.add(customer);
        }

        // 새로운 제품 출시시 모든 고객에게 전화로 알림
        public void notifyAllCustomers(String product) {
            customers.forEach(customer -> {
                customer.receiveCall("New product '" + product + "' is released!");
                customer.reaction();
          });
        }
}
