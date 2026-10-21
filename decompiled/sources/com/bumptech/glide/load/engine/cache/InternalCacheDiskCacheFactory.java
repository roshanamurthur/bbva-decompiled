package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public final class InternalCacheDiskCacheFactory extends DiskLruCacheFactory {

    public class a implements DiskLruCacheFactory.CacheDirectoryGetter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38298b;

        public a(Context context, String str) {
            this.f38297a = context;
            this.f38298b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public final File getCacheDirectory() {
            File cacheDir = this.f38297a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            String str = this.f38298b;
            return str != null ? new File(cacheDir, str) : cacheDir;
        }
    }

    public InternalCacheDiskCacheFactory(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public InternalCacheDiskCacheFactory(Context context, long j10) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, j10);
    }

    public InternalCacheDiskCacheFactory(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
