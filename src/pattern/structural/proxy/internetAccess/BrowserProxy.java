package pattern.structural.proxy.internetAccess;

/**
 * 프록시 서버: 웹 브라우저 내부에 위치하며, 클라이언트와 웹 서버 간의 통신을 중개합니다.
 * 프록시 서버는 클라이언트 요청을 받아 웹 서버에 전달하고,
 * 서버로부터 받은 응답을 클라이언트에게 전달합니다. 이 과정에서 프록시 서버는 요청
 * 및 응답을 필터링하거나 캐싱하여 성능을 향상시키거나 보안을 강화할 수 있습니다.
 */

public class BrowserProxy implements InternetBrowser {
    private InternetBrowser realBrowser;

    @Override
    public void browse(String url) {
        if (isValidSite(url)) {
            // 유효한 웹 사이트인 경우에만 실제 인터넷 브라우저를 생성하여 웹 페이지에 접속
            if (realBrowser == null) {
                realBrowser = new RealInternetBrowser();
            }
            realBrowser.browse(url);
        } else {
            System.out.println("접근할 수 없는 사이트입니다.");
        }
    }

    private boolean isValidSite(String url) {
        //웹 사이트의 유효성을 검사하는 로직을 추가가능
        // ->차단된 사이트인지 확인
        return !url.contains("blocked_site.com");
    }
}
