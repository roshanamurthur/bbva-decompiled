package com.mypinpad.tsdk.isolation;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public final class amv implements amx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53270c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53271d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f53272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[][] f53273b;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i11 | i12);
        int i15 = (((~(i10 | i11)) | i14) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109));
        int i16 = 2;
        if ((((~(i10 | (~i11))) | (~(i13 | i11))) * 110) + i15 != 1) {
            amv amvVar = (amv) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i17 = f53270c;
            int i18 = i17 & 13;
            int i19 = ((i17 ^ 13) | i18) << 1;
            int i20 = -((i17 | 13) & (~i18));
            int i21 = (i19 & i20) + (i20 | i19);
            int i22 = i21 % 128;
            f53271d = i22;
            int i23 = i21 % 2;
            long[] jArr = amvVar.f53273b[bArr[15] & 255];
            long j10 = jArr[0];
            long j11 = jArr[1];
            int i24 = (((i22 & (-112)) | ((~i22) & 111)) - (~((111 & i22) << 1))) - 1;
            f53270c = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 14;
            while (i26 >= 0) {
                int i27 = f53271d;
                int i28 = (i27 & 7) + (i27 | 7);
                f53270c = i28 % 128;
                int i29 = i28 % 2;
                long[] jArr2 = amvVar.f53273b[bArr[i26] & 255];
                long j12 = j11 << 56;
                j11 = jArr2[1] ^ ((j11 >>> 8) | (j10 << 56));
                j10 = ((((jArr2[0] ^ (j10 >>> 8)) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2)) ^ (j12 >>> 7);
                int i30 = (((i26 ^ (-24)) | (i26 & (-24))) << 1) - (((~i26) & (-24)) | (i26 & 23));
                int i31 = i30 ^ 23;
                int i32 = (i30 & 23) << 1;
                i26 = ((i31 & i32) << 1) + (i31 ^ i32);
                int i33 = i27 + 19;
                f53270c = i33 % 128;
                int i34 = i33 % 2;
            }
            ber.setDividerPadding(new Object[]{Long.valueOf(j10), bArr, 0}, 108647497, -108647488, 0);
            ber.setDividerPadding(new Object[]{Long.valueOf(j11), bArr, 8}, 108647497, -108647488, 8);
            int i35 = f53271d;
            int i36 = (i35 ^ 19) + ((i35 & 19) << 1);
            f53270c = i36 % 128;
            int i37 = i36 % 2;
            return null;
        }
        amv amvVar2 = (amv) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int i38 = f53270c;
        int i39 = ((i38 | 9) << 1) - ((i38 & (-10)) | ((~i38) & 9));
        f53271d = i39 % 128;
        int i40 = i39 % 2;
        int i41 = -2;
        if (amvVar2.f53273b == null) {
            int i42 = ((i38 ^ 84) + ((i38 & 84) << 1)) - 1;
            f53271d = i42 % 128;
            if (i42 % 2 == 0) {
                amvVar2.f53273b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 1571, 3);
            } else {
                amvVar2.f53273b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
            }
            int i43 = f53270c;
            int i44 = (-2) - (((i43 ^ 40) + ((i43 & 40) << 1)) ^ (-1));
            f53271d = i44 % 128;
            int i45 = i44 % 2;
        } else if (((Byte) amu.setCompoundDrawableTintBlendMode(new Object[]{amvVar2.f53272a, bArr2}, -2137959665, 2137959666, (int) System.currentTimeMillis())).byteValue() != 0) {
            int i46 = f53271d;
            int i47 = i46 & 111;
            int i48 = i47 + ((i46 ^ 111) | i47);
            f53270c = i48 % 128;
            int i49 = i48 % 2;
            return null;
        }
        byte[] bArr3 = new byte[16];
        amvVar2.f53272a = bArr3;
        amu.setCompoundDrawableTintBlendMode(new Object[]{bArr2, bArr3}, -1028003531, 1028003541, (int) System.currentTimeMillis());
        amu.setCompoundDrawableTintBlendMode(new Object[]{amvVar2.f53272a, amvVar2.f53273b[1]}, -4469678, 4469686, (int) System.currentTimeMillis());
        long[] jArr3 = amvVar2.f53273b[1];
        amu.setCompoundDrawableTintBlendMode(new Object[]{jArr3, jArr3}, 1717577473, -1717577460, (int) System.currentTimeMillis());
        int i50 = f53270c + 29;
        f53271d = i50 % 128;
        int i51 = i50 % 2;
        int i52 = 2;
        for (int i53 = 256; i52 < i53; i53 = 256) {
            int i54 = f53270c;
            int i55 = i54 & 49;
            int i56 = (((i54 | 49) & (~i55)) - (~(-(-(i55 << 1))))) - 1;
            f53271d = i56 % 128;
            int i57 = i56 % i16;
            long[][] jArr4 = amvVar2.f53273b;
            long[] jArr5 = jArr4[i52 >> 1];
            long[] jArr6 = jArr4[i52];
            Object[] objArr2 = new Object[i16];
            objArr2[0] = jArr5;
            objArr2[1] = jArr6;
            amu.setCompoundDrawableTintBlendMode(objArr2, -160753496, 160753498, (int) System.currentTimeMillis());
            long[][] jArr7 = amvVar2.f53273b;
            long[] jArr8 = jArr7[i52];
            long[] jArr9 = jArr7[1];
            int iIdentityHashCode = System.identityHashCode(amvVar2);
            int i58 = -(~(i52 * (-622)));
            int i59 = ((624 & i58) + (i58 | 624)) - 1;
            int i60 = ~i52;
            int i61 = (i60 | i52) & i60;
            int i62 = (i61 & (-2)) | ((~i61) & 1);
            int i63 = i61 & 1;
            int i64 = (i62 ^ i63) | (i62 & i63);
            int i65 = i64 & iIdentityHashCode;
            int i66 = (~i65) & (i64 | iIdentityHashCode);
            int i67 = ~iIdentityHashCode;
            int i68 = -(-((~((i66 ^ i65) | (i66 & i65))) * 623));
            int i69 = ((~i59) & i68) | ((~i68) & i59);
            int i70 = -(-((i68 & i59) << 1));
            int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
            int i72 = (i67 | iIdentityHashCode) & i67;
            int i73 = ~((i41 ^ i52) | (i41 & i52));
            int i74 = ((~i72) & i73) | ((~i73) & i72);
            int i75 = i72 & i73;
            int i76 = -(-(((i75 & i74) | (i74 ^ i75)) * (-623)));
            int i77 = i71 & i76;
            int i78 = (((i76 | i71) & (~i77)) - (~(-(-(i77 << 1))))) - 1;
            int i79 = (i60 ^ 1) | (i60 & 1);
            int i80 = ~i79;
            int i81 = (i79 | i80) & i80;
            int i82 = i60 ^ iIdentityHashCode;
            int i83 = i60 & iIdentityHashCode;
            int i84 = (i82 & i83) | (i82 ^ i83);
            int i85 = ~i84;
            int i86 = (i84 | i85) & i85;
            int i87 = i81 ^ i86;
            int i88 = i81 & i86;
            int i89 = (i88 & i87) | (i87 ^ i88);
            int i90 = (i67 & 1) | (iIdentityHashCode & (-2));
            int i91 = iIdentityHashCode & 1;
            int i92 = ~((i90 & i91) | (i90 ^ i91));
            int i93 = i89 & i92;
            int i94 = (i89 | i92) & (~i93);
            int i95 = ((i94 & i93) | (i94 ^ i93)) * 623;
            int i96 = ((~i95) & i78) | ((~i78) & i95);
            int i97 = (i78 & i95) << 1;
            amu.setCompoundDrawableTintBlendMode(new Object[]{jArr8, jArr9, jArr7[(i96 ^ i97) + ((i97 & i96) << 1)]}, -164048949, 164048958, (int) System.currentTimeMillis());
            int i98 = (i52 & (-41)) + (i52 | (-41));
            int i99 = i98 & 43;
            i52 = (((i98 | 43) & (~i99)) - (~(i99 << 1))) - 1;
            int i100 = f53271d + 91;
            f53270c = i100 % 128;
            int i101 = i100 % 2;
            i16 = 2;
            i41 = -2;
        }
        int i102 = f53270c;
        int i103 = i102 & 59;
        int i104 = (i102 | 59) & (~i103);
        int i105 = i103 << 1;
        int i106 = (i104 ^ i105) + ((i104 & i105) << 1);
        f53271d = i106 % 128;
        if (i106 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.amx
    public final void setCompoundDrawableTintBlendMode(byte[] bArr) {
        setOnFocusChangeListener(new Object[]{this, bArr}, 932521219, -932521219, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.amx
    public final void setY(byte[] bArr) {
        setOnFocusChangeListener(new Object[]{this, bArr}, 1015454505, -1015454504, System.identityHashCode(this));
    }
}
