package pattern.creational.builder.noDirector;

public class Client {
    public static void main(String[] args) {
        // 빌더 객체 생성
        CarBuilder builder = new CarConcreteBuilder();

        // 뭘 넘길지 순서 몰라도 되고, 필요없는건 구지  null로 안 넘겨도 되고, 짓고(Build)나면 빌드할때 생성자 초기화를 하면 됨
        // 첫 번째 자동차 생성
        Car car1 = builder.setModel("SUV")
                          .setColor("Blue")
                          .setFuelType("Gasoline")
                          .setEngineSize(2000)
//                          .setTransmissionType("Automatic") // 옵션
                          .setNavigationSystem(true)
                          .build();

        // 두 번째 자동차 생성
        Car car2 = builder.setModel("Sedan")
                          .setColor("Black")
                          .setFuelType("Diesel")
                          .setEngineSize(1500)
                          .setTransmissionType("Manual")
//                          .setNavigationSystem(false) // 옵션
                          .build();

        // 결과 출력
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}