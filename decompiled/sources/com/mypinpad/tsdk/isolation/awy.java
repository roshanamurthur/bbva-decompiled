package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class awy extends awp {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54068u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54069s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54070t0;

    public awy(awu awuVar, byte[] bArr, byte[] bArr2) {
        super(false, awuVar);
        this.f54069s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54070t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-448)) + (i10 * 450);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = (((~(i10 | i15 | (~i12))) | i14) * 449) + (i14 * (-1347)) + (((~(i15 | i10 | i12)) | i14) * 449) + i13;
        if (i16 == 1) {
            awy awyVar = (awy) objArr[0];
            int i17 = f54068u0;
            int i18 = i17 | 7;
            int i19 = (i18 << 1) - ((~(i17 & 7)) & i18);
            v0 = i19 % 128;
            int i20 = i19 % 2;
            byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{awyVar.f54070t0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i21 = f54068u0;
            int i22 = (i21 & 59) + (i21 | 59);
            v0 = i22 % 128;
            if (i22 % 2 != 0) {
                return bArr;
            }
            int i23 = 62 / 0;
            return bArr;
        }
        if (i16 != 2) {
            awy awyVar2 = (awy) objArr[0];
            int i24 = v0 + 44;
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            f54068u0 = i25 % 128;
            int i26 = i25 % 2;
            byte[] bArr2 = (byte[]) setX(new Object[]{awyVar2.f54069s0, awyVar2.f54070t0}, -726676599, 726676601, (int) System.currentTimeMillis());
            int i27 = f54068u0;
            int i28 = ((i27 | 25) << 1) - (i27 ^ 25);
            v0 = i28 % 128;
            int i29 = i28 % 2;
            return bArr2;
        }
        byte[] bArr3 = (byte[]) objArr[0];
        byte[] bArr4 = (byte[]) objArr[1];
        int i30 = v0;
        int i31 = i30 ^ 19;
        int i32 = -(-((i30 & 19) << 1));
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        f54068u0 = i33 % 128;
        int i34 = i33 % 2;
        byte[] bArr5 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3, bArr4}, 1396275083, -1396275074, (int) System.currentTimeMillis());
        int i35 = f54068u0;
        int i36 = i35 ^ 41;
        int i37 = ((i35 & 41) | i36) << 1;
        int i38 = -i36;
        int i39 = (i37 & i38) + (i37 | i38);
        v0 = i39 % 128;
        int i40 = i39 % 2;
        return bArr5;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, -136657225, 136657226, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -558716693, 558716693, System.identityHashCode(this));
    }

    public awy(awu awuVar, byte[] bArr) {
        super(false, awuVar);
        this.f54069s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 0, 32}, 525237936, -525237917, 0);
        this.f54070t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 32, Integer.valueOf(bArr.length)}, 525237936, -525237917, 32);
    }
}
