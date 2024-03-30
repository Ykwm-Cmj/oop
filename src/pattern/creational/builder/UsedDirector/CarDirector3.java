package pattern.creational.builder.UsedDirector;

// Director: Car 객체를 생성하는 역할을 수행하는 디렉터 클래스
public class CarDirector3 {
    private CarBuilder3 builder;

    public CarDirector3(CarBuilder3 builder) {
        this.builder = builder;
    }

    public Car3 constructSUV() {
        return builder.setModel("SUV")
                      .setColor("Blue")
                      .setFuelType("Gasoline")
                      .setEngineSize(2000)
                      .setTransmissionType("Automatic")
                      .setNavigationSystem(true)
                      .build();
    }

    public Car3 constructSedan() {
        return builder.setModel("Sedan")
                      .setColor("Black")
                      .setFuelType("Diesel")
                      .setEngineSize(1500)
                      .setTransmissionType("Manual")
                      .setNavigationSystem(false)
                      .build();
    }
}

