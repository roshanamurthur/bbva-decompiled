package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class wc extends wl {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final byte[] f61618r0;

    public wc(@Nullable byte[] bArr) {
        super(wm.getNavBarTitleString, null);
        this.f61618r0 = bArr;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((wc) objArr[0]).f61618r0;
    }

    @Nullable
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1317396562, -1317396562, System.identityHashCode(this));
    }
}
