package com.instacart.library.truetime;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;
import java.util.Locale;
import ph.a;
import ph.b;
import ph.c;

/* JADX INFO: loaded from: classes10.dex */
public class TrueTime {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TrueTime f50711b = new TrueTime();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50712c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SntpClient f50713d = new SntpClient();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static float f50714e = 100.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static float f50715f = 100.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f50716g = 750;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f50717h = 30000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f50718a = "1.us.pool.ntp.org";

    public static synchronized void a() {
        SntpClient sntpClient = f50713d;
        if (sntpClient.f50710c.get()) {
            f50712c.a(sntpClient);
        }
    }

    public static TrueTime build() {
        return f50711b;
    }

    public static void clearCachedInfo() {
        CacheInterface cacheInterface = f50712c.f92680a;
        if (cacheInterface != null) {
            cacheInterface.clear();
        }
    }

    public static boolean isInitialized() {
        if (f50713d.f50710c.get()) {
            return true;
        }
        a aVar = f50712c;
        if (!aVar.b()) {
            if (aVar.f92680a.get(CacheInterface.KEY_CACHED_BOOT_TIME, 0L) != 0) {
                if (!(SystemClock.elapsedRealtime() < (aVar.b() ? 0L : aVar.f92680a.get(CacheInterface.KEY_CACHED_DEVICE_UPTIME, 0L)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Date now() {
        long j10;
        long j11;
        if (!isInitialized()) {
            throw new IllegalStateException("You need to call init() on TrueTime at least once.");
        }
        SntpClient sntpClient = f50713d;
        boolean z10 = sntpClient.f50710c.get();
        a aVar = f50712c;
        if (z10) {
            j10 = sntpClient.f50709b.get();
        } else {
            j10 = aVar.b() ? 0L : aVar.f92680a.get(CacheInterface.KEY_CACHED_SNTP_TIME, 0L);
        }
        if (j10 == 0) {
            throw new RuntimeException("expected SNTP time from last boot to be cached. couldn't find it.");
        }
        if (sntpClient.f50710c.get()) {
            j11 = sntpClient.f50708a.get();
        } else {
            j11 = aVar.b() ? 0L : aVar.f92680a.get(CacheInterface.KEY_CACHED_DEVICE_UPTIME, 0L);
        }
        if (j11 != 0) {
            return new Date((SystemClock.elapsedRealtime() - j11) + j10);
        }
        throw new RuntimeException("expected device time from last boot to be cached. couldn't find it.");
    }

    public void initialize() throws Exception {
        initialize(this.f50718a);
    }

    public synchronized TrueTime withConnectionTimeout(int i10) {
        f50717h = i10;
        return f50711b;
    }

    public synchronized TrueTime withCustomizedCache(CacheInterface cacheInterface) {
        f50712c.f92680a = cacheInterface;
        return f50711b;
    }

    public synchronized TrueTime withLoggingEnabled(boolean z10) {
        c.f92682a = z10;
        return f50711b;
    }

    public synchronized TrueTime withNtpHost(String str) {
        this.f50718a = str;
        return f50711b;
    }

    public synchronized TrueTime withRootDelayMax(float f6) {
        try {
            if (f6 > f50714e) {
                String str = String.format(Locale.getDefault(), "The recommended max rootDelay value is %f. You are setting it at %f", Float.valueOf(f50714e), Float.valueOf(f6));
                if (c.f92682a) {
                    Log.w("TrueTime", str);
                }
            }
            f50714e = f6;
        } catch (Throwable th2) {
            throw th2;
        }
        return f50711b;
    }

    public synchronized TrueTime withRootDispersionMax(float f6) {
        try {
            if (f6 > f50715f) {
                String str = String.format(Locale.getDefault(), "The recommended max rootDispersion value is %f. You are setting it at %f", Float.valueOf(f50715f), Float.valueOf(f6));
                if (c.f92682a) {
                    Log.w("TrueTime", str);
                }
            }
            f50715f = f6;
        } catch (Throwable th2) {
            throw th2;
        }
        return f50711b;
    }

    public synchronized TrueTime withServerResponseDelayMax(int i10) {
        f50716g = i10;
        return f50711b;
    }

    public synchronized TrueTime withSharedPreferencesCache(Context context) {
        a aVar = f50712c;
        b bVar = new b();
        bVar.f92681a = context.getSharedPreferences("com.instacart.library.truetime.shared_preferences", 0);
        aVar.f92680a = bVar;
        return f50711b;
    }

    public void initialize(String str) throws Exception {
        if (isInitialized()) {
            return;
        }
        SntpClient sntpClient = f50713d;
        float f6 = f50714e;
        float f10 = f50715f;
        int i10 = f50716g;
        int i11 = f50717h;
        synchronized (sntpClient) {
            DatagramSocket datagramSocket = null;
            try {
                try {
                    try {
                        byte[] bArr = new byte[48];
                        DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, InetAddress.getByName(str), 123);
                        bArr[0] = 27;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        SntpClient.c(jCurrentTimeMillis, bArr);
                        DatagramSocket datagramSocket2 = new DatagramSocket();
                        try {
                            datagramSocket2.setSoTimeout(i11);
                            datagramSocket2.send(datagramPacket);
                            long[] jArr = new long[8];
                            datagramSocket2.receive(new DatagramPacket(bArr, 48));
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            jArr[7] = jElapsedRealtime2;
                            long jB = SntpClient.b(24, bArr);
                            long jB2 = SntpClient.b(32, bArr);
                            long jB3 = SntpClient.b(40, bArr);
                            long j10 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                            jArr[0] = jB;
                            jArr[1] = jB2;
                            jArr[2] = jB3;
                            jArr[3] = j10;
                            long jA = SntpClient.a(4, bArr);
                            jArr[4] = jA;
                            double d2 = jA / 65.536d;
                            if (d2 > f6) {
                                throw new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_delay", (float) d2, f6);
                            }
                            long jA2 = SntpClient.a(8, bArr);
                            jArr[5] = jA2;
                            double d3 = jA2 / 65.536d;
                            if (d3 > f10) {
                                throw new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_dispersion", (float) d3, f10);
                            }
                            byte b10 = bArr[0];
                            byte b11 = (byte) (b10 & 7);
                            if (b11 != 4 && b11 != 5) {
                                throw new InvalidNtpServerResponseException("untrusted mode value for TrueTime: " + ((int) b11));
                            }
                            int i12 = bArr[1] & 255;
                            jArr[6] = i12;
                            if (i12 < 1 || i12 > 15) {
                                throw new InvalidNtpServerResponseException("untrusted stratum value for TrueTime: " + i12);
                            }
                            if (((byte) ((b10 >> 6) & 3)) == 3) {
                                throw new InvalidNtpServerResponseException("unsynchronized server responded for TrueTime");
                            }
                            double dAbs = Math.abs((j10 - jB) - (jB3 - jB2));
                            if (dAbs >= i10) {
                                throw new InvalidNtpServerResponseException("%s too large for comfort %f [actual] >= %f [expected]", "server_response_delay", (float) dAbs, i10);
                            }
                            long jAbs = Math.abs(jB - System.currentTimeMillis());
                            if (jAbs >= 10000) {
                                throw new InvalidNtpServerResponseException("Request was sent more than 10 seconds back " + jAbs);
                            }
                            sntpClient.f50710c.set(true);
                            sntpClient.f50709b.set(jArr[3] + SntpClient.getClockOffset(jArr));
                            sntpClient.f50708a.set(jArr[7]);
                            datagramSocket2.close();
                        } catch (Exception e5) {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            datagramSocket = datagramSocket2;
                            if (datagramSocket != null) {
                                datagramSocket.close();
                            }
                            throw th;
                        }
                    } catch (Exception e7) {
                        throw e7;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        a();
    }
}
