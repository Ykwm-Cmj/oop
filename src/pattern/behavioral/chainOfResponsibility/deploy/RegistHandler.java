package pattern.behavioral.chainOfResponsibility.deploy;

public class RegistHandler extends DeployWorkHandler {
    @Override
    void doWork() {
        System.out.println("배포 등록");
        doWorkNext();
    }
}
