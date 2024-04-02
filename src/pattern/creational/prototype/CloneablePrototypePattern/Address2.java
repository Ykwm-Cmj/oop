package pattern.creational.prototype.CloneablePrototypePattern;

public class Address2 implements Cloneable {
    private String city;
    private String street;

    public Address2(String city, String street) {
        this.city = city;
        this.street = street;
    }

    // 복제 메서드 오버라이드
    @Override
    public Address2 clone() {
        try {
            return (Address2) super.clone();
        } catch (CloneNotSupportedException e) {
            // 복제를 지원하지 않는 경우 예외 처리
            e.printStackTrace();
            return null;
        }
    }

    // 주소 정보 출력 메서드
    public void printAddress() {
        System.out.println("City: " + city + ", Street: " + street);
    }
}
