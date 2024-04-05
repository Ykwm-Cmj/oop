package pattern.structural.adapter.concent;

import pattern.structural.adapter.vault.Vault;

public interface ConcentricPlug<T extends Vault> {
    void charge(T vault);
}
