package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class ExternalCacheDiskCacheFactory extends DiskLruCacheFactory {

    public class a implements DiskLruCacheFactory.CacheDirectoryGetter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38294b;

        public a(Context context, String str) {
            this.f38293a = context;
            this.f38294b = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public final File getCacheDirectory() {
            File externalCacheDir = this.f38293a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            String str = this.f38294b;
            return str != null ? new File(externalCacheDir, str) : externalCacheDir;
        }
    }

    public ExternalCacheDiskCacheFactory(Context context) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, DiskCache.Factory.DEFAULT_DISK_CACHE_SIZE);
    }

    public ExternalCacheDiskCacheFactory(Context context, int i10) {
        this(context, DiskCache.Factory.DEFAULT_DISK_CACHE_DIR, i10);
    }

    public ExternalCacheDiskCacheFactory(Context context, String str, int i10) {
        super(new a(context, str), i10);
    }
}
