package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;

/* JADX INFO: loaded from: classes10.dex */
public final class axa extends awx {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54076w0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54077t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54078u0;

    public axa(aww awwVar, byte[] bArr) {
        super(false, awwVar);
        int length = bArr.length;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = -(~(length * 517));
        int i11 = (((16480 | i10) << 1) - (i10 ^ 16480)) - 1;
        int i12 = ~length;
        int i13 = ~iCurrentTimeMillis;
        int i14 = ~((i12 & i13) | ((~i12) & iCurrentTimeMillis) | (i12 & iCurrentTimeMillis));
        int i15 = i13 & (-32);
        int i16 = (~i15) & (i13 | (-32));
        int i17 = ~((i15 & i16) | (i16 ^ i15));
        int i18 = i14 & i17;
        int i19 = (i14 | i17) & (~i18);
        int i20 = (i19 & i18) | (i19 ^ i18);
        int i21 = ~iCurrentTimeMillis;
        int i22 = (i21 & i12) | ((~i21) & length);
        int i23 = i21 & length;
        int i24 = (i22 & i23) | (i22 ^ i23);
        int i25 = (i24 | (~i24)) & (~i24);
        int i26 = i20 & i25;
        int i27 = (i20 | i25) & (~i26);
        int i28 = -(-(((i27 & i26) | (i27 ^ i26)) * (-516)));
        int i29 = (i11 ^ i28) + ((i11 & i28) << 1);
        int i30 = (~length) & (i12 | length);
        int i31 = (i30 & 31) | (31 ^ i30);
        int i32 = i31 & iCurrentTimeMillis;
        int i33 = (i31 | iCurrentTimeMillis) & (~i32);
        int i34 = ~((i33 & i32) | (i33 ^ i32));
        int i35 = ~iCurrentTimeMillis;
        int i36 = iCurrentTimeMillis | i13;
        int i37 = i35 & i36;
        int i38 = ((~i37) & 31) | (i37 & (-32));
        int i39 = i37 & 31;
        int i40 = (i39 & i38) | (i38 ^ i39);
        int i41 = i40 & length;
        int i42 = (i40 | length) & (~i41);
        int i43 = (i42 & i41) | (i42 ^ i41);
        int i44 = (i43 | (~i43)) & (~i43);
        int i45 = ((~i44) & i34) | ((~i34) & i44);
        int i46 = i44 & i34;
        int i47 = ((i46 & i45) | (i45 ^ i46)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
        int i48 = i29 | i47;
        int i49 = (i48 << 1) - ((~(i47 & i29)) & i48);
        int i50 = (i12 & 31) | (length & (-32));
        int i51 = 31 & length;
        int i52 = ~((i50 & i51) | (i50 ^ i51));
        int i53 = i36 & i21;
        int i54 = ~((length & i53) | (i53 ^ length));
        int i55 = ((~i54) & i52) | ((~i52) & i54);
        int i56 = i54 & i52;
        int i57 = -(~(((i56 & i55) | (i55 ^ i56)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
        int i58 = ((i49 | i57) << 1) - (i57 ^ i49);
        this.f54077t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 0, Integer.valueOf((i58 ^ (-1)) + (i58 << 1))}, 525237936, -525237917, 0);
        int length2 = bArr.length;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i59 = -(~(-(-(length2 * (-112)))));
        int i60 = (((3584 | i59) << 1) - (i59 ^ 3584)) - 1;
        int i61 = ~length2;
        int i62 = ~iCurrentTimeMillis2;
        int i63 = (i62 & i61) | (i61 ^ i62);
        int i64 = (i63 | (~i63)) & (~i63);
        int i65 = (-32) & i64;
        int i66 = (((~i65) & (i64 | (-32))) | i65) * 226;
        int i67 = ((~i66) & i60) | ((~i60) & i66);
        int i68 = -(-((i66 & i60) << 1));
        int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
        int i70 = (31 & i61) | (length2 & (-32));
        int i71 = length2 & 31;
        int i72 = ~((i70 & i71) | (i70 ^ i71));
        int i73 = ~((31 ^ iCurrentTimeMillis2) | (31 & iCurrentTimeMillis2));
        int i74 = i72 & i73;
        int i75 = (i72 | i73) & (~i74);
        int i76 = (i75 & i74) | (i75 ^ i74);
        int i77 = (~iCurrentTimeMillis2) | i61;
        int i78 = (i77 & 31) | ((~i77) & (-32));
        int i79 = i77 & (-32);
        int i80 = ~((i79 & i78) | (i78 ^ i79));
        int i81 = -(-(((i76 & i80) | (i76 ^ i80)) * (-113)));
        int i82 = ((i69 ^ i81) | (i69 & i81)) << 1;
        int i83 = -((i81 & (~i69)) | ((~i81) & i69));
        int i84 = (i82 & i83) + (i83 | i82);
        int i85 = i61 ^ iCurrentTimeMillis2;
        int i86 = i61 & iCurrentTimeMillis2;
        int i87 = (i84 - (~(-(-((~((i85 & i86) | (i85 ^ i86))) * 113))))) - 1;
        this.f54078u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i87), Integer.valueOf(bArr.length)}, 525237936, -525237917, i87);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i10;
        int i14 = ~i11;
        if ((((~(i13 | i12)) | i14) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i14 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i13 | i14 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317)) != 1) {
            byte[] bArr2 = (byte[]) objArr[0];
            byte[] bArr3 = (byte[]) objArr[1];
            int i15 = v0;
            int i16 = i15 & 15;
            int i17 = ((i15 ^ 15) | i16) << 1;
            int i18 = -((i15 | 15) & (~i16));
            int i19 = (i17 & i18) + (i18 | i17);
            f54076w0 = i19 % 128;
            int i20 = i19 % 2;
            bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2, bArr3}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            int i21 = f54076w0 + 25;
            v0 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 23 / 0;
            }
        } else {
            axa axaVar = (axa) objArr[0];
            int i23 = v0;
            int i24 = i23 & 13;
            int i25 = i24 + ((i23 ^ 13) | i24);
            f54076w0 = i25 % 128;
            int i26 = i25 % 2;
            bArr = (byte[]) setX(new Object[]{axaVar.f54077t0, axaVar.f54078u0}, -1932889017, 1932889017, (int) System.currentTimeMillis());
            int i27 = v0;
            int i28 = i27 & 113;
            int i29 = (i27 ^ 113) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f54076w0 = i30 % 128;
            if (i30 % 2 == 0) {
                throw null;
            }
        }
        return bArr;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 1735281504, -1735281503, System.identityHashCode(this));
    }

    public axa(aww awwVar, byte[] bArr, byte[] bArr2) {
        super(false, awwVar);
        this.f54077t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54078u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
    }
}
