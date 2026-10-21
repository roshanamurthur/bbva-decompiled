package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setCustomInsertionActionModeCallback extends setWeightSum {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59611b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getVersion f59612a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCustomInsertionActionModeCallback(@NotNull getVersion getversion) {
        super(null);
        Intrinsics.checkNotNullParameter(getversion, "");
        this.f59612a = getversion;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = (setCustomInsertionActionModeCallback) objArr[0];
        int i13 = f59611b;
        int i14 = ((i13 | 87) << 1) - (i13 ^ 87);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        getVersion getversion = setcustominsertionactionmodecallback.f59612a;
        int i17 = ((i15 ^ 97) | (i15 & 97)) << 1;
        int i18 = -(((~i15) & 97) | (i15 & (-98)));
        int i19 = (i17 & i18) + (i18 | i17);
        f59611b = i19 % 128;
        if (i19 % 2 != 0) {
            return getversion;
        }
        throw null;
    }

    @NotNull
    public final getVersion setY() {
        return (getVersion) setX(new Object[]{this}, 1128251757, -1128251757, System.identityHashCode(this));
    }
}
