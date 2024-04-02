package pattern.creational.prototype.dependentCopy;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 객체를 복제하는 메서드
    public Person clone() {
        // Address 객체도 함께 복제하여 새로운 객체 생성
        Address clonedAddress = this.address.clone();
        return new Person(this.name, this.age, clonedAddress);
    }

    // 개인 정보를 출력하는 메서드
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.print("Address: ");
        address.printAddress();
    }
}
