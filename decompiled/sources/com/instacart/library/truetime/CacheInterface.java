package com.instacart.library.truetime;

/* JADX INFO: loaded from: classes10.dex */
public interface CacheInterface {
    public static final String KEY_CACHED_BOOT_TIME = "com.instacart.library.truetime.cached_boot_time";
    public static final String KEY_CACHED_DEVICE_UPTIME = "com.instacart.library.truetime.cached_device_uptime";
    public static final String KEY_CACHED_SNTP_TIME = "com.instacart.library.truetime.cached_sntp_time";

    void clear();

    long get(String str, long j10);

    void put(String str, long j10);
}
