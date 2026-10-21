package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnTouchListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60265c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f60266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f60267b;

    public setOnTouchListener(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f60266a = str;
        this.f60267b = str2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        if ((((~((~i10) | i12)) | (~(i11 | i15))) * 406) + ((~(i13 | i15 | i10)) * (-406)) + ((i14 | (~(i15 | i10 | i11))) * (-406)) + (i11 * 407) + (i10 * (-405)) != 1) {
            setOnTouchListener setontouchlistener = (setOnTouchListener) objArr[0];
            int i16 = (-2) - ((f60265c + 18) ^ (-1));
            int i17 = i16 % 128;
            int i18 = i16 % 2;
            String str = setontouchlistener.f60267b;
            int i19 = (-2) - ((i17 + 80) ^ (-1));
            f60265c = i19 % 128;
            int i20 = i19 % 2;
            return str;
        }
        setOnTouchListener setontouchlistener2 = (setOnTouchListener) objArr[0];
        int i21 = f60265c + 32;
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        int i23 = i22 % 128;
        int i24 = i22 % 2;
        String str2 = setontouchlistener2.f60266a;
        if (i24 != 0) {
            throw null;
        }
        int i25 = ((i23 & 95) - (~(-(-(i23 | 95))))) - 1;
        f60265c = i25 % 128;
        int i26 = i25 % 2;
        return str2;
    }

    @NotNull
    public final String setDividerPadding() {
        return (String) setY(new Object[]{this}, 103510472, -103510471, System.identityHashCode(this));
    }

    @NotNull
    public final String setX() {
        return (String) setY(new Object[]{this}, -1408297812, 1408297812, System.identityHashCode(this));
    }
}
