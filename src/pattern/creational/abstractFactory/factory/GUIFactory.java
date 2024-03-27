package pattern.creational.abstractFactory.factory;

import pattern.creational.abstractFactory.element.Button;
import pattern.creational.abstractFactory.element.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
