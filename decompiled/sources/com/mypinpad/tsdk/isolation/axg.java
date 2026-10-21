package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class axg extends amw {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final axi f54092r0;

    public axg(boolean z10, axi axiVar) {
        super(z10);
        this.f54092r0 = axiVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((axg) objArr[0]).f54092r0;
    }

    public final axi setOnFocusChangeListener() {
        return (axi) setDividerPadding(new Object[]{this}, -1434115185, 1434115185, System.identityHashCode(this));
    }
}
