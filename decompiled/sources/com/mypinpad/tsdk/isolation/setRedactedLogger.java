package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setRedactedLogger extends setNavigationContentDescription {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f60392n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f60393o = 1;
    public final int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setRedactedLogger(@NotNull PinViewportDp pinViewportDp) {
        super(pinViewportDp, 4, 248);
        Intrinsics.checkNotNullParameter(pinViewportDp, "");
        this.m = 4;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        setRedactedLogger setredactedlogger = (setRedactedLogger) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i13 = f60392n;
        int i14 = ((i13 ^ 104) + ((i13 & 104) << 1)) - 1;
        f60393o = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (!(!super.setX(bArr))) {
            int i16 = f60392n;
            int i17 = (i16 & 87) + (i16 | 87);
            f60393o = i17 % 128;
            int i18 = i17 % 2;
            int i19 = setredactedlogger.m;
            int length = bArr.length;
            if (i18 != 0 ? length % i19 == 0 : (length >> i19) == 0) {
                int i20 = (i16 ^ 119) + ((i16 & 119) << 1);
                f60393o = i20 % 128;
                return Boolean.valueOf(i20 % 2 != 0);
            }
        }
        int i21 = f60393o;
        int i22 = i21 & 13;
        int i23 = -(-((i21 ^ 13) | i22));
        int i24 = (i22 & i23) + (i23 | i22);
        f60392n = i24 % 128;
        int i25 = i24 % 2;
        return Boolean.FALSE;
    }

    @Override // com.mypinpad.tsdk.isolation.setNavigationContentDescription, com.mypinpad.tsdk.isolation.setFindListener
    public final boolean setX(@NotNull byte[] bArr) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, 645118557, -645118557, System.identityHashCode(this))).booleanValue();
    }
}
