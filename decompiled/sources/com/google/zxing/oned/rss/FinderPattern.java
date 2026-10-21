package com.google.zxing.oned.rss;

import com.google.zxing.ResultPoint;

/* JADX INFO: loaded from: classes10.dex */
public final class FinderPattern {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f49962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultPoint[] f49963c;

    public FinderPattern(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f49961a = i10;
        this.f49962b = iArr;
        float f6 = i13;
        this.f49963c = new ResultPoint[]{new ResultPoint(i11, f6), new ResultPoint(i12, f6)};
    }

    public boolean equals(Object obj) {
        return (obj instanceof FinderPattern) && this.f49961a == ((FinderPattern) obj).f49961a;
    }

    public ResultPoint[] getResultPoints() {
        return this.f49963c;
    }

    public int[] getStartEnd() {
        return this.f49962b;
    }

    public int getValue() {
        return this.f49961a;
    }

    public int hashCode() {
        return this.f49961a;
    }
}
