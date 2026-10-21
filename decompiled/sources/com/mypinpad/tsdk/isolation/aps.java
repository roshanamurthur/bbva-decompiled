package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53534a = {13, 41, 121, 337, 897, 2305};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53535b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53536c = 1;

    public static class a implements apo {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53537b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f53538c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ int f53539a;

        @Override // com.mypinpad.tsdk.isolation.apo
        public final apu setOnFocusChangeListener(apu apuVar) {
            apr aprVar;
            Object[] objArr = {this, apuVar};
            System.identityHashCode(this);
            a aVar = (a) objArr[0];
            apu apuVar2 = (apu) objArr[1];
            int i10 = f53537b;
            int i11 = i10 & 69;
            int i12 = (~i11) & (i10 | 69);
            int i13 = i11 << 1;
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            f53538c = i14 % 128;
            if (i14 % 2 == 0) {
                boolean z10 = apuVar2 instanceof apr;
                throw null;
            }
            if (apuVar2 instanceof apr) {
                aprVar = (apr) apuVar2;
                int i15 = ((i10 | 81) << 1) - (i10 ^ 81);
                f53538c = i15 % 128;
                int i16 = i15 % 2;
            } else {
                int i17 = (i10 & 121) + (i10 | 121);
                f53538c = i17 % 128;
                int i18 = i17 % 2;
                aprVar = null;
            }
            if (aprVar != null) {
                int i19 = i10 & 123;
                int i20 = (i10 ^ 123) | i19;
                int i21 = (i19 & i20) + (i20 | i19);
                f53538c = i21 % 128;
                int i22 = i21 % 2;
                if (((Integer) apr.setY(new Object[]{aprVar}, 1173899602, -1173899602, System.identityHashCode(aprVar))).intValue() == aVar.f53539a) {
                    int i23 = f53537b;
                    int i24 = (i23 ^ 51) + ((i23 & 51) << 1);
                    f53538c = i24 % 128;
                    Object[] objArr2 = new Object[1];
                    if (i24 % 2 != 0) {
                        objArr2[0] = aprVar;
                        apr.setY(objArr2, 593828932, -593828923, System.identityHashCode(aprVar));
                        return aprVar;
                    }
                    objArr2[0] = aprVar;
                    apr.setY(objArr2, 593828932, -593828923, System.identityHashCode(aprVar));
                    throw null;
                }
            }
            apr aprVar2 = new apr();
            apr.setY(new Object[]{aprVar2}, 593828932, -593828923, System.identityHashCode(aprVar2));
            int i25 = aVar.f53539a;
            apr.setY(new Object[]{aprVar2, Integer.valueOf(i25)}, -698342477, 698342481, i25);
            if (aprVar != null) {
                int i26 = f53538c;
                int i27 = i26 & 119;
                int i28 = (i27 - (~(-(-((i26 ^ 119) | i27))))) - 1;
                f53537b = i28 % 128;
                int i29 = i28 % 2;
                apr.setY(new Object[]{aprVar2, (apl[]) apr.setY(new Object[]{aprVar}, 1952897732, -1952897730, System.identityHashCode(aprVar))}, -1350627136, 1350627142, System.identityHashCode(aprVar2));
                apr.setY(new Object[]{aprVar2, (apl[]) apr.setY(new Object[]{aprVar}, 703536017, -703536012, System.identityHashCode(aprVar))}, 1301587705, -1301587702, System.identityHashCode(aprVar2));
                apr.setY(new Object[]{aprVar2, (apl) apr.setY(new Object[]{aprVar}, -1061273151, 1061273161, System.identityHashCode(aprVar))}, 907935971, -907935970, System.identityHashCode(aprVar2));
                int iIntValue = ((Integer) apr.setY(new Object[]{aprVar}, -1413925836, 1413925843, System.identityHashCode(aprVar))).intValue();
                apr.setY(new Object[]{aprVar2, Integer.valueOf(iIntValue)}, -575984875, 575984883, iIntValue);
                int i30 = f53537b;
                int i31 = i30 & 103;
                int i32 = ((i30 ^ 103) | i31) << 1;
                int i33 = -((i30 | 103) & (~i31));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                f53538c = i34 % 128;
                int i35 = i34 % 2;
            }
            int i36 = f53538c;
            int i37 = ((i36 & 15) - (~(-(-(i36 | 15))))) - 1;
            f53537b = i37 % 128;
            if (i37 % 2 == 0) {
                return aprVar2;
            }
            throw null;
        }
    }

    static {
        int i10 = 1 & 33;
        int i11 = (1 ^ 33) | i10;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        f53535b = i12 % 128;
        int i13 = i12 % 2;
    }

    public static void setCompoundDrawableTintBlendMode(apl aplVar) {
        setDividerPadding(new Object[]{aplVar}, 1812545968, -1812545968, (int) System.currentTimeMillis());
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int iBitLength;
        int i13 = (i11 * 971) + (i10 * (-1939));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~((~i12) | i11);
        int i17 = ~i10;
        int i18 = (((~(i17 | i14)) | i16) * 970) + ((~(i11 | i17)) * 1940) + ((i15 | i16) * (-970)) + i13;
        if (i18 == 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i19 = f53535b;
            int i20 = i19 ^ 69;
            int i21 = -(-((i19 & 69) << 1));
            int i22 = (i20 & i21) + (i21 | i20);
            f53536c = i22 % 128;
            int i23 = i22 % 2;
            int[] iArr = f53534a;
            if (i23 == 0) {
                ((Integer) setDividerPadding(new Object[]{Integer.valueOf(iIntValue), iArr}, 442633509, -442633507, iIntValue)).intValue();
                throw null;
            }
            int iIntValue2 = ((Integer) setDividerPadding(new Object[]{Integer.valueOf(iIntValue), iArr}, 442633509, -442633507, iIntValue)).intValue();
            int i24 = f53535b;
            int i25 = ((i24 & 10) + (i24 | 10)) - 1;
            f53536c = i25 % 128;
            int i26 = i25 % 2;
            return Integer.valueOf(iIntValue2);
        }
        if (i18 == 2) {
            int iIntValue3 = ((Number) objArr[0]).intValue();
            int[] iArr2 = (int[]) objArr[1];
            int i27 = f53535b;
            int i28 = (i27 ^ 41) + ((i27 & 41) << 1);
            f53536c = i28 % 128;
            int i29 = (i28 % 2 != 0 ? 1 : 0) ^ 1;
            int i30 = (i27 ^ 33) + ((i27 & 33) << 1);
            f53536c = i30 % 128;
            int i31 = i30 % 2;
            while (i29 < iArr2.length) {
                int i32 = f53536c;
                int i33 = i32 & 57;
                int i34 = i33 + ((i32 ^ 57) | i33);
                f53535b = i34 % 128;
                if (i34 % 2 != 0) {
                    int i35 = iArr2[i29];
                    throw null;
                }
                if (iIntValue3 < iArr2[i29]) {
                    break;
                }
                int i36 = (i29 & 49) + (i29 | 49);
                i29 = ((i36 | (-48)) << 1) - (i36 ^ (-48));
                int i37 = i32 + 83;
                f53535b = i37 % 128;
                int i38 = i37 % 2;
            }
            int i39 = i29 & 2;
            int iMax = Math.max(2, Math.min(16, (i39 - (~((i29 ^ 2) | i39))) - 1));
            int i40 = f53536c;
            int i41 = ((i40 | 9) << 1) - (i40 ^ 9);
            f53535b = i41 % 128;
            int i42 = i41 % 2;
            return Integer.valueOf(iMax);
        }
        apl aplVar = (apl) objArr[0];
        int i43 = f53536c + 19;
        f53535b = i43 % 128;
        int i44 = i43 % 2;
        aph x4 = aplVar.setX();
        if (x4 == null) {
            int i45 = f53536c;
            int i46 = ((i45 ^ 100) + ((i45 & 100) << 1)) - 1;
            f53535b = i46 % 128;
            if (i46 % 2 == 0) {
                return null;
            }
            int i47 = 98 / 0;
            return null;
        }
        BigInteger navigationOnClickListener = x4.setNavigationOnClickListener();
        if (navigationOnClickListener == null) {
            int i48 = f53536c;
            int i49 = i48 & 113;
            int i50 = ((i48 | 113) & (~i49)) + (i49 << 1);
            f53535b = i50 % 128;
            if (i50 % 2 != 0) {
                iBitLength = x4.setOnFocusChangeListener();
            } else {
                int onFocusChangeListener = x4.setOnFocusChangeListener();
                iBitLength = ((onFocusChangeListener & 1) << 1) + (onFocusChangeListener ^ 1);
            }
        } else {
            iBitLength = navigationOnClickListener.bitLength();
            int i51 = f53535b + 9;
            f53536c = i51 % 128;
            int i52 = i51 % 2;
        }
        int iIntValue4 = ((Integer) setDividerPadding(new Object[]{Integer.valueOf(iBitLength)}, -1800795728, 1800795729, iBitLength)).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i53 = 1429 - (~(-(~(iIntValue4 * (-475)))));
        int i54 = (-4) ^ iIntValue4;
        int i55 = ~iIntValue4;
        int i56 = (-4) & iIntValue4;
        int i57 = ~((i56 & i54) | (i54 ^ i56));
        int i58 = (i55 ^ 3) | (i55 & 3);
        int i59 = i58 ^ iCurrentTimeMillis;
        int i60 = i58 & iCurrentTimeMillis;
        int i61 = ~((i60 & i59) | (i59 ^ i60));
        int i62 = i57 & i61;
        int i63 = (((i57 | i61) & (~i62)) | i62) * (-476);
        int i64 = (i53 | i63) << 1;
        int i65 = -(i53 ^ i63);
        int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
        int i67 = (iIntValue4 | i55) & i55;
        int i68 = (i67 ^ 3) | (i67 & 3);
        int i69 = i68 ^ iCurrentTimeMillis;
        int i70 = i68 & iCurrentTimeMillis;
        int i71 = -(-((~((i70 & i69) | (i69 ^ i70))) * 952));
        int i72 = i66 & i71;
        int i73 = i72 + ((i71 ^ i66) | i72);
        int i74 = i67 | (~iCurrentTimeMillis);
        int i75 = (i74 & (-4)) | ((~i74) & 3);
        int i76 = i74 & 3;
        int i77 = -(~((~((i76 & i75) | (i75 ^ i76))) * 476));
        int i78 = ((i73 | i77) << 1) - (i77 ^ i73);
        int iMin = Math.min(16, (i78 ^ (-1)) + (i78 << 1));
        a aVar = new a();
        aVar.f53539a = iMin;
        x4.setCompoundDrawableTintBlendMode(aplVar, "bc_wnaf", aVar);
        int i79 = f53536c + 3;
        f53535b = i79 % 128;
        int i80 = i79 % 2;
        return null;
    }
}
