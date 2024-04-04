package pattern.creational.singleton.test.globalstate;

public class TestMain {
    public static void main(String[] args) {
        Thread trueThread = new Thread(new TestRun("This is True", true));
        Thread falseThread = new Thread(new TestRun("This is False", false));

        trueThread.start();
        falseThread.start();
    }
}

class TestRun implements Runnable{
    private String runName;
    private boolean flag;
    public TestRun(String runName, boolean flag){
        this.runName = runName;
        this.flag = flag;
    }

    @Override
    public void run() {
        SingletonState state = SingletonState.getInstance();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            state.setFlag(flag);
            if(state.isFlag() != flag){
                System.out.println(runName + " : " + state.isFlag());
            }
        }
    }
}
