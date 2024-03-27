package pattern.creational.abstractFactory.factory;

import pattern.creational.abstractFactory.element.Button;
import pattern.creational.abstractFactory.element.CheckBox;
import pattern.creational.abstractFactory.element.WinButton;
import pattern.creational.abstractFactory.element.WinCheckBox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
