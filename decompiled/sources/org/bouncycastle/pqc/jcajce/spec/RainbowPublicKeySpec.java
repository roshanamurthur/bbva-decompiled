package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowPublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final short[][] f91565p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final short[][] f91566q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final short[] f91567r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91568s0;

    public RainbowPublicKeySpec(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f91568s0 = i10;
        this.f91565p0 = sArr;
        this.f91566q0 = sArr2;
        this.f91567r0 = sArr3;
    }

    public short[][] getCoeffQuadratic() {
        return this.f91565p0;
    }

    public short[] getCoeffScalar() {
        return this.f91567r0;
    }

    public short[][] getCoeffSingular() {
        return this.f91566q0;
    }

    public int getDocLength() {
        return this.f91568s0;
    }
}
