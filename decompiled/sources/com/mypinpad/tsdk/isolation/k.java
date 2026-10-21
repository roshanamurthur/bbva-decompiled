package com.mypinpad.tsdk.isolation;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/k;", "", "Lcom/mypinpad/tsdk/i/i9;", "Lcom/mypinpad/tsdk/i/j3;"}, k = 1, mv = {1, 5, 1})
abstract class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56732d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f56733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Typeface f56735c;

    public k(String str, float f6, Typeface typeface, DefaultConstructorMarker defaultConstructorMarker) {
        this.f56733a = str;
        this.f56734b = f6;
        this.f56735c = typeface;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~(i10 | i12);
        int i17 = ((i15 | i16) * (-814)) + i13;
        int i18 = ~(i14 | (~i12));
        int i19 = ~i10;
        int i20 = ~(i19 | i11);
        int i21 = (((~(i19 | i12)) | i20 | (~(i11 | i12))) * 407) + ((i18 | i20 | i16) * 407) + i17;
        if (i21 == 1) {
            k kVar = (k) objArr[0];
            int i22 = f56732d;
            int i23 = ((i22 ^ 3) - (~(-(-((i22 & 3) << 1))))) - 1;
            int i24 = i23 % 128;
            int i25 = i23 % 2;
            Typeface typeface = kVar.f56735c;
            if (i25 == 0) {
                throw null;
            }
            int i26 = (((i24 ^ 83) | (i24 & 83)) << 1) - (((~i24) & 83) | (i24 & (-84)));
            f56732d = i26 % 128;
            int i27 = i26 % 2;
            return typeface;
        }
        if (i21 != 2) {
            k kVar2 = (k) objArr[0];
            int i28 = f56732d;
            int i29 = ((i28 & (-54)) | ((~i28) & 53)) + ((i28 & 53) << 1);
            int i30 = i29 % 128;
            int i31 = i29 % 2;
            String str = kVar2.f56733a;
            if (i31 == 0) {
                throw null;
            }
            int i32 = (i28 & 103) + (i28 | 103);
            int i33 = i32 % 128;
            int i34 = i32 % 2;
            return str;
        }
        k kVar3 = (k) objArr[0];
        int i35 = f56732d + 125;
        int i36 = i35 % 128;
        int i37 = i35 % 2;
        float f6 = kVar3.f56734b;
        int i38 = i36 & 49;
        int i39 = ((((i36 ^ 49) | i38) << 1) - (~(-((i36 | 49) & (~i38))))) - 1;
        f56732d = i39 % 128;
        if (i39 % 2 == 0) {
            return Float.valueOf(f6);
        }
        throw null;
    }
}
