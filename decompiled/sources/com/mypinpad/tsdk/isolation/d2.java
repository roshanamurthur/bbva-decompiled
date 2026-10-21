package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class d2 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55096a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55097b = 1;

    public static /* synthetic */ Short c(Object[] objArr, int i10, int i11, int i12) {
        short sShortValue;
        Short shC;
        int i13 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i14 = ~i12;
        switch (((i10 | (~((~i11) | i14))) * 160) + (((~(i14 | i10)) | (~(i10 | i11))) * (-160)) + i13) {
            case 1:
                d2 d2Var = (d2) objArr[0];
                short sShortValue2 = ((Short) objArr[1]).shortValue();
                int i15 = f55097b;
                int i16 = (i15 & (-80)) | ((~i15) & 79);
                int i17 = (i15 & 79) << 1;
                int i18 = (i16 & i17) + (i17 | i16);
                f55096a = i18 % 128;
                if (i18 % 2 != 0) {
                    sShortValue = c(new Object[]{d2Var, Short.valueOf(sShortValue2)}, -545531239, 545531244, System.identityHashCode(d2Var)).shortValue();
                    int i19 = 56 / 0;
                } else {
                    sShortValue = c(new Object[]{d2Var, Short.valueOf(sShortValue2)}, -545531239, 545531244, System.identityHashCode(d2Var)).shortValue();
                }
                return Short.valueOf(sShortValue);
            case 2:
                d2 d2Var2 = (d2) objArr[0];
                short sShortValue3 = ((Short) objArr[1]).shortValue();
                int i20 = f55097b;
                int i21 = i20 & 75;
                int i22 = (i20 ^ 75) | i21;
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f55096a = i23 % 128;
                if (i23 % 2 != 0) {
                    int iIntValue = ((Integer) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(sShortValue3)}, 1256499076, -1256499070, sShortValue3)).intValue();
                    c(new Object[]{d2Var2, Integer.valueOf(iIntValue)}, 2108868905, -2108868899, iIntValue).shortValue();
                    throw null;
                }
                int iIntValue2 = ((Integer) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(sShortValue3)}, 1256499076, -1256499070, sShortValue3)).intValue();
                short sShortValue4 = c(new Object[]{d2Var2, Integer.valueOf(iIntValue2)}, 2108868905, -2108868899, iIntValue2).shortValue();
                int i24 = f55096a;
                int i25 = i24 & 109;
                int i26 = -(-(i24 | 109));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f55097b = i27 % 128;
                int i28 = i27 % 2;
                return Short.valueOf(sShortValue4);
            case 3:
                d2 d2Var3 = (d2) objArr[0];
                short sShortValue5 = ((Short) objArr[1]).shortValue();
                short sShortValue6 = ((Short) objArr[2]).shortValue();
                int i29 = f55096a + 33;
                f55097b = i29 % 128;
                int i30 = i29 % 2;
                long j10 = sShortValue5;
                long j11 = sShortValue6;
                long j12 = (j10 << 7) ^ j10;
                long j13 = (((((((j11 << 6) * (j10 & 64)) ^ ((16385 & j12) * j11)) ^ ((j11 << 1) * (j12 & 32770))) ^ ((j11 << 2) * (j12 & 65540))) ^ ((j11 << 3) * (j12 & 131080))) ^ ((j11 << 4) * (j12 & 262160))) ^ ((j11 << 5) * (j12 & 524320));
                long j14 = 137371844608L & j13;
                int i31 = 67108863 & ((int) ((((j14 >>> 24) ^ ((j14 >>> 18) ^ (j14 >>> 20))) ^ (j14 >>> 26)) ^ j13));
                short sShortValue7 = c(new Object[]{d2Var3, Integer.valueOf(i31)}, 2108868905, -2108868899, i31).shortValue();
                int i32 = f55096a;
                int i33 = i32 & 53;
                int i34 = ((i32 ^ 53) | i33) << 1;
                int i35 = -((i32 | 53) & (~i33));
                int i36 = (i34 & i35) + (i35 | i34);
                f55097b = i36 % 128;
                int i37 = i36 % 2;
                return Short.valueOf(sShortValue7);
            case 4:
                d2 d2Var4 = (d2) objArr[0];
                short sShortValue8 = ((Short) objArr[1]).shortValue();
                int i38 = f55096a;
                int i39 = i38 ^ 5;
                int i40 = ((i38 & 5) | i39) << 1;
                int i41 = -i39;
                int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
                f55097b = i42 % 128;
                int i43 = i42 % 2;
                int iIntValue3 = ((Integer) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(sShortValue8)}, 1256499076, -1256499070, sShortValue8)).intValue();
                short sShortValue9 = c(new Object[]{d2Var4, Integer.valueOf(iIntValue3)}, 2108868905, -2108868899, iIntValue3).shortValue();
                int iIntValue4 = ((Integer) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(sShortValue9)}, 1256499076, -1256499070, sShortValue9)).intValue();
                short sShortValue10 = c(new Object[]{d2Var4, Integer.valueOf(iIntValue4)}, 2108868905, -2108868899, iIntValue4).shortValue();
                int i44 = f55096a;
                int i45 = (i44 & 13) + (i44 | 13);
                f55097b = i45 % 128;
                if (i45 % 2 != 0) {
                    return Short.valueOf(sShortValue10);
                }
                throw null;
            case 5:
                d2 d2Var5 = (d2) objArr[0];
                short sShortValue11 = ((Short) objArr[1]).shortValue();
                int i46 = f55097b;
                int i47 = i46 & 11;
                int i48 = (i47 - (~((i46 ^ 11) | i47))) - 1;
                f55096a = i48 % 128;
                if (i48 % 2 != 0) {
                    short sShortValue12 = c(new Object[]{d2Var5, Short.valueOf(sShortValue11), Short.valueOf(sShortValue11)}, 955750932, -955750929, System.identityHashCode(d2Var5)).shortValue();
                    short sShortValue13 = c(new Object[]{d2Var5, Short.valueOf(sShortValue12), Short.valueOf(sShortValue12)}, 930054982, -930054982, System.identityHashCode(d2Var5)).shortValue();
                    shC = c(new Object[]{d2Var5, Short.valueOf(c(new Object[]{d2Var5, Short.valueOf(c(new Object[]{d2Var5, Short.valueOf(c(new Object[]{d2Var5, Short.valueOf(c(new Object[]{d2Var5, Short.valueOf(sShortValue13)}, -427761705, 427761709, System.identityHashCode(d2Var5)).shortValue()), Short.valueOf(sShortValue13)}, 930054982, -930054982, System.identityHashCode(d2Var5)).shortValue())}, -427761705, 427761709, System.identityHashCode(d2Var5)).shortValue()), Short.valueOf(sShortValue13)}, 930054982, -930054982, System.identityHashCode(d2Var5)).shortValue()), (short) 0}, 955750932, -955750929, System.identityHashCode(d2Var5));
                } else {
                    short sShortValue14 = c(new Object[]{d2Var5, Short.valueOf(sShortValue11), Short.valueOf(sShortValue11)}, 955750932, -955750929, System.identityHashCode(d2Var5)).shortValue();
                    short sShortValue15 = c(new Object[]{d2Var5, Short.valueOf(sShortValue14), Short.valueOf(sShortValue14)}, 930054982, -930054982, System.identityHashCode(d2Var5)).shortValue();
                    shC = c(new Object[]{d2Var5, Short.valueOf(c(new Object[]{d2Var5, Short.valueOf(c(new Object[]{d2Var5, Short.valueOf(c(new Object[]{d2Var5, Short.valueOf(c(new Object[]{d2Var5, Short.valueOf(sShortValue15)}, -427761705, 427761709, System.identityHashCode(d2Var5)).shortValue()), Short.valueOf(sShortValue15)}, 930054982, -930054982, System.identityHashCode(d2Var5)).shortValue())}, -427761705, 427761709, System.identityHashCode(d2Var5)).shortValue()), Short.valueOf(sShortValue15)}, 930054982, -930054982, System.identityHashCode(d2Var5)).shortValue()), (short) 1}, 955750932, -955750929, System.identityHashCode(d2Var5));
                }
                return Short.valueOf(shC.shortValue());
            case 6:
                int iIntValue5 = ((Number) objArr[1]).intValue();
                int i49 = f55096a;
                int i50 = (i49 ^ 1) + ((i49 & 1) << 1);
                int i51 = i50 % 128;
                f55097b = i51;
                int i52 = i50 % 2;
                int i53 = iIntValue5 & 8191;
                int i54 = iIntValue5 >>> 13;
                int i55 = i54 << 4;
                int i56 = i54 << 3;
                int i57 = ((~i55) & i56) | ((~i56) & i55);
                int i58 = i54 << 1;
                int i59 = (~i58) & i57;
                int i60 = (~i57) & i58;
                int i61 = (i60 & i59) | (i59 ^ i60);
                int i62 = i61 >>> 13;
                int i63 = i62 << 4;
                int i64 = i62 << 3;
                int i65 = (i63 | i64) & (~(i63 & i64));
                int i66 = i62 << 1;
                int i67 = (~i66) & i65;
                int i68 = (~i65) & i66;
                int i69 = (i68 & i67) | (i67 ^ i68);
                int i70 = (i54 | i53) & (~(i53 & i54));
                int i71 = (~i62) & i70;
                int i72 = (~i70) & i62;
                int i73 = ((i72 & i71) | (i71 ^ i72)) ^ (i61 & 8191);
                short s4 = (short) (((~i73) & i69) | ((~i69) & i73));
                int i74 = i51 ^ 97;
                int i75 = ((i51 & 97) | i74) << 1;
                int i76 = -i74;
                int i77 = ((i75 | i76) << 1) - (i75 ^ i76);
                f55096a = i77 % 128;
                if (i77 % 2 == 0) {
                    return Short.valueOf(s4);
                }
                throw null;
            case 7:
                d2 d2Var6 = (d2) objArr[0];
                short sShortValue16 = ((Short) objArr[1]).shortValue();
                short sShortValue17 = ((Short) objArr[2]).shortValue();
                int i78 = f55097b;
                int i79 = i78 + 89;
                f55096a = i79 % 128;
                int i80 = i79 % 2;
                int i81 = (sShortValue17 & 1) * sShortValue16;
                int i82 = (-2) - (((i78 ^ 68) + ((i78 & 68) << 1)) ^ (-1));
                f55096a = i82 % 128;
                int i83 = i82 % 2;
                int i84 = 1;
                while (i84 < 13) {
                    int i85 = f55097b + 119;
                    int i86 = i85 % 128;
                    f55096a = i86;
                    int i87 = i85 % 2;
                    int i88 = (sShortValue17 & (1 << i84)) * sShortValue16;
                    i81 = (i81 | i88) & (~(i81 & i88));
                    i84++;
                    int i89 = i86 & 35;
                    int i90 = -(-((i86 ^ 35) | i89));
                    int i91 = (i89 & i90) + (i89 | i90);
                    f55097b = i91 % 128;
                    int i92 = i91 % 2;
                }
                short sShortValue18 = c(new Object[]{d2Var6, Integer.valueOf(i81)}, 2108868905, -2108868899, i81).shortValue();
                int i93 = f55097b;
                int i94 = (i93 ^ 55) + ((i93 & 55) << 1);
                f55096a = i94 % 128;
                if (i94 % 2 == 0) {
                    return Short.valueOf(sShortValue18);
                }
                throw null;
            default:
                d2 d2Var7 = (d2) objArr[0];
                short sShortValue19 = ((Short) objArr[1]).shortValue();
                short sShortValue20 = ((Short) objArr[2]).shortValue();
                int i95 = f55097b;
                int i96 = (i95 & 101) + (i95 | 101);
                f55096a = i96 % 128;
                int i97 = i96 % 2;
                long j15 = sShortValue19;
                long j16 = sShortValue20;
                long j17 = (j15 << 21) ^ j15;
                long j18 = (((((((j16 << 18) * (64 & j15)) ^ ((268435457 & j17) * j16)) ^ ((j16 << 3) * (j17 & 536870914))) ^ ((j16 << 6) * (j17 & 1073741828))) ^ ((j16 << 9) * (j17 & 2147483656L))) ^ ((j16 << 12) * (j17 & 4294967312L))) ^ ((j16 << 15) * (j17 & 8589934624L));
                long j19 = 2305834213120671744L & j18;
                long j20 = j18 ^ ((j19 >>> 26) ^ (((j19 >>> 18) ^ (j19 >>> 20)) ^ (j19 >>> 24)));
                long j21 = 8796025913344L & j20;
                int i98 = 67108863 & ((int) ((((j21 >>> 24) ^ ((j21 >>> 18) ^ (j21 >>> 20))) ^ (j21 >>> 26)) ^ j20));
                short sShortValue21 = c(new Object[]{d2Var7, Integer.valueOf(i98)}, 2108868905, -2108868899, i98).shortValue();
                int i99 = f55096a + 117;
                f55097b = i99 % 128;
                if (i99 % 2 == 0) {
                    int i100 = 30 / 0;
                }
                return Short.valueOf(sShortValue21);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.c2
    public final short a(short s4, short s7) {
        return c(new Object[]{this, Short.valueOf(s4), Short.valueOf(s7)}, 1564442088, -1564442081, System.identityHashCode(this)).shortValue();
    }

    @Override // com.mypinpad.tsdk.isolation.c2
    public final short b(short s4) {
        return c(new Object[]{this, Short.valueOf(s4)}, -1106371899, 1106371900, System.identityHashCode(this)).shortValue();
    }
}
