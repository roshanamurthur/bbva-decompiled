package com.google.zxing.qrcode.detector;

/* JADX INFO: loaded from: classes10.dex */
public final class FinderPatternInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FinderPattern f50054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FinderPattern f50055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FinderPattern f50056c;

    public FinderPatternInfo(FinderPattern[] finderPatternArr) {
        this.f50054a = finderPatternArr[0];
        this.f50055b = finderPatternArr[1];
        this.f50056c = finderPatternArr[2];
    }

    public FinderPattern getBottomLeft() {
        return this.f50054a;
    }

    public FinderPattern getTopLeft() {
        return this.f50055b;
    }

    public FinderPattern getTopRight() {
        return this.f50056c;
    }
}
