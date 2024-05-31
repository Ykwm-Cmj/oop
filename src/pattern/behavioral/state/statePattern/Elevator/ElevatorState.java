package pattern.behavioral.state.statePattern.Elevator;

/***
 * 상태를 인터페이스로 정의해둔다.
 * 이때 각 상태는 엘레베이터를 의존한다.
 */
public interface ElevatorState {

    void pushUpButton(Elevator elevator);
    void pushDownButton(Elevator elevator);
    void pushStopButton(Elevator elevator);
}

