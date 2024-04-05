package pattern.structural.adapter.adapters;

import pattern.structural.adapter.computer.Computer;
import pattern.structural.adapter.phone.OldPhone;

public class SmartPhone extends OldPhone {
    private Computer computer;
    public SmartPhone(String myPhoneNumber, Computer computer) {
        super(myPhoneNumber);
        this.computer = computer;
    }

    public String search(String searchText){
        return computer.search(searchText);
    }

    public void downLoadByInternet(String appName){
        computer.downLoadByInternet(AppId.valueOf(appName).getId());
    }

    private enum AppId{
        KAKAO_TOLK(0), NAVER(1), GOOGLE(2);
        private long id;
        private AppId(long id){
            this.id = id;
        }

        public long getId() {
            return id;
        }
    }
}
