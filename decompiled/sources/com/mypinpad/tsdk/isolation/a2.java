package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class a2 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f51981a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51982b = 1;

    public static /* synthetic */ Short c(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i11;
        int i15 = (~i12) | i14;
        int i16 = (((~i15) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
        int i17 = ~i10;
        int i18 = ((~(i14 | i12)) * 113) + (((~(i10 | i15)) | (~(i11 | i17)) | (~(i17 | i12))) * (-113)) + i16;
        if (i18 == 1) {
            a2 a2Var = (a2) objArr[0];
            short sShortValue = ((Short) objArr[1]).shortValue();
            System.identityHashCode(a2Var);
            System.identityHashCode(a2Var);
            int iIntValue = ((Integer) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(sShortValue)}, 1256499076, -1256499070, sShortValue)).intValue();
            short sShortValue2 = c(new Object[]{a2Var, Integer.valueOf(iIntValue)}, 836385272, -836385272, iIntValue).shortValue();
            int i19 = f51981a;
            int i20 = (i19 & (-82)) | ((~i19) & 81);
            int i21 = (i19 & 81) << 1;
            int i22 = (i20 & i21) + (i21 | i20);
            f51982b = i22 % 128;
            if (i22 % 2 != 0) {
                return Short.valueOf(sShortValue2);
            }
            throw null;
        }
        if (i18 == 2) {
            a2 a2Var2 = (a2) objArr[0];
            short sShortValue3 = ((Short) objArr[1]).shortValue();
            short sShortValue4 = ((Short) objArr[2]).shortValue();
            int i23 = f51981a;
            int i24 = (-2) - (((i23 & 52) + (i23 | 52)) ^ (-1));
            f51982b = i24 % 128;
            int i25 = i24 % 2;
            int i26 = (sShortValue4 & 1) * sShortValue3;
            int i27 = i23 & 15;
            int i28 = i27 + ((i23 ^ 15) | i27);
            f51982b = i28 % 128;
            int i29 = i28 % 2;
            int i30 = 1;
            while (i30 < 12) {
                int i31 = f51981a;
                int i32 = (i31 & 67) + (i31 | 67);
                f51982b = i32 % 128;
                if (i32 % 2 == 0) {
                    int i33 = sShortValue3 / (sShortValue4 & i30);
                    i26 = (i26 | i33) & (~(i26 & i33));
                    i30 += 127;
                } else {
                    int i34 = ((1 << i30) & sShortValue4) * sShortValue3;
                    int i35 = i26 & i34;
                    i26 = ((i26 ^ i34) | i35) & (~i35);
                    int i36 = i30 & (-27);
                    int i37 = -(-((i30 ^ (-27)) | i36));
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    int i39 = i38 & 28;
                    i30 = ((~i39) & (i38 | 28)) + (i39 << 1);
                }
            }
            short sShortValue5 = c(new Object[]{a2Var2, Integer.valueOf(i26)}, 836385272, -836385272, i26).shortValue();
            int i40 = f51981a;
            int i41 = ((i40 | 89) << 1) - (i40 ^ 89);
            f51982b = i41 % 128;
            if (i41 % 2 != 0) {
                return Short.valueOf(sShortValue5);
            }
            throw null;
        }
        if (i18 == 3) {
            a2 a2Var3 = (a2) objArr[0];
            short sShortValue6 = ((Short) objArr[1]).shortValue();
            int i42 = f51982b;
            int i43 = i42 & 33;
            int i44 = (i42 | 33) & (~i43);
            int i45 = i43 << 1;
            int i46 = (i44 & i45) + (i44 | i45);
            f51981a = i46 % 128;
            return Short.valueOf(i46 % 2 != 0 ? z1.d(a2Var3, new Object[]{a2Var3, Short.valueOf(z1.d(a2Var3, new Object[]{a2Var3, Short.valueOf(sShortValue6)}, -65797869, 65797873)), (short) 0}, -78061915, 78061917) : z1.d(a2Var3, new Object[]{a2Var3, Short.valueOf(z1.d(a2Var3, new Object[]{a2Var3, Short.valueOf(sShortValue6)}, -65797869, 65797873)), (short) 1}, -78061915, 78061917));
        }
        if (i18 == 4) {
            a2 a2Var4 = (a2) objArr[0];
            short sShortValue7 = ((Short) objArr[1]).shortValue();
            int i47 = f51982b;
            int i48 = i47 & 41;
            int i49 = ((i47 | 41) & (~i48)) + (i48 << 1);
            f51981a = i49 % 128;
            int i50 = i49 % 2;
            short sD = z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(sShortValue7)}, -1866280461, 1866280462)), Short.valueOf(sShortValue7)}, -78061915, 78061917);
            short sD2 = z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(sD)}, -1866280461, 1866280462))}, -1866280461, 1866280462)), Short.valueOf(sD)}, -78061915, 78061917);
            short sD3 = z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(z1.d(a2Var4, new Object[]{a2Var4, Short.valueOf(sD2)}, -1866280461, 1866280462))}, -1866280461, 1866280462))}, -1866280461, 1866280462))}, -1866280461, 1866280462)), Short.valueOf(sD2)}, -78061915, 78061917))}, -1866280461, 1866280462))}, -1866280461, 1866280462)), Short.valueOf(sD)}, -78061915, 78061917))}, -1866280461, 1866280462)), Short.valueOf(sShortValue7)}, -78061915, 78061917))}, -1866280461, 1866280462);
            int i51 = f51981a;
            int i52 = i51 | 105;
            int i53 = i52 << 1;
            int i54 = -((~(i51 & 105)) & i52);
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            f51982b = i55 % 128;
            if (i55 % 2 != 0) {
                return Short.valueOf(sD3);
            }
            throw null;
        }
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i56 = f51981a;
        int i57 = i56 ^ 93;
        int i58 = -(-((i56 & 93) << 1));
        int i59 = (i57 & i58) + (i58 | i57);
        f51982b = i59 % 128;
        if (i59 % 2 == 0) {
            int i60 = (2093056 & iIntValue2) * 92;
            int i61 = (14680064 & iIntValue2) * 39;
            int i62 = ((iIntValue2 & (-71)) + (iIntValue2 | (-71))) - 1;
            int i63 = (iIntValue2 & 28082) ^ (iIntValue2 / 85);
            int i64 = i63 & i60;
            int i65 = ((i63 ^ i60) | i64) & (~i64);
            int i66 = i65 & i61;
            int i67 = ((i65 ^ i61) | i66) & (~i66);
            int i68 = i67 & i62;
            i13 = ((i67 ^ i62) | i68) & (~i68);
        } else {
            int i69 = iIntValue2 & 4095;
            int i70 = iIntValue2 >>> 12;
            int i71 = (2093056 & iIntValue2) >>> 9;
            int i72 = (14680064 & iIntValue2) >>> 18;
            int i73 = iIntValue2 >>> 21;
            int i74 = i69 ^ i70;
            int i75 = (~i71) & i74;
            int i76 = (~i74) & i71;
            int i77 = (i76 & i75) | (i75 ^ i76);
            int i78 = (i72 & (~i77)) | ((~i72) & i77);
            int i79 = i78 & i73;
            i13 = ((i73 ^ i78) | i79) & (~i79);
        }
        return Short.valueOf((short) i13);
    }

    @Override // com.mypinpad.tsdk.isolation.c2
    public final short a(short s4, short s7) {
        return z1.d(this, new Object[]{this, Short.valueOf(s4), Short.valueOf(s7)}, -78061915, 78061917);
    }

    @Override // com.mypinpad.tsdk.isolation.c2
    public final short b(short s4) {
        return z1.d(this, new Object[]{this, Short.valueOf(s4)}, -65797869, 65797873);
    }
}
