package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DiskCacheStrategy {
    public static final DiskCacheStrategy ALL = new a();
    public static final DiskCacheStrategy NONE = new b();
    public static final DiskCacheStrategy DATA = new c();
    public static final DiskCacheStrategy RESOURCE = new d();
    public static final DiskCacheStrategy AUTOMATIC = new e();

    public class a extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedData() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedResource() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isDataCacheable(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isResourceCacheable(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    public class b extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedData() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedResource() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isDataCacheable(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isResourceCacheable(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class c extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedData() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedResource() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isDataCacheable(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isResourceCacheable(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class d extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedData() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedResource() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isDataCacheable(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isResourceCacheable(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    public class e extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedData() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean decodeCachedResource() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isDataCacheable(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        public final boolean isResourceCacheable(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z10 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean decodeCachedData();

    public abstract boolean decodeCachedResource();

    public abstract boolean isDataCacheable(DataSource dataSource);

    public abstract boolean isResourceCacheable(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy);
}
