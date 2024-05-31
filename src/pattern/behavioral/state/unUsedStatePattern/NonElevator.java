package pattern.behavioral.state.unUsedStatePattern;

public class NonElevator {
    public static final String up = "UP";
    public static final String down = "DOWN";
    public static final String stop = "STOP";
    public static final String open = "OPEN";
    private String curState = "";

    public NonElevator() {
        this.curState = stop;
    }

    public void setState(String state) {
        this.curState = state;
    }

    public String getCurState() {
        return curState;
    }

    public void setCurState(String curState) {
        this.curState = curState;
    }

    public void pushUpButton() {
        if (curState.equals(up)) {
            System.out.println("이미 올라가는 중입니다.");
        } else {
            System.out.println("올라갑니다.");
            curState = up;
        }
    }

    public void pushDownButton() {
        if (curState.equals(down)) {
            System.out.println("이미 내려가는 중입니다.");
        } else {
            System.out.println("내려갑니다.");
            curState = down;
        }
    }

    public void pushStopButton() {
        if (curState.equals(stop)) {
            System.out.println("이미 멈춰있습니다.");
        } else {
            System.out.println("멈춥니다.");
            curState = stop;
        }
    }

    public void openDoor() {
        if (curState.equals(open)) {
            System.out.println("이미 문이 열려있습니다.");
        } else {
            System.out.println("문이 열립니다.");
            curState = open;
        }
    }

}