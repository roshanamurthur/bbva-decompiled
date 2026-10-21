package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class component3 extends component9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f54901a;

    public component3(boolean z10) {
        super(null);
        this.f54901a = z10;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return Boolean.valueOf(((component3) objArr[0]).f54901a);
    }

    public final boolean setX() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1640427560, 1640427560, System.identityHashCode(this))).booleanValue();
    }
}
