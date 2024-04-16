package pattern.structural.composite.ex1;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Square - ");
        color.applyColor();
    }
}