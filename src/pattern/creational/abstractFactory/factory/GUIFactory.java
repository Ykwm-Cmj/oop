package pattern.creational.abstractFactory.factory;

import pattern.creational.abstractFactory.element.Button;
import pattern.creational.abstractFactory.element.CheckBox;

public interface GUIFactory {
    static GUIFactory getFactory(){
        return switch(System.getProperty("os.name").substring(0,3).toUpperCase()){
            case "WIN" -> new WinFactory();
            case "MAC" -> new MacFactory();
            default -> throw new RuntimeException("No Declare OS");
        };
    }
    Button createButton();
    CheckBox createCheckBox();
}
