package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class vp extends wl {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61574s0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final vr f61575r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(@NotNull vr vrVar) {
        super(wm.setY, null);
        Intrinsics.checkNotNullParameter(vrVar, "");
        this.f61575r0 = vrVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        vp vpVar = (vp) objArr[0];
        int i13 = f61574s0;
        int i14 = (i13 & 123) + (i13 | 123);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        vr vrVar = vpVar.f61575r0;
        if (i16 != 0) {
            throw null;
        }
        int i17 = i15 + 43;
        f61574s0 = i17 % 128;
        int i18 = i17 % 2;
        return vrVar;
    }

    @NotNull
    public final vr setOnFocusChangeListener() {
        return (vr) setY(new Object[]{this}, 1751351831, -1751351831, System.identityHashCode(this));
    }
}
