package pattern.behavioral.chainOfResponsibility.deploy;

public class Deploy {
    private DeployWorkHandler handler;

    public Deploy(DeployWorkHandler handler) {
        this.handler = handler;
    }

    public void deploy(){
        handler.doWork();
        System.out.println("배포 완료");
    }
}
