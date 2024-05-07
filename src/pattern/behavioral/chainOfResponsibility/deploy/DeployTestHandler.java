package pattern.behavioral.chainOfResponsibility.deploy;

public class DeployTestHandler extends DeployWorkHandler {
    @Override
    void doWork() {
        System.out.println("배포 및 테스트");
        doWorkNext();
    }
}
