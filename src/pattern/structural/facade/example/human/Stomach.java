package pattern.structural.facade.example.human;

import pattern.structural.facade.example.food.Food;

public class Stomach {
    private int max;

    public Stomach(int max) {
        this.max = max;
    }

    public boolean mixAndMelt(Food food){
        if(food.getKcal() > max){
            return false;
        }
        food.setName("melted " + food.getName());
        return true;
    }
}
