package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class awo extends awm {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54052t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54053u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54054s0;

    public awo(awn awnVar, byte[] bArr) {
        super(false, awnVar);
        this.f54054s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = (i11 * 253) + (i10 * 253);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        int i17 = i15 | (~i12);
        int i18 = i16 | (~i17);
        int i19 = i11 | i10;
        int i20 = ~(i12 | i19);
        if ((((~(i10 | i17)) | i20) * 252) + (i19 * (-252)) + ((i18 | i20) * (-252)) + i13 != 1) {
            awo awoVar = (awo) objArr[0];
            int i21 = f54053u0;
            int i22 = i21 & 109;
            int i23 = -(-((i21 ^ 109) | i22));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f54052t0 = i24 % 128;
            Object[] objArr2 = new Object[1];
            if (i24 % 2 != 0) {
                objArr2[0] = awoVar;
                throw null;
            }
            objArr2[0] = awoVar;
            bArr = (byte[]) setX(objArr2, 1364095473, -1364095472, System.identityHashCode(awoVar));
            int i25 = f54052t0;
            int i26 = i25 & 99;
            int i27 = -(-((i25 ^ 99) | i26));
            int i28 = (i26 & i27) + (i27 | i26);
            f54053u0 = i28 % 128;
            if (i28 % 2 == 0) {
                throw null;
            }
        } else {
            awo awoVar2 = (awo) objArr[0];
            int i29 = f54053u0;
            int i30 = (i29 | 85) << 1;
            int i31 = -(i29 ^ 85);
            int i32 = (i30 & i31) + (i31 | i30);
            f54052t0 = i32 % 128;
            int i33 = i32 % 2;
            bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{awoVar2.f54054s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i34 = f54053u0;
            int i35 = (((i34 ^ 89) | (i34 & 89)) << 1) - (((~i34) & 89) | (i34 & (-90)));
            f54052t0 = i35 % 128;
            if (i35 % 2 != 0) {
                int i36 = 62 / 0;
            }
        }
        return bArr;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, -1123685320, 1123685320, System.identityHashCode(this));
    }
}
