package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class DSAPublicKeyParameters extends DSAKeyParameters {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final BigInteger f89257s0 = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final BigInteger f89258t0 = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89259r0;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (org.bouncycastle.crypto.params.DSAPublicKeyParameters.f89257s0.equals(r3.modPow(r4.getQ(), r4.getP())) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DSAPublicKeyParameters(java.math.BigInteger r3, org.bouncycastle.crypto.params.DSAParameters r4) {
        /*
            r2 = this;
            r0 = 0
            r2.<init>(r0, r4)
            if (r4 == 0) goto L39
            java.math.BigInteger r0 = org.bouncycastle.crypto.params.DSAPublicKeyParameters.f89258t0
            int r1 = r0.compareTo(r3)
            if (r1 > 0) goto L31
            java.math.BigInteger r1 = r4.getP()
            java.math.BigInteger r0 = r1.subtract(r0)
            int r0 = r0.compareTo(r3)
            if (r0 < 0) goto L31
            java.math.BigInteger r0 = r4.getQ()
            java.math.BigInteger r4 = r4.getP()
            java.math.BigInteger r4 = r3.modPow(r0, r4)
            java.math.BigInteger r0 = org.bouncycastle.crypto.params.DSAPublicKeyParameters.f89257s0
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L31
            goto L39
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "y value does not appear to be in correct group"
            r3.<init>(r4)
            throw r3
        L39:
            r2.f89259r0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.params.DSAPublicKeyParameters.<init>(java.math.BigInteger, org.bouncycastle.crypto.params.DSAParameters):void");
    }

    public BigInteger getY() {
        return this.f89259r0;
    }
}
