package pattern.behavioral.chainOfResponsibility.deploy;

public class DeployTestHandler extends DeployWorkHandler {
    @Override
    boolean doWork() {
        System.out.println("배포 및 테스트");
        if(!check()){
            System.out.println("배포 및 테스트 실패");
            return false;
        }
        return doWorkNext();
    }

    @Override
    boolean check() {
        boolean b = Math.random() > 0.2;
        return b;
    }
}
