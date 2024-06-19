package pattern.behavioral.visitor;
/**
 * 객체는 자기 구조를 지키면서 방문자의 방문만 허가해주면 된다.
 */
public class RobotToy implements Toy {
    private String id;
    private boolean hasBattery;

    public RobotToy(String id, boolean hasBattery) {
        this.id = id;
        this.hasBattery = hasBattery;
    }

    public String getId() {
        return id;
    }

    public boolean hasBattery() {
        return hasBattery;
    }

    @Override
    public void accept(ToyVisitor visitor) {
        visitor.visit(this);
    }
}