package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410PublicKeyParameters extends GOST3410KeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89303r0;

    public GOST3410PublicKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(false, gOST3410Parameters);
        this.f89303r0 = bigInteger;
    }

    public BigInteger getY() {
        return this.f89303r0;
    }
}
