package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class azs extends azo {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54213u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54214t0;

    public azs(byte[] bArr, String str) {
        super(false, str);
        this.f54214t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        azs azsVar = (azs) objArr[0];
        int i13 = v0;
        int i14 = i13 & 125;
        int i15 = ((i13 ^ 125) | i14) << 1;
        int i16 = -((i13 | 125) & (~i14));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f54213u0 = i17 % 128;
        int i18 = i17 % 2;
        byte[] bArr = azsVar.f54214t0;
        if (i18 != 0) {
            throw null;
        }
        byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i19 = f54213u0 + 83;
        v0 = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 12 / 0;
        }
        return bArr2;
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -34095331, 34095331, System.identityHashCode(this));
    }
}
