package ph;

import android.util.Log;
import com.instacart.library.truetime.CacheInterface;
import com.instacart.library.truetime.SntpClient;

/* JADX INFO: compiled from: DiskCacheClient.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CacheInterface f92680a = null;

    public final void a(SntpClient sntpClient) {
        if (b()) {
            return;
        }
        long j10 = sntpClient.f50709b.get();
        long j11 = sntpClient.f50708a.get();
        long j12 = j10 - j11;
        String.format("Caching true time info to disk sntp [%s] device [%s] boot [%s]", Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12));
        this.f92680a.put(CacheInterface.KEY_CACHED_BOOT_TIME, j12);
        this.f92680a.put(CacheInterface.KEY_CACHED_DEVICE_UPTIME, j11);
        this.f92680a.put(CacheInterface.KEY_CACHED_SNTP_TIME, j10);
    }

    public final boolean b() {
        if (this.f92680a != null) {
            return false;
        }
        if (!c.f92682a) {
            return true;
        }
        Log.w("a", "Cannot use disk caching strategy for TrueTime. CacheInterface unavailable");
        return true;
    }
}
