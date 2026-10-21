package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getTotalElapsedTimeout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55965c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55966d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f55967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f55968b;

    public getTotalElapsedTimeout(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f55967a = str;
        this.f55968b = str2;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        String str;
        int i13 = ~i11;
        int i14 = (i13 * (-629)) + (i11 * (-628)) + (i10 * 630);
        int i15 = ~i10;
        if (((i15 | i11) * 629) + ((~(i13 | i15)) * (-629)) + i14 != 1) {
            getTotalElapsedTimeout gettotalelapsedtimeout = (getTotalElapsedTimeout) objArr[0];
            int i16 = f55966d;
            int i17 = i16 & 63;
            int i18 = ((i16 ^ 63) | i17) << 1;
            int i19 = -((i16 | 63) & (~i17));
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            int i21 = i20 % 128;
            f55965c = i21;
            int i22 = i20 % 2;
            str = gettotalelapsedtimeout.f55967a;
            int i23 = ((i21 & 42) + (i21 | 42)) - 1;
            f55966d = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 67 / 0;
            }
        } else {
            getTotalElapsedTimeout gettotalelapsedtimeout2 = (getTotalElapsedTimeout) objArr[0];
            int i25 = f55965c + 7;
            int i26 = i25 % 128;
            f55966d = i26;
            int i27 = i25 % 2;
            str = gettotalelapsedtimeout2.f55968b;
            if (i27 == 0) {
                throw null;
            }
            int i28 = i26 & 33;
            int i29 = i28 + ((i26 ^ 33) | i28);
            f55965c = i29 % 128;
            int i30 = i29 % 2;
        }
        return str;
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -669080270, 669080270, System.identityHashCode(this));
    }

    @NotNull
    public final String setDividerPadding() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -88803646, 88803647, System.identityHashCode(this));
    }
}
