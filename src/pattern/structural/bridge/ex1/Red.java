package pattern.structural.bridge.ex1;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}