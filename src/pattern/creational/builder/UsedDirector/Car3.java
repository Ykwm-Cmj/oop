package pattern.creational.builder.UsedDirector;

// 자동차 클래스
// Car3 클래스: 자동차를 나타내는 클래스
public class Car3 {
    private String model;
    private String color;
    private String fuelType;
    private int engineSize;
    private String transmissionType;
    private boolean hasNavigationSystem;

    public Car3(String model, String color, String fuelType, int engineSize, String transmissionType, boolean hasNavigationSystem) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.engineSize = engineSize;
        this.transmissionType = transmissionType;
        this.hasNavigationSystem = hasNavigationSystem;
    }

    @Override
    public String toString() {
        return "Car3{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", engineSize=" + engineSize +
                ", transmissionType='" + transmissionType + '\'' +
                ", hasNavigationSystem=" + hasNavigationSystem +
                '}';
    }
}

