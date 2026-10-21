package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes9.dex */
public final class LogEventDropped {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LogEventDropped f43781c = new Builder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reason f43783b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f43784a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Reason f43785b = Reason.REASON_UNKNOWN;

        public LogEventDropped build() {
            return new LogEventDropped(this.f43784a, this.f43785b);
        }

        public Builder setEventsDroppedCount(long j10) {
            this.f43784a = j10;
            return this;
        }

        public Builder setReason(Reason reason) {
            this.f43785b = reason;
            return this;
        }
    }

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i10) {
            this.number_ = i10;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public LogEventDropped(long j10, Reason reason) {
        this.f43782a = j10;
        this.f43783b = reason;
    }

    public static LogEventDropped getDefaultInstance() {
        return f43781c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getEventsDroppedCount() {
        return this.f43782a;
    }

    @Protobuf(tag = 3)
    public Reason getReason() {
        return this.f43783b;
    }
}
