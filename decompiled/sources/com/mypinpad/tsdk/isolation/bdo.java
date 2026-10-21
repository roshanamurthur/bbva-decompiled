package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class bdo extends amw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54575t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54576u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f54577r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54578s0;

    public bdo(int i10, byte[] bArr) {
        super(true);
        if (bArr.length != ((Integer) bdu.setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, -816990371, 816990372, i10)).intValue()) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f54577r0 = i10;
        this.f54578s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i10;
        if (((~(i11 | i13)) * 381) + (((~(i10 | i11)) | (~((~i12) | i11)) | (~((~i11) | i13))) * 381) + ((i11 | i12 | i13) * (-381)) + (i11 * 382) + (i10 * (-380)) == 1) {
            bdo bdoVar = (bdo) objArr[0];
            int i14 = f54576u0;
            int i15 = i14 & 97;
            int i16 = i15 + ((i14 ^ 97) | i15);
            int i17 = i16 % 128;
            f54575t0 = i17;
            int i18 = i16 % 2;
            int i19 = bdoVar.f54577r0;
            if (i18 != 0) {
                int i20 = 68 / 0;
            }
            int i21 = i17 & 123;
            int i22 = -(-((i17 ^ 123) | i21));
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            f54576u0 = i23 % 128;
            int i24 = i23 % 2;
            return Integer.valueOf(i19);
        }
        bdo bdoVar2 = (bdo) objArr[0];
        int i25 = f54575t0;
        int i26 = i25 & 115;
        int i27 = (i25 ^ 115) | i26;
        int i28 = (i26 & i27) + (i27 | i26);
        f54576u0 = i28 % 128;
        int i29 = i28 % 2;
        byte[] bArr2 = bdoVar2.f54578s0;
        Object[] objArr2 = new Object[1];
        if (i29 == 0) {
            objArr2[0] = bArr2;
            bArr = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
            int i30 = 80 / 0;
        } else {
            objArr2[0] = bArr2;
            bArr = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
        }
        int i31 = f54575t0 + 45;
        f54576u0 = i31 % 128;
        int i32 = i31 % 2;
        return bArr;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, 1545400458, -1545400458, System.identityHashCode(this));
    }

    public final int setY() {
        return ((Integer) setX(new Object[]{this}, -1672456908, 1672456909, System.identityHashCode(this))).intValue();
    }
}
