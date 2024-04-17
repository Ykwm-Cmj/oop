package pattern.structural.bridge.onlyInterfaceEx2;

public class AdvancedRemote implements Remote {
    private AdvancedTV tv;

    public AdvancedRemote(AdvancedTV tv) {
        this.tv = tv;
    }

    @Override
    public void power() {
        tv.powerOn();
    }

    @Override
    public void channelUp() {
        System.out.println("Advanced Remote is changing channel up.");
    }

    @Override
    public void channelDown() {
        System.out.println("Advanced Remote is changing channel down.");
    }

    // 새로운 기능을 제어하는 메서드
    public void connectToInternet() {
        tv.connectToInternet();
    }
}
