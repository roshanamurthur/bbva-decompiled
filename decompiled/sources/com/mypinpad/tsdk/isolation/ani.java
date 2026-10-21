package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ani extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53324s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53325t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final aug.setLayoutAnimation f53326r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ani(byte[] bArr) {
        super(false);
        byte[] bArr2 = (byte[]) setX(new Object[]{bArr}, -282062719, 282062721, (int) System.currentTimeMillis());
        this.f53326r0 = (aug.setLayoutAnimation) setX(new Object[]{bArr2, 0}, -225454810, 225454810, 0);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i11;
        int i16 = ((i12 | i14 | (~(i15 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
        int i17 = ~i12;
        int i18 = (((~(i10 | i17 | i11)) | (~(i13 | i15 | i17))) * 614) + (((~(i13 | i17)) | i14 | (~(i17 | i11))) * (-1228)) + i16;
        if (i18 == 1) {
            ani aniVar = (ani) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i19 = f53325t0;
            int i20 = (i19 & 87) + (i19 | 87);
            f53324s0 = i20 % 128;
            int i21 = i20 % 2;
            aug.setOnFocusChangeListener(new Object[]{aniVar.f53326r0, bArr, 0}, -916446261, 916446268, 0);
            int i22 = f53324s0;
            int i23 = i22 & 63;
            int i24 = ((((i22 ^ 63) | i23) << 1) - (~(-((i22 | 63) & (~i23))))) - 1;
            f53325t0 = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        if (i18 == 2) {
            byte[] bArr2 = (byte[]) objArr[0];
            int i26 = f53325t0;
            int i27 = ((i26 ^ 108) + ((i26 & 108) << 1)) - 1;
            int i28 = i27 % 128;
            f53324s0 = i28;
            int i29 = i27 % 2;
            if (bArr2.length != 32) {
                throw new IllegalArgumentException("'buf' must have length 32");
            }
            int i30 = (i28 ^ 67) + ((i28 & 67) << 1);
            f53325t0 = i30 % 128;
            if (i30 % 2 != 0) {
                return bArr2;
            }
            throw null;
        }
        if (i18 != 3) {
            byte[] bArr3 = (byte[]) objArr[0];
            ((Number) objArr[1]).intValue();
            int i31 = f53325t0;
            int i32 = ((i31 | 52) << 1) - (i31 ^ 52);
            int i33 = (i32 ^ (-1)) + (i32 << 1);
            f53324s0 = i33 % 128;
            int i34 = i33 % 2;
            aug.setLayoutAnimation setlayoutanimation = (aug.setLayoutAnimation) aug.setOnFocusChangeListener(new Object[]{bArr3, 0}, -1762713145, 1762713150, 0);
            if (setlayoutanimation != null) {
                return setlayoutanimation;
            }
            throw new IllegalArgumentException("invalid public key");
        }
        ani aniVar2 = (ani) objArr[0];
        int i35 = f53325t0;
        int i36 = i35 & 79;
        int i37 = (i36 - (~((i35 ^ 79) | i36))) - 1;
        f53324s0 = i37 % 128;
        int i38 = i37 % 2;
        byte[] bArr4 = new byte[32];
        setX(new Object[]{aniVar2, bArr4}, 978878834, -978878833, System.identityHashCode(aniVar2));
        int i39 = f53325t0;
        int i40 = (((i39 | 80) << 1) - (i39 ^ 80)) - 1;
        f53324s0 = i40 % 128;
        int i41 = i40 % 2;
        return bArr4;
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, 2094247535, -2094247532, System.identityHashCode(this));
    }
}
