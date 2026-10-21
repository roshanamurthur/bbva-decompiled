package ph;

import android.content.SharedPreferences;
import com.instacart.library.truetime.CacheInterface;

/* JADX INFO: compiled from: SharedPreferenceCacheImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements CacheInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f92681a;

    @Override // com.instacart.library.truetime.CacheInterface
    public final void clear() {
        this.f92681a.edit().remove(CacheInterface.KEY_CACHED_BOOT_TIME).apply();
        this.f92681a.edit().remove(CacheInterface.KEY_CACHED_DEVICE_UPTIME).apply();
        this.f92681a.edit().remove(CacheInterface.KEY_CACHED_SNTP_TIME).apply();
    }

    @Override // com.instacart.library.truetime.CacheInterface
    public final long get(String str, long j10) {
        return this.f92681a.getLong(str, j10);
    }

    @Override // com.instacart.library.truetime.CacheInterface
    public final void put(String str, long j10) {
        this.f92681a.edit().putLong(str, j10).apply();
    }
}
