package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public class aeb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52525b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52526c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f52527a;

    public aeb(OutputStream outputStream) {
        this.f52527a = outputStream;
    }

    public static aeb a(Object[] objArr) {
        OutputStream outputStream = (OutputStream) objArr[0];
        String str = (String) objArr[1];
        int i10 = f52526c;
        int i11 = i10 & 71;
        int i12 = i11 + ((i10 ^ 71) | i11);
        f52525b = i12 % 128;
        int i13 = i12 % 2;
        if (str.equals(ASN1Encoding.DER)) {
            o0 o0Var = new o0(outputStream);
            int i14 = f52525b;
            int i15 = (i14 & 1) + (i14 | 1);
            f52526c = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 0 / 0;
            }
            return o0Var;
        }
        if (str.equals(ASN1Encoding.DL)) {
            q0 q0Var = new q0(outputStream);
            int i17 = f52526c;
            int i18 = ((i17 & (-16)) | ((~i17) & 15)) + ((i17 & 15) << 1);
            f52525b = i18 % 128;
            int i19 = i18 % 2;
            return q0Var;
        }
        aeb aebVar = new aeb(outputStream);
        int i20 = f52526c + 115;
        f52525b = i20 % 128;
        if (i20 % 2 == 0) {
            return aebVar;
        }
        throw null;
    }

    public static /* synthetic */ void b(Object[] objArr) throws IOException {
        aeb aebVar = (aeb) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f52525b;
        int i11 = i10 & 105;
        int i12 = ((i10 ^ 105) | i11) << 1;
        int i13 = -((i10 | 105) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        f52526c = i15;
        int i16 = i14 % 2;
        if (iIntValue2 < 31) {
            int i17 = i15 & 47;
            int i18 = (i15 ^ 47) | i17;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            f52525b = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = (iIntValue2 & iIntValue) | ((~iIntValue2) & iIntValue) | ((~iIntValue) & iIntValue2);
                setX(new Object[]{aebVar, Integer.valueOf(i20)}, -478708408, 478708419, i20);
                int i21 = 51 / 0;
            } else {
                int i22 = ((~iIntValue2) & iIntValue) | ((~iIntValue) & iIntValue2);
                int i23 = iIntValue2 & iIntValue;
                int i24 = (i23 & i22) | (i22 ^ i23);
                setX(new Object[]{aebVar, Integer.valueOf(i24)}, -478708408, 478708419, i24);
            }
            int i25 = f52526c;
            int i26 = (i25 & 103) + (i25 | 103);
            f52525b = i26 % 128;
            if (i26 % 2 != 0) {
                throw null;
            }
            return;
        }
        byte[] bArr = new byte[6];
        bArr[5] = (byte) (iIntValue2 & 127);
        int i27 = i15 ^ 85;
        int i28 = ((i15 & 85) | i27) << 1;
        int i29 = -i27;
        int i30 = (i28 & i29) + (i28 | i29);
        f52525b = i30 % 128;
        int i31 = i30 % 2;
        int i32 = 5;
        while (iIntValue2 > 127) {
            int i33 = f52525b;
            int i34 = (((i33 | 78) << 1) - (i33 ^ 78)) - 1;
            int i35 = i34 % 128;
            f52526c = i35;
            int i36 = i34 % 2;
            iIntValue2 >>>= 7;
            i32--;
            bArr[i32] = (byte) ((iIntValue2 & 127) | 128);
            int i37 = (i35 & 97) + (i35 | 97);
            f52525b = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = ((-1) << 1) - (i32 ^ (-1));
        bArr[i39] = (byte) ((iIntValue & 31) | (iIntValue & (-32)) | ((~iIntValue) & 31));
        setX(new Object[]{aebVar, bArr, Integer.valueOf(i39), Integer.valueOf(5 - (~(-i39)))}, -464690180, 464690189, i39);
        int i40 = f52526c;
        int i41 = i40 & 43;
        int i42 = (i40 | 43) & (~i41);
        int i43 = i41 << 1;
        int i44 = (i42 & i43) + (i42 | i43);
        f52525b = i44 % 128;
        int i45 = i44 % 2;
    }

    public static int c(int i10) {
        return ((Integer) setX(new Object[]{Integer.valueOf(i10)}, 1896945642, -1896945627, i10)).intValue();
    }

    public static /* synthetic */ void e(Object[] objArr) throws IOException {
        aeb aebVar = (aeb) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int i10 = f52525b;
        int i11 = i10 & 109;
        int i12 = (((~i11) & (i10 | 109)) - (~(i11 << 1))) - 1;
        f52526c = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (!(!zBooleanValue)) {
            int i13 = (i10 & 33) + (i10 | 33);
            f52526c = i13 % 128;
            if (i13 % 2 == 0) {
                setX(new Object[]{aebVar, Integer.valueOf(iIntValue)}, -478708408, 478708419, iIntValue);
                int i14 = 69 / 0;
            } else {
                setX(new Object[]{aebVar, Integer.valueOf(iIntValue)}, -478708408, 478708419, iIntValue);
            }
        }
        int i15 = f52526c;
        int i16 = i15 & 95;
        int i17 = i15 | 95;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f52525b = i18 % 128;
        int i19 = i18 % 2;
    }

    public static /* synthetic */ Integer f(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i10 = f52526c;
        int i11 = i10 & 49;
        int i12 = ((i10 ^ 49) | i11) << 1;
        int i13 = -((~i11) & (i10 | 49));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        int i15 = i14 % 128;
        f52525b = i15;
        if (i14 % 2 == 0 ? iIntValue < 31 : iIntValue < 79) {
            int i16 = i15 ^ 15;
            int i17 = ((i15 & 15) | i16) << 1;
            int i18 = -i16;
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            int i20 = i19 % 128;
            f52526c = i20;
            int i21 = i19 % 2 != 0 ? 1 : 0;
            int i22 = i20 & 59;
            int i23 = (((i20 ^ 59) | i22) << 1) - ((i20 | 59) & (~i22));
            f52525b = i23 % 128;
            if (i23 % 2 == 0) {
                return Integer.valueOf(i21);
            }
            throw null;
        }
        int i24 = i10 & 7;
        int i25 = -(-((i10 ^ 7) | i24));
        int i26 = (i24 & i25) + (i24 | i25);
        f52525b = i26 % 128;
        int i27 = i26 % 2;
        int i28 = 2;
        while (true) {
            iIntValue >>>= 7;
            if (iIntValue == 0) {
                int i29 = f52525b;
                int i30 = i29 & 31;
                int i31 = (i30 - (~(-(-((i29 ^ 31) | i30))))) - 1;
                f52526c = i31 % 128;
                int i32 = i31 % 2;
                return Integer.valueOf(i28);
            }
            int i33 = f52525b;
            int i34 = i33 & 3;
            int i35 = (i33 | 3) & (~i34);
            int i36 = -(-(i34 << 1));
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            int i38 = i37 % 128;
            f52526c = i38;
            int i39 = i37 % 2;
            int i40 = i28 - 93;
            i28 = ((i40 & 94) << 1) + (i40 ^ 94);
            int i41 = (i38 ^ 11) + ((i38 & 11) << 1);
            f52525b = i41 % 128;
            int i42 = i41 % 2;
        }
    }

    public static /* synthetic */ aeb g(Object[] objArr) {
        aeb aebVar = new aeb((OutputStream) objArr[0]);
        int i10 = f52525b;
        int i11 = i10 & 107;
        int i12 = (i11 - (~(-(-((i10 ^ 107) | i11))))) - 1;
        f52526c = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 17 / 0;
        }
        return aebVar;
    }

    public static /* synthetic */ void j(Object[] objArr) throws IOException {
        aeb aebVar = (aeb) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        byte[] bArr = (byte[]) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        byte bByteValue = ((Byte) objArr[4]).byteValue();
        int i10 = f52526c;
        int i11 = i10 & 37;
        int i12 = i11 + ((i10 ^ 37) | i11);
        f52525b = i12 % 128;
        int i13 = i12 % 2;
        setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 3}, 1303469841, -1303469839, 3);
        int i14 = (-2) - ((569 - (~(-(-(iIntValue * 569))))) ^ (-1));
        int i15 = ~iIntValue;
        int i16 = i15 | iIntValue;
        int i17 = i15 & i16;
        int i18 = (-2) ^ i17;
        int i19 = (-2) & i17;
        int i20 = ~((i18 ^ i19) | (i18 & i19));
        int i21 = ~(i18 | i19);
        int i22 = (i20 & i21) | (i20 ^ i21);
        int i23 = ~(((~i15) & i17) | ((~i17) & i15) | (i17 & i15));
        int i24 = -(~(-(-(((i22 & i23) | (i22 ^ i23)) * (-1136)))));
        int i25 = ((i14 & i24) + (i14 | i24)) - 1;
        int i26 = (-2) & iIntValue;
        int i27 = (~i26) & ((-2) | iIntValue);
        int i28 = (i26 & i27) | (i27 ^ i26);
        int i29 = ~i28;
        int i30 = (i28 | i29) & i29;
        int i31 = i17 & iIntValue;
        int i32 = (i17 | iIntValue) & (~i31);
        int i33 = ~((i31 & i32) | (i32 ^ i31));
        int i34 = i30 ^ i33;
        int i35 = i30 & i33;
        int i36 = (i35 & i34) | (i34 ^ i35);
        int i37 = i15 & 1;
        int i38 = (~i37) & (i15 | 1);
        int i39 = i38 | i37 | iIntValue;
        int i40 = ~i39;
        int i41 = i40 & (i39 | i40);
        int i42 = i36 ^ i41;
        int i43 = i36 & i41;
        int i44 = ((i43 & i42) | (i42 ^ i43)) * (-568);
        int i45 = ((i25 ^ i44) | (i25 & i44)) << 1;
        int i46 = -((i44 & (~i25)) | ((~i44) & i25));
        int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
        int i48 = ~((i38 ^ i37) | (i37 & i38));
        int i49 = i15 & iIntValue;
        int i50 = ~(i49 | ((~i49) & i16));
        int i51 = ((~i50) & i48) | ((~i48) & i50);
        int i52 = i48 & i50;
        int i53 = (i52 & i51) | (i51 ^ i52);
        int i54 = (-2) | i15;
        int i55 = i54 ^ iIntValue;
        int i56 = i54 & iIntValue;
        int i57 = ~((i56 & i55) | (i55 ^ i56));
        int i58 = -(-(((i53 & i57) | (i53 ^ i57)) * 568));
        int i59 = i47 | i58;
        int i60 = i59 << 1;
        int i61 = -((~(i58 & i47)) & i59);
        int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
        setX(new Object[]{aebVar, Integer.valueOf(i62)}, 1357165778, -1357165764, i62);
        setX(new Object[]{aebVar, bArr, 0, Integer.valueOf(iIntValue)}, -464690180, 464690189, 0);
        setX(new Object[]{aebVar, Integer.valueOf(bByteValue)}, -478708408, 478708419, bByteValue);
        int i63 = f52525b;
        int i64 = i63 & 39;
        int i65 = (i63 | 39) & (~i64);
        int i66 = i64 << 1;
        int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
        f52526c = i67 % 128;
        if (i67 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void k(Object[] objArr) throws IOException {
        boolean z10 = false;
        aeb aebVar = (aeb) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f52526c;
        int i11 = (i10 ^ 57) + ((i10 & 57) << 1);
        f52525b = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        if (iIntValue < 128) {
            int i14 = i10 & 23;
            int i15 = -(-(i10 | 23));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f52525b = i16 % 128;
            int i17 = i16 % 2;
            setX(new Object[]{aebVar, Integer.valueOf(iIntValue)}, -478708408, 478708419, iIntValue);
            int i18 = f52526c + 87;
            f52525b = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            return;
        }
        byte[] bArr = new byte[5];
        int i19 = ((i10 | 17) << 1) - (i10 ^ 17);
        f52525b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = iIntValue;
        int i22 = 5;
        while (true) {
            int i23 = i22 & (-19);
            int i24 = -(-((i22 ^ (-19)) | i23));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            i22 = (-2) - (((i25 & 19) + (i25 | 19)) ^ (-1));
            bArr[i22] = (byte) i21;
            i21 >>>= 8;
            if (i21 == 0) {
                int i26 = f52526c;
                int i27 = i26 ^ 43;
                int i28 = ((((i26 & 43) | i27) << 1) - (~(-i27))) - 1;
                f52525b = i28 % 128;
                int i29 = i28 % i12;
                int i30 = -i22;
                int i31 = (i30 * (-574)) - 2870;
                int i32 = ~i30;
                int i33 = ~iIntValue;
                int i34 = (i33 | iIntValue) & i33;
                int i35 = ~((i32 ^ i34) | (i32 & i34));
                int i36 = ((-6) ^ iIntValue) | ((-6) & iIntValue);
                int i37 = ~i36;
                int i38 = i35 & i37;
                int i39 = (~i38) & (i35 | i37);
                int i40 = -(-(((i38 & i39) | (i39 ^ i38)) * 1150));
                int i41 = i31 & i40;
                int i42 = ((i31 ^ i40) | i41) << 1;
                int i43 = -((i40 | i31) & (~i41));
                int i44 = (i42 & i43) + (i43 | i42);
                int i45 = (i37 | i36) & i37;
                int i46 = ~((5 & i34) | (i34 & (-6)) | ((~i34) & 5));
                int i47 = i45 ^ i46;
                int i48 = i45 & i46;
                int i49 = ((i48 & i47) | (i47 ^ i48)) * (-575);
                int i50 = i44 & i49;
                int i51 = (i49 | i44) & (~i50);
                int i52 = i50 << 1;
                int i53 = (i51 & i52) + (i51 | i52);
                int i54 = (i32 | i30) & i32;
                int i55 = i54 & iIntValue;
                int i56 = (i54 | iIntValue) & (~i55);
                int i57 = ~((i56 & i55) | (i56 ^ i55));
                int i58 = (i33 & i32) | ((~i33) & i30);
                int i59 = i30 & i33;
                int i60 = (i58 & i59) | (i58 ^ i59);
                int i61 = ~i60;
                int i62 = (i60 | i61) & i61;
                int i63 = i57 & i62;
                int i64 = (((i57 | i62) & (~i63)) | i63) * 575;
                int i65 = i53 & i64;
                int i66 = -(-((i64 ^ i53) | i65));
                int i67 = (i65 & i66) + (i66 | i65);
                int i68 = (~i22) | i22;
                int i69 = (i22 & i68) + (i68 | i22);
                bArr[i69] = (byte) ((i67 ^ 128) | (i67 & 128));
                int i70 = -(-(i67 * (-500)));
                int i71 = (-500) & i70;
                int i72 = (((-500) ^ i70) | i71) << 1;
                int i73 = -((i70 | (-500)) & (~i71));
                int i74 = (i72 & i73) + (i73 | i72);
                int i75 = ~i67;
                int i76 = i75 & (-2);
                int i77 = ((~i75) & 1) | i76;
                int i78 = i75 & 1;
                int i79 = ~((i77 & i78) | (i77 ^ i78));
                int i80 = iIntValue | ((-2) ^ i67) | ((-2) & i67);
                int i81 = ~i80;
                int i82 = (i80 | i81) & i81;
                int i83 = ((~i82) & i79) | ((~i79) & i82);
                int i84 = i82 & i79;
                int i85 = ((i84 & i83) | (i83 ^ i84)) * 501;
                int i86 = (i74 ^ i85) + ((i85 & i74) << 1);
                int i87 = (i75 | (-2)) & (~i76);
                int i88 = -(-((~((i87 & i76) | (i87 ^ i76))) * 1002));
                int i89 = (i86 & i88) + (i88 | i86);
                int i90 = (-2) ^ i33;
                int i91 = (-2) & i33;
                int i92 = (i91 & i90) | (i90 ^ i91);
                int i93 = i92 & i67;
                int i94 = (i92 | i67) & (~i93);
                setX(new Object[]{aebVar, bArr, Integer.valueOf(i69), Integer.valueOf((i89 - (~((~((i94 & i93) | (i94 ^ i93))) * 501))) - 1)}, -464690180, 464690189, i69);
                int i95 = f52525b;
                int i96 = i95 & 29;
                int i97 = (i95 ^ 29) | i96;
                int i98 = (i96 & i97) + (i97 | i96);
                f52526c = i98 % 128;
                int i99 = i98 % 2;
                return;
            }
            i12 = i12;
            z10 = z10;
        }
    }

    public static /* synthetic */ void n(Object[] objArr) throws IOException {
        aeb aebVar = (aeb) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        byte bByteValue = ((Byte) objArr[2]).byteValue();
        int i10 = f52526c;
        int i11 = ((i10 & 112) + (i10 | 112)) - 1;
        f52525b = i11 % 128;
        int i12 = i11 % 2;
        setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 1}, 1303469841, -1303469839, 1);
        setX(new Object[]{aebVar, 1}, 1357165778, -1357165764, 1);
        setX(new Object[]{aebVar, Integer.valueOf(bByteValue)}, -478708408, 478708419, bByteValue);
        int i13 = f52526c;
        int i14 = ((i13 | 23) << 1) - (i13 ^ 23);
        f52525b = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 92 / 0;
        }
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object obj;
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        int iValueOf = 1;
        switch (((i10 | i15) * 948) + ((~((~i12) | i14 | i15)) * (-948)) + (((~(i15 | i12)) | i14) * (-948)) + (i11 * 949) + (i10 * (-947))) {
            case 1:
                obj = null;
                n(objArr);
                return obj;
            case 2:
                obj = null;
                e(objArr);
                return obj;
            case 3:
                return g(objArr);
            case 4:
                obj = null;
                aeb aebVar = (aeb) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int iIntValue = ((Number) objArr[2]).intValue();
                byte[] bArr = (byte[]) objArr[3];
                int i16 = f52525b;
                int i17 = ((i16 & 48) + (i16 | 48)) - 1;
                f52526c = i17 % 128;
                if (i17 % 2 != 0) {
                    setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue)}, 1303469841, -1303469839, iIntValue);
                    int length = bArr.length;
                    setX(new Object[]{aebVar, Integer.valueOf(length)}, 1357165778, -1357165764, length);
                    setX(new Object[]{aebVar, bArr, 0, Integer.valueOf(bArr.length)}, -464690180, 464690189, 0);
                    break;
                } else {
                    setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue)}, 1303469841, -1303469839, iIntValue);
                    int length2 = bArr.length;
                    setX(new Object[]{aebVar, Integer.valueOf(length2)}, 1357165778, -1357165764, length2);
                    setX(new Object[]{aebVar, bArr, 1, Integer.valueOf(bArr.length)}, -464690180, 464690189, 1);
                }
                return obj;
            case 5:
                obj = null;
                aeb aebVar2 = (aeb) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                byte[] bArr2 = (byte[]) objArr[3];
                int iIntValue3 = ((Number) objArr[4]).intValue();
                int iIntValue4 = ((Number) objArr[5]).intValue();
                int i18 = f52526c;
                int i19 = i18 & 15;
                int i20 = -(-((i18 ^ 15) | i19));
                int i21 = (i19 & i20) + (i20 | i19);
                f52525b = i21 % 128;
                int i22 = i21 % 2;
                setX(new Object[]{aebVar2, Boolean.valueOf(zBooleanValue2), Integer.valueOf(iIntValue2)}, 1303469841, -1303469839, iIntValue2);
                setX(new Object[]{aebVar2, Integer.valueOf(iIntValue4)}, 1357165778, -1357165764, iIntValue4);
                setX(new Object[]{aebVar2, bArr2, Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)}, -464690180, 464690189, iIntValue3);
                int i23 = f52525b;
                int i24 = (i23 | 99) << 1;
                int i25 = -(((~i23) & 99) | (i23 & (-100)));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                f52526c = i26 % 128;
                int i27 = i26 % 2;
                return obj;
            case 6:
                obj = null;
                b(objArr);
                return obj;
            case 7:
                return a(objArr);
            case 8:
                obj = null;
                j(objArr);
                return obj;
            case 9:
                aeb aebVar3 = (aeb) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int iIntValue5 = ((Number) objArr[2]).intValue();
                int iIntValue6 = ((Number) objArr[3]).intValue();
                int i28 = f52525b;
                int i29 = ((((i28 ^ 41) | (i28 & 41)) << 1) - (~(-(((~i28) & 41) | (i28 & (-42)))))) - 1;
                f52526c = i29 % 128;
                int i30 = i29 % 2;
                aebVar3.f52527a.write(bArr3, iIntValue5, iIntValue6);
                if (i30 == 0) {
                    throw null;
                }
                return null;
            case 10:
                aeb aebVar4 = (aeb) objArr[0];
                ((Boolean) objArr[1]).booleanValue();
                byte bByteValue = ((Byte) objArr[2]).byteValue();
                byte[] bArr4 = (byte[]) objArr[3];
                int iIntValue7 = ((Number) objArr[4]).intValue();
                int iIntValue8 = ((Number) objArr[5]).intValue();
                int i31 = f52525b;
                int i32 = (i31 & 61) + (i31 | 61);
                f52526c = i32 % 128;
                int i33 = i32 % 2;
                setX(new Object[]{aebVar4, Boolean.TRUE, 3}, 1303469841, -1303469839, 3);
                int i34 = (-2) - ((221 - (~(-(-(iIntValue8 * (-219)))))) ^ (-1));
                int i35 = ~iIntValue8;
                int i36 = (-2) ^ i35;
                int i37 = (-2) & i35;
                int i38 = (i36 ^ i37) | (i36 & i37);
                int i39 = ~i38;
                int i40 = i39 & (i38 | i39);
                int i41 = ~iIntValue7;
                int i42 = (i41 & (-2)) | ((~i41) & 1);
                int i43 = i41 & 1;
                int i44 = (i42 ^ i43) | (i42 & i43);
                int i45 = (i44 & iIntValue8) | ((~i44) & iIntValue8) | (i35 & i44);
                int i46 = ~i45;
                int i47 = (i45 | i46) & i46;
                int i48 = i40 ^ i47;
                int i49 = i47 & i40;
                int i50 = ((i49 & i48) | (i48 ^ i49)) * 220;
                int i51 = (((i34 ^ i50) | (i34 & i50)) << 1) - ((i50 & (~i34)) | ((~i50) & i34));
                int i52 = i41 & iIntValue8;
                int i53 = (~i52) & (i41 | iIntValue8);
                int i54 = ~((i52 & i53) | (i53 ^ i52));
                int i55 = i54 & 1;
                int i56 = (i54 | 1) & (~i55);
                int i57 = (-2) - ((i51 - (~(((i56 & i55) | (i56 ^ i55)) * (-440)))) ^ (-1));
                int i58 = iIntValue8 & 1;
                int i59 = (~i58) & (iIntValue8 | 1);
                int i60 = (i58 & i59) | (i59 ^ i58);
                int i61 = ((i60 & iIntValue7) | (i60 ^ iIntValue7)) * 220;
                int i62 = ((~i61) & i57) | ((~i57) & i61);
                int i63 = -(-((i61 & i57) << 1));
                int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                setX(new Object[]{aebVar4, Integer.valueOf(i64)}, 1357165778, -1357165764, i64);
                setX(new Object[]{aebVar4, Integer.valueOf(bByteValue)}, -478708408, 478708419, bByteValue);
                setX(new Object[]{aebVar4, bArr4, Integer.valueOf(iIntValue7), Integer.valueOf(iIntValue8)}, -464690180, 464690189, iIntValue7);
                int i65 = f52525b;
                int i66 = (i65 ^ 103) + ((i65 & 103) << 1);
                f52526c = i66 % 128;
                int i67 = i66 % 2;
                return null;
            case 11:
                aeb aebVar5 = (aeb) objArr[0];
                int iIntValue9 = ((Number) objArr[1]).intValue();
                int i68 = f52525b;
                int i69 = ((i68 & (-2)) | ((~i68) & 1)) + ((i68 & 1) << 1);
                f52526c = i69 % 128;
                if (i69 % 2 == 0) {
                    aebVar5.f52527a.write(iIntValue9);
                    throw null;
                }
                aebVar5.f52527a.write(iIntValue9);
                int i70 = f52526c;
                int i71 = i70 & 63;
                int i72 = -(-((i70 ^ 63) | i71));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                f52525b = i73 % 128;
                if (i73 % 2 != 0) {
                    throw null;
                }
                return null;
            case 12:
                boolean zBooleanValue3 = ((Boolean) objArr[0]).booleanValue();
                int iIntValue10 = ((Number) objArr[1]).intValue();
                int i74 = f52526c;
                int i75 = ((i74 | 63) << 1) - (i74 ^ 63);
                int i76 = i75 % 128;
                f52525b = i76;
                int i77 = i75 % 2;
                if (zBooleanValue3) {
                    int i78 = (i74 ^ 45) + ((i74 & 45) << 1);
                    f52525b = i78 % 128;
                    int i79 = i78 % 2;
                    i13 = 1;
                } else {
                    int i80 = i76 & 21;
                    int i81 = (~i80) & (i76 | 21);
                    int i82 = -(-(i80 << 1));
                    int i83 = (i81 & i82) + (i82 | i81);
                    f52526c = i83 % 128;
                    int i84 = i83 % 2;
                    i13 = 0;
                }
                int iIntValue11 = ((Integer) setX(new Object[]{Integer.valueOf(iIntValue10)}, 1896945642, -1896945627, iIntValue10)).intValue();
                int i85 = iIntValue11 * (-520);
                int i86 = i13 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY;
                int i87 = (i85 & i86) + (i85 | i86);
                int i88 = ~iIntValue11;
                int i89 = ~i13;
                int i90 = ~i88;
                int i91 = (i88 & i89) | (i13 & i90);
                int i92 = i88 & i13;
                int i93 = (i91 & i92) | (i91 ^ i92);
                int i94 = -(-((~((i93 & iIntValue10) | (i93 ^ iIntValue10))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i95 = (((i87 ^ i94) | (i87 & i94)) << 1) - (((~i87) & i94) | ((~i94) & i87));
                int i96 = -(-((~((i89 ^ iIntValue11) | (i89 & iIntValue11))) * (-1042)));
                int i97 = i95 ^ i96;
                int i98 = (((i96 & i95) | i97) << 1) - i97;
                int i99 = i89 & (i89 | i13);
                int i100 = i99 & iIntValue11;
                int i101 = (iIntValue11 | i99) & (~i100);
                int i102 = (i101 & i100) | (i101 ^ i100);
                int i103 = ~i102;
                int i104 = (i102 | i103) & i103;
                int i105 = ~iIntValue10;
                int i106 = ((~i105) & i88) | (i105 & i90);
                int i107 = i88 & i105;
                int i108 = (i107 & i106) | (i106 ^ i107);
                int i109 = i108 & i13;
                int i110 = (i13 | i108) & (~i109);
                int i111 = ~((i110 & i109) | (i110 ^ i109));
                int i112 = ((~i111) & i104) | ((~i104) & i111);
                int i113 = i111 & i104;
                int i114 = -(~(((i113 & i112) | (i112 ^ i113)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i115 = (((i98 ^ i114) + ((i114 & i98) << 1)) - 1) - i105;
                int i116 = (i115 ^ (-1)) + (i115 << 1);
                int i117 = f52526c + 67;
                f52525b = i117 % 128;
                int i118 = i117 % 2;
                return Integer.valueOf(i116);
            case 13:
                return f(objArr);
            case 14:
                k(objArr);
                return null;
            case 15:
                int iIntValue12 = ((Number) objArr[0]).intValue();
                int i119 = f52526c;
                int i120 = (i119 ^ 99) + ((i119 & 99) << 1);
                int i121 = i120 % 128;
                f52525b = i121;
                int i122 = i120 % 2;
                if (iIntValue12 < 128) {
                    int i123 = i121 & 61;
                    int i124 = (((i121 ^ 61) | i123) << 1) - ((~i123) & (i121 | 61));
                    int i125 = i124 % 128;
                    f52526c = i125;
                    int i126 = i124 % 2;
                    int i127 = i125 & 107;
                    int i128 = (i127 - (~((i125 ^ 107) | i127))) - 1;
                    f52525b = i128 % 128;
                    if (i128 % 2 != 0) {
                        throw null;
                    }
                } else {
                    int i129 = i119 & 109;
                    int i130 = (i119 | 109) & (~i129);
                    int i131 = -(-(i129 << 1));
                    int i132 = ((i130 | i131) << 1) - (i130 ^ i131);
                    f52525b = i132 % 128;
                    int i133 = i132 % 2;
                    int i134 = 2;
                    while (true) {
                        iIntValue12 >>>= 8;
                        if (iIntValue12 != 0) {
                            int i135 = f52525b;
                            int i136 = i135 & 89;
                            int i137 = ((i135 ^ 89) | i136) << 1;
                            int i138 = -((i135 | 89) & (~i136));
                            int i139 = (i137 & i138) + (i138 | i137);
                            int i140 = i139 % 128;
                            f52526c = i140;
                            if (i139 % 2 == 0) {
                                i134 += 34;
                            } else {
                                int i141 = ((i134 ^ 1) | (i134 & 1)) << 1;
                                int i142 = -(((~i134) & 1) | (i134 & (-2)));
                                i134 = ((i141 | i142) << 1) - (i142 ^ i141);
                            }
                            int i143 = (i140 ^ 15) + ((i140 & 15) << 1);
                            f52525b = i143 % 128;
                            int i144 = i143 % 2;
                        } else {
                            int i145 = f52525b;
                            int i146 = i145 & 55;
                            int i147 = -(-((i145 ^ 55) | i146));
                            int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                            f52526c = i148 % 128;
                            int i149 = i148 % 2;
                            iValueOf = Integer.valueOf(i134);
                        }
                    }
                }
                return iValueOf;
            default:
                aeb aebVar6 = (aeb) objArr[0];
                boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                int iIntValue13 = ((Number) objArr[2]).intValue();
                add[] addVarArr = (add[]) objArr[3];
                int i150 = f52525b + 107;
                f52526c = i150 % 128;
                int i151 = i150 % 2;
                setX(new Object[]{aebVar6, Boolean.valueOf(zBooleanValue4), Integer.valueOf(iIntValue13)}, 1303469841, -1303469839, iIntValue13);
                setX(new Object[]{aebVar6, 128}, -478708408, 478708419, 128);
                aebVar6.i(addVarArr);
                setX(new Object[]{aebVar6, 0}, -478708408, 478708419, 0);
                setX(new Object[]{aebVar6, 0}, -478708408, 478708419, 0);
                int i152 = f52526c;
                int i153 = i152 ^ 77;
                int i154 = ((i152 & 77) | i153) << 1;
                int i155 = -i153;
                int i156 = (i154 ^ i155) + ((i154 & i155) << 1);
                f52525b = i156 % 128;
                if (i156 % 2 != 0) {
                    int i157 = 4 / 0;
                }
                return null;
        }
    }

    public void d(ady[] adyVarArr) throws IOException {
        int i10 = f52526c;
        int i11 = ((i10 ^ 37) | (i10 & 37)) << 1;
        int i12 = -(((~i10) & 37) | (i10 & (-38)));
        int i13 = (i11 & i12) + (i12 | i11);
        f52525b = i13 % 128;
        int i14 = i13 % 2;
        int length = adyVarArr.length;
        int i15 = 0;
        while (i15 < length) {
            int i16 = f52525b;
            int i17 = i16 & 27;
            int i18 = i17 + ((i16 ^ 27) | i17);
            f52526c = i18 % 128;
            if (i18 % 2 == 0) {
                adyVarArr[i15].c(this, true);
                int i19 = i15 & (-21);
                int i20 = (i15 ^ (-21)) | i19;
                int i21 = (i19 & i20) + (i20 | i19);
                i15 = ((i21 & 120) + (i21 | 120)) - 1;
            } else {
                adyVarArr[i15].c(this, true);
                int i22 = (i15 & (-2)) | ((~i15) & 1);
                int i23 = (i15 & 1) << 1;
                i15 = (i22 & i23) + (i23 | i22);
            }
            int i24 = f52526c + 121;
            f52525b = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f52525b;
        int i27 = ((i26 & (-64)) | ((~i26) & 63)) + ((i26 & 63) << 1);
        f52526c = i27 % 128;
        int i28 = i27 % 2;
    }

    public q0 h() {
        q0 q0Var = new q0(this.f52527a);
        int i10 = f52525b;
        int i11 = ((i10 ^ 55) | (i10 & 55)) << 1;
        int i12 = -(((~i10) & 55) | (i10 & (-56)));
        int i13 = (i11 & i12) + (i12 | i11);
        f52526c = i13 % 128;
        int i14 = i13 % 2;
        return q0Var;
    }

    public void i(add[] addVarArr) throws IOException {
        int i10;
        int i11 = f52525b;
        int i12 = (((i11 ^ 51) | (i11 & 51)) << 1) - (((~i11) & 51) | (i11 & (-52)));
        f52526c = i12 % 128;
        int i13 = i12 % 2;
        int length = addVarArr.length;
        int i14 = i13 == 0 ? 1 : 0;
        while (i14 < length) {
            int i15 = f52525b;
            int i16 = ((i15 ^ 15) | (i15 & 15)) << 1;
            int i17 = -(((~i15) & 15) | (i15 & (-16)));
            int i18 = (i16 & i17) + (i17 | i16);
            f52526c = i18 % 128;
            if (i18 % 2 == 0) {
                addVarArr[i14].UiMessageCallbackKtWhenMappings().c(this, true);
                i10 = (i14 & 27) + (i14 | 27) + 26;
            } else {
                addVarArr[i14].UiMessageCallbackKtWhenMappings().c(this, true);
                i10 = ((i14 & (-2)) | ((~i14) & 1)) + ((i14 & 1) << 1);
            }
            i14 = i10;
        }
        int i19 = f52525b;
        int i20 = i19 & 85;
        int i21 = ((i19 | 85) & (~i20)) + (i20 << 1);
        f52526c = i21 % 128;
        int i22 = i21 % 2;
    }

    public o0 l() {
        o0 o0Var = new o0(this.f52527a);
        int i10 = ((-1) << 1) - ((f52525b + 78) ^ (-1));
        f52526c = i10 % 128;
        int i11 = i10 % 2;
        return o0Var;
    }

    public void m(ady adyVar) throws IOException {
        int i10 = f52525b;
        int i11 = ((i10 ^ 32) + ((i10 & 32) << 1)) - 1;
        f52526c = i11 % 128;
        int i12 = i11 % 2;
        adyVar.c(this, true);
        int i13 = f52526c + 123;
        f52525b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 63 / 0;
        }
    }

    public static aeb setX(OutputStream outputStream, String str) {
        return (aeb) setX(new Object[]{outputStream, str}, 20425772, -20425765, (int) System.currentTimeMillis());
    }

    public static aeb setX(OutputStream outputStream) {
        return (aeb) setX(new Object[]{outputStream}, -2145123870, 2145123873, (int) System.currentTimeMillis());
    }
}
