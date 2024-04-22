package pattern.structural.facade.example.human;

import pattern.structural.facade.example.food.Food;

public class Intestines {
    public int absorb(Food food){
        int absorbed = food.getKcal() * (food.isLiquid() ? 9 : 8) / 10;
        food.setKcal(food.getKcal() - absorbed);
        return absorbed;
    }
}
