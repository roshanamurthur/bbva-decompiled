package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class setItemsCanFocus extends setForeground {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f59933p0;

    public setItemsCanFocus(boolean z10) {
        super(null);
        this.f59933p0 = z10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return Boolean.valueOf(((setItemsCanFocus) objArr[0]).f59933p0);
    }

    public final boolean setX() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -2146958847, 2146958847, System.identityHashCode(this))).booleanValue();
    }
}
