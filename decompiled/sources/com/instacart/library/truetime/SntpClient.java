package com.instacart.library.truetime;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public class SntpClient {
    public static final int RESPONSE_INDEX_DISPERSION = 5;
    public static final int RESPONSE_INDEX_ORIGINATE_TIME = 0;
    public static final int RESPONSE_INDEX_RECEIVE_TIME = 1;
    public static final int RESPONSE_INDEX_RESPONSE_TICKS = 7;
    public static final int RESPONSE_INDEX_RESPONSE_TIME = 3;
    public static final int RESPONSE_INDEX_ROOT_DELAY = 4;
    public static final int RESPONSE_INDEX_SIZE = 8;
    public static final int RESPONSE_INDEX_STRATUM = 6;
    public static final int RESPONSE_INDEX_TRANSMIT_TIME = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f50708a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f50709b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f50710c = new AtomicBoolean(false);

    public static long a(int i10, byte[] bArr) {
        return (((long) (bArr[i10] & 255)) << 24) + (((long) (bArr[i10 + 1] & 255)) << 16) + (((long) (bArr[i10 + 2] & 255)) << 8) + ((long) (bArr[i10 + 3] & 255));
    }

    public static long b(int i10, byte[] bArr) {
        long jA = a(i10, bArr);
        return ((a(i10 + 4, bArr) * 1000) / SvgConstantsKt.SPECIFIED_SOLID_OPACITY) + ((jA - 2208988800L) * 1000);
    }

    public static void c(long j10, byte[] bArr) {
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        bArr[40] = (byte) (j13 >> 24);
        bArr[41] = (byte) (j13 >> 16);
        bArr[42] = (byte) (j13 >> 8);
        bArr[43] = (byte) j13;
        long j14 = (j12 * SvgConstantsKt.SPECIFIED_SOLID_OPACITY) / 1000;
        bArr[44] = (byte) (j14 >> 24);
        bArr[45] = (byte) (j14 >> 16);
        bArr[46] = (byte) (j14 >> 8);
        bArr[47] = (byte) (Math.random() * 255.0d);
    }

    public static long getClockOffset(long[] jArr) {
        return ((jArr[2] - jArr[3]) + (jArr[1] - jArr[0])) / 2;
    }

    public static long getRoundTripDelay(long[] jArr) {
        return (jArr[3] - jArr[0]) - (jArr[2] - jArr[1]);
    }
}
