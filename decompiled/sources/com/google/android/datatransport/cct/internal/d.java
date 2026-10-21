package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_LogRequest.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends LogRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClientInfo f43654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f43655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<LogEvent> f43657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final QosTier f43658g;

    /* JADX INFO: compiled from: AutoValue_LogRequest.java */
    public static final class a extends LogRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f43659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f43660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ClientInfo f43661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f43662d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f43663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<LogEvent> f43664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public QosTier f43665g;

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final a a(@Nullable Integer num) {
            this.f43662d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final a b(@Nullable String str) {
            this.f43663e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest build() {
            String strConcat = this.f43659a == null ? " requestTimeMs" : "";
            if (this.f43660b == null) {
                strConcat = strConcat.concat(" requestUptimeMs");
            }
            if (strConcat.isEmpty()) {
                return new d(this.f43659a.longValue(), this.f43660b.longValue(), this.f43661c, this.f43662d, this.f43663e, this.f43664f, this.f43665g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder setClientInfo(@Nullable ClientInfo clientInfo) {
            this.f43661c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder setLogEvents(@Nullable List<LogEvent> list) {
            this.f43664f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder setQosTier(@Nullable QosTier qosTier) {
            this.f43665g = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder setRequestTimeMs(long j10) {
            this.f43659a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder setRequestUptimeMs(long j10) {
            this.f43660b = Long.valueOf(j10);
            return this;
        }
    }

    public d() {
        throw null;
    }

    public d(long j10, long j11, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f43652a = j10;
        this.f43653b = j11;
        this.f43654c = clientInfo;
        this.f43655d = num;
        this.f43656e = str;
        this.f43657f = list;
        this.f43658g = qosTier;
    }

    public final boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<LogEvent> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f43652a == logRequest.getRequestTimeMs() && this.f43653b == logRequest.getRequestUptimeMs() && ((clientInfo = this.f43654c) != null ? clientInfo.equals(logRequest.getClientInfo()) : logRequest.getClientInfo() == null) && ((num = this.f43655d) != null ? num.equals(logRequest.getLogSource()) : logRequest.getLogSource() == null) && ((str = this.f43656e) != null ? str.equals(logRequest.getLogSourceName()) : logRequest.getLogSourceName() == null) && ((list = this.f43657f) != null ? list.equals(logRequest.getLogEvents()) : logRequest.getLogEvents() == null)) {
            QosTier qosTier = this.f43658g;
            if (qosTier == null) {
                if (logRequest.getQosTier() == null) {
                    return true;
                }
            } else if (qosTier.equals(logRequest.getQosTier())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public final ClientInfo getClientInfo() {
        return this.f43654c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    @Encodable.Field(name = "logEvent")
    public final List<LogEvent> getLogEvents() {
        return this.f43657f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public final Integer getLogSource() {
        return this.f43655d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public final String getLogSourceName() {
        return this.f43656e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public final QosTier getQosTier() {
        return this.f43658g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long getRequestTimeMs() {
        return this.f43652a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long getRequestUptimeMs() {
        return this.f43653b;
    }

    public final int hashCode() {
        long j10 = this.f43652a;
        long j11 = this.f43653b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        ClientInfo clientInfo = this.f43654c;
        int iHashCode = (i10 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f43655d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f43656e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<LogEvent> list = this.f43657f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f43658g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f43652a + ", requestUptimeMs=" + this.f43653b + ", clientInfo=" + this.f43654c + ", logSource=" + this.f43655d + ", logSourceName=" + this.f43656e + ", logEvents=" + this.f43657f + ", qosTier=" + this.f43658g + "}";
    }
}
