package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class agd extends acz {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52611y0;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (~(i14 | i15)) | (~(i15 | i12));
        int i17 = ~(i11 | (~i12) | i10);
        switch ((((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + i13) {
            case 1:
                int i18 = E0;
                int i19 = ((i18 ^ 45) | (i18 & 45)) << 1;
                int i20 = -((i18 & (-46)) | ((~i18) & 45));
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                f52611y0 = i21 % 128;
                int i22 = i21 % 2;
                int i23 = ((i18 | 43) << 1) - (i18 ^ 43);
                f52611y0 = i23 % 128;
                if (i23 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 2:
                aeb aebVar = (aeb) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                byte[] bArr = (byte[]) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i24 = f52611y0;
                int i25 = i24 & 71;
                int i26 = ((((i24 ^ 71) | i25) << 1) - (~(-((i24 | 71) & (~i25))))) - 1;
                E0 = i26 % 128;
                int i27 = i26 % 2;
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 3, bArr, 0, Integer.valueOf(iIntValue)}, -734840943, 734840948, 3);
                int i28 = E0;
                int i29 = ((i28 & 14) + (i28 | 14)) - 1;
                f52611y0 = i29 % 128;
                int i30 = i29 % 2;
                return null;
            case 3:
                boolean zBooleanValue2 = ((Boolean) objArr[0]).booleanValue();
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i31 = f52611y0;
                int i32 = i31 ^ 61;
                int i33 = -(-((i31 & 61) << 1));
                int i34 = (i32 & i33) + (i33 | i32);
                E0 = i34 % 128;
                int i35 = i34 % 2;
                int iIntValue3 = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(iIntValue2)}, 1150803379, -1150803367, iIntValue2)).intValue();
                int i36 = f52611y0 + 55;
                E0 = i36 % 128;
                if (i36 % 2 != 0) {
                    return Integer.valueOf(iIntValue3);
                }
                throw null;
            case 4:
                agd agdVar = (agd) objArr[0];
                int i37 = f52611y0;
                int i38 = ((i37 ^ 115) | (i37 & 115)) << 1;
                int i39 = -(((~i37) & 115) | (i37 & (-116)));
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                int i41 = i40 % 128;
                E0 = i41;
                int i42 = i40 % 2;
                int i43 = ((i41 & (-66)) | ((~i41) & 65)) + ((i41 & 65) << 1);
                f52611y0 = i43 % 128;
                int i44 = i43 % 2;
                return agdVar;
            case 5:
                agd agdVar2 = (agd) objArr[0];
                aeb aebVar2 = (aeb) objArr[1];
                boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                int i45 = E0 + 60;
                int i46 = (i45 ^ (-1)) + (i45 << 1);
                f52611y0 = i46 % 128;
                int i47 = i46 % 2;
                byte[] bArr2 = agdVar2.f52440t0;
                if (i47 != 0) {
                    aeb.setX(new Object[]{aebVar2, Boolean.valueOf(zBooleanValue3), 4, bArr2}, 478760665, -478760661, 4);
                    return null;
                }
                aeb.setX(new Object[]{aebVar2, Boolean.valueOf(zBooleanValue3), 3, bArr2}, 478760665, -478760661, 3);
                return null;
            case 6:
                aeb aebVar3 = (aeb) objArr[0];
                byte bByteValue = ((Byte) objArr[1]).byteValue();
                byte[] bArr3 = (byte[]) objArr[2];
                int iIntValue4 = ((Number) objArr[3]).intValue();
                int iIntValue5 = ((Number) objArr[4]).intValue();
                int i48 = E0;
                int i49 = i48 & 69;
                int i50 = (i48 ^ 69) | i49;
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                f52611y0 = i51 % 128;
                int i52 = i51 % 2;
                aeb.setX(new Object[]{aebVar3, Boolean.TRUE, Byte.valueOf(bByteValue), bArr3, Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5)}, -1917427487, 1917427497, iIntValue4);
                int i53 = E0;
                int i54 = (i53 ^ 88) + ((i53 & 88) << 1);
                int i55 = (i54 ^ (-1)) + (i54 << 1);
                f52611y0 = i55 % 128;
                if (i55 % 2 == 0) {
                    return null;
                }
                throw null;
            default:
                agd agdVar3 = (agd) objArr[0];
                boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                int i56 = E0 + 125;
                f52611y0 = i56 % 128;
                int i57 = i56 % 2;
                int length = agdVar3.f52440t0.length;
                int iIntValue6 = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue4), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                int i58 = E0;
                int i59 = i58 & 81;
                int i60 = (i58 | 81) & (~i59);
                int i61 = i59 << 1;
                int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                f52611y0 = i62 % 128;
                if (i62 % 2 != 0) {
                    int i63 = 3 / 0;
                }
                return Integer.valueOf(iIntValue6);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.acz, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setY(new Object[]{this}, 664785259, -664785255, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setY(new Object[]{this, Boolean.valueOf(z10)}, -1675042171, 1675042171, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setY(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1511472507, -1511472502, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setY(new Object[]{this}, -1114398599, 1114398600, System.identityHashCode(this))).booleanValue();
    }
}
