package io.dexnet.hdwalletkit;

public class CantDeriveNonHardened extends HDDerivationException {
    public CantDeriveNonHardened() {
        super("can't derive non hardened");
    }
}
