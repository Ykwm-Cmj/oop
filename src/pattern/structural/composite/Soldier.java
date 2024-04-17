package pattern.structural.composite;

public class Soldier implements MilitaryUnit {
    private String name;

    public Soldier(String name) {
        this.name = name;
    }

    public void executeOrders() {
        System.out.println("Soldier " + name + " executing orders.");
    }
}