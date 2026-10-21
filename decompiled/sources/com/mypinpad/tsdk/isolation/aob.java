package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class aob extends amw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f53400s0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f53401r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aob(byte[] bArr) {
        super(false);
        byte[] bArr2 = (byte[]) setY(new Object[]{bArr}, 1115921900, -1115921900, (int) System.currentTimeMillis());
        byte[] bArr3 = new byte[56];
        this.f53401r0 = bArr3;
        System.arraycopy(bArr2, 0, bArr3, 0, 56);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = (i11 * (-463)) + (i10 * 465);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~(i14 | i10);
        if ((((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13 != 1) {
            bArr = (byte[]) objArr[0];
            int i18 = f53400s0;
            int i19 = ((i18 ^ 39) | (i18 & 39)) << 1;
            int i20 = -(((~i18) & 39) | (i18 & (-40)));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            int i22 = i21 % 128;
            int i23 = i21 % 2;
            int length = bArr.length;
            if (i23 == 0 ? length != 56 : length != 78) {
                throw new IllegalArgumentException("'buf' must have length 56");
            }
            int i24 = i22 & 107;
            int i25 = -(-((i22 ^ 107) | i24));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f53400s0 = i26 % 128;
            int i27 = i26 % 2;
        } else {
            aob aobVar = (aob) objArr[0];
            int i28 = f53400s0 + 23;
            int i29 = i28 % 128;
            int i30 = i28 % 2;
            bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{aobVar.f53401r0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i31 = f53400s0 + 41;
            int i32 = i31 % 128;
            if (i31 % 2 != 0) {
                throw null;
            }
        }
        return bArr;
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setY(new Object[]{this}, -273648745, 273648746, System.identityHashCode(this));
    }
}
