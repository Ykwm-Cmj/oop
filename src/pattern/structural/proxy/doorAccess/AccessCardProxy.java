package pattern.structural.proxy.doorAccess;

/**
 *  출입 카드를 사용하여 출입을 제어하는 문단속 프록시 클래스
 */
public class AccessCardProxy implements AccessCard {
    private RealAccessCard realAccessCard;

    public AccessCardProxy(String owner) {
        this.realAccessCard = new RealAccessCard(owner);
    }

    @Override
    public void access(String enteredOwner) {
        // 프록시에서 출입 체크
        realAccessCard.access(enteredOwner);
    }

}
