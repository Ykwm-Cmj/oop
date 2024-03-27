package pattern.creational.abstractFactory.element;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("window checkbox - paint sky blue");
    }
}
