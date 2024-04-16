package pattern.structural.composite.onlyInterfaceEx2;

public class AdvancedTV implements TV {
    @Override
    public void powerOn() {
        System.out.println("Advanced TV is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Advanced TV is powered off.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Advanced TV is changing to channel " + channel);
    }

    // 새로운 기능
    public void connectToInternet() {
        System.out.println("Advanced TV is connected to the internet.");
    }
}
