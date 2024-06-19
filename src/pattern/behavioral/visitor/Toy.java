package pattern.behavioral.visitor;

/**
 * Toy 인터페이스를 구현하는 구현체는 모든 방문자에 대하여 방문 허가할지 여부를 정할 수 있다.
 */
public interface Toy {
    void accept(ToyVisitor visitor);
}
