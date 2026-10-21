package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class f3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55475e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55476f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final adu f55480d;

    public f3(adu aduVar) {
        if (aduVar == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.f55480d = aduVar;
        aky akyVar = (aky) z2.a(new Object[]{aduVar}, -70585841, 70585843, (int) System.currentTimeMillis());
        int iIntValue = ((Integer) bbi.setOnFocusChangeListener(new Object[]{akyVar}, 1100642384, -1100642371, (int) System.currentTimeMillis())).intValue();
        this.f55477a = iIntValue;
        this.f55478b = 16;
        int iCeil = (int) Math.ceil(((double) (iIntValue * 8)) / ((double) ((Integer) bbi.setOnFocusChangeListener(new Object[]{16}, -641546869, 641546871, 16)).intValue()));
        int i10 = 15 * iCeil;
        int iIntValue2 = ((Integer) bbi.setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, -641546869, 641546871, i10)).intValue() / ((Integer) bbi.setOnFocusChangeListener(new Object[]{16}, -641546869, 641546871, 16)).intValue();
        int i11 = iIntValue2 & 1;
        int i12 = -(-(iIntValue2 | 1));
        int i13 = -(-((i11 & i12) + (i12 | i11)));
        int i14 = iCeil & i13;
        int i15 = ((((iCeil ^ i13) | i14) << 1) - (~(-((iCeil | i13) & (~i14))))) - 1;
        this.f55479c = i15;
        if (((d3) d3.a(new Object[]{akyVar.setX(), Integer.valueOf(iIntValue), 16, Integer.valueOf(i15)}, -1538624180, 1538624182, iIntValue)) != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("cannot find OID for digest algorithm: ");
        sb2.append(akyVar.setX());
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i14 = ~i10;
        int i15 = (((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13;
        if (i15 == 1) {
            f3 f3Var = (f3) objArr[0];
            int i16 = f55476f;
            int i17 = i16 & 105;
            int i18 = (~i17) & (i16 | 105);
            int i19 = -(-(i17 << 1));
            int i20 = (i18 & i19) + (i19 | i18);
            f55475e = i20 % 128;
            int i21 = i20 % 2;
            int i22 = f3Var.f55477a;
            int i23 = i16 & 49;
            int i24 = (i16 | 49) & (~i23);
            int i25 = i23 << 1;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f55475e = i26 % 128;
            if (i26 % 2 == 0) {
                return Integer.valueOf(i22);
            }
            throw null;
        }
        if (i15 == 2) {
            f3 f3Var2 = (f3) objArr[0];
            int i27 = f55475e;
            int i28 = ((i27 ^ 95) - (~(-(-((i27 & 95) << 1))))) - 1;
            f55476f = i28 % 128;
            int i29 = i28 % 2;
            int i30 = f3Var2.f55478b;
            int i31 = i27 & 115;
            int i32 = -(-((i27 ^ 115) | i31));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            f55476f = i33 % 128;
            if (i33 % 2 == 0) {
                int i34 = 79 / 0;
            }
            return Integer.valueOf(i30);
        }
        if (i15 != 3) {
            f3 f3Var3 = (f3) objArr[0];
            int i35 = f55476f;
            int i36 = (((i35 ^ 25) | (i35 & 25)) << 1) - (((~i35) & 25) | (i35 & (-26)));
            int i37 = i36 % 128;
            f55475e = i37;
            int i38 = i36 % 2;
            int i39 = f3Var3.f55479c;
            int i40 = i37 & 111;
            int i41 = (i40 - (~((i37 ^ 111) | i40))) - 1;
            f55476f = i41 % 128;
            int i42 = i41 % 2;
            return Integer.valueOf(i39);
        }
        f3 f3Var4 = (f3) objArr[0];
        int i43 = f55475e;
        int i44 = i43 ^ 57;
        int i45 = (i43 & 57) << 1;
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        int i47 = i46 % 128;
        f55476f = i47;
        int i48 = i46 % 2;
        adu aduVar = f3Var4.f55480d;
        int i49 = (i47 & (-58)) | ((~i47) & 57);
        int i50 = (i47 & 57) << 1;
        int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
        f55475e = i51 % 128;
        int i52 = i51 % 2;
        return aduVar;
    }
}
