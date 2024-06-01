package pattern.behavioral.strategy.game.strategyEnums;

import pattern.behavioral.strategy.game.strategyIntefaces.Attack;

public enum AttackStrategy {
    FIST((str, luk) -> str),
    SWORD((str, luk) -> str * 3 + luk),
    GUN((str, luk) -> str * 10 + luk * 2);

    AttackStrategy(Attack attack) {
        this.attack = attack;
    }

    final Attack attack;

    public int attack(int str, int luk){
        return attack.attack(str, luk);
    }
}
