package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ayq extends ayj {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54168u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54169s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54170t0;

    public ayq(ayn aynVar, byte[] bArr) {
        super(false, aynVar);
        byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 0, 32}, 525237936, -525237917, 0);
        this.f54169s0 = bArr2;
        int length = bArr2.length;
        this.f54170t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(length), Integer.valueOf(bArr.length)}, 525237936, -525237917, length);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        ayq ayqVar = (ayq) objArr[0];
        int i13 = v0;
        int i14 = ((i13 | 105) << 1) - (i13 ^ 105);
        f54168u0 = i14 % 128;
        if (i14 % 2 != 0) {
            ayn y7 = ayqVar.setY();
            bArr = new byte[((Integer) ayn.setOnFocusChangeListener(new Object[]{y7}, -1623181113, 1623181113, System.identityHashCode(y7))).intValue()];
            byte[] bArr2 = ayqVar.f54169s0;
            System.arraycopy(bArr2, 0, bArr, 1, bArr2.length);
            int length = bArr2.length;
            byte[] bArr3 = ayqVar.f54170t0;
            System.arraycopy(bArr3, 1, bArr, length, bArr3.length);
        } else {
            ayn y10 = ayqVar.setY();
            bArr = new byte[((Integer) ayn.setOnFocusChangeListener(new Object[]{y10}, -1623181113, 1623181113, System.identityHashCode(y10))).intValue()];
            byte[] bArr4 = ayqVar.f54169s0;
            System.arraycopy(bArr4, 0, bArr, 0, bArr4.length);
            int length2 = bArr4.length;
            byte[] bArr5 = ayqVar.f54170t0;
            System.arraycopy(bArr5, 0, bArr, length2, bArr5.length);
        }
        int i15 = f54168u0;
        int i16 = (i15 ^ 105) + ((i15 & 105) << 1);
        v0 = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 70 / 0;
        }
        return bArr;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, 323613012, -323613012, System.identityHashCode(this));
    }
}
