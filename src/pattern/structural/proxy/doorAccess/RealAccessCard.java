package pattern.structural.proxy.doorAccess;

/**
 * 구현체
 */
public class RealAccessCard implements AccessCard {
    private String owner;

    public RealAccessCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void access(String enteredOwner) {
        // 유효성 검사 로직
        if (enteredOwner.equals(owner)) {
            System.out.println(owner + "님이 출입하였습니다.");
        } else {
            System.out.println("출입 권한이 없습니다.");
        }
    }
}