package pattern.behavioral.state.statePattern.Elevator;


public class StopState implements ElevatorState {
    @Override
    public void pushUpButton(Elevator elevator) {
        System.out.println("올라감");
        elevator.setState(new UpState());
    }

    @Override
    public void pushDownButton(Elevator elevator) {
        System.out.println("내려감");
        elevator.setState(new DownState());
    }

    @Override
    public void pushStopButton(Elevator elevator) {
        System.out.println("동작 없음");
    }
}