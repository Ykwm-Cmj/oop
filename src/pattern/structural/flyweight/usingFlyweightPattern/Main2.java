package pattern.structural.flyweight.usingFlyweightPattern;

import pattern.structural.flyweight.unUsedFlyweightPattern.Memory;
import pattern.structural.flyweight.unUsedFlyweightPattern.Terrain;

public class Main2 {
    public static void main(String[] args) {
        // 지형 생성
        Terrain2 terrain2 = new Terrain2();

        // 지형에 Oak 나무 5 그루 생성
        for (int i = 0; i < 5; i++) {
            terrain2.render(
                    "Oak", // type
                    Math.random() * Terrain2.CANVAS_SIZE, // position_x
                    Math.random() * Terrain2.CANVAS_SIZE // position_y
            );
        }

        // 지형에 Acacia 나무 5 그루 생성
        for (int i = 0; i < 5; i++) {
            terrain2.render(
                    "Acacia", // type
                    Math.random() * Terrain2.CANVAS_SIZE, // position_x
                    Math.random() * Terrain2.CANVAS_SIZE // position_y
            );
        }

        // 지형에 Jungle 나무 5 그루 생성
        for (int i = 0; i < 5; i++) {
            terrain2.render(
                    "Jungle", // type
                    Math.random() * Terrain2.CANVAS_SIZE, // position_x
                    Math.random() * Terrain2.CANVAS_SIZE // position_y
            );
        }

        // 총 메모리 사용률 출력
        Memory2.print();
    }
}
