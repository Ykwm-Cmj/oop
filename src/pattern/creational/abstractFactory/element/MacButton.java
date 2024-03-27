package pattern.creational.abstractFactory.element;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("mac button - paint white");
    }
}
