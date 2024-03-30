package pattern.creational.builder.unUsedBuilderEx;

public class Client {
    public static void main(String[] args) {

        Car car1 = new Car("SUV", "Blue", "Gasoline", 2000, "Automatic", true);
        Car car2 = new Car("Sedan", "Black", "Diesel", 1500, "Manual", false);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
