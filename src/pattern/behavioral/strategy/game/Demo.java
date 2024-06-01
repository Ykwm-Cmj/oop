package pattern.behavioral.strategy.game;

import pattern.behavioral.strategy.game.strategyEnums.AttackStrategy;
import pattern.behavioral.strategy.game.users.User;

public class Demo {
    public static void main(String[] args) {
        String how = "FIST";
        User user = new User(AttackStrategy.valueOf(how));
        user.setLuk(30);
        user.setStr(50);
        user.attck();

        user.setAttack(((str, luk) -> str / 10 + luk * 100));
        user.attck();

        user.setAttack(AttackStrategy.SWORD);
        user.attck();

    }
}
