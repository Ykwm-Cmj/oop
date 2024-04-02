package pattern.creational.prototype.dependentCopy;

public class Address {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    // 주소 정보를 복제하는 메서드
    public Address clone() {
        return new Address(this.city, this.street);
    }

    // 주소 정보 출력 메서드
    public void printAddress() {
        System.out.println("City: " + city + ", Street: " + street);
    }
}

