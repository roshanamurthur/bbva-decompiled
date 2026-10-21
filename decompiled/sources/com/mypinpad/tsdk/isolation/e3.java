package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class e3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55300b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55301c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f55302a;

    public e3(f3 f3Var, byte[][] bArr) {
        if (f3Var == null) {
            throw new NullPointerException("params == null");
        }
        if (((Boolean) bbi.setOnFocusChangeListener(new Object[]{bArr}, -1436239977, 1436239985, (int) System.currentTimeMillis())).booleanValue()) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != ((Integer) f3.a(new Object[]{f3Var}, -1054280030, 1054280030, System.identityHashCode(f3Var))).intValue()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        int i10 = 0;
        while (i10 < bArr.length) {
            if (bArr[i10].length != ((Integer) f3.a(new Object[]{f3Var}, 1362098093, -1362098092, System.identityHashCode(f3Var))).intValue()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
            int i11 = (-2) - ((i10 + 82) ^ (-1));
            int i12 = (i11 & 79) | ((~i11) & (-80));
            int i13 = (i11 & (-80)) << 1;
            i10 = (i13 | i12) + (i12 & i13);
        }
        this.f55302a = (byte[][]) bbi.setOnFocusChangeListener(new Object[]{bArr}, 9598254, -9598244, (int) System.currentTimeMillis());
    }
}
