package pattern.structural.adapter.adapters;

import pattern.structural.adapter.vault.Vault110;
import pattern.structural.adapter.vault.Vault220;

public class Adapter110To220 extends Vault110 {
    private Vault220 vault220;

    public Adapter110To220(Vault220 vault220) {
        this.vault220 = vault220;
    }

    @Override
    public void charge(int power) {
        vault220.charge(power);
    }
}
