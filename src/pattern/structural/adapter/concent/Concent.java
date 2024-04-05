package pattern.structural.adapter.concent;

import pattern.structural.adapter.vault.Vault;

public class Concent<T extends Vault> implements ConcentricPlug<T> {
    private int power;

    public Concent(int power) {
        this.power = power;
    }

    @Override
    public void charge(T vault) {
        vault.charge(power);
    }
}
