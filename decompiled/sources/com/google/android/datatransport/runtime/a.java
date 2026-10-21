package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.u;
import java.util.Map;

/* JADX INFO: compiled from: AutoValue_EventInternal.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends EventInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f43706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EncodedPayload f43707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f43709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f43710f;

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_EventInternal.java */
    public static final class C0195a extends EventInternal.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f43712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EncodedPayload f43713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f43714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f43715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map<String, String> f43716f;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal build() {
            String strF = this.f43711a == null ? " transportName" : "";
            if (this.f43713c == null) {
                strF = strF.concat(" encodedPayload");
            }
            if (this.f43714d == null) {
                strF = u.f(strF, " eventMillis");
            }
            if (this.f43715e == null) {
                strF = u.f(strF, " uptimeMillis");
            }
            if (this.f43716f == null) {
                strF = u.f(strF, " autoMetadata");
            }
            if (strF.isEmpty()) {
                return new a(this.f43711a, this.f43712b, this.f43713c, this.f43714d.longValue(), this.f43715e.longValue(), this.f43716f);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final Map<String, String> getAutoMetadata() {
            Map<String, String> map = this.f43716f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder setAutoMetadata(Map<String, String> map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f43716f = map;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder setCode(Integer num) {
            this.f43712b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload) {
            if (encodedPayload == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f43713c = encodedPayload;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder setEventMillis(long j10) {
            this.f43714d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder setTransportName(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f43711a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public final EventInternal.Builder setUptimeMillis(long j10) {
            this.f43715e = Long.valueOf(j10);
            return this;
        }
    }

    public a(String str, Integer num, EncodedPayload encodedPayload, long j10, long j11, Map map) {
        this.f43705a = str;
        this.f43706b = num;
        this.f43707c = encodedPayload;
        this.f43708d = j10;
        this.f43709e = j11;
        this.f43710f = map;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        return this.f43705a.equals(eventInternal.getTransportName()) && ((num = this.f43706b) != null ? num.equals(eventInternal.getCode()) : eventInternal.getCode() == null) && this.f43707c.equals(eventInternal.getEncodedPayload()) && this.f43708d == eventInternal.getEventMillis() && this.f43709e == eventInternal.getUptimeMillis() && this.f43710f.equals(eventInternal.getAutoMetadata());
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final Map<String, String> getAutoMetadata() {
        return this.f43710f;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public final Integer getCode() {
        return this.f43706b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final EncodedPayload getEncodedPayload() {
        return this.f43707c;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long getEventMillis() {
        return this.f43708d;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final String getTransportName() {
        return this.f43705a;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public final long getUptimeMillis() {
        return this.f43709e;
    }

    public final int hashCode() {
        int iHashCode = (this.f43705a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f43706b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f43707c.hashCode()) * 1000003;
        long j10 = this.f43708d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f43709e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f43710f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f43705a + ", code=" + this.f43706b + ", encodedPayload=" + this.f43707c + ", eventMillis=" + this.f43708d + ", uptimeMillis=" + this.f43709e + ", autoMetadata=" + this.f43710f + "}";
    }
}
