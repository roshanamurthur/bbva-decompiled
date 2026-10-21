package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class azl extends amw {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final azk f54205r0;

    public azl(boolean z10, azk azkVar) {
        super(z10);
        this.f54205r0 = azkVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return ((azl) objArr[0]).f54205r0;
    }

    public final azk setDividerPadding() {
        return (azk) setY(new Object[]{this}, -1124566291, 1124566291, System.identityHashCode(this));
    }
}
