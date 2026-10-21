package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aep extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final char[] f52555u0;
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52556w0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52557t0;

    static {
        Integer num = 28;
        num.intValue();
        f52555u0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i10 = v0;
        int i11 = i10 & 67;
        int i12 = -(-((i10 ^ 67) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52556w0 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = v0;
        int i11 = i10 & 21;
        int i12 = (i10 | 21) & (~i11);
        int i13 = i11 << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        int i15 = i14 % 128;
        f52556w0 = i15;
        int i16 = i14 % 2;
        if (iIntValue < 128) {
            int i17 = (((i15 | 76) << 1) - (i15 ^ 76)) - 1;
            v0 = i17 % 128;
            int i18 = i17 % 2;
            setX(new Object[]{stringBuffer, Integer.valueOf(iIntValue)}, -919571808, 919571808, iIntValue);
            int i19 = f52556w0;
            int i20 = (i19 & 53) + (i19 | 53);
            v0 = i20 % 128;
            if (i20 % 2 != 0) {
                throw null;
            }
            return;
        }
        byte[] bArr = new byte[5];
        int i21 = ((i15 & 42) + (i15 | 42)) - 1;
        v0 = i21 % 128;
        int i22 = i21 % 2;
        int i23 = 5;
        do {
            int i24 = (i23 ^ 34) + ((i23 & 34) << 1);
            int i25 = i24 & (-35);
            int i26 = (i24 ^ (-35)) | i25;
            i23 = (i25 | i26) + (i25 & i26);
            bArr[i23] = (byte) iIntValue;
            iIntValue >>>= 8;
        } while (iIntValue != 0);
        int i27 = v0;
        int i28 = ((i27 | 99) << 1) - (i27 ^ 99);
        int i29 = i28 % 128;
        f52556w0 = i29;
        int i30 = i28 % 2;
        int i31 = 5 - i23;
        int i32 = -(-((~i23) | i23));
        int i33 = (i23 ^ i32) + ((i23 & i32) << 1);
        bArr[i33] = (byte) (((~i31) & 128) | (i31 & (-129)) | (128 & i31));
        int i34 = i29 + 80;
        int i35 = (i34 ^ (-1)) + (i34 << 1);
        v0 = i35 % 128;
        int i36 = i35 % 2;
        while (true) {
            int i37 = i33 + 1;
            byte b10 = bArr[i33];
            setX(new Object[]{stringBuffer, Integer.valueOf(b10)}, -919571808, 919571808, b10);
            if (i37 >= 5) {
                int i38 = v0;
                int i39 = i38 & 111;
                int i40 = (((i38 ^ 111) | i39) << 1) - ((i38 | 111) & (~i39));
                f52556w0 = i40 % 128;
                int i41 = i40 % 2;
                return;
            }
            i33 = i37;
        }
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        aep aepVar = (aep) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = v0 + 103;
        f52556w0 = i10 % 128;
        int i11 = i10 % 2;
        int length = aepVar.f52557t0.length;
        int iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
        int i12 = v0;
        int i13 = ((i12 | 91) << 1) - (i12 ^ 91);
        f52556w0 = i13 % 128;
        if (i13 % 2 != 0) {
            return Integer.valueOf(iIntValue);
        }
        throw null;
    }

    public static /* synthetic */ Boolean h(Object[] objArr) {
        int i10 = v0;
        int i11 = (i10 & 23) + (i10 | 23);
        f52556w0 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        int i12 = i10 & 15;
        int i13 = (i10 | 15) & (~i12);
        int i14 = i12 << 1;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        f52556w0 = i15 % 128;
        if (i15 % 2 != 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public static /* synthetic */ Integer i(Object[] objArr) {
        int iIntValue;
        aep aepVar = (aep) objArr[0];
        int i10 = v0;
        int i11 = i10 & 67;
        int i12 = ((i10 ^ 67) | i11) << 1;
        int i13 = -((i10 | 67) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f52556w0 = i14 % 128;
        int i15 = i14 % 2;
        byte[] bArr = aepVar.f52557t0;
        if (i15 == 0) {
            iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            int i16 = 68 / 0;
        } else {
            iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
        }
        int i17 = f52556w0;
        int i18 = i17 & 63;
        int i19 = (i17 ^ 63) | i18;
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        v0 = i20 % 128;
        if (i20 % 2 == 0) {
            return Integer.valueOf(iIntValue);
        }
        int i21 = 96 / 0;
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Boolean boolValueOf;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        switch ((((~(i10 | i11)) | (~(i15 | i10)) | (~(i13 | i14))) * 184) + ((i10 | i14 | i15) * 184) + ((i11 | i13) * (-368)) + (i11 * 185) + (i10 * (-183))) {
            case 1:
                aep aepVar = (aep) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i16 = f52556w0 + 53;
                v0 = i16 % 128;
                int i17 = i16 % 2;
                byte[] bArr = aepVar.f52557t0;
                if (i17 != 0) {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 59, bArr}, 478760665, -478760661, 59);
                    return null;
                }
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 28, bArr}, 478760665, -478760661, 28);
                return null;
            case 2:
                aep aepVar2 = (aep) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i18 = v0;
                int i19 = ((((i18 ^ 111) | (i18 & 111)) << 1) - (~(-((i18 & (-112)) | ((~i18) & 111))))) - 1;
                f52556w0 = i19 % 128;
                int i20 = i19 % 2;
                if (!(adyVar instanceof aep)) {
                    int i21 = i18 & 27;
                    int i22 = (~i21) & (i18 | 27);
                    int i23 = i21 << 1;
                    int i24 = (i22 & i23) + (i23 | i22);
                    int i25 = i24 % 128;
                    f52556w0 = i25;
                    boolean z10 = i24 % 2 == 0;
                    int i26 = i25 & 109;
                    int i27 = ((i25 ^ 109) | i26) << 1;
                    int i28 = -((i25 | 109) & (~i26));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    v0 = i29 % 128;
                    int i30 = i29 % 2;
                    boolValueOf = Boolean.valueOf(z10);
                } else {
                    boolean zBooleanValue2 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{aepVar2.f52557t0, ((aep) adyVar).f52557t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i31 = v0;
                    int i32 = ((i31 ^ 24) + ((i31 & 24) << 1)) - 1;
                    f52556w0 = i32 % 128;
                    int i33 = i32 % 2;
                    boolValueOf = Boolean.valueOf(zBooleanValue2);
                }
                return boolValueOf;
            case 3:
                f(objArr);
                return null;
            case 4:
                return i(objArr);
            case 5:
                aep aepVar3 = (aep) objArr[0];
                int length = aepVar3.f52557t0.length;
                int iC = aeb.c(length);
                System.identityHashCode(aepVar3);
                int i34 = length * 630;
                int i35 = -(~(-(-(iC * (-628)))));
                int i36 = ((i34 ^ i35) + ((i34 & i35) << 1)) - 1;
                int i37 = ~iC;
                int i38 = -(-(i37 * (-629)));
                int i39 = i36 & i38;
                int i40 = (i38 ^ i36) | i39;
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                int i42 = ~length;
                int i43 = i37 & (i37 | iC);
                int i44 = ((~i43) & i42) | ((~i42) & i43);
                int i45 = i43 & i42;
                int i46 = -(-((~((i45 & i44) | (i44 ^ i45))) * (-629)));
                int i47 = i41 ^ i46;
                int i48 = (i46 & i41) << 1;
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                int i50 = (i42 | length) & i42;
                int i51 = iC & i50;
                int i52 = -(~(-(-((((iC | i50) & (~i51)) | i51) * 629))));
                int i53 = ((i49 ^ i52) + ((i52 & i49) << 1)) - 1;
                int i54 = i53 * 2;
                int iIdentityHashCode = System.identityHashCode(aepVar3);
                int i55 = i53 * 434;
                int i56 = ((i55 | (-645)) << 1) - (i55 ^ (-645));
                int i57 = i54 ^ iIdentityHashCode;
                int i58 = ~iIdentityHashCode;
                int i59 = iIdentityHashCode & i54;
                int i60 = -(-((~((i57 & i59) | (i57 ^ i59))) * 216));
                int i61 = ((~i60) & i56) | ((~i56) & i60);
                int i62 = (i60 & i56) << 1;
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                int i64 = i54 & (-4);
                int i65 = (~i64) & (i54 | (-4));
                int i66 = (i64 & i65) | (i65 ^ i64);
                int i67 = i66 ^ i58;
                int i68 = i66 & i58;
                int i69 = -(-(((i68 & i67) | (i67 ^ i68)) * (-216)));
                int i70 = (i63 | i69) << 1;
                int i71 = -((i69 & (~i63)) | ((~i69) & i63));
                int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                int i73 = i58 ^ i54;
                int i74 = i54 & i58;
                int i75 = (i74 & i73) | (i73 ^ i74);
                int i76 = ~i75;
                int i77 = -(-((3 | ((i75 | i76) & i76)) * 216));
                int i78 = i72 & i77;
                int i79 = -(-(i77 | i72));
                StringBuffer stringBuffer = new StringBuffer((i78 & i79) + (i79 | i78));
                stringBuffer.append("#1C");
                setX(new Object[]{stringBuffer, Integer.valueOf(length)}, -1392273414, 1392273417, length);
                int i80 = v0;
                int i81 = i80 & 55;
                int i82 = i80 | 55;
                int i83 = (i81 & i82) + (i82 | i81);
                f52556w0 = i83 % 128;
                int i84 = i83 % 2;
                int i85 = 0;
                while (i85 < length) {
                    int i86 = v0;
                    int i87 = (i86 & 44) + (i86 | 44);
                    int i88 = (i87 ^ (-1)) + (i87 << 1);
                    f52556w0 = i88 % 128;
                    int i89 = i88 % 2;
                    byte[] bArr2 = aepVar3.f52557t0;
                    if (i89 == 0) {
                        byte b10 = bArr2[i85];
                        setX(new Object[]{stringBuffer, Integer.valueOf(b10)}, -919571808, 919571808, b10);
                        i85 = ((i85 << 1) - (~(-i85))) - 1;
                    } else {
                        byte b11 = bArr2[i85];
                        setX(new Object[]{stringBuffer, Integer.valueOf(b11)}, -919571808, 919571808, b11);
                        int i90 = (i85 & (-2)) | ((~i85) & 1);
                        int i91 = (i85 & 1) << 1;
                        i85 = ((i90 | i91) << 1) - (i91 ^ i90);
                    }
                }
                String string = stringBuffer.toString();
                int i92 = v0;
                int i93 = ((i92 ^ 101) | (i92 & 101)) << 1;
                int i94 = -(((~i92) & 101) | (i92 & (-102)));
                int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                f52556w0 = i95 % 128;
                int i96 = i95 % 2;
                return string;
            case 6:
                return g(objArr);
            case 7:
                agb agbVar = new agb((byte[]) objArr[0]);
                int i97 = f52556w0;
                int i98 = (((i97 & (-78)) | ((~i97) & 77)) - (~((i97 & 77) << 1))) - 1;
                v0 = i98 % 128;
                int i99 = i98 % 2;
                return agbVar;
            case 8:
                return h(objArr);
            default:
                StringBuffer stringBuffer2 = (StringBuffer) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i100 = f52556w0;
                int i101 = (((i100 & (-76)) | ((~i100) & 75)) - (~((i100 & 75) << 1))) - 1;
                v0 = i101 % 128;
                int i102 = i101 % 2;
                char[] cArr = f52555u0;
                stringBuffer2.append(cArr[(iIntValue >>> 4) & 15]);
                stringBuffer2.append(cArr[iIntValue & 15]);
                return null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setX(new Object[]{this, Boolean.valueOf(z10)}, -1852032090, 1852032096, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setX(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -389276132, 389276133, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setX(new Object[]{this, adyVar}, 1834211779, -1834211777, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -600278090, 600278094, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, 792134268, -792134263, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, 1862481847, -1862481839, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = v0;
        int i11 = ((i10 | 81) << 1) - (i10 ^ 81);
        f52556w0 = i11 % 128;
        if (i11 % 2 != 0) {
            return (String) setX(new Object[]{this}, 792134268, -792134263, System.identityHashCode(this));
        }
        throw null;
    }
}
