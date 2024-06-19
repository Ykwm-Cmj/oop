package pattern.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Toy> toys = Arrays.asList(
                new CarToy("Car1", true),
                new CarToy("Car2", false),
                new RobotToy("Robot1", true),
                new RobotToy("Robot2", false)
        );

        // 인터페이스클래스 변수에 구현체를 담아서 확장성을 챙긴다.
        ToyVisitor statusChecker = new ToyStatusCheckerVisitor();
        // 방문자 방문 허가
        for (Toy toy : toys) {
            toy.accept(statusChecker);
        }

        // 방문자에 의한 방문 보고
        List<String> report = ((ToyStatusCheckerVisitor) statusChecker).getReport();
        for (String line : report) {
            System.out.println("====== 보고드립니다 ======");
            System.out.println(line);
        }

        // 새로운 기능: 청소 기능 추가
        ToyVisitor cleaner = new ToyCleaningVisitor();
        System.out.println();
        for (Toy toy : toys) {
            toy.accept(cleaner);
        }
    }
}
