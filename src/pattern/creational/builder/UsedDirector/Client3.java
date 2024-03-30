package pattern.creational.builder.UsedDirector;

// Client3: 빌더와 디렉터를 사용하여 Car 객체를 생성하는 클라이언트 코드
public class Client3 {
    public static void main(String[] args) {
        // 빌더 객체 생성
        CarBuilder3 builder = new Car3Builder();

        // 디렉터 객체 생성
        CarDirector3 director = new CarDirector3(builder);

        // SUV 생성
        Car3 suv = director.constructSUV();
        // Sedan 생성
        Car3 sedan = director.constructSedan();

        // 결과 출력
        System.out.println(suv);
        System.out.println(sedan);
    }
}



