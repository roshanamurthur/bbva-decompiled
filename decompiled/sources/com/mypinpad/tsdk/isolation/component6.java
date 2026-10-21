package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class component6 extends component9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54974a;

    public component6(boolean z10) {
        super(null);
        this.f54974a = z10;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return Boolean.valueOf(((component6) objArr[0]).f54974a);
    }

    public final boolean setX() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 323682778, -323682778, System.identityHashCode(this))).booleanValue();
    }
}
