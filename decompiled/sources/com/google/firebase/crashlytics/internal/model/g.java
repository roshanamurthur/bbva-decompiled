package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends CrashlyticsReport.Session {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f48096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CrashlyticsReport.Session.Application f48098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CrashlyticsReport.Session.User f48099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CrashlyticsReport.Session.OperatingSystem f48100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CrashlyticsReport.Session.Device f48101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<CrashlyticsReport.Session.Event> f48102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f48103l;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session.java */
    public static final class a extends CrashlyticsReport.Session.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48106c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f48107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f48108e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f48109f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CrashlyticsReport.Session.Application f48110g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CrashlyticsReport.Session.User f48111h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CrashlyticsReport.Session.OperatingSystem f48112i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CrashlyticsReport.Session.Device f48113j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<CrashlyticsReport.Session.Event> f48114k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Integer f48115l;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session build() {
            String strF = this.f48104a == null ? " generator" : "";
            if (this.f48105b == null) {
                strF = strF.concat(" identifier");
            }
            if (this.f48107d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " startedAt");
            }
            if (this.f48109f == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " crashed");
            }
            if (this.f48110g == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " app");
            }
            if (this.f48115l == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " generatorType");
            }
            if (strF.isEmpty()) {
                return new g(this.f48104a, this.f48105b, this.f48106c, this.f48107d.longValue(), this.f48108e, this.f48109f.booleanValue(), this.f48110g, this.f48111h, this.f48112i, this.f48113j, this.f48114k, this.f48115l.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.f48110g = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setAppQualitySessionId(@Nullable String str) {
            this.f48106c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setCrashed(boolean z10) {
            this.f48109f = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device) {
            this.f48113j = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setEndedAt(Long l6) {
            this.f48108e = l6;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setEvents(List<CrashlyticsReport.Session.Event> list) {
            this.f48114k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setGenerator(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f48104a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setGeneratorType(int i10) {
            this.f48115l = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f48105b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f48112i = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setStartedAt(long j10) {
            this.f48107d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user) {
            this.f48111h = user;
            return this;
        }
    }

    public g() {
        throw null;
    }

    public g(String str, String str2, String str3, long j10, Long l6, boolean z10, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, List list, int i10) {
        this.f48092a = str;
        this.f48093b = str2;
        this.f48094c = str3;
        this.f48095d = j10;
        this.f48096e = l6;
        this.f48097f = z10;
        this.f48098g = application;
        this.f48099h = user;
        this.f48100i = operatingSystem;
        this.f48101j = device;
        this.f48102k = list;
        this.f48103l = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l6;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        List<CrashlyticsReport.Session.Event> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        return this.f48092a.equals(session.getGenerator()) && this.f48093b.equals(session.getIdentifier()) && ((str = this.f48094c) != null ? str.equals(session.getAppQualitySessionId()) : session.getAppQualitySessionId() == null) && this.f48095d == session.getStartedAt() && ((l6 = this.f48096e) != null ? l6.equals(session.getEndedAt()) : session.getEndedAt() == null) && this.f48097f == session.isCrashed() && this.f48098g.equals(session.getApp()) && ((user = this.f48099h) != null ? user.equals(session.getUser()) : session.getUser() == null) && ((operatingSystem = this.f48100i) != null ? operatingSystem.equals(session.getOs()) : session.getOs() == null) && ((device = this.f48101j) != null ? device.equals(session.getDevice()) : session.getDevice() == null) && ((list = this.f48102k) != null ? list.equals(session.getEvents()) : session.getEvents() == null) && this.f48103l == session.getGeneratorType();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @NonNull
    public final CrashlyticsReport.Session.Application getApp() {
        return this.f48098g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public final String getAppQualitySessionId() {
        return this.f48094c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public final CrashlyticsReport.Session.Device getDevice() {
        return this.f48101j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public final Long getEndedAt() {
        return this.f48096e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public final List<CrashlyticsReport.Session.Event> getEvents() {
        return this.f48102k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @NonNull
    public final String getGenerator() {
        return this.f48092a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final int getGeneratorType() {
        return this.f48103l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @NonNull
    @Encodable.Ignore
    public final String getIdentifier() {
        return this.f48093b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public final CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.f48100i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final long getStartedAt() {
        return this.f48095d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Nullable
    public final CrashlyticsReport.Session.User getUser() {
        return this.f48099h;
    }

    public final int hashCode() {
        int iHashCode = (((this.f48092a.hashCode() ^ 1000003) * 1000003) ^ this.f48093b.hashCode()) * 1000003;
        String str = this.f48094c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f48095d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        Long l6 = this.f48096e;
        int iHashCode3 = (((((i10 ^ (l6 == null ? 0 : l6.hashCode())) * 1000003) ^ (this.f48097f ? 1231 : 1237)) * 1000003) ^ this.f48098g.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.f48099h;
        int iHashCode4 = (iHashCode3 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f48100i;
        int iHashCode5 = (iHashCode4 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.f48101j;
        int iHashCode6 = (iHashCode5 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        List<CrashlyticsReport.Session.Event> list = this.f48102k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f48103l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final boolean isCrashed() {
        return this.f48097f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Builder toBuilder() {
        a aVar = new a();
        aVar.f48104a = getGenerator();
        aVar.f48105b = getIdentifier();
        aVar.f48106c = getAppQualitySessionId();
        aVar.f48107d = Long.valueOf(getStartedAt());
        aVar.f48108e = getEndedAt();
        aVar.f48109f = Boolean.valueOf(isCrashed());
        aVar.f48110g = getApp();
        aVar.f48111h = getUser();
        aVar.f48112i = getOs();
        aVar.f48113j = getDevice();
        aVar.f48114k = getEvents();
        aVar.f48115l = Integer.valueOf(getGeneratorType());
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f48092a);
        sb2.append(", identifier=");
        sb2.append(this.f48093b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f48094c);
        sb2.append(", startedAt=");
        sb2.append(this.f48095d);
        sb2.append(", endedAt=");
        sb2.append(this.f48096e);
        sb2.append(", crashed=");
        sb2.append(this.f48097f);
        sb2.append(", app=");
        sb2.append(this.f48098g);
        sb2.append(", user=");
        sb2.append(this.f48099h);
        sb2.append(", os=");
        sb2.append(this.f48100i);
        sb2.append(", device=");
        sb2.append(this.f48101j);
        sb2.append(", events=");
        sb2.append(this.f48102k);
        sb2.append(", generatorType=");
        return androidx.appcompat.widget.a.c(sb2, this.f48103l, "}");
    }
}
