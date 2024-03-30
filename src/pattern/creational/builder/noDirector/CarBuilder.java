package pattern.creational.builder.noDirector;

public interface CarBuilder {
    CarBuilder setModel(String model);
    CarBuilder setColor(String color);
    CarBuilder setFuelType(String fuelType);
    CarBuilder setEngineSize(int engineSize);
    CarBuilder setTransmissionType(String transmissionType);
    CarBuilder setNavigationSystem(boolean hasNavigationSystem);
    Car build();
}