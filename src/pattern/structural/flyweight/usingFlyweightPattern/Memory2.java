package pattern.structural.flyweight.usingFlyweightPattern;

public class Memory2 {
    public static long size = 0; // 메모리 사용량

    public static void print() {
        System.out.println("총 메모리 사용량 : " + Memory2.size + "MB");
    }
}
