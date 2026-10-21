package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class setAccessibilityHeading extends setSystemGestureExclusionRects {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f58223d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f58224e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setClipChildren f58225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final setProgressTintList f58226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAccessibilityHeading(int i10, @NotNull setClipChildren setclipchildren, @Nullable setProgressTintList setprogresstintlist) {
        super(i10);
        Intrinsics.checkNotNullParameter(setclipchildren, "");
        this.f58225b = setclipchildren;
        this.f58226c = setprogresstintlist;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
        int i18 = ~(i15 | i16);
        int i19 = ~(i12 | i10);
        if ((((~(i10 | i15)) | (~(i14 | i16)) | i19) * 520) + ((i18 | i19) * (-1040)) + i17 != 1) {
            setAccessibilityHeading setaccessibilityheading = (setAccessibilityHeading) objArr[0];
            int i20 = f58224e;
            int i21 = i20 & 47;
            int i22 = (i21 - (~((i20 ^ 47) | i21))) - 1;
            int i23 = i22 % 128;
            f58223d = i23;
            int i24 = i22 % 2;
            obj = setaccessibilityheading.f58226c;
            if (i24 != 0) {
                int i25 = 58 / 0;
            }
            int i26 = ((i23 ^ 83) | (i23 & 83)) << 1;
            int i27 = -(((~i23) & 83) | (i23 & (-84)));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            f58224e = i28 % 128;
            if (i28 % 2 == 0) {
                throw null;
            }
        } else {
            setAccessibilityHeading setaccessibilityheading2 = (setAccessibilityHeading) objArr[0];
            int i29 = f58223d;
            int i30 = i29 & 13;
            int i31 = -(-(i29 | 13));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            int i33 = i32 % 128;
            f58224e = i33;
            int i34 = i32 % 2;
            obj = setaccessibilityheading2.f58225b;
            int i35 = ((i33 ^ 26) + ((i33 & 26) << 1)) - 1;
            f58223d = i35 % 128;
            if (i35 % 2 != 0) {
                int i36 = 41 / 0;
            }
        }
        return obj;
    }

    @Nullable
    public final setProgressTintList setOnFocusChangeListener() {
        return (setProgressTintList) setY(new Object[]{this}, -639969926, 639969926, System.identityHashCode(this));
    }

    @NotNull
    public String toString() {
        int i10 = f58224e;
        int i11 = ((i10 | 87) << 1) - (i10 ^ 87);
        f58223d = i11 % 128;
        if (i11 % 2 == 0) {
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            return "";
        }
        setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
        int i12 = 2 / 0;
        return "";
    }

    @NotNull
    public final setClipChildren setY() {
        return (setClipChildren) setY(new Object[]{this}, -1450404791, 1450404792, System.identityHashCode(this));
    }
}
