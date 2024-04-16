package pattern.structural.composite.onlyInterfaceEx2;

public class Main2 {
    public static void main(String[] args) {
        // 새로운 기능이 추가된 텔레비전 생성
        AdvancedTV advancedTV = new AdvancedTV();

        // 기존 리모컨으로 텔레비전 제어
        BasicRemote basicRemote = new BasicRemote(advancedTV);
        basicRemote.power(); // 텔레비전을 켬
        basicRemote.channelUp(); // 채널을 올림
        System.out.println("===========");

        // 새로운 리모컨으로 텔레비전 제어 (새로운 기능 제어)
        AdvancedRemote advancedRemote = new AdvancedRemote(advancedTV);
        advancedRemote.power(); // 텔레비전을 켬
        advancedRemote.connectToInternet(); // 인터넷에 연결
    }
}