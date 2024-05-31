package pattern.behavioral.state.statePattern.Elevator;

/**
 * 각 상태에 대한
 */
public class DownState implements ElevatorState {
    //엘리베이터가 내려가는 중에 올라가는 버튼이 눌릴 경우,
    //엘리베이터는 올라가야하므로 엘리베이터의 상태를 UpState로 전환
    @Override
    public void pushUpButton(Elevator elevator) {
        System.out.println("올라감");
        elevator.setState(new UpState());
    }

    //엘리베이터가 내려가는 중에 내려감 버튼이 눌리면 동작없음 표기
    @Override
    public void pushDownButton(Elevator elevator) {
        System.out.println("이미 내려가는 중");
    }

    //엘리베이터가 내려가는 중에 멈춤 버튼이 눌릴 경우,
    //엘리베이터는 멈춰야하므로 엘리베이터의 상태를 stopState로 전환
    @Override
    public void pushStopButton(Elevator elevator) {
        System.out.println("멈춤");
        elevator.setState(new StopState());
    }
}