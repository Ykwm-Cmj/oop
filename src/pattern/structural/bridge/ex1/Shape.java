package pattern.structural.bridge.ex1;

abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color; // 모양에 색을 입히기! (모양 - 추상, 색 - 구현 을 넣는다)
        // 이 부분에 의하여 브릿지 패턴이 완성됨
    }

    abstract void draw();
}
