package pattern.behavioral.chainOfResponsibility.deploy;

public class RegistHandler extends DeployWorkHandler {
    @Override
    boolean doWork() {
        System.out.println("배포 등록");
        return doWorkNext();
    }

    @Override
    boolean check() {
        return true;
    }


}
