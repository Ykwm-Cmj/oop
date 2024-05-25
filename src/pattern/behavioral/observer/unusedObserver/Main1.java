package pattern.behavioral.observer.unusedObserver;

public class Main1 {

    public static void main(String[] args) {
        // 매장 생성
        Store1 store = new Store1();

        // 고객 등록
        Customer1 customer1 = new Customer1("010-1234-5678", true);
        Customer1 customer2 = new Customer1("010-9876-5432", false); // 신제품 관심 없음
        store.registerCustomer(customer1);
        store.registerCustomer(customer2);

        // 새로운 제품 출시
        store.notifyAllCustomers("New Fancy is Comming~");
    }
}
