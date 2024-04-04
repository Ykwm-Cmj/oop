package pattern.creational.singleton.test.globalstate;

public class SingletonState {
    private static SingletonState instance;
    private boolean flag;
    public static SingletonState getInstance(){
        if (instance == null)
            instance = new SingletonState();
        return instance;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
