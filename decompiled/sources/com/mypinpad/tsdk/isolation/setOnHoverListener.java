package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnHoverListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60244c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60245d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final md f60246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setMaxWidth f60247b;

    public setOnHoverListener(@NotNull md mdVar, @NotNull setMaxWidth setmaxwidth) {
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(setmaxwidth, "");
        this.f60246a = mdVar;
        this.f60247b = setmaxwidth;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int iHashCode;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46);
        if (i15 == 1) {
            setOnHoverListener setonhoverlistener = (setOnHoverListener) objArr[0];
            int i16 = f60245d;
            int i17 = i16 ^ 47;
            int i18 = ((i16 & 47) | i17) << 1;
            int i19 = -i17;
            int i20 = (i18 & i19) + (i18 | i19);
            f60244c = i20 % 128;
            int i21 = i20 % 2;
            setMaxWidth setmaxwidth = setonhoverlistener.f60247b;
            if (i21 == 0) {
                return setmaxwidth;
            }
            int i22 = 41 / 0;
            return setmaxwidth;
        }
        if (i15 == 2) {
            int i23 = ((-1) << 1) - ((f60245d + 24) ^ (-1));
            int i24 = i23 % 128;
            f60244c = i24;
            int i25 = i23 % 2;
            int i26 = i24 & 107;
            int i27 = ((i24 | 107) & (~i26)) + (i26 << 1);
            f60245d = i27 % 128;
            int i28 = i27 % 2;
            return "KCDFTT";
        }
        if (i15 == 3) {
            setOnHoverListener setonhoverlistener2 = (setOnHoverListener) objArr[0];
            int i29 = f60245d + 93;
            int i30 = i29 % 128;
            f60244c = i30;
            int i31 = i29 % 2;
            md mdVar = setonhoverlistener2.f60246a;
            int i32 = i30 + 123;
            f60245d = i32 % 128;
            int i33 = i32 % 2;
            return mdVar;
        }
        if (i15 != 4) {
            setOnHoverListener setonhoverlistener3 = (setOnHoverListener) objArr[0];
            int i34 = f60245d;
            int i35 = ((((i34 ^ 53) | (i34 & 53)) << 1) - (~(-(((~i34) & 53) | (i34 & (-54)))))) - 1;
            f60244c = i35 % 128;
            int i36 = i35 % 2;
            int iHashCode2 = setonhoverlistener3.f60246a.hashCode();
            if (i36 != 0) {
                iHashCode = (iHashCode2 >>> 5) >>> setonhoverlistener3.f60247b.hashCode();
            } else {
                int i37 = iHashCode2 * 31;
                int iHashCode3 = setonhoverlistener3.f60247b.hashCode();
                iHashCode = ((iHashCode3 & i37) << 1) + (i37 ^ iHashCode3);
            }
            return Integer.valueOf(iHashCode);
        }
        setOnHoverListener setonhoverlistener4 = (setOnHoverListener) objArr[0];
        Object obj = objArr[1];
        int i38 = f60244c;
        int i39 = ((i38 | 45) << 1) - (i38 ^ 45);
        int i40 = i39 % 128;
        f60245d = i40;
        int i41 = i39 % 2;
        if (setonhoverlistener4 != obj) {
            if (!(obj instanceof setOnHoverListener)) {
                int i42 = i40 & 101;
                int i43 = (i42 - (~(-(-((i40 ^ 101) | i42))))) - 1;
                f60244c = i43 % 128;
                return Boolean.valueOf(i43 % 2 != 0);
            }
            setOnHoverListener setonhoverlistener5 = (setOnHoverListener) obj;
            if (setonhoverlistener4.f60246a != setonhoverlistener5.f60246a) {
                int i44 = i40 & 59;
                int i45 = ((~i44) & (i40 | 59)) + (i44 << 1);
                int i46 = i45 % 128;
                f60244c = i46;
                int i47 = i45 % 2;
                int i48 = i46 & 107;
                int i49 = i48 + ((i46 ^ 107) | i48);
                f60245d = i49 % 128;
                if (i49 % 2 == 0) {
                    throw null;
                }
            } else if (!Intrinsics.areEqual(setonhoverlistener4.f60247b, setonhoverlistener5.f60247b)) {
                int i50 = f60244c;
                int i51 = i50 & 53;
                int i52 = -(-(i50 | 53));
                int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                f60245d = i53 % 128;
                int i54 = i53 % 2;
                int i55 = i50 & 111;
                int i56 = (i50 ^ 111) | i55;
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                f60245d = i57 % 128;
                int i58 = i57 % 2;
            } else {
                int i59 = f60245d;
                int i60 = i59 & 45;
                int i61 = -(-((i59 ^ 45) | i60));
                int i62 = (i60 & i61) + (i61 | i60);
                f60244c = i62 % 128;
                int i63 = i62 % 2;
            }
            return Boolean.FALSE;
        }
        int i64 = i40 & 103;
        int i65 = -(-((i40 ^ 103) | i64));
        int i66 = ((i64 | i65) << 1) - (i64 ^ i65);
        f60244c = i66 % 128;
        int i67 = i66 % 2;
        int i68 = (((i40 & (-116)) | ((~i40) & 115)) - (~((i40 & 115) << 1))) - 1;
        f60244c = i68 % 128;
        if (i68 % 2 != 0) {
            throw null;
        }
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, -1382921422, 1382921426, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -578163249, 578163249, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final setMaxWidth setDividerPadding() {
        return (setMaxWidth) setCompoundDrawableTintBlendMode(new Object[]{this}, 654544735, -654544734, System.identityHashCode(this));
    }

    @NotNull
    public final md setY() {
        return (md) setCompoundDrawableTintBlendMode(new Object[]{this}, 2039294722, -2039294719, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1332780573, 1332780575, System.identityHashCode(this));
    }
}
