package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MilitaryComposite implements MilitaryUnit {
    private String name;
    private List<MilitaryUnit> subUnits;

    public MilitaryComposite(String name) {
        this.name = name;
        this.subUnits = new ArrayList<>();
    }

    public void addSubUnit(MilitaryUnit unit) {
        subUnits.add(unit);
    }

    public void removeSubUnit(MilitaryUnit unit) {
        subUnits.remove(unit);
    }

    public void executeOrders() {
        System.out.println("Executing orders for " + name);
        for (MilitaryUnit unit : subUnits) {
            unit.executeOrders();
        }
    }
}

