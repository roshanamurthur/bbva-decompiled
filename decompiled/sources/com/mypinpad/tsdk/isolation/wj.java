package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class wj extends we {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f61658q0;

    public wj(boolean z10) {
        super(wf.setCompoundDrawableTintBlendMode, null);
        this.f61658q0 = z10;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return Boolean.valueOf(((wj) objArr[0]).f61658q0);
    }

    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, 974138031, -974138031, System.identityHashCode(this))).booleanValue();
    }
}
