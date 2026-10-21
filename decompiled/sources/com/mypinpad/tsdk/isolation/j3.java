package com.mypinpad.tsdk.isolation;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class j3 extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f56599g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56600h = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Bitmap f56601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56602f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(@NotNull String str, float f6, @NotNull Typeface typeface, @Nullable Bitmap bitmap, int i10) {
        super(str, f6, typeface, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(typeface, "");
        this.f56601e = bitmap;
        this.f56602f = i10;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-463)) + (i10 * 465);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~(i14 | i10);
        if ((((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13 == 1) {
            j3 j3Var = (j3) objArr[0];
            int i18 = f56599g;
            int i19 = i18 ^ 25;
            int i20 = ((((i18 & 25) | i19) << 1) - (~(-i19))) - 1;
            int i21 = i20 % 128;
            f56600h = i21;
            int i22 = i20 % 2;
            int i23 = j3Var.f56602f;
            int i24 = ((i21 ^ 8) + ((i21 & 8) << 1)) - 1;
            f56599g = i24 % 128;
            int i25 = i24 % 2;
            return Integer.valueOf(i23);
        }
        j3 j3Var2 = (j3) objArr[0];
        int i26 = (-2) - ((f56600h + 126) ^ (-1));
        int i27 = i26 % 128;
        f56599g = i27;
        int i28 = i26 % 2;
        Bitmap bitmap = j3Var2.f56601e;
        int i29 = ((i27 ^ 109) | (i27 & 109)) << 1;
        int i30 = -(((~i27) & 109) | (i27 & (-110)));
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        f56600h = i31 % 128;
        if (i31 % 2 != 0) {
            return bitmap;
        }
        throw null;
    }
}
