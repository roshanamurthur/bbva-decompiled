package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ays extends ayt {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54171t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54172u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54173s0;

    public ays(ayu ayuVar, byte[] bArr) {
        super(true, ayuVar);
        this.f54173s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        ays aysVar = (ays) objArr[0];
        int i13 = f54171t0;
        int i14 = (i13 & (-104)) | ((~i13) & 103);
        int i15 = -(-((i13 & 103) << 1));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f54172u0 = i16 % 128;
        int i17 = i16 % 2;
        byte[] bArr2 = aysVar.f54173s0;
        if (i17 == 0) {
            bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i18 = 3 / 0;
        } else {
            bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        }
        int i19 = f54172u0 + 90;
        int i20 = (i19 ^ (-1)) + (i19 << 1);
        f54171t0 = i20 % 128;
        if (i20 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1890867872, 1890867872, System.identityHashCode(this));
    }
}
