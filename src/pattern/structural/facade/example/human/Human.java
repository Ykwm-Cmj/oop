package pattern.structural.facade.example.human;

import pattern.structural.facade.example.food.Food;

public class Human {
    private Mouth mouth;
    private Stomach stomach;
    private Intestines intestines;
    private int energe;

    public Human(Mouth mouth, Stomach stomach, Intestines intestines) {
        this.mouth = mouth;
        this.stomach = stomach;
        this.intestines = intestines;
        this.energe = 100;
    }

    public String eat(Food food){
        if (!mouth.isEatable(food)){
            return "dirty " + food.getName();
        }

        energe--;
        if(!stomach.mixAndMelt(food)){
            return "throw up " + food.getName();
        }

        energe--;
        energe += intestines.absorb(food);

        return food.isLiquid() ? "fee" : "foo";
    }

    public int getEnerge() {return energe;}
}
