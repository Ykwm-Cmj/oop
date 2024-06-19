package pattern.behavioral.visitor;

/**
 * 방문자는 각 객체들에 대하여 방문할 수 있어야한다.
 * 이때 객체마다 방문하여 처리할 행위(로직)이 다르므로 분리하여 추상화한다.
 */
public interface ToyVisitor {
    void visit(CarToy car);
    void visit(RobotToy robot);
}
