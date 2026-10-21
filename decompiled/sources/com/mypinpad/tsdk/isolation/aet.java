package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aet extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52562u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52563t0;

    static {
        Integer num = 21;
        num.intValue();
        int i10 = v0;
        int i11 = (((i10 | 79) << 1) - (~(-(i10 ^ 79)))) - 1;
        f52562u0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = ~i11;
        switch (((~(i10 | i14)) * 69) + (((~(i11 | i12)) | (~(i13 | i12)) | (~(i13 | i11))) * (-69)) + (((~(i13 | i14 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70)) {
            case 1:
                aet aetVar = (aet) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i15 = f52562u0;
                int i16 = i15 & 45;
                int i17 = i15 | 45;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                v0 = i18 % 128;
                int i19 = i18 % 2;
                byte[] bArr = aetVar.f52563t0;
                if (i19 == 0) {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 114, bArr}, 478760665, -478760661, 114);
                    return null;
                }
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 21, bArr}, 478760665, -478760661, 21);
                return null;
            case 2:
                aet aetVar2 = (aet) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i20 = v0;
                int i21 = i20 & 89;
                int i22 = ((i20 ^ 89) | i21) << 1;
                int i23 = -((i20 | 89) & (~i21));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                int i25 = i24 % 128;
                f52562u0 = i25;
                int i26 = i24 % 2;
                if (!(adyVar instanceof aet)) {
                    int i27 = i25 & 67;
                    int i28 = -(-(i25 | 67));
                    int i29 = (i27 & i28) + (i27 | i28);
                    int i30 = i29 % 128;
                    v0 = i30;
                    int i31 = i29 % 2;
                    int i32 = (i30 & 75) + (i30 | 75);
                    f52562u0 = i32 % 128;
                    if (i32 % 2 != 0) {
                        int i33 = 41 / 0;
                    }
                    objValueOf = Boolean.FALSE;
                } else {
                    boolean zBooleanValue2 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{aetVar2.f52563t0, ((aet) adyVar).f52563t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i34 = v0;
                    int i35 = i34 ^ 7;
                    int i36 = ((((i34 & 7) | i35) << 1) - (~(-i35))) - 1;
                    f52562u0 = i36 % 128;
                    if (i36 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.valueOf(zBooleanValue2);
                }
                break;
            case 3:
                aet aetVar3 = (aet) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int i37 = v0;
                int i38 = (i37 & (-48)) | ((~i37) & 47);
                int i39 = (i37 & 47) << 1;
                int i40 = (i38 & i39) + (i39 | i38);
                f52562u0 = i40 % 128;
                int i41 = i40 % 2;
                byte[] bArr2 = aetVar3.f52563t0;
                if (i41 == 0) {
                    int length = bArr2.length;
                    return Integer.valueOf(((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue3), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue());
                }
                int length2 = bArr2.length;
                ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue3), Integer.valueOf(length2)}, 1150803379, -1150803367, length2)).intValue();
                throw null;
            case 4:
                byte[] bArr3 = (byte[]) objArr[0];
                agc agcVar = new agc();
                agcVar.f52563t0 = bArr3;
                int i42 = f52562u0 + 111;
                v0 = i42 % 128;
                if (i42 % 2 != 0) {
                    return agcVar;
                }
                throw null;
            case 5:
                aet aetVar4 = (aet) objArr[0];
                int i43 = v0;
                int i44 = i43 & 19;
                int i45 = (i43 | 19) & (~i44);
                int i46 = -(-(i44 << 1));
                int i47 = (i45 & i46) + (i45 | i46);
                f52562u0 = i47 % 128;
                int i48 = i47 % 2;
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{aetVar4.f52563t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i49 = f52562u0 + 33;
                v0 = i49 % 128;
                if (i49 % 2 == 0) {
                    int i50 = 74 / 0;
                }
                objValueOf = Integer.valueOf(iIntValue);
                break;
            case 6:
                aet aetVar5 = (aet) objArr[0];
                int i51 = f52562u0;
                int i52 = (i51 & (-6)) | ((~i51) & 5);
                int i53 = (i51 & 5) << 1;
                int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                v0 = i54 % 128;
                int i55 = i54 % 2;
                objValueOf = (String) bez.setX(new Object[]{aetVar5.f52563t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                int i56 = f52562u0;
                int i57 = i56 & 43;
                int i58 = (i56 | 43) & (~i57);
                int i59 = i57 << 1;
                int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                v0 = i60 % 128;
                if (i60 % 2 == 0) {
                    throw null;
                }
                break;
            default:
                int i61 = f52562u0 + 17;
                int i62 = i61 % 128;
                v0 = i62;
                boolean z10 = i61 % 2 == 0;
                int i63 = ((i62 ^ 71) | (i62 & 71)) << 1;
                int i64 = -(((~i62) & 71) | (i62 & (-72)));
                int i65 = (i63 ^ i64) + ((i63 & i64) << 1);
                f52562u0 = i65 % 128;
                int i66 = i65 % 2;
                return Boolean.valueOf(z10);
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, Boolean.valueOf(z10)}, 1758471866, -1758471863, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setOnFocusChangeListener(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1618065519, -1618065518, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, adyVar}, 1816296396, -1816296394, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1550186184, 1550186189, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -490708391, 490708391, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1720775694, 1720775700, System.identityHashCode(this));
    }
}
