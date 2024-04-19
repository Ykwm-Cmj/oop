package pattern.structural.decorator.myexample.deco.recipe;

public enum EquipmentEnum {
    POT("냄비"),
    FRYING_PAN("프라이팬");
    final String name;
    private EquipmentEnum(String name){
        this.name = name;
    }
}
