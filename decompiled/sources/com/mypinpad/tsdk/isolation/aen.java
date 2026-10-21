package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aen extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52553u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52554t0;

    static {
        Integer num = 12;
        num.intValue();
        int i10 = f52553u0;
        int i11 = i10 & 33;
        int i12 = ((((i10 ^ 33) | i11) << 1) - (~(-((i10 | 33) & (~i11))))) - 1;
        v0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int iIntValue;
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) + (i10 * (-520));
        int i14 = ~i10;
        int i15 = ((~(i14 | i11 | i12)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i13;
        int i16 = ~(i10 | (~i11));
        switch (((i16 | (~(i11 | (~i12) | i14))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i16 * (-1042)) + i15) {
            case 1:
                aen aenVar = (aen) objArr[0];
                System.identityHashCode(aenVar);
                System.identityHashCode(aenVar);
                int i17 = v0;
                int i18 = i17 ^ 87;
                int i19 = (((i17 & 87) | i18) << 1) - i18;
                f52553u0 = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 99 / 0;
                }
                objValueOf = Boolean.FALSE;
                break;
            case 2:
                aen aenVar2 = (aen) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i21 = ((-1) << 1) - ((f52553u0 + 74) ^ (-1));
                v0 = i21 % 128;
                int i22 = i21 % 2;
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 12, aenVar2.f52554t0}, 478760665, -478760661, 12);
                int i23 = v0;
                int i24 = (i23 ^ 69) + ((i23 & 69) << 1);
                f52553u0 = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 3:
                aen aenVar3 = (aen) objArr[0];
                int i26 = f52553u0;
                int i27 = ((i26 & 40) + (i26 | 40)) - 1;
                v0 = i27 % 128;
                int i28 = i27 % 2;
                String str = (String) bez.setX(new Object[]{aenVar3.f52554t0}, -288715044, 288715047, (int) System.currentTimeMillis());
                int i29 = f52553u0;
                int i30 = (((i29 & (-102)) | ((~i29) & 101)) - (~((i29 & 101) << 1))) - 1;
                v0 = i30 % 128;
                int i31 = i30 % 2;
                return str;
            case 4:
                aen aenVar4 = (aen) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i32 = f52553u0;
                int i33 = (i32 & 2) + (i32 | 2);
                int i34 = (i33 ^ (-1)) + (i33 << 1);
                v0 = i34 % 128;
                int i35 = i34 % 2;
                byte[] bArr = aenVar4.f52554t0;
                if (i35 == 0) {
                    int length = bArr.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                    int i36 = 30 / 0;
                } else {
                    int length2 = bArr.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length2)}, 1150803379, -1150803367, length2)).intValue();
                }
                int i37 = v0 + 93;
                f52553u0 = i37 % 128;
                if (i37 % 2 != 0) {
                    int i38 = 21 / 0;
                }
                objValueOf = Integer.valueOf(iIntValue);
                break;
            case 5:
                aen aenVar5 = (aen) objArr[0];
                int i39 = v0 + 91;
                f52553u0 = i39 % 128;
                int i40 = i39 % 2;
                byte[] bArr2 = aenVar5.f52554t0;
                if (i40 == 0) {
                    return Integer.valueOf(((Integer) bek.setOnFocusChangeListener(new Object[]{bArr2}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue());
                }
                ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr2}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                throw null;
            case 6:
                byte[] bArr3 = (byte[]) objArr[0];
                age ageVar = new age();
                ageVar.f52554t0 = bArr3;
                int i41 = v0;
                int i42 = i41 ^ 5;
                int i43 = (i41 & 5) << 1;
                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                f52553u0 = i44 % 128;
                if (i44 % 2 == 0) {
                    return ageVar;
                }
                throw null;
            default:
                aen aenVar6 = (aen) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i45 = f52553u0;
                int i46 = i45 + 99;
                v0 = i46 % 128;
                int i47 = i46 % 2;
                if (!(adyVar instanceof aen)) {
                    int i48 = i45 ^ 95;
                    int i49 = (i45 & 95) << 1;
                    int i50 = (i48 & i49) + (i48 | i49);
                    int i51 = i50 % 128;
                    v0 = i51;
                    int i52 = i50 % 2;
                    int i53 = ((((i51 ^ 113) | (i51 & 113)) << 1) - (~(-(((~i51) & 113) | (i51 & (-114)))))) - 1;
                    f52553u0 = i53 % 128;
                    int i54 = i53 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    boolean zBooleanValue3 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{aenVar6.f52554t0, ((aen) adyVar).f52554t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i55 = v0 + 59;
                    f52553u0 = i55 % 128;
                    if (i55 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.valueOf(zBooleanValue3);
                }
                break;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 470700994, -470700990, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1752589355, -1752589353, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setDividerPadding(new Object[]{this, adyVar}, 116170060, -116170060, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -778305187, 778305192, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setDividerPadding(new Object[]{this}, 1736212861, -1736212858, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 629447588, -629447587, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = v0;
        int i11 = (i10 & (-60)) | ((~i10) & 59);
        int i12 = -(-((i10 & 59) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52553u0 = i13 % 128;
        Object[] objArr = new Object[1];
        if (i13 % 2 == 0) {
            objArr[0] = this;
            return (String) setDividerPadding(objArr, 1736212861, -1736212858, System.identityHashCode(this));
        }
        objArr[0] = this;
        throw null;
    }
}
