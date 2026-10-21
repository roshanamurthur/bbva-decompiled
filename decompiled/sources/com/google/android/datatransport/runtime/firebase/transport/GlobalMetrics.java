package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes9.dex */
public final class GlobalMetrics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final GlobalMetrics f43778b = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StorageMetrics f43779a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public StorageMetrics f43780a = null;

        public GlobalMetrics build() {
            return new GlobalMetrics(this.f43780a);
        }

        public Builder setStorageMetrics(StorageMetrics storageMetrics) {
            this.f43780a = storageMetrics;
            return this;
        }
    }

    public GlobalMetrics(StorageMetrics storageMetrics) {
        this.f43779a = storageMetrics;
    }

    public static GlobalMetrics getDefaultInstance() {
        return f43778b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public StorageMetrics getStorageMetrics() {
        StorageMetrics storageMetrics = this.f43779a;
        return storageMetrics == null ? StorageMetrics.getDefaultInstance() : storageMetrics;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    public StorageMetrics getStorageMetricsInternal() {
        return this.f43779a;
    }
}
