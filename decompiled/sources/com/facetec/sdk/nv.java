package com.facetec.sdk;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public final class nv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f42731c = Charset.forName("UTF-8");

    public static short a(short s4) {
        return (short) (((s4 & 255) << 8) | (((65535 & s4) >>> 8) & 255));
    }

    public static int d(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12)));
        }
    }

    public static boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static void b(Throwable th2) throws Throwable {
        throw th2;
    }
}
