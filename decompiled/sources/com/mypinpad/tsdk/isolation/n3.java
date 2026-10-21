package com.mypinpad.tsdk.isolation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class n3 extends Lambda implements Function1<getBeepOnFailure, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final n3 f57193p0 = new n3();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57194q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57195r0 = 1;

    static {
        int i10 = f57194q0;
        int i11 = i10 & 81;
        int i12 = i11 + ((i10 ^ 81) | i11);
        f57195r0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public n3() {
        super(1);
    }

    public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~(i15 | i12);
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13 | i12)) | (~(i15 | i17))) * 920) + (((~i15) | (~(i13 | i17))) * 920) + ((i16 | (~(i14 | i17 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919));
        boolean z10 = false;
        if (i18 != 1) {
            Object obj = objArr[1];
            int i19 = f57194q0;
            int i20 = ((i19 & (-100)) | ((~i19) & 99)) + ((i19 & 99) << 1);
            f57195r0 = i20 % 128;
            int i21 = i20 % 2;
            Boolean boolA = a(new Object[]{(getBeepOnFailure) obj}, -194157321, 194157322, (int) System.currentTimeMillis());
            int i22 = f57194q0;
            int i23 = i22 & 117;
            int i24 = ((i22 ^ 117) | i23) << 1;
            int i25 = -((i22 | 117) & (~i23));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f57195r0 = i26 % 128;
            int i27 = i26 % 2;
            return boolA;
        }
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i28 = f57195r0;
        int i29 = (i28 & 27) + (i28 | 27);
        f57194q0 = i29 % 128;
        int i30 = i29 % 2;
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        if (((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))).length() == 6) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            int i31 = f57195r0;
            int i32 = i31 & 27;
            int i33 = (i31 ^ 27) | i32;
            int i34 = (i32 & i33) + (i33 | i32);
            f57194q0 = i34 % 128;
            int i35 = i34 % 2;
            z10 = true;
        } else {
            int i36 = (-2) - ((f57195r0 + 112) ^ (-1));
            f57194q0 = i36 % 128;
            int i37 = i36 % 2;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i38 = f57195r0 + 33;
        f57194q0 = i38 % 128;
        int i39 = i38 % 2;
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(getBeepOnFailure getbeeponfailure) {
        return a(new Object[]{this, getbeeponfailure}, -1012063993, 1012063993, System.identityHashCode(this));
    }
}
