package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class i2 extends e2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BigInteger f66071d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BigInteger f66072e = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f66073c;

    public i2(BigInteger bigInteger, g2 g2Var) {
        super(false, g2Var);
        this.f66073c = a(bigInteger, g2Var);
    }

    private BigInteger a(BigInteger bigInteger, g2 g2Var) {
        if (g2Var == null) {
            return bigInteger;
        }
        BigInteger bigInteger2 = f66072e;
        if (bigInteger2.compareTo(bigInteger) > 0 || g2Var.b().subtract(bigInteger2).compareTo(bigInteger) < 0 || !f66071d.equals(bigInteger.modPow(g2Var.c(), g2Var.b()))) {
            throw new IllegalArgumentException("y value does not appear to be in correct group");
        }
        return bigInteger;
    }
}
