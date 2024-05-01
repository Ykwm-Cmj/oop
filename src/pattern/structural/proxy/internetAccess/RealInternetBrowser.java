package pattern.structural.proxy.internetAccess;

public class RealInternetBrowser implements InternetBrowser {
    @Override
    public void browse(String url) {
        System.out.println("Accessing website: " + url);
        // 웹 페이지에 접속하는 로직을 추가 구현 가능
    }
}