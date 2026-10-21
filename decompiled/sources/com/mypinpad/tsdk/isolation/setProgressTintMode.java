package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setProgressTintMode extends getInstallationId {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f60390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Terminal f60391d = Terminal.KERNEL_6;

    public setProgressTintMode(boolean z10) {
        this.f60390c = z10;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 591) + (i10 * (-589));
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (~(i14 | i10)) | (~(i14 | i15)) | (~(i15 | i10));
        int i17 = ~i10;
        int i18 = (((~(i12 | i17 | i11)) | i16) * 590) + i13;
        int i19 = (((~(i17 | i15)) | (~(i11 | i15))) * 590) + (i16 * (-1180)) + i18;
        if (i19 == 1) {
            return Boolean.valueOf(((setProgressTintMode) objArr[0]).f60390c);
        }
        if (i19 != 2) {
            return ((setProgressTintMode) objArr[0]).f60391d;
        }
        return Boolean.TRUE;
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    @NotNull
    public final Terminal setOnFocusChangeListener() {
        return (Terminal) setDividerPadding(new Object[]{this}, -2026751668, 2026751668, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getInstallationId
    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 84573845, -84573843, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setDividerPadding() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1929988626, -1929988625, System.identityHashCode(this))).booleanValue();
    }
}
