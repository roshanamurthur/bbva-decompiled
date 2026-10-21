package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aer extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52560u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52561t0;

    static {
        Integer num = 26;
        num.intValue();
        int i10 = v0 + 3;
        f52560u0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        int iIntValue;
        Boolean boolValueOf;
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
        int i18 = ~(i15 | i16);
        int i19 = ~(i12 | i10);
        switch ((((~(i10 | i15)) | (~(i14 | i16)) | i19) * 520) + ((i18 | i19) * (-1040)) + i17) {
            case 1:
                aer aerVar = (aer) objArr[0];
                int i20 = v0;
                int i21 = (i20 ^ 19) + ((i20 & 19) << 1);
                f52560u0 = i21 % 128;
                int i22 = i21 % 2;
                int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{aerVar.f52561t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i23 = v0;
                int i24 = i23 & 45;
                int i25 = (i23 | 45) & (~i24);
                int i26 = i24 << 1;
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                f52560u0 = i27 % 128;
                int i28 = i27 % 2;
                return Integer.valueOf(iIntValue2);
            case 2:
                aer aerVar2 = (aer) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i29 = f52560u0;
                int i30 = i29 ^ 17;
                int i31 = ((i29 & 17) | i30) << 1;
                int i32 = -i30;
                int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                v0 = i33 % 128;
                int i34 = i33 % 2;
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 26, aerVar2.f52561t0}, 478760665, -478760661, 26);
                int i35 = v0 + 43;
                f52560u0 = i35 % 128;
                if (i35 % 2 == 0) {
                    return null;
                }
                throw null;
            case 3:
                aer aerVar3 = (aer) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i36 = f52560u0 + 39;
                v0 = i36 % 128;
                int i37 = i36 % 2;
                byte[] bArr = aerVar3.f52561t0;
                if (i37 == 0) {
                    int length = bArr.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                    int i38 = 63 / 0;
                } else {
                    int length2 = bArr.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length2)}, 1150803379, -1150803367, length2)).intValue();
                }
                return Integer.valueOf(iIntValue);
            case 4:
                byte[] bArr2 = (byte[]) objArr[0];
                aga agaVar = new aga();
                agaVar.f52561t0 = bArr2;
                int i39 = f52560u0;
                int i40 = ((i39 ^ 107) | (i39 & 107)) << 1;
                int i41 = -(((~i39) & 107) | (i39 & (-108)));
                int i42 = (i40 & i41) + (i41 | i40);
                v0 = i42 % 128;
                if (i42 % 2 != 0) {
                    return agaVar;
                }
                throw null;
            case 5:
                aer aerVar4 = (aer) objArr[0];
                int i43 = f52560u0;
                int i44 = i43 & 123;
                int i45 = (i43 ^ 123) | i44;
                int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                v0 = i46 % 128;
                int i47 = i46 % 2;
                String str = (String) bez.setX(new Object[]{aerVar4.f52561t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                int i48 = f52560u0;
                int i49 = i48 & 115;
                int i50 = (i49 - (~((i48 ^ 115) | i49))) - 1;
                v0 = i50 % 128;
                if (i50 % 2 != 0) {
                    return str;
                }
                int i51 = 52 / 0;
                return str;
            case 6:
                int i52 = f52560u0;
                int i53 = ((-1) << 1) - ((i52 + 82) ^ (-1));
                v0 = i53 % 128;
                int i54 = i53 % 2;
                int i55 = ((-1) << 1) - ((i52 + 114) ^ (-1));
                v0 = i55 % 128;
                int i56 = i55 % 2;
                return false;
            default:
                aer aerVar5 = (aer) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i57 = v0 + 117;
                int i58 = i57 % 128;
                f52560u0 = i58;
                int i59 = i57 % 2;
                if (adyVar instanceof aer) {
                    boolean zBooleanValue3 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{aerVar5.f52561t0, ((aer) adyVar).f52561t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i60 = f52560u0;
                    int i61 = i60 & 21;
                    int i62 = i60 | 21;
                    int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                    v0 = i63 % 128;
                    int i64 = i63 % 2;
                    boolValueOf = Boolean.valueOf(zBooleanValue3);
                } else {
                    int i65 = ((i58 ^ 31) | (i58 & 31)) << 1;
                    int i66 = -((i58 & (-32)) | ((~i58) & 31));
                    int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                    int i68 = i67 % 128;
                    v0 = i68;
                    int i69 = i67 % 2;
                    int i70 = ((i68 | 85) << 1) - (i68 ^ 85);
                    f52560u0 = i70 % 128;
                    int i71 = i70 % 2;
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setX(new Object[]{this, Boolean.valueOf(z10)}, 837529388, -837529385, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setX(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -1170437469, 1170437471, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setX(new Object[]{this, adyVar}, -28725812, 28725812, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -15270371, 15270372, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, -1403866614, 1403866619, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, -645690097, 645690103, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = v0;
        int i11 = (((i10 & (-68)) | ((~i10) & 67)) - (~(-(-((i10 & 67) << 1))))) - 1;
        f52560u0 = i11 % 128;
        int i12 = i11 % 2;
        String str = (String) setX(new Object[]{this}, -1403866614, 1403866619, System.identityHashCode(this));
        int i13 = v0;
        int i14 = i13 ^ 109;
        int i15 = (i13 & 109) << 1;
        int i16 = (i14 & i15) + (i15 | i14);
        f52560u0 = i16 % 128;
        if (i16 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
