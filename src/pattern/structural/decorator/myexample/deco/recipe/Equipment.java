package pattern.structural.decorator.myexample.deco.recipe;

public class Equipment extends Ingredient {

    public Equipment(String name, String how) {
        super(name, "를 준비");
    }

    public Equipment(EquipmentEnum e){
        super(e.name, "를 준비");
    }

    @Override
    public void cook() {
        super.cook();
    }
}
