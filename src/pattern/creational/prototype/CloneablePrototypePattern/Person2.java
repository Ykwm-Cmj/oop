package pattern.creational.prototype.CloneablePrototypePattern;

public class Person2 implements Cloneable {
    private String name;
    private int age;
    private Address2 address;

    public Person2(String name, int age, Address2 address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public Person2 clone() {
        try {
            // Address2 객체도 함께 복제하여 새로운 객체 생성
            Person2 clonedPerson = (Person2) super.clone();
            clonedPerson.address = this.address.clone();
            return clonedPerson;
        } catch (CloneNotSupportedException e) {
            // 복제를 지원하지 않는 경우 예외 처리
            e.printStackTrace();
            return null;
        }
    }

    // 개인 정보를 출력하는 메서드
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.print("Address: ");
        address.printAddress();
    }
}
