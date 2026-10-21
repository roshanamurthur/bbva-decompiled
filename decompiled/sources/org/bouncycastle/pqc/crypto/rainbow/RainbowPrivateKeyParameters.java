package org.bouncycastle.pqc.crypto.rainbow;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowPrivateKeyParameters extends RainbowKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final short[][] f91239r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final short[] f91240s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final short[][] f91241t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final short[] f91242u0;
    public final int[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Layer[] f91243w0;

    public RainbowPrivateKeyParameters(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        super(true, iArr[iArr.length - 1] - iArr[0]);
        this.f91239r0 = sArr;
        this.f91240s0 = sArr2;
        this.f91241t0 = sArr3;
        this.f91242u0 = sArr4;
        this.v0 = iArr;
        this.f91243w0 = layerArr;
    }

    public short[] getB1() {
        return this.f91240s0;
    }

    public short[] getB2() {
        return this.f91242u0;
    }

    public short[][] getInvA1() {
        return this.f91239r0;
    }

    public short[][] getInvA2() {
        return this.f91241t0;
    }

    public Layer[] getLayers() {
        return this.f91243w0;
    }

    public int[] getVi() {
        return this.v0;
    }
}
