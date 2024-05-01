package pattern.structural.proxy.internetAccess;

public class Clent2 {
    public static void main(String[] args) {
        // 인터넷 브라우저 프록시를 생성하여 사용합니다.
        InternetBrowser browser = new BrowserProxy();
        browser.browse("https://www.example.com"); // 유효한 웹 사이트에 접속
        browser.browse("https://blocked_site.com"); // 차단된 사이트에 접속 시도
    }
}
