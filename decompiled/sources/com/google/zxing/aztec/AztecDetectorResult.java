package com.google.zxing.aztec;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;

/* JADX INFO: loaded from: classes10.dex */
public final class AztecDetectorResult extends DetectorResult {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49674e;

    public AztecDetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr, boolean z10, int i10, int i11) {
        super(bitMatrix, resultPointArr);
        this.f49672c = z10;
        this.f49673d = i10;
        this.f49674e = i11;
    }

    public int getNbDatablocks() {
        return this.f49673d;
    }

    public int getNbLayers() {
        return this.f49674e;
    }

    public boolean isCompact() {
        return this.f49672c;
    }
}
