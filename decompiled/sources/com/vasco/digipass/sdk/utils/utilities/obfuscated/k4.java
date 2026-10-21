package com.vasco.digipass.sdk.utils.utilities.obfuscated;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k4 {
    public static int a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long b(byte[] bArr, int i10) {
        int iA = a(bArr, i10);
        return (((long) a(bArr, i10 + 4)) & 4294967295L) | ((((long) iA) & 4294967295L) << 32);
    }

    public static int c(byte[] bArr, int i10) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static void a(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public static void a(long j10, byte[] bArr, int i10) {
        a((int) (j10 >>> 32), bArr, i10);
        a((int) (j10 & 4294967295L), bArr, i10 + 4);
    }
}
