package pattern.behavioral.visitor;

/**
 * 장난감을 청소하는 방문자
 */
public class ToyCleaningVisitor implements ToyVisitor {
    @Override
    public void visit(CarToy car) {
        System.out.println("CarToy 청소완료" + car.getId());
    }

    @Override
    public void visit(RobotToy robot) {
        System.out.println("RobotToy 청소완료" + robot.getId());
    }
}