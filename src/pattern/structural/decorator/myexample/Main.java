package pattern.structural.decorator.myexample;

import pattern.structural.decorator.myexample.deco.recipe.*;

public class Main {
    public static void main(String[] args) {
//        작동 순서까지 런타임에 바꿀수는 없나 생각해보다가 만듬
//        완전히 데코레이터 구조를 따라가진 않았지만 비슷하게 생각해봄
//        String[] recipe = {"WATER_HOT", "PAWDER", "NOODLE", "WAIT_3_M"};
//        String[] recipe = {"WATER", "PAWDER", "NOODLE", "FIRE","WAIT_3_M"};
        String[] recipe = {"WATER_HOT", "PAWDER", "NOODLE", "EGG","WAIT_3_M"}; // 권모씨 레시피
        RamenRecipe ramenRecipe = new Equipment(EquipmentEnum.valueOf("POT"));
        for (String r : recipe){
            ramenRecipe.next(new Ingredient(IngredientEnum.valueOf(r)));
        }

        ramenRecipe.cook();
    }
}
