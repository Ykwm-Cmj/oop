package pattern.creational.prototype.prototypePattern;

public class Main2 {
    public static void main(String[] args) {
        // 프로토타입 객체 생성
        Prototype prototype = new Person("John", 30, new Address("Seoul", "Gangnam-gu"));

        // 클라이언트 코드에서는 복제 메서드를 호출하여 새로운 객체 생성
        Prototype cloned = prototype.clone();

        // 복제된 객체의 정보 출력
        ((Person) cloned).printInfo();
    }
}
