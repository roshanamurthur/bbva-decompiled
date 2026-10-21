package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getAmountOther {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55672c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f55673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getClearButtonText f55674b;

    public getAmountOther(@NotNull getTransactionPortrait gettransactionportrait, @NotNull getClearButtonText getclearbuttontext) {
        Intrinsics.checkNotNullParameter(gettransactionportrait, "");
        Intrinsics.checkNotNullParameter(getclearbuttontext, "");
        this.f55673a = gettransactionportrait;
        this.f55674b = getclearbuttontext;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i15 = ~i11;
        if (((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14 != 1) {
            getAmountOther getamountother = (getAmountOther) objArr[0];
            int i16 = f55672c + 87;
            int i17 = i16 % 128;
            int i18 = i16 % 2;
            getTransactionPortrait gettransactionportrait = getamountother.f55673a;
            if (i18 != 0) {
                return gettransactionportrait;
            }
            throw null;
        }
        getAmountOther getamountother2 = (getAmountOther) objArr[0];
        int i19 = f55672c;
        int i20 = (((i19 | 52) << 1) - (i19 ^ 52)) - 1;
        int i21 = i20 % 128;
        int i22 = i20 % 2;
        getClearButtonText getclearbuttontext = getamountother2.f55674b;
        int i23 = i21 & 79;
        int i24 = -(-((i21 ^ 79) | i23));
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        f55672c = i25 % 128;
        int i26 = i25 % 2;
        return getclearbuttontext;
    }

    @NotNull
    public final getClearButtonText setY() {
        return (getClearButtonText) setX(new Object[]{this}, 883808993, -883808992, System.identityHashCode(this));
    }

    @NotNull
    public final getTransactionPortrait setX() {
        return (getTransactionPortrait) setX(new Object[]{this}, 1463202478, -1463202478, System.identityHashCode(this));
    }
}
