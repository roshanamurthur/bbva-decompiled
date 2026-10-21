package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOverScrollMode {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60281c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60282d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f60283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f60284b;

    public setOverScrollMode(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f60283a = str;
        this.f60284b = str2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~(i13 | i12);
        int i16 = ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
        int i17 = ~i11;
        int i18 = ((i15 | (~(i17 | i12))) * 140) + i16;
        int i19 = ~(i13 | i17 | i12);
        int i20 = ~i12;
        if ((((~(i10 | i20 | i17)) | (~(i11 | i13 | i20)) | i19) * 140) + i18 == 1) {
            setOverScrollMode setoverscrollmode = (setOverScrollMode) objArr[0];
            int i21 = f60281c;
            int i22 = ((i21 | 77) << 1) - (i21 ^ 77);
            int i23 = i22 % 128;
            f60282d = i23;
            int i24 = i22 % 2;
            String str = setoverscrollmode.f60283a;
            int i25 = i23 & 73;
            int i26 = -(-((i23 ^ 73) | i25));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            f60281c = i27 % 128;
            int i28 = i27 % 2;
            return str;
        }
        setOverScrollMode setoverscrollmode2 = (setOverScrollMode) objArr[0];
        int i29 = f60282d;
        int i30 = i29 ^ 99;
        int i31 = (i29 & 99) << 1;
        int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
        f60281c = i32 % 128;
        int i33 = i32 % 2;
        String str2 = setoverscrollmode2.f60284b;
        if (i33 != 0) {
            throw null;
        }
        int i34 = i29 & 71;
        int i35 = (i34 - (~(-(-((i29 ^ 71) | i34))))) - 1;
        f60281c = i35 % 128;
        if (i35 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setY(new Object[]{this}, -1826405260, 1826405260, System.identityHashCode(this));
    }

    @NotNull
    public final String setX() {
        return (String) setY(new Object[]{this}, -1032775005, 1032775006, System.identityHashCode(this));
    }
}
