package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.u;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_LogEvent.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends LogEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f43639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f43641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NetworkConnectionInfo f43644g;

    /* JADX INFO: compiled from: AutoValue_LogEvent.java */
    public static final class a extends LogEvent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f43645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f43646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f43647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f43648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f43649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f43650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public NetworkConnectionInfo f43651g;

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent build() {
            String strF = this.f43645a == null ? " eventTimeMs" : "";
            if (this.f43647c == null) {
                strF = strF.concat(" eventUptimeMs");
            }
            if (this.f43650f == null) {
                strF = u.f(strF, " timezoneOffsetSeconds");
            }
            if (strF.isEmpty()) {
                return new c(this.f43645a.longValue(), this.f43646b, this.f43647c.longValue(), this.f43648d, this.f43649e, this.f43650f.longValue(), this.f43651g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder setEventCode(@Nullable Integer num) {
            this.f43646b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder setEventTimeMs(long j10) {
            this.f43645a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder setEventUptimeMs(long j10) {
            this.f43647c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo) {
            this.f43651g = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder setTimezoneOffsetSeconds(long j10) {
            this.f43650f = Long.valueOf(j10);
            return this;
        }
    }

    public c(long j10, Integer num, long j11, byte[] bArr, String str, long j12, NetworkConnectionInfo networkConnectionInfo) {
        this.f43638a = j10;
        this.f43639b = num;
        this.f43640c = j11;
        this.f43641d = bArr;
        this.f43642e = str;
        this.f43643f = j12;
        this.f43644g = networkConnectionInfo;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f43638a == logEvent.getEventTimeMs() && ((num = this.f43639b) != null ? num.equals(logEvent.getEventCode()) : logEvent.getEventCode() == null) && this.f43640c == logEvent.getEventUptimeMs()) {
            if (Arrays.equals(this.f43641d, logEvent instanceof c ? ((c) logEvent).f43641d : logEvent.getSourceExtension()) && ((str = this.f43642e) != null ? str.equals(logEvent.getSourceExtensionJsonProto3()) : logEvent.getSourceExtensionJsonProto3() == null) && this.f43643f == logEvent.getTimezoneOffsetSeconds()) {
                NetworkConnectionInfo networkConnectionInfo = this.f43644g;
                if (networkConnectionInfo == null) {
                    if (logEvent.getNetworkConnectionInfo() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(logEvent.getNetworkConnectionInfo())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public final Integer getEventCode() {
        return this.f43639b;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long getEventTimeMs() {
        return this.f43638a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long getEventUptimeMs() {
        return this.f43640c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public final NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.f43644g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public final byte[] getSourceExtension() {
        return this.f43641d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public final String getSourceExtensionJsonProto3() {
        return this.f43642e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long getTimezoneOffsetSeconds() {
        return this.f43643f;
    }

    public final int hashCode() {
        long j10 = this.f43638a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f43639b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j11 = this.f43640c;
        int iHashCode2 = (((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f43641d)) * 1000003;
        String str = this.f43642e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f43643f;
        int i11 = (iHashCode3 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f43644g;
        return i11 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f43638a + ", eventCode=" + this.f43639b + ", eventUptimeMs=" + this.f43640c + ", sourceExtension=" + Arrays.toString(this.f43641d) + ", sourceExtensionJsonProto3=" + this.f43642e + ", timezoneOffsetSeconds=" + this.f43643f + ", networkConnectionInfo=" + this.f43644g + "}";
    }
}
