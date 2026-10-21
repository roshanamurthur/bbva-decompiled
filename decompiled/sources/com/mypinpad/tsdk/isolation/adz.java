package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class adz extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52523u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52524t0;

    static {
        Integer num = 19;
        num.intValue();
        int i10 = f52523u0 + 113;
        v0 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:18:0x011f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0128  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13;
        int i14 = ~i10;
        int i15 = ~(i12 | i11);
        switch ((((~(i10 | (~i11))) | (~(i14 | i11))) * 110) + ((i15 | (~(i10 | i11))) * 220) + ((i14 | i15) * (-220)) + (i11 * 111) + (i10 * (-109))) {
            case 1:
                int i16 = f52523u0;
                int i17 = i16 & 5;
                int i18 = ((i16 ^ 5) | i17) << 1;
                int i19 = -((i16 | 5) & (~i17));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                int i21 = i20 % 128;
                v0 = i21;
                int i22 = i20 % 2;
                int i23 = i21 + 97;
                f52523u0 = i23 % 128;
                int i24 = i23 % 2;
                return Boolean.FALSE;
            case 2:
                adz adzVar = (adz) objArr[0];
                int i25 = f52523u0 + 117;
                v0 = i25 % 128;
                int i26 = i25 % 2;
                objValueOf = (String) bez.setX(new Object[]{adzVar.f52524t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                int i27 = v0;
                int i28 = (i27 & (-40)) | ((~i27) & 39);
                int i29 = -(-((i27 & 39) << 1));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                f52523u0 = i30 % 128;
                if (i30 % 2 != 0) {
                    throw null;
                }
                break;
            case 3:
                byte[] bArr = (byte[]) objArr[0];
                afw afwVar = new afw();
                afwVar.f52524t0 = bArr;
                int i31 = f52523u0 + 3;
                v0 = i31 % 128;
                int i32 = i31 % 2;
                return afwVar;
            case 4:
                adz adzVar2 = (adz) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i33 = f52523u0;
                int i34 = i33 & 119;
                int i35 = (i33 | 119) & (~i34);
                int i36 = -(-(i34 << 1));
                int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
                v0 = i37 % 128;
                int i38 = i37 % 2;
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 19, adzVar2.f52524t0}, 478760665, -478760661, 19);
                int i39 = v0;
                int i40 = ((-1) << 1) - ((-1) ^ ((i39 ^ 26) + ((i39 & 26) << 1)));
                f52523u0 = i40 % 128;
                int i41 = i40 % 2;
                return null;
            case 5:
                adz adzVar3 = (adz) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i42 = f52523u0;
                int i43 = i42 & 123;
                int i44 = -(-((i42 ^ 123) | i43));
                int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
                v0 = i45 % 128;
                boolean z10 = adyVar instanceof adz;
                if (i45 % 2 == 0) {
                    int i46 = 6 / 0;
                    if (!z10) {
                        int i47 = i42 & 35;
                        int i48 = -(-((i42 ^ 35) | i47));
                        int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                        v0 = i49 % 128;
                        int i50 = i49 % 2;
                        objValueOf = Boolean.FALSE;
                    } else {
                        boolean zBooleanValue2 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{adzVar3.f52524t0, ((adz) adyVar).f52524t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                        int i51 = f52523u0;
                        int i52 = (i51 | 109) << 1;
                        int i53 = -(((~i51) & 109) | (i51 & (-110)));
                        i13 = ((i52 | i53) << 1) - (i53 ^ i52);
                        v0 = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i54 = 25 / 0;
                        }
                        objValueOf = Boolean.valueOf(zBooleanValue2);
                    }
                } else if (!z10) {
                    int i410 = i42 & 35;
                    int i411 = -(-((i42 ^ 35) | i410));
                    int i412 = ((i410 | i411) << 1) - (i410 ^ i411);
                    v0 = i412 % 128;
                    int i55 = i412 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    boolean zBooleanValue3 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{adzVar3.f52524t0, ((adz) adyVar).f52524t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i56 = f52523u0;
                    int i57 = (i56 | 109) << 1;
                    int i58 = -(((~i56) & 109) | (i56 & (-110)));
                    i13 = ((i57 | i58) << 1) - (i58 ^ i57);
                    v0 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i59 = 25 / 0;
                    }
                    objValueOf = Boolean.valueOf(zBooleanValue3);
                }
                break;
            case 6:
                adz adzVar4 = (adz) objArr[0];
                int i60 = f52523u0;
                int i61 = i60 & 77;
                int i62 = i60 | 77;
                int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                v0 = i63 % 128;
                int i64 = i63 % 2;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{adzVar4.f52524t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i65 = f52523u0;
                int i66 = (i65 ^ 99) + ((i65 & 99) << 1);
                v0 = i66 % 128;
                if (i66 % 2 != 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            default:
                adz adzVar5 = (adz) objArr[0];
                boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                int i67 = v0;
                int i68 = ((i67 | 76) << 1) - (i67 ^ 76);
                int i69 = (i68 ^ (-1)) + (i68 << 1);
                f52523u0 = i69 % 128;
                int i70 = i69 % 2;
                int length = adzVar5.f52524t0.length;
                int iIntValue2 = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue4), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                int i71 = f52523u0;
                int i72 = i71 & 23;
                int i73 = (i71 ^ 23) | i72;
                int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                v0 = i74 % 128;
                int i75 = i74 % 2;
                return Integer.valueOf(iIntValue2);
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -86445435, 86445435, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -704586747, 704586751, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setDividerPadding(new Object[]{this, adyVar}, 1559822886, -1559822881, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 776452480, -776452474, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setDividerPadding(new Object[]{this}, -1403301856, 1403301858, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1946896572, 1946896573, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = v0;
        int i11 = ((((i10 ^ 1) | (i10 & 1)) << 1) - (~(-(((~i10) & 1) | (i10 & (-2)))))) - 1;
        f52523u0 = i11 % 128;
        int i12 = i11 % 2;
        String str = (String) setDividerPadding(new Object[]{this}, -1403301856, 1403301858, System.identityHashCode(this));
        int i13 = v0;
        int i14 = i13 & 43;
        int i15 = i14 + ((i13 ^ 43) | i14);
        f52523u0 = i15 % 128;
        int i16 = i15 % 2;
        return str;
    }
}
