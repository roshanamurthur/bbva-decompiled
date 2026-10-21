package com.google.zxing.qrcode.detector;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes10.dex */
public final class FinderPattern extends ResultPoint {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50046d;

    public FinderPattern(float f6, float f10, float f11, int i10) {
        super(f6, f10);
        this.f50045c = f11;
        this.f50046d = i10;
    }

    public float getEstimatedModuleSize() {
        return this.f50045c;
    }
}
