package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f90542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f90543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigInteger f90544c;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f90542a = bigInteger;
        this.f90543b = bigInteger2;
        this.f90544c = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410PublicKeyParameterSetSpec)) {
            return false;
        }
        GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
        return this.f90544c.equals(gOST3410PublicKeyParameterSetSpec.f90544c) && this.f90542a.equals(gOST3410PublicKeyParameterSetSpec.f90542a) && this.f90543b.equals(gOST3410PublicKeyParameterSetSpec.f90543b);
    }

    public BigInteger getA() {
        return this.f90544c;
    }

    public BigInteger getP() {
        return this.f90542a;
    }

    public BigInteger getQ() {
        return this.f90543b;
    }

    public int hashCode() {
        return (this.f90544c.hashCode() ^ this.f90542a.hashCode()) ^ this.f90543b.hashCode();
    }
}
