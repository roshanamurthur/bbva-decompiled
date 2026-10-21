package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class anj extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53327s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f53328t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final auh.setOnFocusChangeListener f53329r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anj(byte[] bArr) {
        super(false);
        byte[] bArr2 = (byte[]) setCompoundDrawableTintBlendMode(new Object[]{bArr}, -2046065051, 2046065051, (int) System.currentTimeMillis());
        this.f53329r0 = (auh.setOnFocusChangeListener) setCompoundDrawableTintBlendMode(new Object[]{bArr2, 0}, 618265964, -618265961, 0);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        auh.setOnFocusChangeListener setonfocuschangelistener;
        int i13 = (i11 * (-864)) + (i10 * 866);
        int i14 = ~i11;
        int i15 = ~i10;
        int i16 = ~i12;
        int i17 = (((~(i10 | i16)) | (~(i14 | i16))) * 865) + ((~(i12 | i10)) * 865) + (((~(i15 | i16)) | i14) * (-865)) + i13;
        if (i17 == 1) {
            anj anjVar = (anj) objArr[0];
            int i18 = f53328t0;
            int i19 = i18 & 37;
            int i20 = ((i18 | 37) & (~i19)) + (i19 << 1);
            f53327s0 = i20 % 128;
            if (i20 % 2 != 0) {
                bArr = new byte[6];
                setCompoundDrawableTintBlendMode(new Object[]{anjVar, bArr}, 1116846822, -1116846820, System.identityHashCode(anjVar));
            } else {
                bArr = new byte[57];
                setCompoundDrawableTintBlendMode(new Object[]{anjVar, bArr}, 1116846822, -1116846820, System.identityHashCode(anjVar));
            }
            return bArr;
        }
        if (i17 == 2) {
            anj anjVar2 = (anj) objArr[0];
            byte[] bArr2 = (byte[]) objArr[1];
            int i21 = f53328t0;
            int i22 = ((i21 | 113) << 1) - (i21 ^ 113);
            f53327s0 = i22 % 128;
            int i23 = i22 % 2;
            auh.setOnFocusChangeListener setonfocuschangelistener2 = anjVar2.f53329r0;
            Object[] objArr2 = new Object[3];
            if (i23 != 0) {
                objArr2[0] = setonfocuschangelistener2;
                objArr2[1] = bArr2;
                objArr2[2] = 0;
                auh.setDividerPadding(objArr2, 1070668575, -1070668575, 0);
            } else {
                objArr2[0] = setonfocuschangelistener2;
                objArr2[1] = bArr2;
                objArr2[2] = 0;
                auh.setDividerPadding(objArr2, 1070668575, -1070668575, 0);
            }
            return null;
        }
        if (i17 != 3) {
            byte[] bArr3 = (byte[]) objArr[0];
            int i24 = f53328t0;
            int i25 = (-2) - ((i24 + 8) ^ (-1));
            f53327s0 = i25 % 128;
            int i26 = i25 % 2;
            if (bArr3.length != 57) {
                throw new IllegalArgumentException("'buf' must have length 57");
            }
            int i27 = i24 ^ 77;
            int i28 = ((((i24 & 77) | i27) << 1) - (~(-i27))) - 1;
            f53327s0 = i28 % 128;
            if (i28 % 2 == 0) {
                return bArr3;
            }
            int i29 = 31 / 0;
            return bArr3;
        }
        byte[] bArr4 = (byte[]) objArr[0];
        ((Number) objArr[1]).intValue();
        int i30 = f53328t0;
        int i31 = i30 & 121;
        int i32 = (i30 ^ 121) | i31;
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        f53327s0 = i33 % 128;
        if (i33 % 2 == 0 ? (setonfocuschangelistener = (auh.setOnFocusChangeListener) auh.setDividerPadding(new Object[]{bArr4, 0}, -2048804572, 2048804577, 0)) == null : (setonfocuschangelistener = (auh.setOnFocusChangeListener) auh.setDividerPadding(new Object[]{bArr4, 0}, -2048804572, 2048804577, 0)) == null) {
            throw new IllegalArgumentException("invalid public key");
        }
        int i34 = f53327s0;
        int i35 = i34 & 125;
        int i36 = -(-((i34 ^ 125) | i35));
        int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
        f53328t0 = i37 % 128;
        int i38 = i37 % 2;
        return setonfocuschangelistener;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1717514962, -1717514961, System.identityHashCode(this));
    }
}
