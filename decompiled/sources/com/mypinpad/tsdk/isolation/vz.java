package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class vz extends wl {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61584s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final String f61585r0;

    public vz(@Nullable String str) {
        super(wm.setLayoutAnimation, null);
        this.f61585r0 = str;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        vz vzVar = (vz) objArr[0];
        int i13 = f61584s0;
        int i14 = ((i13 | 1) << 1) - (i13 ^ 1);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        String str = vzVar.f61585r0;
        if (i16 == 0) {
            throw null;
        }
        int i17 = i15 & 59;
        int i18 = -(-(i15 | 59));
        int i19 = (i17 & i18) + (i18 | i17);
        f61584s0 = i19 % 128;
        if (i19 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Nullable
    public final String setDividerPadding() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1493784240, 1493784240, System.identityHashCode(this));
    }
}
