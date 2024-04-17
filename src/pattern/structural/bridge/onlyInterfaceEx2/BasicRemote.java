package pattern.structural.bridge.onlyInterfaceEx2;

public class BasicRemote implements Remote {
    private TV tv;

    public BasicRemote(TV tv) {
        this.tv = tv;
    }

    @Override
    public void power() {
        tv.powerOn();
    }

    @Override
    public void channelUp() {
        System.out.println("Basic Remote is changing channel up.");
    }

    @Override
    public void channelDown() {
        System.out.println("Basic Remote is changing channel down.");
    }
}
