package pattern.behavioral.state.unUsedStatePattern;

public class Main1 {

    public static void main(String[] args) {
        NonElevator elevator = new NonElevator();

        System.out.println("초기 상태: " + elevator.getCurState() + "\n");

        // 올라가는 버튼을 눌렀을 때
        elevator.pushUpButton();
        System.out.println("현재 상태: " + elevator.getCurState() + "\n");

        // 올라가는 버튼을 다시 눌렀을 때
        elevator.pushUpButton();
        System.out.println("현재 상태: " + elevator.getCurState() + "\n");

        // 멈춤 버튼을 눌렀을 때
        elevator.pushStopButton();
        System.out.println("현재 상태: " + elevator.getCurState() + "\n");

        // 내려가는 버튼을 눌렀을 때
        elevator.pushDownButton();
        System.out.println("현재 상태: " + elevator.getCurState() + "\n");

        // 내려가는 버튼을 다시 눌렀을 때
        elevator.pushDownButton();
        System.out.println("현재 상태: " + elevator.getCurState() + "\n");

        // 멈춤 버튼을 눌렀을 때
        elevator.pushStopButton();
        System.out.println("현재 상태: " + elevator.getCurState() + "\n");

        // 문 열림 버튼을 눌렀을 때
        elevator.openDoor();
        System.out.println("현재 상태: " + elevator.getCurState() + "\n");

        // 문 열림 버튼을 다시 눌렀을 때
        elevator.openDoor();
        System.out.println("현재 상태: " + elevator.getCurState() + "\n");

    }
}
