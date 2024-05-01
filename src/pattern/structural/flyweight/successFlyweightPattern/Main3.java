package pattern.structural.flyweight.successFlyweightPattern;
/*
합성 사용(상속x)
 */
public class Main3 {
    public static void main(String[] args) {
        // 지형 생성
        Terrain3 terrain2 = new Terrain3();

        // 지형에 Oak 나무 5 그루 생성
        for (int i = 0; i < 5; i++) {
            terrain2.render(
                    "Oak", // type
                    Math.random() * Terrain3.CANVAS_SIZE, // position_x
                    Math.random() * Terrain3.CANVAS_SIZE // position_y
            );
        }

        // 지형에 Acacia 나무 5 그루 생성
        for (int i = 0; i < 5; i++) {
            terrain2.render(
                    "Acacia", // type
                    Math.random() * Terrain3.CANVAS_SIZE, // position_x
                    Math.random() * Terrain3.CANVAS_SIZE // position_y
            );
        }

        // 지형에 Jungle 나무 5 그루 생성
        for (int i = 0; i < 5; i++) {
            terrain2.render(
                    "Jungle", // type
                    Math.random() * Terrain3.CANVAS_SIZE, // position_x
                    Math.random() * Terrain3.CANVAS_SIZE // position_y
            );
        }

        // 총 메모리 사용률 출력
        Memory3.print();
    }
}
