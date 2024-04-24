package pattern.structural.decorator.myexample.deco.recipe;

public enum IngredientEnum {
    WATER_HOT("물", "을 넣고 끓임")
    , WATER("물","을 넣음")
    , PAWDER("분말스프","를 넣음")
    , FIRE("불", "을 올려 끓임")
    , NOODLE("면", "을 넣음")
    , EGG("계란", "을 넣음")
    , WAIT_3_M("3분", " 기다려");
    final String name, how;

    private IngredientEnum(String name, String how){
        this.name = name;
        this.how = how;
    }
}
