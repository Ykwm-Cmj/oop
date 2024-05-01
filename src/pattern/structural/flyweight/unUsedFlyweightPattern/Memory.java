package pattern.structural.flyweight.unUsedFlyweightPattern;

public class Memory {
    public static long size = 0; // 메모리 사용량

    public static void print() {
        System.out.println("총 메모리 사용량 : " + Memory.size + "MB");
    }
}
