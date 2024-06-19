package pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 객체를 방문하여 방문 결과를 리포트에 저장한다.
 */
public class ToyStatusCheckerVisitor implements ToyVisitor {
    private List<String> report = new ArrayList<>();

    @Override
    public void visit(CarToy car) {
        if (car.isWorking()) {
            report.add("CarToy " + car.getId() + " 는 정상 작동합니다.");
        } else {
            report.add("CarToy " + car.getId() + " 는 비정상 작동합니다.");
        }
    }

    @Override
    public void visit(RobotToy robot) {
        if (robot.hasBattery()) {
            report.add("RobotToy " + robot.getId() + " 배터리가 충분합니다.");
        } else {
            report.add("RobotToy " + robot.getId() + " 배터리가 부족합니다.");
        }
    }

    public List<String> getReport() {
        return report;
    }
}
