package pattern.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Application app = Application.getInstance();
        System.out.println("**********************************************");
        app.buttonClick();
        app.checkBoxClick();
        System.out.println("**********************************************");
    }
}
