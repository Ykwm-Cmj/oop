package pattern.creational.builder.noDirector;

public class CarConcreteBuilder implements CarBuilder {
    private String model;
    private String color;
    private String fuelType;
    private int engineSize;


    // 선택적 매개변수는 기본값으로 초기화합니다.
    private String transmissionType = "Automatic";
    private boolean hasNavigationSystem = false;

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    @Override
    public CarBuilder setEngineSize(int engineSize) {
        this.engineSize = engineSize;
        return this;
    }

    @Override
    public CarBuilder setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    @Override
    public CarBuilder setNavigationSystem(boolean hasNavigationSystem) {
        this.hasNavigationSystem = hasNavigationSystem;
        return this;
    }

    @Override
    public Car build() {
        return new Car(model, color, fuelType, engineSize, transmissionType, hasNavigationSystem);
    }
}
