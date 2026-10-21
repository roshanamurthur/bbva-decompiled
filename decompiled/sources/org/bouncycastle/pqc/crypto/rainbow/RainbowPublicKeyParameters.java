package org.bouncycastle.pqc.crypto.rainbow;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowPublicKeyParameters extends RainbowKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final short[][] f91244r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final short[][] f91245s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final short[] f91246t0;

    public RainbowPublicKeyParameters(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        super(false, i10);
        this.f91244r0 = sArr;
        this.f91245s0 = sArr2;
        this.f91246t0 = sArr3;
    }

    public short[][] getCoeffQuadratic() {
        return this.f91244r0;
    }

    public short[] getCoeffScalar() {
        return this.f91246t0;
    }

    public short[][] getCoeffSingular() {
        return this.f91245s0;
    }
}
