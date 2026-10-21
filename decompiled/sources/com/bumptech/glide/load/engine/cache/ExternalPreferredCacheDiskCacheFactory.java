package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public final class ExternalPreferredCacheDiskCacheFactory extends DiskLruCacheFactory {

    public class a implements DiskLruCacheFactory.CacheDirectoryGetter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38296b;

        public a(Context context, String str) {
            this.f38295a = context;
            this.f38296b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public final File getCacheDirectory() {
            File externalCacheDir;
            Context context = this.f38295a;
            File cacheDir = context.getCacheDir();
            String str = this.f38296b;
            if (cacheDir == null) {
                cacheDir = null;
            } else if (str != null) {
                cacheDir = new File(cacheDir, str);
            }
            if ((cacheDir == null || !cacheDir.exists()) && (externalCacheDir = context.getExternalCacheDir()) != null && externalCacheDir.canWrite()) {
                return str != null ? new File(externalCacheDir, str) : externalCacheDir;
            }
            return cacheDir;
        }
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context, long j10) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, j10);
    }

    public ExternalPreferredCacheDiskCacheFactory(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
