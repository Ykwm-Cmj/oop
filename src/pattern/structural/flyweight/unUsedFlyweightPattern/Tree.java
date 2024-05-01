package pattern.structural.flyweight.unUsedFlyweightPattern;

public class Tree {
    long objSize = 100; // 100MB

    String type; // 나무 종류

    Object mesh; // 메쉬
    Object texture; // 나무 껍질 + 잎사귀 텍스쳐

    // 위치 변수
    double position_x;
    double position_y;

    public Tree(String type, Object mesh, Object texture, double position_x, double position_y) {
        this.type = type;
        this.mesh = mesh;
        this.texture = texture;
        this.position_x = position_x;
        this.position_y = position_y;

        // 나무 객체를 생성하였으니 메모리 사용 크기 증가
        Memory.size +=  this.objSize;
    }

}
