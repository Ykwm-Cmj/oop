package pattern.structural.facade.example;

import pattern.structural.facade.example.food.Food;
import pattern.structural.facade.example.human.Human;
import pattern.structural.facade.example.human.Intestines;
import pattern.structural.facade.example.human.Mouth;
import pattern.structural.facade.example.human.Stomach;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(new Mouth(), new Stomach(40), new Intestines());
        Food food1 = new Food("apple", false, 10, "sweet");
        Food food2 = new Food("apple", false, 7, "bitter");

        System.out.println(human.eat(food1));
        System.out.println(human.eat(food2));
        System.out.println("energe : " + human.getEnerge());
    }
}
