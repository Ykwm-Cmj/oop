package pattern.behavioral.observer.unusedObserver2;

public class Main2 {
    public static void main(String[] args) {
        Store2 store = new Store2();
        store.notifyCustomers("New Fancy is Comming~");
        store.notifyCustomersViaSMS("New Fancy is Comming~");
    }
}
