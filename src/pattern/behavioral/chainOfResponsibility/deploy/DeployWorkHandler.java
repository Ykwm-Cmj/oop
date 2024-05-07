package pattern.behavioral.chainOfResponsibility.deploy;

public abstract class DeployWorkHandler {
    private DeployWorkHandler next;

    abstract boolean doWork();

    abstract boolean check();

    protected boolean doWorkNext(){
        if(next == null) return true;
        return next.doWork();

    }
    public DeployWorkHandler setNext(DeployWorkHandler next){
        this.next = next;
        return next;
    }
}
