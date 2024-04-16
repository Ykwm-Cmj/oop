package pattern.structural.composite.ex1;

public class Main1 {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red()); // 다형성 구현!!
        Shape blueSquare = new Square(new Blue());

        redCircle.draw(); // 원을 그리고 빨간색 적용
        blueSquare.draw(); // 직사각형을 그리고 파란색 적용
    }
}
