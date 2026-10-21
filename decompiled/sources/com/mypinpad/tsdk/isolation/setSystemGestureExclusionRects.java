package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class setSystemGestureExclusionRects {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60625a;

    public setSystemGestureExclusionRects(int i10) {
        this.f60625a = i10;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return Integer.valueOf(((setSystemGestureExclusionRects) objArr[0]).f60625a);
    }

    public final int setDividerPadding() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1114753942, -1114753942, System.identityHashCode(this))).intValue();
    }
}
