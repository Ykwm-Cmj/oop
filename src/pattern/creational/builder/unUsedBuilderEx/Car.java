package pattern.creational.builder.unUsedBuilderEx;

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

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setHasNavigationSystem(boolean hasNavigationSystem) {
        this.hasNavigationSystem = hasNavigationSystem;
    }

    // toString 메서드
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

