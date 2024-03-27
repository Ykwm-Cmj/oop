package pattern.creational.abstractFactory;

import pattern.creational.abstractFactory.element.Button;
import pattern.creational.abstractFactory.element.CheckBox;
import pattern.creational.abstractFactory.factory.GUIFactory;
import pattern.creational.abstractFactory.factory.MacFactory;
import pattern.creational.abstractFactory.factory.WinFactory;

public class Application {
    private GUIFactory factory;
    private Button button;
    private CheckBox checkBox;

    private Application(GUIFactory factory){
        this.factory = factory;
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void buttonClick(){
        button.paint();;
    }

    public void checkBoxClick(){
        checkBox.paint();
    }

    public static Application getInstance() {
        String os = System.getProperty("os.name").toUpperCase();

        GUIFactory factory = switch (os){
            case  "WIN" -> new WinFactory();
            case "MAC" -> new MacFactory();
            default -> new WinFactory();
        };

        return new Application(factory);
    }
}
