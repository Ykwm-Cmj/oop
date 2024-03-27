package pattern.creational.abstractFactory.element;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("mac checkbox - paint white");
    }
}
