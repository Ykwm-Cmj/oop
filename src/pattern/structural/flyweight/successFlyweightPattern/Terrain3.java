package pattern.structural.flyweight.successFlyweightPattern;

/**
 * Client
 */
public class Terrain3 {
    // 지형 타일 크기
    static final int CANVAS_SIZE = 10000;

    // 나무를 렌더릴
    public void render(String type, double position_x, double position_y) {
        // 1. 캐시 되어 있는 나무 모델 객체 가져오기
        TreeModel3 model = TreeModelFactory3.getInstance(type);

        // 2. 재사용한 나무 모델 객체와 변화하는 속성인 좌표값으로 나무 생성
        Tree3 tree = new Tree3(model,
                               position_x,
                               position_y);

        System.out.println("x:" + tree.position_x + " y:" + tree.position_y + " 위치에 " + type + " 나무 생성 완료");
    }

}
