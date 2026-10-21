package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
public class ElGamalPublicKeySpec extends ElGamalKeySpec {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f90533q0;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f90533q0 = bigInteger;
    }

    public BigInteger getY() {
        return this.f90533q0;
    }
}
