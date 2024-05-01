package pattern.structural.flyweight.successFlyweightPattern;

/**
 * UnsharedConcreteFlyweight -> 비 본질 특성 담은 클래스
 * 따라서, 위치속성을 비본질 속성으로 빼둠
 */
final class Tree3 {
   // 죄표값과 나무 모델 참조 객체 크기를 합친 사이즈
    long objSize = 10; // 10MB

    // 위치 변수
    double position_x;
    double position_y;

    // 나무 모델
    TreeModel3 model;

    public Tree3(TreeModel3 model, double position_x, double position_y) {

        this.model = model;
        this.position_x = position_x;
        this.position_y = position_y;

        // 나무 객체를 생성하였으니 메모리 사용 크기 증가
        Memory3.size +=  this.objSize;
    }
}
