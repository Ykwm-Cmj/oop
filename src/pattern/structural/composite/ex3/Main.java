package pattern.structural.composite.ex3;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger(new Hunting_Method2());
        Animal bird = new Bird(new Hunting_Method1());

        tiger.hunt();
        System.out.println("--------------");
        bird.hunt();
    }
}
