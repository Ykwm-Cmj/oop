package pattern.creational.builder.UsedDirector;

public class Car3Builder implements CarBuilder3 {
    private String model;
    private String color;
    private String fuelType;
    private int engineSize;
    private String transmissionType = "Automatic";
    private boolean hasNavigationSystem = false;

    @Override
    public CarBuilder3 setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder3 setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder3 setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    @Override
    public CarBuilder3 setEngineSize(int engineSize) {
        this.engineSize = engineSize;
        return this;
    }

    @Override
    public CarBuilder3 setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    @Override
    public CarBuilder3 setNavigationSystem(boolean hasNavigationSystem) {
        this.hasNavigationSystem = hasNavigationSystem;
        return this;
    }

    @Override
    public Car3 build() {
        return new Car3(model, color, fuelType, engineSize, transmissionType, hasNavigationSystem);
    }
}