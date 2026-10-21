package com.google.zxing.pdf417.encoder;

/* JADX INFO: loaded from: classes10.dex */
public final class Dimensions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50016d;

    public Dimensions(int i10, int i11, int i12, int i13) {
        this.f50013a = i10;
        this.f50014b = i11;
        this.f50015c = i12;
        this.f50016d = i13;
    }

    public int getMaxCols() {
        return this.f50014b;
    }

    public int getMaxRows() {
        return this.f50016d;
    }

    public int getMinCols() {
        return this.f50013a;
    }

    public int getMinRows() {
        return this.f50015c;
    }
}
