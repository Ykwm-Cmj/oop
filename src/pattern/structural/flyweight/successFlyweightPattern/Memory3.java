package pattern.structural.flyweight.successFlyweightPattern;

public class Memory3 {
    public static long size = 0; // 메모리 사용량

    public static void print() {
        System.out.println("총 메모리 사용량 : " + Memory3.size + "MB");
    }
}
