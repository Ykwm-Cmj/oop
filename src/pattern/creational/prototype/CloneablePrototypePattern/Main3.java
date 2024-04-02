package pattern.creational.prototype.CloneablePrototypePattern;

public class Main3 {
    public static void main(String[] args) {
        // 프로토타입 객체 생성
        Person2 prototype = new Person2("John", 30, new Address2("Seoul", "Gangnam-gu"));

        // 클라이언트 코드에서는 복제 메서드를 호출하여 새로운 객체 생성
        Person2 cloned = prototype.clone();

        // 복제된 객체의 정보 출력
        cloned.printInfo();
    }
}
