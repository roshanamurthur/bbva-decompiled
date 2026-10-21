package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class pt extends px {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57738b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setMeasureWithLargestChildEnabled f57739a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(@NotNull setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled) {
        super(null);
        Intrinsics.checkNotNullParameter(setmeasurewithlargestchildenabled, "");
        this.f57739a = setmeasurewithlargestchildenabled;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        pt ptVar = (pt) objArr[0];
        int i13 = f57738b + 11;
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled = ptVar.f57739a;
        if (i15 == 0) {
            throw null;
        }
        int i16 = (i14 | 105) << 1;
        int i17 = -(((~i14) & 105) | (i14 & (-106)));
        int i18 = (i16 & i17) + (i16 | i17);
        f57738b = i18 % 128;
        if (i18 % 2 != 0) {
            int i19 = 46 / 0;
        }
        return setmeasurewithlargestchildenabled;
    }

    @NotNull
    public final setMeasureWithLargestChildEnabled setX() {
        return (setMeasureWithLargestChildEnabled) setY(new Object[]{this}, 1337190740, -1337190740, System.identityHashCode(this));
    }
}
