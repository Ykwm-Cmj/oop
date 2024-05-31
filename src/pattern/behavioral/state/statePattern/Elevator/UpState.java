package pattern.behavioral.state.statePattern.Elevator;

public class UpState implements ElevatorState {
    @Override
    public void pushUpButton(Elevator elevator) {
        System.out.println("이미 올라가는 중");
    }

    @Override
    public void pushDownButton(Elevator elevator) {
        System.out.println("내려감");
        elevator.setState(new DownState());
    }

    @Override
    public void pushStopButton(Elevator elevator) {
        System.out.println("멈춤");
        elevator.setState(new StopState());
    }
}
