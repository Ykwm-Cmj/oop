package pattern.creational.abstractFactory.factory;

import pattern.creational.abstractFactory.element.Button;
import pattern.creational.abstractFactory.element.CheckBox;
import pattern.creational.abstractFactory.element.MacButton;
import pattern.creational.abstractFactory.element.MacCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
