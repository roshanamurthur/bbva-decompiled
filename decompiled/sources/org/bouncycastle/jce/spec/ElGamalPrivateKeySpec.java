package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f90532q0;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f90532q0 = bigInteger;
    }

    public BigInteger getX() {
        return this.f90532q0;
    }
}
