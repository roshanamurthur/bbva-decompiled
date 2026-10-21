package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TransactionErrorCause {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f51912a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51913b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        byte[] dividerPadding;
        setChildIndicatorBounds setchildindicatorbounds = (setChildIndicatorBounds) objArr[0];
        setBreakStrategy setbreakstrategy = (setBreakStrategy) objArr[1];
        int i13 = f51913b;
        int i14 = i13 & 109;
        int i15 = -(-(i13 | 109));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f51912a = i16 % 128;
        if (i16 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setchildindicatorbounds, "");
            Intrinsics.checkNotNullParameter(setbreakstrategy, "");
            dividerPadding = setchildindicatorbounds.setDividerPadding((byte[]) setBreakStrategy.setY(new Object[]{setbreakstrategy}, -1496220400, 1496220400, System.identityHashCode(setbreakstrategy)), (byte[]) setBreakStrategy.setY(new Object[]{setbreakstrategy}, -1690322503, 1690322504, System.identityHashCode(setbreakstrategy)));
            int i17 = 0 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setchildindicatorbounds, "");
            Intrinsics.checkNotNullParameter(setbreakstrategy, "");
            dividerPadding = setchildindicatorbounds.setDividerPadding((byte[]) setBreakStrategy.setY(new Object[]{setbreakstrategy}, -1496220400, 1496220400, System.identityHashCode(setbreakstrategy)), (byte[]) setBreakStrategy.setY(new Object[]{setbreakstrategy}, -1690322503, 1690322504, System.identityHashCode(setbreakstrategy)));
        }
        int i18 = f51912a;
        int i19 = (i18 & (-118)) | ((~i18) & 117);
        int i20 = -(-((i18 & 117) << 1));
        int i21 = (i19 & i20) + (i20 | i19);
        f51913b = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 77 / 0;
        }
        return dividerPadding;
    }

    @NotNull
    public static byte[] setOnFocusChangeListener(@NotNull setChildIndicatorBounds setchildindicatorbounds, @NotNull setBreakStrategy setbreakstrategy) {
        return (byte[]) setDividerPadding(new Object[]{setchildindicatorbounds, setbreakstrategy}, -1953644896, 1953644896, (int) System.currentTimeMillis());
    }
}
