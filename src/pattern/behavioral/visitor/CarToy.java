package pattern.behavioral.visitor;

/**
 * 객체는 자기 구조를 지키면서 방문자의 방문만 허가해주면 된다.
 */
public class CarToy implements Toy {
    private String id;
    private boolean isWorking;

    public CarToy(String id, boolean isWorking) {
        this.id = id;
        this.isWorking = isWorking;
    }

    public String getId() {
        return id;
    }

    public boolean isWorking() {
        return isWorking;
    }

    @Override
    public void accept(ToyVisitor visitor) {
        visitor.visit(this);
    }
}
