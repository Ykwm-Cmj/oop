package pattern.creational.prototype.prototypePattern;

public class Address implements Prototype {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    // 복제 메서드 구현
    @Override
    public Address clone() {
        return new Address(this.city, this.street);
    }

    // 주소 정보 출력 메서드
    public void printAddress() {
        System.out.println("City: " + city + ", Street: " + street);
    }
}
