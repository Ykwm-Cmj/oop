package pattern.behavioral.state.statePattern.Elevator;

/**
 * 엘레베이터는 상태에 의존한다.(엘리베이터가 상태에 따라 다른 동작을 수행)
 */
public class Elevator {
    //상태 객체는 엘리베이터의 동작을 캡슐화 -> 엘레베이터가 생성될때 상태도 생성함으로써 
    //상태 클래스의 모든 기능에 접근이 가능해져버린다.
    // 이를 통해 확장성을 유지할 수 있고 캡슐화가 성립
    private ElevatorState state;    // 인터페이스 확상성 + 캡슐화

    public Elevator() {
        // 처음엔 멈춰있는다.
        this.state = new StopState();
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public void pushUpButton() {
        state.pushUpButton(this);
    }

    public void pushDownButton() {
        state.pushDownButton(this);
    }

    public void pushStopButton() {
        state.pushStopButton(this);
    }
}