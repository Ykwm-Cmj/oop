package pattern.structural.flyweight.unUsedFlyweightPattern;

public class Terrain {
    // 지형 타일 크기
    static final int CANVAS_SIZE = 10000;

    // 나무를 렌더링
    public void render(String type, Object mesh, Object texture, double position_x, double position_y) {
        // 나무를 지형에 생성
        Tree tree = new Tree(
                type, // 나무 종류
                mesh, // mesh
                texture, // texture
                Math.random() * CANVAS_SIZE, // position_x
                Math.random() * CANVAS_SIZE // position_y
        );

        System.out.println("x:" + tree.position_x + " y:" + tree.position_y + " 위치에 " + type + " 나무 생성 완료");
    }
}
