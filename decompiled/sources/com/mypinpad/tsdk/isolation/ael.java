package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ael extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52551u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52552t0;

    static {
        Integer num = 20;
        num.intValue();
        int i10 = f52551u0;
        int i11 = (i10 & 15) + (i10 | 15);
        v0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int iIntValue;
        String str;
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-283)) + (i11 * (-282)) + (i10 * 284);
        int i15 = ~i11;
        switch (((~(i15 | i13 | i12)) * 283) + ((~(i10 | i15)) * 283) + i14) {
            case 1:
                ael aelVar = (ael) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i16 = v0;
                int i17 = i16 & 9;
                int i18 = ((i16 | 9) & (~i17)) + (i17 << 1);
                f52551u0 = i18 % 128;
                int i19 = i18 % 2;
                byte[] bArr = aelVar.f52552t0;
                if (i19 != 0) {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 101, bArr}, 478760665, -478760661, 101);
                } else {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 20, bArr}, 478760665, -478760661, 20);
                }
                int i20 = f52551u0;
                int i21 = ((i20 | 55) << 1) - (((~i20) & 55) | (i20 & (-56)));
                v0 = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 2:
                ael aelVar2 = (ael) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i23 = f52551u0;
                int i24 = ((i23 ^ 35) | (i23 & 35)) << 1;
                int i25 = -(((~i23) & 35) | (i23 & (-36)));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                v0 = i26 % 128;
                int i27 = i26 % 2;
                byte[] bArr2 = aelVar2.f52552t0;
                if (i27 == 0) {
                    int length = bArr2.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                    int i28 = 2 / 0;
                } else {
                    int length2 = bArr2.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length2)}, 1150803379, -1150803367, length2)).intValue();
                }
                return Integer.valueOf(iIntValue);
            case 3:
                ael aelVar3 = (ael) objArr[0];
                int i29 = v0;
                int i30 = i29 & 87;
                int i31 = ((i29 | 87) & (~i30)) + (i30 << 1);
                f52551u0 = i31 % 128;
                int i32 = i31 % 2;
                byte[] bArr3 = aelVar3.f52552t0;
                if (i32 != 0) {
                    str = (String) bez.setX(new Object[]{bArr3}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                    int i33 = 72 / 0;
                } else {
                    str = (String) bez.setX(new Object[]{bArr3}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                }
                int i34 = f52551u0 + 49;
                v0 = i34 % 128;
                int i35 = i34 % 2;
                return str;
            case 4:
                int i36 = f52551u0 + 75;
                v0 = i36 % 128;
                return Boolean.valueOf(i36 % 2 == 0);
            case 5:
                ael aelVar4 = (ael) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i37 = v0;
                int i38 = i37 & 61;
                int i39 = (((i37 ^ 61) | i38) << 1) - ((i37 | 61) & (~i38));
                int i40 = i39 % 128;
                f52551u0 = i40;
                int i41 = i39 % 2;
                if (adyVar instanceof ael) {
                    boolean zBooleanValue3 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{aelVar4.f52552t0, ((ael) adyVar).f52552t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i42 = f52551u0;
                    int i43 = ((i42 | 18) << 1) - (i42 ^ 18);
                    int i44 = (i43 ^ (-1)) + (i43 << 1);
                    v0 = i44 % 128;
                    if (i44 % 2 == 0) {
                        int i45 = 47 / 0;
                    }
                    return Boolean.valueOf(zBooleanValue3);
                }
                int i46 = (i40 & (-92)) | ((~i40) & 91);
                int i47 = -(-((i40 & 91) << 1));
                int i48 = (i46 & i47) + (i46 | i47);
                v0 = i48 % 128;
                int i49 = i48 % 2;
                System.identityHashCode(aelVar4);
                System.identityHashCode(aelVar4);
                return Boolean.FALSE;
            case 6:
                byte[] bArr4 = (byte[]) objArr[0];
                afy afyVar = new afy();
                afyVar.f52552t0 = bArr4;
                int i50 = v0;
                int i51 = i50 & 37;
                int i52 = (i50 | 37) & (~i51);
                int i53 = i51 << 1;
                int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
                f52551u0 = i54 % 128;
                if (i54 % 2 != 0) {
                    int i55 = 94 / 0;
                }
                return afyVar;
            default:
                ael aelVar5 = (ael) objArr[0];
                int i56 = v0;
                int i57 = i56 & 61;
                int i58 = -(-((i56 ^ 61) | i57));
                int i59 = (i57 & i58) + (i58 | i57);
                f52551u0 = i59 % 128;
                int i60 = i59 % 2;
                int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{aelVar5.f52552t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i61 = f52551u0;
                int i62 = i61 & 55;
                int i63 = -(-(55 | i61));
                int i64 = (i62 & i63) + (i63 | i62);
                v0 = i64 % 128;
                int i65 = i64 % 2;
                return Integer.valueOf(iIntValue2);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, 700886601, -700886599, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1588172015, -1588172014, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, adyVar}, 457455074, -457455069, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1713640789, -1713640789, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -279697677, 279697680, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -775924266, 775924270, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        String str;
        int i10 = f52551u0;
        int i11 = (i10 & (-86)) | ((~i10) & 85);
        int i12 = (i10 & 85) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        v0 = i13 % 128;
        if (i13 % 2 == 0) {
            str = (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -279697677, 279697680, System.identityHashCode(this));
            int i14 = 58 / 0;
        } else {
            str = (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -279697677, 279697680, System.identityHashCode(this));
        }
        int i15 = v0;
        int i16 = (((i15 | 56) << 1) - (i15 ^ 56)) - 1;
        f52551u0 = i16 % 128;
        if (i16 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
