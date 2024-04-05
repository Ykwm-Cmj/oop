package pattern.structural.adapter.computer;

public class MacComputer implements Computer {
    @Override
    public String search(String searchText) {
        return "result by search " + searchText;
    }

    @Override
    public void downLoadByInternet(long appId) {
        System.out.println(appId + " down load by internet");
    }
}
