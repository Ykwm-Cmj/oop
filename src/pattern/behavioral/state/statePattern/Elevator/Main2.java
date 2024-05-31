package pattern.behavioral.state.statePattern.Elevator;

public class Main2 {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        // 초기 상태
        elevator.pushStopButton();
        System.out.println();

        // 올라가는 버튼을 눌렀을 때
        elevator.pushUpButton();
        System.out.println();

        // 올라가는 버튼을 다시 눌렀을 때
        elevator.pushUpButton();
        System.out.println();

        // 멈춤 버튼을 눌렀을 때
        elevator.pushStopButton();
        System.out.println();

        // 내려가는 버튼을 눌렀을 때
        elevator.pushDownButton();
        System.out.println();

        // 내려가는 버튼을 다시 눌렀을 때
        elevator.pushDownButton();
        System.out.println();

        // 멈춤 버튼을 눌렀을 때
        elevator.pushStopButton();
    }
}
