package pattern.structural.facade.example.human;

import pattern.structural.facade.example.food.Food;

public class Mouth {
    public boolean isEatable(Food food){
        return !"bitter".equals(food.getFlavor());
    }
}
