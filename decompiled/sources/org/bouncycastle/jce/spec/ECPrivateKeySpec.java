package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
public class ECPrivateKeySpec extends ECKeySpec {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f90526q0;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f90526q0 = bigInteger;
    }

    public BigInteger getD() {
        return this.f90526q0;
    }
}
