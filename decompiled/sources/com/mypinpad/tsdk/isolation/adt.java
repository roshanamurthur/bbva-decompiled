package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class adt extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52505u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52506t0;

    static {
        Integer num = 18;
        num.intValue();
        int i10 = f52505u0 + 27;
        v0 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:20:0x0107  */
    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        switch ((((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i13 | i11 | i12)) * (-604)) + (((~((~i12) | i13 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303)) {
            case 1:
                byte[] bArr = (byte[]) objArr[0];
                afr afrVar = new afr();
                afrVar.f52506t0 = bArr;
                int i14 = v0 + 115;
                f52505u0 = i14 % 128;
                if (i14 % 2 == 0) {
                    return afrVar;
                }
                throw null;
            case 2:
                adt adtVar = (adt) objArr[0];
                int i15 = v0;
                int i16 = ((i15 & (-8)) | ((~i15) & 7)) + ((i15 & 7) << 1);
                f52505u0 = i16 % 128;
                int i17 = i16 % 2;
                byte[] bArr2 = adtVar.f52506t0;
                Object[] objArr2 = new Object[1];
                if (i17 != 0) {
                    objArr2[0] = bArr2;
                    objValueOf = (String) bez.setX(objArr2, -1321203111, 1321203112, (int) System.currentTimeMillis());
                    int i18 = 61 / 0;
                } else {
                    objArr2[0] = bArr2;
                    objValueOf = (String) bez.setX(objArr2, -1321203111, 1321203112, (int) System.currentTimeMillis());
                }
                int i19 = f52505u0 + 19;
                v0 = i19 % 128;
                if (i19 % 2 == 0) {
                    throw null;
                }
                break;
            case 3:
                adt adtVar2 = (adt) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i20 = f52505u0;
                int i21 = i20 & 45;
                int i22 = -(-((i20 ^ 45) | i21));
                int i23 = (i21 & i22) + (i22 | i21);
                v0 = i23 % 128;
                int i24 = i23 % 2;
                byte[] bArr3 = adtVar2.f52506t0;
                if (i24 == 0) {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 65, bArr3}, 478760665, -478760661, 65);
                    return null;
                }
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 18, bArr3}, 478760665, -478760661, 18);
                return null;
            case 4:
                int i25 = f52505u0 + 37;
                int i26 = i25 % 128;
                v0 = i26;
                int i27 = i25 % 2;
                int i28 = (((i26 & (-74)) | ((~i26) & 73)) - (~(-(-((i26 & 73) << 1))))) - 1;
                f52505u0 = i28 % 128;
                int i29 = i28 % 2;
                return false;
            case 5:
                adt adtVar3 = (adt) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i30 = f52505u0;
                int i31 = (-2) - ((((i30 | 10) << 1) - (i30 ^ 10)) ^ (-1));
                v0 = i31 % 128;
                if (i31 % 2 == 0) {
                    int i32 = 7 / 0;
                    if (!(adyVar instanceof adt)) {
                        int i33 = (i30 & (-50)) | ((~i30) & 49);
                        int i34 = -(-((i30 & 49) << 1));
                        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                        v0 = i35 % 128;
                        int i36 = i35 % 2;
                        objValueOf = Boolean.FALSE;
                    } else {
                        boolean zBooleanValue2 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{adtVar3.f52506t0, ((adt) adyVar).f52506t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                        int i37 = f52505u0;
                        int i38 = i37 ^ 67;
                        int i39 = (((i37 & 67) | i38) << 1) - i38;
                        v0 = i39 % 128;
                        int i40 = i39 % 2;
                        objValueOf = Boolean.valueOf(zBooleanValue2);
                    }
                } else if (!(!(adyVar instanceof adt))) {
                    boolean zBooleanValue3 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{adtVar3.f52506t0, ((adt) adyVar).f52506t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i310 = f52505u0;
                    int i311 = i310 ^ 67;
                    int i312 = (((i310 & 67) | i311) << 1) - i311;
                    v0 = i312 % 128;
                    int i41 = i312 % 2;
                    objValueOf = Boolean.valueOf(zBooleanValue3);
                } else {
                    int i313 = (i30 & (-50)) | ((~i30) & 49);
                    int i314 = -(-((i30 & 49) << 1));
                    int i315 = (i313 ^ i314) + ((i313 & i314) << 1);
                    v0 = i315 % 128;
                    int i316 = i315 % 2;
                    objValueOf = Boolean.FALSE;
                }
                break;
            case 6:
                adt adtVar4 = (adt) objArr[0];
                boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                int i42 = f52505u0;
                int i43 = i42 & 89;
                int i44 = (i43 - (~((i42 ^ 89) | i43))) - 1;
                v0 = i44 % 128;
                int i45 = i44 % 2;
                int length = adtVar4.f52506t0.length;
                int iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue4), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                int i46 = v0;
                int i47 = i46 & 51;
                int i48 = (i46 ^ 51) | i47;
                int i49 = (i47 & i48) + (i48 | i47);
                f52505u0 = i49 % 128;
                if (i49 % 2 == 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            default:
                adt adtVar5 = (adt) objArr[0];
                int i50 = f52505u0;
                int i51 = i50 ^ 111;
                int i52 = (((i50 & 111) | i51) << 1) - i51;
                v0 = i52 % 128;
                int i53 = i52 % 2;
                int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{adtVar5.f52506t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i54 = f52505u0;
                int i55 = i54 & 53;
                int i56 = (i55 - (~(-(-((i54 ^ 53) | i55))))) - 1;
                v0 = i56 % 128;
                if (i56 % 2 == 0) {
                    int i57 = 54 / 0;
                }
                objValueOf = Integer.valueOf(iIntValue2);
                break;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setX(new Object[]{this, Boolean.valueOf(z10)}, -2051338094, 2051338100, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setX(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -1660192908, 1660192911, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setX(new Object[]{this, adyVar}, -1765980958, 1765980963, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 1351239732, -1351239732, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, 412617720, -412617718, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, -1137118019, 1137118023, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        System.identityHashCode(this);
        System.identityHashCode(this);
        String str = (String) setX(new Object[]{this}, 412617720, -412617718, System.identityHashCode(this));
        int i10 = v0;
        int i11 = i10 & 49;
        int i12 = i11 + ((i10 ^ 49) | i11);
        f52505u0 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
