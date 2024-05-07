package pattern.behavioral.chainOfResponsibility.deploy;

public class Deploy {
    private DeployWorkHandler handler;

    public Deploy(DeployWorkHandler handler) {
        this.handler = handler;
    }

    public void deploy(){
        System.out.println("배포" + (handler.doWork() ? "완료" : "실패"));
    }
}
