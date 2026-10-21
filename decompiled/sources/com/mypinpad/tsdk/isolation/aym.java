package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class aym extends ayl {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54157t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54158u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54159s0;

    public aym(ayk aykVar, byte[] bArr) {
        super(true, aykVar);
        this.f54159s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i10;
        int i14 = ~i11;
        if ((((~(i10 | (~i12))) | i14) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i13 | i14)) | (~(i14 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167)) != 1) {
            aym aymVar = (aym) objArr[0];
            int i15 = f54158u0;
            int i16 = i15 & 99;
            int i17 = ((i15 ^ 99) | i16) << 1;
            int i18 = -((i15 | 99) & (~i16));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f54157t0 = i19 % 128;
            int i20 = i19 % 2;
            bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{aymVar.f54159s0}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i21 = f54157t0;
            int i22 = i21 & 65;
            int i23 = i22 + ((i21 ^ 65) | i22);
            f54158u0 = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = 74 / 0;
            }
        } else {
            aym aymVar2 = (aym) objArr[0];
            int i25 = f54157t0;
            int i26 = ((i25 | 51) << 1) - (i25 ^ 51);
            f54158u0 = i26 % 128;
            int i27 = i26 % 2;
            bArr = (byte[]) setX(new Object[]{aymVar2}, -739625653, 739625653, System.identityHashCode(aymVar2));
            int i28 = f54158u0 + 101;
            f54157t0 = i28 % 128;
            if (i28 % 2 != 0) {
                int i29 = 96 / 0;
            }
        }
        return bArr;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setX(new Object[]{this}, 204982284, -204982283, System.identityHashCode(this));
    }
}
