package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.pqc.crypto.rainbow.Layer;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowPrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final short[][] f91559p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final short[] f91560q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final short[][] f91561r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final short[] f91562s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int[] f91563t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Layer[] f91564u0;

    public RainbowPrivateKeySpec(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, Layer[] layerArr) {
        this.f91559p0 = sArr;
        this.f91560q0 = sArr2;
        this.f91561r0 = sArr3;
        this.f91562s0 = sArr4;
        this.f91563t0 = iArr;
        this.f91564u0 = layerArr;
    }

    public short[] getB1() {
        return this.f91560q0;
    }

    public short[] getB2() {
        return this.f91562s0;
    }

    public short[][] getInvA1() {
        return this.f91559p0;
    }

    public short[][] getInvA2() {
        return this.f91561r0;
    }

    public Layer[] getLayers() {
        return this.f91564u0;
    }

    public int[] getVi() {
        return this.f91563t0;
    }
}
