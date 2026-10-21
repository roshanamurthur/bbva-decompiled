package com.google.zxing.common;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes10.dex */
public class DetectorResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f49825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultPoint[] f49826b;

    public DetectorResult(BitMatrix bitMatrix, ResultPoint[] resultPointArr) {
        this.f49825a = bitMatrix;
        this.f49826b = resultPointArr;
    }

    public final BitMatrix getBits() {
        return this.f49825a;
    }

    public final ResultPoint[] getPoints() {
        return this.f49826b;
    }
}
