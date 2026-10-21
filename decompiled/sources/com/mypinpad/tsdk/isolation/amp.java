package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;

/* JADX INFO: loaded from: classes10.dex */
public final class amp implements amq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53227b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53228c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f53229a;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        long[] jArr;
        int i13 = (i11 * 517) + (i10 * (-515));
        int i14 = ~i11;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = i15 | (~(i16 | i10));
        int i18 = ~(i16 | i11);
        int i19 = ~i10;
        if ((((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i17 | i18) * (-516)) + i13 != 1) {
            amp ampVar = (amp) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i20 = f53228c + 101;
            f53227b = i20 % 128;
            int i21 = i20 % 2;
            ampVar.f53229a = (long[]) amu.setCompoundDrawableTintBlendMode(new Object[]{bArr}, -304715478, 304715481, (int) System.currentTimeMillis());
            int i22 = f53227b;
            int i23 = i22 ^ 91;
            int i24 = ((i22 & 91) | i23) << 1;
            int i25 = -i23;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f53228c = i26 % 128;
            int i27 = i26 % 2;
        } else {
            amp ampVar2 = (amp) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            byte[] bArr2 = (byte[]) objArr[2];
            int i28 = f53227b;
            int i29 = i28 & 103;
            int i30 = i28 | 103;
            int i31 = (i29 & i30) + (i30 | i29);
            f53228c = i31 % 128;
            int i32 = i31 % 2;
            long[] jArr2 = (long[]) amu.setCompoundDrawableTintBlendMode(new Object[0], -1233866299, 1233866316, (int) System.currentTimeMillis());
            if (jLongValue > 0) {
                int i33 = f53228c;
                int i34 = i33 ^ 75;
                int i35 = (i33 & 75) << 1;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f53227b = i36 % 128;
                if (i36 % 2 != 0) {
                    jArr = new long[5];
                    amu.setCompoundDrawableTintBlendMode(new Object[]{ampVar2.f53229a, jArr}, 550161453, -550161447, (int) System.currentTimeMillis());
                } else {
                    jArr = new long[2];
                    amu.setCompoundDrawableTintBlendMode(new Object[]{ampVar2.f53229a, jArr}, 550161453, -550161447, (int) System.currentTimeMillis());
                }
                int i37 = f53227b;
                int i38 = i37 & 33;
                int i39 = (i37 ^ 33) | i38;
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                f53228c = i40 % 128;
                int i41 = i40 % 2;
                do {
                    if ((1 & jLongValue) != 0) {
                        int i42 = f53228c;
                        int i43 = i42 & 91;
                        int i44 = (((i42 | 91) & (~i43)) - (~(i43 << 1))) - 1;
                        f53227b = i44 % 128;
                        int i45 = i44 % 2;
                        amu.setCompoundDrawableTintBlendMode(new Object[]{jArr2, jArr}, -144881152, 144881167, (int) System.currentTimeMillis());
                        int i46 = f53227b;
                        int i47 = (i46 & (-116)) | ((~i46) & 115);
                        int i48 = -(-((i46 & 115) << 1));
                        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                        f53228c = i49 % 128;
                        int i50 = i49 % 2;
                    }
                    amu.setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr}, 666181894, -666181883, (int) System.currentTimeMillis());
                    jLongValue >>>= 1;
                } while (jLongValue > 0);
            }
            amu.setCompoundDrawableTintBlendMode(new Object[]{jArr2, bArr2}, -2024198581, 2024198595, (int) System.currentTimeMillis());
            int i51 = f53228c + 81;
            f53227b = i51 % 128;
            if (i51 % 2 != 0) {
                throw null;
            }
        }
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.amq
    public final void setY(long j10, byte[] bArr) {
        setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10), bArr}, 480394407, -480394406, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.amq
    public final void setY(byte[] bArr) {
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, 830355379, -830355379, System.identityHashCode(this));
    }
}
