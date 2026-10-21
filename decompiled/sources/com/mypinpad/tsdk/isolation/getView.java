package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55990a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55991b = 1;

    @NotNull
    public static String setDividerPadding(@NotNull setChildIndicatorBounds setchildindicatorbounds, @NotNull String str, long j10) {
        return (String) setX(new Object[]{setchildindicatorbounds, str, Long.valueOf(j10)}, -475318592, 475318592, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        setChildIndicatorBounds setchildindicatorbounds = (setChildIndicatorBounds) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i13 = f55991b;
        int i14 = ((((i13 ^ 91) | (i13 & 91)) << 1) - (~(-(((~i13) & 91) | (i13 & (-92)))))) - 1;
        f55990a = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(setchildindicatorbounds, "");
        Intrinsics.checkNotNullParameter(str, "");
        String x4 = setchildindicatorbounds.setX(str, jLongValue);
        int i16 = f55990a;
        int i17 = ((i16 ^ 66) + ((i16 & 66) << 1)) - 1;
        f55991b = i17 % 128;
        if (i17 % 2 != 0) {
            return x4;
        }
        throw null;
    }
}
