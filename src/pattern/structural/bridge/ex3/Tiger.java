package pattern.structural.bridge.ex3;

public class Tiger extends Animal {
    public Tiger(Hunting_Handler hunting) {
        super(hunting);
    }
    public void hunt() {
        System.out.println("호랑이의 사냥방식");
        Find_Quarry();
        Detected_Quarry();
        attack();
    }
}
