package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class alz implements akg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53110f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53111g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f53112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aky f53113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final akg f53114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SecureRandom f53115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f53116e;

    public alz(akg akgVar, aky akyVar) {
        this.f53114c = akgVar;
        this.f53113b = akyVar;
        byte[] bArr = new byte[akyVar.setY()];
        this.f53112a = bArr;
        akyVar.setOnFocusChangeListener();
        akyVar.setCompoundDrawableTintBlendMode(bArr, 0);
    }

    public static /* synthetic */ Object a(Object[] objArr) {
        int i10;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        alz alzVar = (alz) objArr[0];
        byte[] bArr4 = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = 3;
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i12 = f53111g;
        int i13 = i12 & 61;
        int i14 = i12 | 61;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        f53110f = i15 % 128;
        if (i15 % 2 != 0) {
            bArr2 = new byte[iIntValue3];
            bArr3 = new byte[alzVar.f53113b.setY()];
            bArr = new byte[2];
            alzVar.f53113b.setOnFocusChangeListener();
            i10 = 1;
        } else {
            byte[] bArr5 = new byte[alzVar.f53113b.setY()];
            alzVar.f53113b.setOnFocusChangeListener();
            i10 = 0;
            bArr = new byte[4];
            bArr2 = new byte[iIntValue3];
            bArr3 = bArr5;
        }
        int i16 = f53111g + 55;
        f53110f = i16 % 128;
        int i17 = i16 % 2;
        while (i10 < iIntValue3 / bArr3.length) {
            int i18 = f53110f + 7;
            f53111g = i18 % 128;
            int i19 = i18 % 2;
            Object[] objArr2 = new Object[i11];
            objArr2[0] = Integer.valueOf(i10);
            objArr2[1] = bArr;
            objArr2[2] = 0;
            ber.setDividerPadding(objArr2, -2092293587, 2092293591, i10);
            alzVar.f53113b.setCompoundDrawableTintBlendMode(bArr4, iIntValue, iIntValue2);
            int length = bArr.length;
            aky akyVar = alzVar.f53113b;
            akyVar.setCompoundDrawableTintBlendMode(bArr, 0, length);
            akyVar.setCompoundDrawableTintBlendMode(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, bArr3.length * i10, bArr3.length);
            int i20 = i10 ^ 1;
            int i21 = ((i10 & 1) | i20) << 1;
            int i22 = -i20;
            i10 = ((i21 | i22) << 1) - (i22 ^ i21);
            int i23 = f53111g;
            int i24 = i23 | 19;
            int i25 = i24 << 1;
            int i26 = -((~(i23 & 19)) & i24);
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f53110f = i27 % 128;
            int i28 = i27 % 2;
            i11 = 3;
        }
        if (bArr3.length * i10 < iIntValue3) {
            int i29 = f53110f + 73;
            f53111g = i29 % 128;
            int i30 = i29 % 2;
            ber.setDividerPadding(new Object[]{Integer.valueOf(i10), bArr, 0}, -2092293587, 2092293591, i10);
            alzVar.f53113b.setCompoundDrawableTintBlendMode(bArr4, iIntValue, iIntValue2);
            int length2 = bArr.length;
            aky akyVar2 = alzVar.f53113b;
            akyVar2.setCompoundDrawableTintBlendMode(bArr, 0, length2);
            akyVar2.setCompoundDrawableTintBlendMode(bArr3, 0);
            int length3 = bArr3.length * i10;
            int length4 = bArr2.length;
            int i31 = -(i10 * bArr3.length);
            int i32 = i31 * 755;
            int i33 = length4 * (-753);
            int i34 = ((((~i33) & i32) | ((~i32) & i33)) - (~(-(-((i32 & i33) << 1))))) - 1;
            int i35 = ~i31;
            int i36 = ~i31;
            int i37 = (i36 | i31) & i35;
            int i38 = i37 & length4;
            int i39 = (i37 | length4) & (~i38);
            int i40 = ~((i39 & i38) | (i39 ^ i38));
            int i41 = ~((i36 ^ iIntValue) | (i36 & iIntValue));
            int i42 = i40 ^ i41;
            int i43 = i40 & i41;
            int i44 = (i43 & i42) | (i42 ^ i43);
            int i45 = length4 & iIntValue;
            int i46 = (~i45) & (length4 | iIntValue);
            int i47 = ~iIntValue;
            int i48 = ~((i46 ^ i45) | (i45 & i46));
            int i49 = (((~i44) & i48) | ((~i48) & i44) | (i44 & i48)) * (-754);
            int i50 = i34 & i49;
            int i51 = ((i34 ^ i49) | i50) << 1;
            int i52 = -((i49 | i34) & (~i50));
            int i53 = (i51 & i52) + (i52 | i51);
            int i54 = i36 & length4;
            int i55 = (~i54) & (i36 | length4);
            int i56 = (i54 & i55) | (i55 ^ i54);
            int i57 = i56 & iIntValue;
            int i58 = (i56 | iIntValue) & (~i57);
            int i59 = ~((i58 & i57) | (i58 ^ i57));
            int i60 = (iIntValue | i47) & (~iIntValue);
            int i61 = (i36 & i60) | ((~i60) & i31);
            int i62 = i31 & i60;
            int i63 = (i62 & i61) | (i61 ^ i62);
            int i64 = i63 & length4;
            int i65 = (length4 | i63) & (~i64);
            int i66 = ~((i65 & i64) | (i65 ^ i64));
            int i67 = ((i59 & i66) | ((~i66) & i59) | ((~i59) & i66)) * (-754);
            int i68 = (i53 ^ i67) + ((i67 & i53) << 1);
            int i69 = i35 & i60;
            int i70 = (~i69) & (i60 | i35);
            System.arraycopy(bArr3, 0, bArr2, length3, (i68 - (~(-(~(-(-(((i69 & i70) | (i70 ^ i69)) * 754))))))) - 2);
            int i71 = f53110f;
            int i72 = ((i71 ^ 110) + ((i71 & 110) << 1)) - 1;
            f53111g = i72 % 128;
            int i73 = i72 % 2;
        }
        int i74 = f53111g + 3;
        f53110f = i74 % 128;
        if (i74 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        alz alzVar = (alz) objArr[0];
        int i10 = f53110f + 7;
        f53111g = i10 % 128;
        int i11 = i10 % 2;
        int onFocusChangeListener = alzVar.f53114c.setOnFocusChangeListener();
        if (!alzVar.f53116e) {
            int i12 = onFocusChangeListener - 1;
            int i13 = -(alzVar.f53112a.length * 2);
            int i14 = i12 ^ i13;
            int i15 = (((i13 & i12) | i14) << 1) - i14;
            int i16 = f53111g;
            int i17 = i16 & 1;
            int i18 = (i17 - (~(-(-((i16 ^ 1) | i17))))) - 1;
            f53110f = i18 % 128;
            if (i18 % 2 == 0) {
                return Integer.valueOf(i15);
            }
            throw null;
        }
        int i19 = f53111g;
        int i20 = ((i19 | 3) << 1) - (i19 ^ 3);
        int i21 = i20 % 128;
        f53110f = i21;
        if (i20 % 2 != 0) {
            throw null;
        }
        int i22 = (-2) - ((((i21 | 10) << 1) - (i21 ^ 10)) ^ (-1));
        f53111g = i22 % 128;
        if (i22 % 2 != 0) {
            return Integer.valueOf(onFocusChangeListener);
        }
        throw null;
    }

    public static /* synthetic */ void c(Object[] objArr) {
        alz alzVar = (alz) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        akk akkVar = (akk) objArr[2];
        int i10 = f53110f;
        int i11 = ((i10 ^ 19) | (i10 & 19)) << 1;
        int i12 = -(((~i10) & 19) | (i10 & (-20)));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f53111g = i14;
        int i15 = i13 % 2;
        if (akkVar instanceof ant) {
            int i16 = (i14 & (-36)) | ((~i14) & 35);
            int i17 = -(-((i14 & 35) << 1));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f53110f = i18 % 128;
            if (i18 % 2 != 0) {
                ant antVar = (ant) akkVar;
                alzVar.f53115d = (SecureRandom) ant.setOnFocusChangeListener(new Object[]{antVar}, 1149346033, -1149346032, System.identityHashCode(antVar));
                throw null;
            }
            ant antVar2 = (ant) akkVar;
            alzVar.f53115d = (SecureRandom) ant.setOnFocusChangeListener(new Object[]{antVar2}, 1149346033, -1149346032, System.identityHashCode(antVar2));
            int i19 = f53111g;
            int i20 = i19 ^ 5;
            int i21 = ((i19 & 5) | i20) << 1;
            int i22 = -i20;
            int i23 = (i21 & i22) + (i21 | i22);
            f53110f = i23 % 128;
            int i24 = i23 % 2;
        } else {
            alzVar.f53115d = (SecureRandom) aku.setCompoundDrawableTintBlendMode(new Object[0], -496048399, 496048400, (int) System.currentTimeMillis());
            int i25 = f53110f + 125;
            f53111g = i25 % 128;
            int i26 = i25 % 2;
        }
        alzVar.f53114c.setX(zBooleanValue, akkVar);
        alzVar.f53116e = zBooleanValue;
        int i27 = f53111g;
        int i28 = ((i27 & (-16)) | ((~i27) & 15)) + ((i27 & 15) << 1);
        f53110f = i28 % 128;
        if (i28 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        alz alzVar = (alz) objArr[0];
        int i10 = f53110f;
        int i11 = i10 & 79;
        int i12 = i11 + ((i10 ^ 79) | i11);
        f53111g = i12 % 128;
        if (i12 % 2 == 0) {
            alzVar.f53114c.setCompoundDrawableTintBlendMode();
            throw null;
        }
        int compoundDrawableTintBlendMode = alzVar.f53114c.setCompoundDrawableTintBlendMode();
        if (!alzVar.f53116e) {
            int i13 = f53110f;
            int i14 = ((((i13 ^ 41) | (i13 & 41)) << 1) - (~(-(((~i13) & 41) | (i13 & (-42)))))) - 1;
            f53111g = i14 % 128;
            if (i14 % 2 != 0) {
                return Integer.valueOf(compoundDrawableTintBlendMode);
            }
            throw null;
        }
        int i15 = (compoundDrawableTintBlendMode ^ (-1)) + (compoundDrawableTintBlendMode << 1);
        int i16 = -(alzVar.f53112a.length * 2);
        int i17 = ((~i16) & i15) | ((~i15) & i16);
        int i18 = -(-((i16 & i15) << 1));
        int i19 = (i17 & i18) + (i18 | i17);
        int i20 = f53111g;
        int i21 = i20 & 27;
        int i22 = (i20 ^ 27) | i21;
        int i23 = (i21 & i22) + (i22 | i21);
        f53110f = i23 % 128;
        int i24 = i23 % 2;
        return Integer.valueOf(i19);
    }

    public static /* synthetic */ Object e(Object[] objArr) {
        alz alzVar = (alz) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f53110f;
        int i11 = ((i10 ^ 1) | (i10 & 1)) << 1;
        int i12 = -((i10 & (-2)) | ((~i10) & 1));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f53111g = i13 % 128;
        int i14 = i13 % 2;
        if (!alzVar.f53116e) {
            byte[] bArr2 = (byte[]) setCompoundDrawableTintBlendMode(new Object[]{alzVar, bArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 681028106, -681028104, iIntValue);
            int i15 = f53111g + 93;
            f53110f = i15 % 128;
            int i16 = i15 % 2;
            return bArr2;
        }
        int i17 = (i10 | 55) << 1;
        int i18 = -(((~i10) & 55) | (i10 & (-56)));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        f53111g = i19 % 128;
        Object[] objArr2 = new Object[4];
        if (i19 % 2 != 0) {
            objArr2[0] = alzVar;
            objArr2[1] = bArr;
            objArr2[2] = Integer.valueOf(iIntValue);
            objArr2[3] = Integer.valueOf(iIntValue2);
            return (byte[]) setCompoundDrawableTintBlendMode(objArr2, -1916164040, 1916164040, iIntValue);
        }
        objArr2[0] = alzVar;
        objArr2[1] = bArr;
        objArr2[2] = Integer.valueOf(iIntValue);
        objArr2[3] = Integer.valueOf(iIntValue2);
        throw null;
    }

    public static /* synthetic */ Object f(Object[] objArr) throws akx {
        int i10;
        int i11;
        int i12;
        alz alzVar = (alz) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i13 = ~iIntValue;
        int i14 = ~iIntValue;
        int i15 = ~i14;
        int i16 = i14 | iIntValue;
        byte[] onFocusChangeListener = alzVar.f53114c.setOnFocusChangeListener(bArr, iIntValue, iIntValue2);
        int onFocusChangeListener2 = alzVar.f53114c.setOnFocusChangeListener();
        byte[] bArr2 = new byte[onFocusChangeListener2];
        byte[] bArr3 = alzVar.f53112a;
        int length = bArr3.length * 2;
        int i17 = ((length ^ 1) | (length & 1)) << 1;
        int i18 = -((length & (-2)) | ((~length) & 1));
        int i19 = -((i17 & i18) + (i18 | i17));
        int i20 = i19 * 624;
        int i21 = -(~(onFocusChangeListener2 * (-622)));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        int i23 = (i22 ^ (-1)) + (i22 << 1);
        int i24 = ~onFocusChangeListener2;
        int i25 = ~onFocusChangeListener2;
        int i26 = i25 | onFocusChangeListener2;
        int i27 = i24 & i26;
        int i28 = ~i19;
        int i29 = (i27 & i28) | ((~i27) & i19);
        int i30 = i27 & i19;
        int i31 = (i29 ^ i30) | (i29 & i30);
        int i32 = -(-((~((i31 & iIntValue) | ((~i31) & iIntValue) | (i31 & i14))) * 623));
        int i33 = ((i23 ^ i32) | (i23 & i32)) << 1;
        int i34 = -((i32 & (~i23)) | ((~i32) & i23));
        int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
        int i36 = i13 & i16;
        int i37 = ~i19;
        int i38 = ((~i37) & onFocusChangeListener2) | (i37 & i25);
        int i39 = i37 & onFocusChangeListener2;
        int i40 = ~((i39 & i38) | (i38 ^ i39));
        int i41 = i36 & i40;
        int i42 = (i36 | i40) & (~i41);
        int i43 = -(-(((i42 & i41) | (i42 ^ i41)) * (-623)));
        int i44 = (i35 ^ i43) + ((i43 & i35) << 1);
        int i45 = ~onFocusChangeListener2;
        int i46 = i45 & i26;
        int i47 = i46 & i19;
        int i48 = (i46 | i19) & (~i47);
        int i49 = ~((i48 & i47) | (i48 ^ i47));
        int i50 = i45 & i26;
        int i51 = ((~i50) & iIntValue) | (i50 & i14);
        int i52 = i50 & iIntValue;
        int i53 = ~((i51 ^ i52) | (i51 & i52));
        int i54 = (i53 & i49) | (i49 ^ i53);
        int i55 = ~((i28 & iIntValue) | (i19 & i14) | (i19 & iIntValue));
        int i56 = i54 & i55;
        int i57 = (i54 | i55) & (~i56);
        int i58 = ((i57 & i56) | (i57 ^ i56)) * 623;
        int i59 = (((((i44 ^ i58) | (i44 & i58)) << 1) - (~(-((i58 & (~i44)) | ((~i58) & i44))))) - 1) >> 31;
        if (onFocusChangeListener.length <= onFocusChangeListener2) {
            int i60 = f53110f + 85;
            f53111g = i60 % 128;
            int i61 = i60 % 2;
            int i62 = -onFocusChangeListener.length;
            int i63 = (onFocusChangeListener2 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) + (i62 * (-520));
            int i64 = ~i62;
            int i65 = i64 & onFocusChangeListener2;
            int i66 = (i64 | onFocusChangeListener2) & (~i65);
            int i67 = (i66 & i65) | (i66 ^ i65);
            int i68 = i67 ^ iIntValue;
            int i69 = i67 & iIntValue;
            int i70 = (i69 & i68) | (i68 ^ i69);
            int i71 = (((i70 | (~i70)) & (~i70)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i63;
            int i72 = ~i62;
            int i73 = (i25 & i72) | ((~i25) & i62);
            int i74 = i25 & i62;
            int i75 = (i74 & i73) | (i73 ^ i74);
            int i76 = -(-(((i75 | (~i75)) & (~i75)) * (-1042)));
            int i77 = (i71 & i76) + (i76 | i71);
            int i78 = ~((i50 ^ i62) | (i62 & i50));
            int i79 = i72 & i14;
            int i80 = i79 | ((~i79) & (i72 | i14));
            int i81 = ~((i80 & onFocusChangeListener2) | (i80 ^ onFocusChangeListener2));
            System.arraycopy(onFocusChangeListener, 0, bArr2, (((i78 & i81) | (i78 ^ i81)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i77, onFocusChangeListener.length);
            int i82 = f53110f;
            i10 = (i82 ^ 27) + ((i82 & 27) << 1);
            f53111g = i10 % 128;
        } else {
            System.arraycopy(onFocusChangeListener, 0, bArr2, 0, onFocusChangeListener2);
            i59 |= 1;
            int i83 = f53111g;
            i10 = ((i83 ^ 62) + ((i83 & 62) << 1)) - 1;
            f53110f = i10 % 128;
        }
        int i84 = i10 % 2;
        int length2 = bArr3.length;
        int i85 = -bArr3.length;
        int i86 = onFocusChangeListener2 & i85;
        byte[] bArr4 = (byte[]) setCompoundDrawableTintBlendMode(new Object[]{alzVar, bArr2, Integer.valueOf(length2), Integer.valueOf(i86 + ((i85 ^ onFocusChangeListener2) | i86)), Integer.valueOf(bArr3.length)}, -422519749, 422519755, length2);
        int i87 = f53110f + 81;
        f53111g = i87 % 128;
        int i88 = i87 % 2;
        int i89 = 0;
        while (i89 != bArr3.length) {
            int i90 = f53110f;
            int i91 = ((i90 ^ 27) - (~(-(-((i90 & 27) << 1))))) - 1;
            f53111g = i91 % 128;
            int i92 = i91 % 2;
            byte b10 = bArr2[i89];
            byte b11 = bArr4[i89];
            bArr2[i89] = (byte) (((~b10) & b11) | ((~b11) & b10));
            int i93 = (i89 ^ (-35)) + ((i89 & (-35)) << 1);
            i89 = (i93 & 36) + (i93 | 36);
            int i94 = i90 + 41;
            f53111g = i94 % 128;
            int i95 = i94 % 2;
        }
        int length3 = bArr3.length;
        int i96 = -bArr3.length;
        int i97 = onFocusChangeListener2 & i96;
        byte[] bArr5 = (byte[]) setCompoundDrawableTintBlendMode(new Object[]{alzVar, bArr2, 0, Integer.valueOf(length3), Integer.valueOf((((onFocusChangeListener2 ^ i96) | i97) << 1) - ((i96 | onFocusChangeListener2) & (~i97)))}, -422519749, 422519755, 0);
        int length4 = bArr3.length;
        int i98 = f53111g;
        int i99 = i98 & 121;
        int i100 = (i98 ^ 121) | i99;
        int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
        f53110f = i101 % 128;
        int i102 = i101 % 2;
        while (length4 != onFocusChangeListener2) {
            int i103 = (705688624 & i14) | ((-705688625) & iIntValue);
            int i104 = 705688624 & iIntValue;
            int i105 = (i104 & i103) | (i103 ^ i104);
            int i106 = (i105 | (~i105)) & (~i105);
            int i107 = ((~i106) & 422069149) | ((-422069150) & i106);
            int i108 = i106 & 422069149;
            int i109 = -(~(-(-(((i108 & i107) | (i107 ^ i108)) * (-366)))));
            int i110 = ((1792893698 & i109) + (i109 | 1792893698)) - 1;
            int i111 = 992999357 & iIntValue;
            int i112 = (992999357 | iIntValue) & (~i111);
            int i113 = -(~(((~((i112 & i111) | (i112 ^ i111))) | 134758416) * 366));
            int i114 = (i110 & i113) + (i113 | i110);
            int i115 = (i114 ^ (-1)) + (i114 << 1);
            int i116 = (-1117809826) ^ iIntValue;
            int i117 = (-1117809826) & iIntValue;
            int i118 = (i116 & i117) | (i116 ^ i117);
            int i119 = (i118 | (~i118)) & (~i118);
            int i120 = ((~i119) & 8416417) | (i119 & (-8416418));
            int i121 = i119 & 8416417;
            int i122 = ((i121 & i120) | (i120 ^ i121)) * 345;
            int i123 = 639769552 & i122;
            int i124 = -(-((i122 ^ 639769552) | i123));
            int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
            int i126 = ~(((-1117809826) & i13) | ((~i13) & (-1117809826)) | (1117809825 & i13));
            int i127 = i126 ^ (-1877208240);
            int i128 = i126 & (-1877208240);
            int i129 = (((i128 & i127) | (i127 ^ i128)) * 345) + i125;
            int i130 = (-8416418) & iIntValue;
            int i131 = (~i130) & ((-8416418) | iIntValue);
            int i132 = -(-((~((i130 & i131) | (i131 ^ i130))) * 345));
            int i133 = i129 & i132;
            if (i115 <= i133 + ((i129 ^ i132) | i133)) {
                byte b12 = bArr2[length4];
                int i134 = -bArr3.length;
                int i135 = length4 ^ i134;
                int i136 = -(-((i134 & length4) << 1));
                byte b13 = bArr5[(i135 & i136) + (i136 | i135)];
                int i137 = (~b13) & b12;
                int i138 = (~b12) & b13;
                bArr2[length4] = (byte) ((i138 & i137) | (i137 ^ i138));
                int i139 = (length4 & (-7)) | ((~length4) & 6);
                int i140 = (length4 & 6) << 1;
                i11 = i139 & i140;
                i12 = i140 | i139;
            } else {
                byte b14 = bArr2[length4];
                int i141 = -bArr3.length;
                byte b15 = bArr5[(((~i141) & length4) | ((~length4) & i141)) + ((i141 & length4) << 1)];
                int i142 = b14 & b15;
                bArr2[length4] = (byte) (((b14 ^ b15) | i142) & (~i142));
                int i143 = length4 & 1;
                int i144 = (length4 | 1) & (~i143);
                int i145 = -(-(i143 << 1));
                i11 = i144 & i145;
                i12 = i144 | i145;
            }
            length4 = i11 + i12;
            int i146 = f53110f;
            int i147 = i146 & 69;
            int i148 = i147 + ((i146 ^ 69) | i147);
            f53111g = i148 % 128;
            int i149 = i148 % 2;
        }
        int i150 = f53111g;
        int i151 = ((i150 | 109) << 1) - (i150 ^ 109);
        f53110f = i151 % 128;
        int i152 = i151 % 2;
        int i153 = 0;
        while (i153 != bArr3.length) {
            int i154 = f53110f;
            int i155 = i154 & 77;
            int i156 = (i154 | 77) & (~i155);
            int i157 = -(-(i155 << 1));
            int i158 = (i156 ^ i157) + ((i156 & i157) << 1);
            int i159 = i158 % 128;
            f53111g = i159;
            int i160 = i158 % 2;
            int i161 = bArr3[i153];
            int length5 = bArr3.length;
            int i162 = length5 & i153;
            int i163 = -(-((length5 ^ i153) | i162));
            int i164 = bArr2[(i162 ^ i163) + ((i163 & i162) << 1)];
            int i165 = (i161 | i164) & (~(i161 & i164));
            int i166 = ((~i165) & i59) | ((~i59) & i165);
            int i167 = i59 & i165;
            i59 = (i167 & i166) | (i166 ^ i167);
            int i168 = i153 & 1;
            int i169 = (i153 ^ 1) | i168;
            i153 = ((i168 | i169) << 1) - (i169 ^ i168);
            int i170 = (i159 ^ 21) + ((i159 & 21) << 1);
            f53110f = i170 % 128;
            int i171 = i170 % 2;
        }
        int length6 = bArr3.length * 2;
        int i172 = f53111g;
        int i173 = i172 ^ 11;
        int i174 = -(-((i172 & 11) << 1));
        int i175 = (i173 ^ i174) + ((i174 & i173) << 1);
        f53110f = i175 % 128;
        int i176 = i175 % 2;
        int i177 = -1;
        while (length6 != onFocusChangeListener2) {
            int i178 = f53111g;
            int i179 = i178 & 117;
            int i180 = (i178 ^ 117) | i179;
            int i181 = (i179 & i180) + (i180 | i179);
            int i182 = i181 % 128;
            f53110f = i182;
            int i183 = i181 % 2;
            int i184 = -(bArr2[length6] & 255);
            int i185 = ~i177;
            int i186 = ((i184 & i177) >> 31) & length6;
            int i187 = i186 & i177;
            int i188 = (~i187) & (i186 | i177);
            int i189 = (((i177 * 471) + (i186 * 471)) - (~(((i187 & i188) | (i188 ^ i187)) * (-470)))) - 1;
            int i190 = ~i186;
            int i191 = ~i186;
            int i192 = i190 & (i191 | i186);
            int i193 = ~i177;
            int i194 = i192 & i193;
            int i195 = onFocusChangeListener2;
            int i196 = (~i194) & (i192 | i193);
            int i197 = ~((i194 & i196) | (i196 ^ i194));
            int i198 = ~i177;
            int i199 = i198 ^ iIntValue;
            int i200 = i198 & iIntValue;
            int i201 = (i199 ^ i200) | (i200 & i199);
            int i202 = (i201 | (~i201)) & (~i201);
            int i203 = i197 & i202;
            int i204 = ((i197 | i202) & (~i203)) | i203;
            int i205 = (i14 & i191) | ((~i14) & i186);
            int i206 = i14 & i186;
            int i207 = (i205 & i206) | (i205 ^ i206);
            int i208 = (i207 & i177) | (i207 ^ i177);
            int i209 = (i208 | (~i208)) & (~i208);
            int i210 = i204 & i209;
            int i211 = (((i204 | i209) & (~i210)) | i210) * (-470);
            int i212 = ((i189 & i211) - (~(i211 | i189))) - 1;
            int i213 = (i193 ^ i186) | (i193 & i186);
            int i214 = (i213 & i14) | ((~i213) & iIntValue);
            int i215 = i213 & iIntValue;
            int i216 = ~((i215 & i214) | (i214 ^ i215));
            int i217 = i13 & i186;
            int i218 = (i186 | i13) & (~i217);
            int i219 = (i218 & i217) | (i218 ^ i217);
            int i220 = (i185 & i219) | ((~i219) & i177);
            int i221 = i177 & i219;
            int i222 = (i221 & i220) | (i220 ^ i221);
            int i223 = (i222 | (~i222)) & (~i222);
            int i224 = i216 ^ i223;
            int i225 = i223 & i216;
            int i226 = -(-(((i225 & i224) | (i224 ^ i225)) * 470));
            int i227 = i212 & i226;
            int i228 = (i226 | i212) & (~i227);
            int i229 = -(-(i227 << 1));
            i177 = ((i228 & i229) << 1) + (i228 ^ i229);
            length6 = (((length6 | (-85)) << 1) - (length6 ^ (-85))) + 86;
            int i230 = i182 + 112;
            int i231 = (i230 ^ (-1)) + (i230 << 1);
            f53111g = i231 % 128;
            int i232 = i231 % 2;
            onFocusChangeListener2 = i195;
            bArr2 = bArr2;
        }
        int i233 = onFocusChangeListener2;
        byte[] bArr6 = bArr2;
        int i234 = i177 >> 31;
        int i235 = i59 & i234;
        int i236 = (i234 | i59) & (~i235);
        int i237 = (i236 & i235) | (i236 ^ i235);
        int i238 = i177 & 1;
        int i239 = (i238 - (~(-(-((i177 ^ 1) | i238))))) - 1;
        int i240 = bArr6[i239];
        int i241 = i240 & 1;
        if ((i237 | (((i240 ^ 1) | i241) & (~i241))) != 0) {
            bek.setOnFocusChangeListener(new Object[]{bArr6}, -949833373, 949833375, (int) System.currentTimeMillis());
            throw new akx("data wrong");
        }
        int i242 = (i239 ^ 60) + ((i239 & 60) << 1);
        int i243 = (i242 & (-59)) + (i242 | (-59));
        int i244 = -i243;
        int i245 = i244 * 302;
        int i246 = -(-(i233 * TypedValues.MotionType.TYPE_EASING));
        int i247 = i245 & i246;
        int i248 = (i245 ^ i246) | i247;
        int i249 = ((i247 | i248) << 1) - (i248 ^ i247);
        int i250 = ~i244;
        int i251 = i13 & i16;
        int i252 = ((~i251) & i250) | ((~i250) & i251);
        int i253 = i250 & i251;
        int i254 = ~((i253 & i252) | (i252 ^ i253));
        int i255 = i233 ^ i254;
        int i256 = i254 & i233;
        int i257 = -(~(((i256 & i255) | (i255 ^ i256)) * (-602)));
        int i258 = (i249 ^ i257) + ((i257 & i249) << 1);
        int i259 = (i258 ^ (-1)) + (i258 << 1);
        int i260 = ~i244;
        int i261 = i260 & i45;
        int i262 = (~i261) & (i260 | i45);
        int i263 = (i261 & i262) | (i262 ^ i261);
        int i264 = (i263 | (~i263)) & (~i263);
        int i265 = ~i244;
        int i266 = i260 & (i265 | i244);
        int i267 = i266 & iIntValue;
        int i268 = (iIntValue | i266) & (~i267);
        int i269 = ~((i268 & i267) | (i268 ^ i267));
        int i270 = (i269 & i264) | (i264 ^ i269);
        int i271 = (i14 & i265) | (i244 & i15);
        int i272 = i244 & i14;
        int i273 = (i272 & i271) | (i271 ^ i272);
        int i274 = i273 & i233;
        int i275 = (i273 | i233) & (~i274);
        int i276 = ~((i275 & i274) | (i275 ^ i274));
        int i277 = i270 & i276;
        int i278 = (i276 | i270) & (~i277);
        int i279 = ((-1) << 1) - ((-1) ^ ((i259 - (~(-(~(((i278 & i277) | (i278 ^ i277)) * (-301)))))) - 1));
        int i280 = -(~((~((i14 ^ i233) | (i14 & i233))) * 301));
        int i281 = (i279 & i280) + (i280 | i279);
        int i282 = (i281 ^ (-1)) + (i281 << 1);
        byte[] bArr7 = new byte[i282];
        System.arraycopy(bArr6, i243, bArr7, 0, i282);
        bek.setOnFocusChangeListener(new Object[]{bArr6}, -949833373, 949833375, (int) System.currentTimeMillis());
        int i283 = f53111g + 77;
        f53110f = i283 % 128;
        if (i283 % 2 != 0) {
            int i284 = 90 / 0;
        }
        return bArr7;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws akx {
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        switch (((~(i10 | i15)) * 69) + (((~(i11 | i12)) | (~(i14 | i12)) | (~(i14 | i11))) * (-69)) + (((~(i14 | i15 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70)) {
            case 1:
                return d(objArr);
            case 2:
                return f(objArr);
            case 3:
                c(objArr);
                return null;
            case 4:
                return e(objArr);
            case 5:
                return b(objArr);
            case 6:
                return a(objArr);
            default:
                alz alzVar = (alz) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i16 = f53110f;
                int i17 = i16 & 85;
                int i18 = (i17 - (~(-(-((i16 ^ 85) | i17))))) - 1;
                f53111g = i18 % 128;
                int i19 = i18 % 2;
                if (iIntValue2 > ((Integer) setCompoundDrawableTintBlendMode(new Object[]{alzVar}, 791559153, -791559152, System.identityHashCode(alzVar))).intValue()) {
                    throw new akr("input data too long");
                }
                int iIntValue3 = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{alzVar}, 791559153, -791559152, System.identityHashCode(alzVar))).intValue();
                int i20 = iIntValue3 & 1;
                int i21 = (iIntValue3 | 1) & (~i20);
                int i22 = i20 << 1;
                int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                int length = alzVar.f53112a.length * 2;
                int i24 = (i23 & length) + (length | i23);
                byte[] bArr2 = new byte[i24];
                int i25 = -iIntValue2;
                int i26 = i25 * 989;
                int i27 = i24 * (-987);
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                int i29 = ~i24;
                int i30 = (i29 | i24) & i29;
                int i31 = ~iIntValue;
                int i32 = i30 & i31;
                int i33 = (~i32) & (i30 | i31);
                int i34 = (i33 ^ i32) | (i33 & i32);
                int i35 = (i34 ^ i25) | (i34 & i25);
                int i36 = ~i35;
                int i37 = i36 & (i35 | i36);
                int i38 = i25 & i24;
                int i39 = (~i38) & (i25 | i24);
                int i40 = (i39 ^ i38) | (i38 & i39);
                int i41 = ((~i40) & iIntValue) | (i40 & i31);
                int i42 = i40 & iIntValue;
                int i43 = ~((i41 & i42) | (i41 ^ i42));
                int i44 = i37 & i43;
                int i45 = (i37 | i43) & (~i44);
                int i46 = ((i45 & i44) | (i45 ^ i44)) * 988;
                int i47 = i28 & i46;
                int i48 = -(-((i46 ^ i28) | i47));
                int i49 = (i47 & i48) + (i48 | i47);
                int i50 = ((i25 ^ i29) | (i25 & i29)) * (-988);
                int i51 = (i49 & i50) + (i50 | i49);
                int i52 = ~i25;
                int i53 = ~((i52 ^ i29) | (i52 & i29));
                int i54 = ((~i30) & iIntValue) | i32;
                int i55 = i30 & iIntValue;
                int i56 = ~((i54 ^ i55) | (i54 & i55));
                int i57 = i53 ^ i56;
                int i58 = i53 & i56;
                int i59 = (i58 & i57) | (i57 ^ i58);
                int i60 = (i31 | iIntValue) & i31;
                int i61 = (i60 & i52) | ((~i60) & i25);
                int i62 = i60 & i25;
                int i63 = (i61 ^ i62) | (i61 & i62);
                int i64 = ~((i63 & i24) | (i63 ^ i24));
                int i65 = i59 ^ i64;
                int i66 = i59 & i64;
                System.arraycopy(bArr, iIntValue, bArr2, (((i66 & i65) | (i65 ^ i66)) * 988) + i51, iIntValue2);
                int i67 = i25 * (-949);
                int i68 = i24 * (-949);
                int i69 = i67 & i68;
                int i70 = ((i67 ^ i68) | i69) << 1;
                int i71 = -((i67 | i68) & (~i69));
                int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                int i73 = i29 ^ i31;
                int i74 = i29 & i31;
                int i75 = ~((i73 & i74) | (i73 ^ i74));
                int i76 = i52 & iIntValue;
                int i77 = (i52 | iIntValue) & (~i76);
                int i78 = ~((i77 & i76) | (i77 ^ i76));
                int i79 = i75 & i78;
                int i80 = (((i78 | i75) & (~i79)) | i79) * ReturnCode.ERR_REPOSITORY;
                int i81 = i72 & i80;
                int i82 = ((i72 ^ i80) | i81) << 1;
                int i83 = -((i80 | i72) & (~i81));
                int i84 = (i82 & i83) + (i83 | i82);
                int i85 = i31 & i25;
                int i86 = (~i85) & (i31 | i25);
                int i87 = (i86 & i85) | (i86 ^ i85);
                int i88 = ~i87;
                int i89 = (i87 | i88) & i88;
                int i90 = i24 & iIntValue;
                int i91 = ~((i24 ^ iIntValue) | i90);
                int i92 = ((~i91) & i89) | ((~i89) & i91);
                int i93 = i89 & i91;
                int i94 = ((i93 & i92) | (i92 ^ i93)) * (-950);
                int i95 = (i84 ^ i94) + ((i94 & i84) << 1);
                int i96 = ((~i31) & i24) | i74;
                int i97 = i31 & i24;
                int i98 = ~((i96 & i97) | (i96 ^ i97));
                int i99 = i85 | i76;
                int i100 = i25 & iIntValue;
                int i101 = ~((i99 & i100) | (i99 ^ i100));
                bArr2[(i95 - (~(-(~(-(-(((i101 & i98) | (i98 ^ i101)) * 950))))))) - 3] = 1;
                byte[] bArr3 = alzVar.f53112a;
                System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                alzVar.f53115d.nextBytes(bArr4);
                int i102 = -bArr3.length;
                int i103 = i102 * 69;
                int i104 = -(~(-(-(i24 * (-67)))));
                int i105 = ((i103 & i104) + (i103 | i104)) - 1;
                int i106 = ~i102;
                int i107 = i106 & i29;
                int i108 = (i29 | i106) & (~i107);
                int i109 = (i107 & i108) | (i108 ^ i107);
                int i110 = ~((i60 & i109) | (i109 ^ i60));
                int i111 = i102 & i24;
                int i112 = (~i111) & (i102 | i24);
                int i113 = ~((i111 & i112) | (i112 ^ i111));
                int i114 = i110 & i113;
                int i115 = (i110 | i113) & (~i114);
                int i116 = (i115 & i114) | (i115 ^ i114);
                int i117 = (~i90) & (i24 | iIntValue);
                int i118 = ~((i90 & i117) | (i117 ^ i90));
                int i119 = i116 ^ i118;
                int i120 = i116 & i118;
                int i121 = (i105 - (~(-(-(((i120 & i119) | (i119 ^ i120)) * (-68)))))) - 1;
                int i122 = (i102 | i106) & i106;
                int i123 = (i122 ^ i31) | (i122 & i31);
                int i124 = (i123 & i24) | (i123 ^ i24);
                int i125 = ~i124;
                int i126 = -(-(((i124 | i125) & i125) * (-68)));
                int i127 = i121 ^ i126;
                int i128 = ((((i126 & i121) | i127) << 1) - (~(-i127))) - 1;
                int i129 = i30 ^ i31;
                int i130 = ~((i129 & i32) | (i129 ^ i32));
                int i131 = -(-(((i122 & i130) | (i122 ^ i130)) * 68));
                int i132 = i128 & i131;
                byte[] bArr5 = (byte[]) setCompoundDrawableTintBlendMode(new Object[]{alzVar, bArr4, 0, Integer.valueOf(length2), Integer.valueOf((i132 - (~(-(-((i131 ^ i128) | i132))))) - 1)}, -422519749, 422519755, 0);
                int length3 = bArr3.length;
                int i133 = f53111g;
                int i134 = i133 & 7;
                int i135 = (((i133 ^ 7) | i134) << 1) - ((i133 | 7) & (~i134));
                f53110f = i135 % 128;
                int i136 = i135 % 2;
                while (length3 != i24) {
                    int i137 = f53111g;
                    int i138 = ((i137 & 98) + (i137 | 98)) - 1;
                    f53110f = i138 % 128;
                    int i139 = i138 % 2;
                    byte b10 = bArr2[length3];
                    int i140 = -bArr3.length;
                    int i141 = ((i140 * 284) - (~(-(-(length3 * (-282)))))) - 1;
                    int i142 = ~i140;
                    int i143 = i142 & (i142 | i140);
                    int i144 = i143 & length3;
                    int i145 = (~i144) & (i143 | length3);
                    int i146 = ~length3;
                    int i147 = (i145 ^ i144) | (i145 & i144);
                    int i148 = ~i147;
                    int i149 = (i147 | i148) & i148;
                    int i150 = i142 & iIntValue;
                    alz alzVar2 = alzVar;
                    int i151 = (~i150) & (i142 | iIntValue);
                    int i152 = (i151 ^ i150) | (i151 & i150);
                    int i153 = ~i152;
                    int i154 = (i152 | i153) & i153;
                    int i155 = i149 ^ i154;
                    int i156 = i154 & i149;
                    int i157 = -(-(((i156 & i155) | (i155 ^ i156)) * (-283)));
                    int i158 = i141 & i157;
                    int i159 = (i157 | i141) & (~i158);
                    int i160 = -(-(i158 << 1));
                    int i161 = ((i159 | i160) << 1) - (i159 ^ i160);
                    int i162 = i146 & i140;
                    int i163 = i162 | ((~i162) & (i146 | i140));
                    int i164 = ~i163;
                    int i165 = ((i163 | i164) & i164) * 283;
                    int i166 = ((i161 & i165) - (~(i165 | i161))) - 1;
                    int i167 = i142 ^ i146;
                    int i168 = i142 & i146;
                    int i169 = -(-((~((i167 & i168) | (i167 ^ i168) | iIntValue)) * 283));
                    int i170 = i166 & i169;
                    int i171 = ((i166 ^ i169) | i170) << 1;
                    int i172 = -((i169 | i166) & (~i170));
                    bArr2[length3] = (byte) (bArr5[((i171 | i172) << 1) - (i172 ^ i171)] ^ b10);
                    int i173 = length3 + 11;
                    int i174 = (i173 ^ (-1)) + (i173 << 1);
                    int i175 = i174 & (-9);
                    int i176 = (i174 ^ (-9)) | i175;
                    length3 = (i175 ^ i176) + ((i176 & i175) << 1);
                    int i177 = i137 ^ 111;
                    int i178 = ((((i137 & 111) | i177) << 1) - (~(-i177))) - 1;
                    f53110f = i178 % 128;
                    int i179 = i178 % 2;
                    alzVar = alzVar2;
                }
                alz alzVar3 = alzVar;
                System.arraycopy(bArr4, 0, bArr2, 0, bArr3.length);
                int length4 = bArr3.length;
                int i180 = -bArr3.length;
                byte[] bArr6 = (byte[]) setCompoundDrawableTintBlendMode(new Object[]{alzVar3, bArr2, Integer.valueOf(length4), Integer.valueOf((i24 & i180) + (i180 | i24)), Integer.valueOf(bArr3.length)}, -422519749, 422519755, length4);
                int i181 = f53110f;
                int i182 = i181 ^ 79;
                int i183 = ((i181 & 79) | i182) << 1;
                int i184 = -i182;
                int i185 = (i183 ^ i184) + ((i183 & i184) << 1);
                f53111g = i185 % 128;
                int i186 = i185 % 2;
                int i187 = 0;
                while (i187 != bArr3.length) {
                    int i188 = f53110f;
                    int i189 = i188 & 39;
                    int i190 = ((i188 ^ 39) | i189) << 1;
                    int i191 = -((~i189) & (i188 | 39));
                    int i192 = (i190 & i191) + (i190 | i191);
                    f53111g = i192 % 128;
                    if (i192 % 2 == 0) {
                        byte b11 = bArr2[i187];
                        byte b12 = bArr6[i187];
                        int i193 = b11 & b12;
                        bArr2[i187] = (byte) (((b11 ^ b12) | i193) & (~i193));
                        i187 = (i187 ^ 102) + ((i187 & 102) << 1);
                        i13 = 1;
                    } else {
                        byte b13 = bArr2[i187];
                        byte b14 = bArr6[i187];
                        bArr2[i187] = (byte) (((~b13) & b14) | ((~b14) & b13));
                        i13 = 1;
                        i187 = (((i187 | 2) << 1) - (i187 ^ 2)) - 1;
                    }
                    int i194 = ((i188 & (-4)) | ((~i188) & 3)) + ((i188 & 3) << i13);
                    f53111g = i194 % 128;
                    int i195 = i194 % 2;
                }
                byte[] onFocusChangeListener = alzVar3.f53114c.setOnFocusChangeListener(bArr2, 0, i24);
                int i196 = f53110f;
                int i197 = ((i196 & 14) + (i196 | 14)) - 1;
                f53111g = i197 % 128;
                int i198 = i197 % 2;
                return onFocusChangeListener;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final byte[] setOnFocusChangeListener(byte[] bArr, int i10, int i11) throws akx {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -1797443330, 1797443334, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final void setX(boolean z10, akk akkVar) throws akx {
        setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10), akkVar}, -1749354439, 1749354442, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1620813472, 1620813477, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.akg
    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 791559153, -791559152, System.identityHashCode(this))).intValue();
    }
}
