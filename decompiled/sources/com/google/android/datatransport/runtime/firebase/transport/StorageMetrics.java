package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes9.dex */
public final class StorageMetrics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StorageMetrics f43791c = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43793b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f43794a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f43795b = 0;

        public StorageMetrics build() {
            return new StorageMetrics(this.f43794a, this.f43795b);
        }

        public Builder setCurrentCacheSizeBytes(long j10) {
            this.f43794a = j10;
            return this;
        }

        public Builder setMaxCacheSizeBytes(long j10) {
            this.f43795b = j10;
            return this;
        }
    }

    public StorageMetrics(long j10, long j11) {
        this.f43792a = j10;
        this.f43793b = j11;
    }

    public static StorageMetrics getDefaultInstance() {
        return f43791c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getCurrentCacheSizeBytes() {
        return this.f43792a;
    }

    @Protobuf(tag = 2)
    public long getMaxCacheSizeBytes() {
        return this.f43793b;
    }
}
