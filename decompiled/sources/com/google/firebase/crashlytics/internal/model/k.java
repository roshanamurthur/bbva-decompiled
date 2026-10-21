package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends CrashlyticsReport.Session.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application f48152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Device f48153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Log f48154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.RolloutsState f48155f;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    public static final class a extends CrashlyticsReport.Session.Event.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f48156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application f48158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Device f48159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Log f48160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.RolloutsState f48161f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event build() {
            String strF = this.f48156a == null ? " timestamp" : "";
            if (this.f48157b == null) {
                strF = strF.concat(" type");
            }
            if (this.f48158c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " app");
            }
            if (this.f48159d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " device");
            }
            if (strF.isEmpty()) {
                return new k(this.f48156a.longValue(), this.f48157b, this.f48158c, this.f48159d, this.f48160e, this.f48161f);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setApp(CrashlyticsReport.Session.Event.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.f48158c = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setDevice(CrashlyticsReport.Session.Event.Device device) {
            if (device == null) {
                throw new NullPointerException("Null device");
            }
            this.f48159d = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setLog(CrashlyticsReport.Session.Event.Log log) {
            this.f48160e = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setRollouts(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.f48161f = rolloutsState;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setTimestamp(long j10) {
            this.f48156a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setType(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f48157b = str;
            return this;
        }
    }

    public k(long j10, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, CrashlyticsReport.Session.Event.Log log, CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.f48150a = j10;
        this.f48151b = str;
        this.f48152c = application;
        this.f48153d = device;
        this.f48154e = log;
        this.f48155f = rolloutsState;
    }

    public final boolean equals(Object obj) {
        CrashlyticsReport.Session.Event.Log log;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.f48150a == event.getTimestamp() && this.f48151b.equals(event.getType()) && this.f48152c.equals(event.getApp()) && this.f48153d.equals(event.getDevice()) && ((log = this.f48154e) != null ? log.equals(event.getLog()) : event.getLog() == null)) {
            CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f48155f;
            if (rolloutsState == null) {
                if (event.getRollouts() == null) {
                    return true;
                }
            } else if (rolloutsState.equals(event.getRollouts())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @NonNull
    public final CrashlyticsReport.Session.Event.Application getApp() {
        return this.f48152c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @NonNull
    public final CrashlyticsReport.Session.Event.Device getDevice() {
        return this.f48153d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @Nullable
    public final CrashlyticsReport.Session.Event.Log getLog() {
        return this.f48154e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @Nullable
    public final CrashlyticsReport.Session.Event.RolloutsState getRollouts() {
        return this.f48155f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final long getTimestamp() {
        return this.f48150a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    @NonNull
    public final String getType() {
        return this.f48151b;
    }

    public final int hashCode() {
        long j10 = this.f48150a;
        int iHashCode = (((((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f48151b.hashCode()) * 1000003) ^ this.f48152c.hashCode()) * 1000003) ^ this.f48153d.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log = this.f48154e;
        int iHashCode2 = (iHashCode ^ (log == null ? 0 : log.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f48155f;
        return iHashCode2 ^ (rolloutsState != null ? rolloutsState.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Builder toBuilder() {
        a aVar = new a();
        aVar.f48156a = Long.valueOf(getTimestamp());
        aVar.f48157b = getType();
        aVar.f48158c = getApp();
        aVar.f48159d = getDevice();
        aVar.f48160e = getLog();
        aVar.f48161f = getRollouts();
        return aVar;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f48150a + ", type=" + this.f48151b + ", app=" + this.f48152c + ", device=" + this.f48153d + ", log=" + this.f48154e + ", rollouts=" + this.f48155f + "}";
    }
}
