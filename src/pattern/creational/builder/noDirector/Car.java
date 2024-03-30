package pattern.creational.builder.noDirector;

public class Car {
    private String model;
    private String color;
    private String fuelType;
    private int engineSize;
    private String transmissionType;
    private boolean hasNavigationSystem;

    public Car(String model, String color, String fuelType, int engineSize, String transmissionType, boolean hasNavigationSystem) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.engineSize = engineSize;
        this.transmissionType = transmissionType;
        this.hasNavigationSystem = hasNavigationSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineSize=" + engineSize +
                ", transmissionType='" + transmissionType + '\'' +
                ", hasNavigationSystem=" + hasNavigationSystem +
                '}';
    }
}
