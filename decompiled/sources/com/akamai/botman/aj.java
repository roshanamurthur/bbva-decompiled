package com.akamai.botman;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class aj {
    public static long a(long j10, int i10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i11 = (int) j10;
        int i12 = (int) (j10 >> 32);
        int i13 = 0;
        while (i13 < 16) {
            int i14 = i12 ^ (((i10 << i13) | (i10 >>> (32 - i13))) ^ i11);
            i13++;
            int i15 = i11;
            i11 = i14;
            i12 = i15;
        }
        long j11 = (((long) i12) << 32) | (((long) i11) & 4294967295L);
        ap.a("FeistelCipher", androidx.datastore.preferences.protobuf.e.f("FeistelCipherEncode-Time: ", SystemClock.uptimeMillis() - jUptimeMillis, "ms"), new Throwable[0]);
        return j11;
    }
}
