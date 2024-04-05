package pattern.structural.adapter.vault;

public class Vault110 implements Vault {
    @Override
    public void charge(int power) {
        System.out.println("110 vault charging " + power);
    }
}
