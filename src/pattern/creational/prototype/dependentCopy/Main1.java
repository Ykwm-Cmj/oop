package pattern.creational.prototype.dependentCopy;

public class Main1 {
    public static void main(String[] args) {
        Address address = new Address("Seoul", "Gangnam-gu");
        Person person1 = new Person("John", 30, address);
        Person person2 = person1.clone();

        // person1의 정보 출력
        System.out.println("Person 1:");
        person1.printInfo();

        // person2의 정보 출력
        System.out.println("\nPerson 2:");
        person2.printInfo();
    }
}