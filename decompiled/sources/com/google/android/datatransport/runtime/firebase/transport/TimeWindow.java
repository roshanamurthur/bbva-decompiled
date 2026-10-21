package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes9.dex */
public final class TimeWindow {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeWindow f43796c = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43798b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f43799a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f43800b = 0;

        public TimeWindow build() {
            return new TimeWindow(this.f43799a, this.f43800b);
        }

        public Builder setEndMs(long j10) {
            this.f43800b = j10;
            return this;
        }

        public Builder setStartMs(long j10) {
            this.f43799a = j10;
            return this;
        }
    }

    public TimeWindow(long j10, long j11) {
        this.f43797a = j10;
        this.f43798b = j11;
    }

    public static TimeWindow getDefaultInstance() {
        return f43796c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    public long getEndMs() {
        return this.f43798b;
    }

    @Protobuf(tag = 1)
    public long getStartMs() {
        return this.f43797a;
    }
}
