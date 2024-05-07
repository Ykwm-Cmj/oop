package pattern.behavioral.chainOfResponsibility.deploy;

public class TotalTestHandler extends DeployWorkHandler {
    @Override
    void doWork() {
        System.out.println("통합테스트 실시");
        doWorkNext();
    }
}
