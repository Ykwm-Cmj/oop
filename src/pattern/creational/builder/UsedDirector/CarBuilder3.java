package pattern.creational.builder.UsedDirector;

// Builder: 빌더 인터페이스
public interface CarBuilder3 {
    CarBuilder3 setModel(String model);
    CarBuilder3 setColor(String color);
    CarBuilder3 setFuelType(String fuelType);
    CarBuilder3 setEngineSize(int engineSize);
    CarBuilder3 setTransmissionType(String transmissionType);
    CarBuilder3 setNavigationSystem(boolean hasNavigationSystem);
    Car3 build();

//    default Car3 createSuv() {
//        return this.set~~;
//    }
}
