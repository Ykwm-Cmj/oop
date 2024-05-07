package pattern.behavioral.chainOfResponsibility.deploy;

public class TotalTestHandler extends DeployWorkHandler {
    @Override
    boolean doWork() {
        System.out.println("통합테스트 실시");
        if(!check()){
            System.out.println("통합테스트 실패");
            return false;
        }
        return doWorkNext();
    }

    @Override
    boolean check() {
        boolean b = Math.random() > 0.3;
        return b;
    }
}
