package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class setAutoHandwritingEnabled {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59465a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59466b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-929)) + (i10 * (-464));
        int i14 = ~i10;
        int i15 = i11 | i12;
        if (((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13 == 1) {
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i16 = f59466b;
            int i17 = ((((i16 ^ 21) | (i16 & 21)) << 1) - (~(-(((~i16) & 21) | (i16 & (-22)))))) - 1;
            f59465a = i17 % 128;
            int i18 = i17 % 2;
            int iIntValue2 = ((Integer) setDividerPadding(new Object[]{getbeeponfailure, Integer.valueOf(iIntValue)}, -920819064, 920819064, iIntValue)).intValue();
            int i19 = f59466b;
            int i20 = (((i19 | 7) << 1) - (~(-(((~i19) & 7) | (i19 & (-8)))))) - 1;
            f59465a = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 28 / 0;
            }
            return Integer.valueOf(iIntValue2);
        }
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[0];
        int iIntValue3 = ((Number) objArr[1]).intValue();
        int i22 = f59465a;
        int i23 = ((i22 | 105) << 1) - (i22 ^ 105);
        f59466b = i23 % 128;
        int i24 = i23 % 2;
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
        String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
        int i25 = iIntValue3 << 1;
        int i26 = i25 * (-864);
        int i27 = 1732 & i26;
        int i28 = i27 + ((i26 ^ 1732) | i27);
        int i29 = ~i25;
        int i30 = ~iIntValue3;
        int i31 = (i30 | iIntValue3) & i30;
        int i32 = ~(((-3) & i31) | ((-3) ^ i31));
        int i33 = -(~(((i32 & i29) | (i29 ^ i32)) * (-865)));
        int i34 = (-2) - ((((i28 | i33) << 1) - (i28 ^ i33)) ^ (-1));
        int i35 = i30 & 2;
        int i36 = (iIntValue3 & (-3)) | i35;
        int i37 = iIntValue3 & 2;
        int i38 = (~((i37 & i36) | (i36 ^ i37))) * 865;
        int i39 = ((i34 | i38) << 1) - (i38 ^ i34);
        int i40 = i29 & i31;
        int i41 = (i29 | i31) & (~i40);
        int i42 = ~((i40 & i41) | (i41 ^ i40));
        int i43 = (~i35) & (i30 | 2);
        int i44 = (i43 & i35) | (i43 ^ i35);
        int i45 = ~i44;
        int i46 = (i44 | i45) & i45;
        int i47 = i42 ^ i46;
        int i48 = i42 & i46;
        int i49 = ((i48 & i47) | (i47 ^ i48)) * 865;
        int i50 = (((i39 ^ i49) | (i39 & i49)) << 1) - ((i49 & (~i39)) | ((~i49) & i39));
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(i25, i50);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        byte b10 = ((byte[]) setInputExtras.setDividerPadding(new Object[]{strSubstring}, -1768743273, 1768743278, (int) System.currentTimeMillis()))[0];
        int i51 = f59466b;
        int i52 = ((i51 | 17) << 1) - (i51 ^ 17);
        f59465a = i52 % 128;
        if (i52 % 2 == 0) {
            return Integer.valueOf(b10);
        }
        throw null;
    }
}
