package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ww extends wi {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61693s0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final rb f61694r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(@NotNull rb rbVar) {
        super(wm.setAlwaysDrawnWithCacheEnabled, null);
        Intrinsics.checkNotNullParameter(rbVar, "");
        this.f61694r0 = rbVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        ww wwVar = (ww) objArr[0];
        int i13 = f61693s0;
        int i14 = ((i13 & 56) + (i13 | 56)) - 1;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        rb rbVar = wwVar.f61694r0;
        int i17 = (i15 ^ 13) + ((i15 & 13) << 1);
        f61693s0 = i17 % 128;
        int i18 = i17 % 2;
        return rbVar;
    }

    @NotNull
    public final rb setOnFocusChangeListener() {
        return (rb) setOnFocusChangeListener(new Object[]{this}, 868531281, -868531281, System.identityHashCode(this));
    }
}
