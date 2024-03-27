package pattern.creational.abstractFactory.element;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("window button - paint sky blue");
    }
}
