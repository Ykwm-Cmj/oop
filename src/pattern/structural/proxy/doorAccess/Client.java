package pattern.structural.proxy.doorAccess;

public class Client {
    public static void main(String[] args) {
        // 출입 카드 프록시를 생성하여 사용합니다.
        AccessCard accessCard = new AccessCardProxy("John Doe");
        accessCard.access("John Doe"); // 유효한 출입
        accessCard.access("Jane Smith"); // 유효하지 않은 출입
    }
}
