package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class adj extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52472u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52473t0;

    static {
        Integer num = 27;
        num.intValue();
        int i10 = f52472u0;
        int i11 = (i10 ^ 107) + ((i10 & 107) << 1);
        v0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Boolean boolValueOf;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = ((i16 | (~(i13 | i17)) | (~(i14 | i17))) * (-1136)) + (i11 * 569) + (i10 * 569);
        int i19 = i10 | i17;
        switch ((((~i19) | (~(i11 | i17)) | (~(i15 | i12))) * 568) + (((~(i13 | i12)) | (~(i14 | i12)) | (~(i19 | i11))) * (-568)) + i18) {
            case 1:
                adj adjVar = (adj) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i20 = f52472u0;
                int i21 = (i20 & (-124)) | ((~i20) & 123);
                int i22 = (123 & i20) << 1;
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                v0 = i23 % 128;
                int i24 = i23 % 2;
                byte[] bArr = adjVar.f52473t0;
                if (i24 == 0) {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 122, bArr}, 478760665, -478760661, 122);
                    return null;
                }
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 27, bArr}, 478760665, -478760661, 27);
                return null;
            case 2:
                adj adjVar2 = (adj) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i25 = v0;
                int i26 = ((i25 ^ 107) | (i25 & 107)) << 1;
                int i27 = -(((~i25) & 107) | (i25 & (-108)));
                int i28 = (i26 & i27) + (i27 | i26);
                f52472u0 = i28 % 128;
                int i29 = i28 % 2;
                int length = adjVar2.f52473t0.length;
                int iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                int i30 = v0;
                int i31 = ((((i30 ^ 123) | (i30 & 123)) << 1) - (~(-(((~i30) & 123) | (i30 & (-124)))))) - 1;
                f52472u0 = i31 % 128;
                if (i31 % 2 == 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            case 3:
                adj adjVar3 = (adj) objArr[0];
                int i32 = v0;
                int i33 = i32 & 103;
                int i34 = (i33 - (~((i32 ^ 103) | i33))) - 1;
                f52472u0 = i34 % 128;
                int i35 = i34 % 2;
                byte[] bArr2 = adjVar3.f52473t0;
                if (i35 != 0) {
                    ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr2}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                    throw null;
                }
                int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr2}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i36 = v0;
                int i37 = ((i36 | 3) << 1) - (i36 ^ 3);
                f52472u0 = i37 % 128;
                int i38 = i37 % 2;
                return Integer.valueOf(iIntValue2);
            case 4:
                byte[] bArr3 = (byte[]) objArr[0];
                afn afnVar = new afn();
                afnVar.f52473t0 = bArr3;
                int i39 = v0;
                int i40 = i39 & 9;
                int i41 = ((i39 ^ 9) | i40) << 1;
                int i42 = -((i39 | 9) & (~i40));
                int i43 = (i41 & i42) + (i42 | i41);
                f52472u0 = i43 % 128;
                int i44 = i43 % 2;
                return afnVar;
            case 5:
                adj adjVar4 = (adj) objArr[0];
                int i45 = f52472u0;
                int i46 = (i45 ^ 119) + ((i45 & 119) << 1);
                v0 = i46 % 128;
                int i47 = i46 % 2;
                String str = (String) bez.setX(new Object[]{adjVar4.f52473t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                int i48 = v0;
                int i49 = ((((i48 ^ 31) | (i48 & 31)) << 1) - (~(-(((~i48) & 31) | (i48 & (-32)))))) - 1;
                f52472u0 = i49 % 128;
                int i50 = i49 % 2;
                return str;
            case 6:
                adj adjVar5 = (adj) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i51 = v0;
                int i52 = i51 + 115;
                f52472u0 = i52 % 128;
                int i53 = i52 % 2;
                if (adyVar instanceof adj) {
                    boolean zBooleanValue3 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{adjVar5.f52473t0, ((adj) adyVar).f52473t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i54 = v0;
                    int i55 = i54 & 89;
                    int i56 = i54 | 89;
                    int i57 = (i55 & i56) + (i56 | i55);
                    f52472u0 = i57 % 128;
                    if (i57 % 2 != 0) {
                        throw null;
                    }
                    boolValueOf = Boolean.valueOf(zBooleanValue3);
                } else {
                    int i58 = ((i51 ^ 82) + ((i51 & 82) << 1)) - 1;
                    f52472u0 = i58 % 128;
                    int i59 = i58 % 2;
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            default:
                int i60 = f52472u0;
                int i61 = i60 ^ 43;
                int i62 = ((i60 & 43) | i61) << 1;
                int i63 = -i61;
                int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                int i65 = i64 % 128;
                v0 = i65;
                int i66 = i64 % 2;
                int i67 = i65 & 31;
                int i68 = ((i65 ^ 31) | i67) << 1;
                int i69 = -((i65 | 31) & (~i67));
                int i70 = (i68 & i69) + (i69 | i68);
                f52472u0 = i70 % 128;
                int i71 = i70 % 2;
                return Boolean.FALSE;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, Boolean.valueOf(z10)}, 247731925, -247731923, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setOnFocusChangeListener(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1972416919, -1972416918, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, adyVar}, -2097352314, 2097352320, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 67706176, -67706173, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1768516021, 1768516021, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = f52472u0;
        int i11 = ((i10 ^ 75) | (i10 & 75)) << 1;
        int i12 = -(((~i10) & 75) | (i10 & (-76)));
        int i13 = (i11 & i12) + (i12 | i11);
        v0 = i13 % 128;
        Object[] objArr = new Object[1];
        if (i13 % 2 != 0) {
            objArr[0] = this;
            return (String) setOnFocusChangeListener(objArr, -2046986858, 2046986863, System.identityHashCode(this));
        }
        objArr[0] = this;
        int i14 = 4 / 0;
        return (String) setOnFocusChangeListener(objArr, -2046986858, 2046986863, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -2046986858, 2046986863, System.identityHashCode(this));
    }
}
