package pattern.behavioral.strategy.game.users;

import pattern.behavioral.strategy.game.strategyEnums.AttackStrategy;
import pattern.behavioral.strategy.game.strategyIntefaces.Attack;

public class User {
    private int level;
    private int str;
    private int dex;
    private int intel;
    private int luk;
    private Attack attack;

    public User(AttackStrategy attack) {
        this.attack = attack::attack;
    }
    public User(Attack attack) {
        this.attack = attack;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setLuk(int luk) {
        this.luk = luk;
    }

    public void setAttack(AttackStrategy attack) {
        this.attack = attack::attack;
    }
    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public void attck(){
        int damage = attack.attack(str, luk);
        System.out.println(damage + "의 피해를 입혔습니다.");
    }

    public void move(){

    }
}
