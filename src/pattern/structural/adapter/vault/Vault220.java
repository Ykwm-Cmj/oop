package pattern.structural.adapter.vault;

public class Vault220 implements Vault {
    @Override
    public void charge(int power) {
        System.out.println("220 vault charging " + power);
    }
}
