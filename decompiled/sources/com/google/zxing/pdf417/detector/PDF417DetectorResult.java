package com.google.zxing.pdf417.detector;

import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class PDF417DetectorResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f50007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ResultPoint[]> f50008b;

    public PDF417DetectorResult(BitMatrix bitMatrix, List<ResultPoint[]> list) {
        this.f50007a = bitMatrix;
        this.f50008b = list;
    }

    public BitMatrix getBits() {
        return this.f50007a;
    }

    public List<ResultPoint[]> getPoints() {
        return this.f50008b;
    }
}
