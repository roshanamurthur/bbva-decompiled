package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes13.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f91190r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91191s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final GF2Matrix f91192t0;

    public McEliecePublicKeyParameters(int i10, int i11, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f91190r0 = i10;
        this.f91191s0 = i11;
        this.f91192t0 = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f91192t0;
    }

    public int getK() {
        return this.f91192t0.getNumRows();
    }

    public int getN() {
        return this.f91190r0;
    }

    public int getT() {
        return this.f91191s0;
    }
}
