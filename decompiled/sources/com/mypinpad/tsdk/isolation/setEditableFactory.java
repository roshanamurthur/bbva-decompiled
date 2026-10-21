package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setEditableFactory extends Endpoint {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f59645q0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final setWeightSum f59646p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setEditableFactory(@NotNull setWeightSum setweightsum) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(setweightsum, "");
        this.f59646p0 = setweightsum;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setEditableFactory seteditablefactory = (setEditableFactory) objArr[0];
        int i13 = f59645q0 + 73;
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        setWeightSum setweightsum = seteditablefactory.f59646p0;
        int i16 = i14 & 61;
        int i17 = ((i14 ^ 61) | i16) << 1;
        int i18 = -((i14 | 61) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        f59645q0 = i19 % 128;
        int i20 = i19 % 2;
        return setweightsum;
    }

    @NotNull
    public final setWeightSum setDividerPadding() {
        return (setWeightSum) setDividerPadding(new Object[]{this}, -1013583289, 1013583289, System.identityHashCode(this));
    }
}
