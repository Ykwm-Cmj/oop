package pattern.behavioral.chainOfResponsibility.deploy;

public abstract class DeployWorkHandler {
    private DeployWorkHandler next;

    abstract void doWork();

    protected void doWorkNext(){
        if(next != null){
            next.doWork();
        }
    }
    public DeployWorkHandler setNext(DeployWorkHandler next){
        this.next = next;
        return next;
    }
}
