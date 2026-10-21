package com.bumptech.glide.load.engine.cache;

import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public class DiskLruCacheFactory implements DiskCache.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheDirectoryGetter f38283b;

    public interface CacheDirectoryGetter {
        File getCacheDirectory();
    }

    public class a implements CacheDirectoryGetter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38284a;

        public a(String str) {
            this.f38284a = str;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public final File getCacheDirectory() {
            return new File(this.f38284a);
        }
    }

    public class b implements CacheDirectoryGetter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38286b;

        public b(String str, String str2) {
            this.f38285a = str;
            this.f38286b = str2;
        }

        @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
        public final File getCacheDirectory() {
            return new File(this.f38285a, this.f38286b);
        }
    }

    public DiskLruCacheFactory(String str, long j10) {
        this(new a(str), j10);
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
    public DiskCache build() {
        File cacheDirectory = this.f38283b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.isDirectory() || cacheDirectory.mkdirs()) {
            return DiskLruCacheWrapper.create(cacheDirectory, this.f38282a);
        }
        return null;
    }

    public DiskLruCacheFactory(String str, String str2, long j10) {
        this(new b(str, str2), j10);
    }

    public DiskLruCacheFactory(CacheDirectoryGetter cacheDirectoryGetter, long j10) {
        this.f38282a = j10;
        this.f38283b = cacheDirectoryGetter;
    }
}
