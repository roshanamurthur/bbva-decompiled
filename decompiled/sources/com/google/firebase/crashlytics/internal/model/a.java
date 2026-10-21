package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends CrashlyticsReport {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CrashlyticsReport.Session f48021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CrashlyticsReport.FilesPayload f48022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CrashlyticsReport.ApplicationExitInfo f48023l;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport.java */
    public static final class C0209a extends CrashlyticsReport.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f48026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f48027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f48028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f48029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f48030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f48031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CrashlyticsReport.Session f48032i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CrashlyticsReport.FilesPayload f48033j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CrashlyticsReport.ApplicationExitInfo f48034k;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport build() {
            String strF = this.f48024a == null ? " sdkVersion" : "";
            if (this.f48025b == null) {
                strF = strF.concat(" gmpAppId");
            }
            if (this.f48026c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " platform");
            }
            if (this.f48027d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " installationUuid");
            }
            if (this.f48030g == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " buildVersion");
            }
            if (this.f48031h == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " displayVersion");
            }
            if (strF.isEmpty()) {
                return new a(this.f48024a, this.f48025b, this.f48026c.intValue(), this.f48027d, this.f48028e, this.f48029f, this.f48030g, this.f48031h, this.f48032i, this.f48033j, this.f48034k);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f48034k = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setAppQualitySessionId(@Nullable String str) {
            this.f48029f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setBuildVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f48030g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setDisplayVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f48031h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setFirebaseInstallationId(@Nullable String str) {
            this.f48028e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setGmpAppId(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f48025b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setInstallationUuid(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f48027d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.f48033j = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setPlatform(int i10) {
            this.f48026c = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setSdkVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f48024a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session) {
            this.f48032i = session;
            return this;
        }
    }

    public a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.f48013b = str;
        this.f48014c = str2;
        this.f48015d = i10;
        this.f48016e = str3;
        this.f48017f = str4;
        this.f48018g = str5;
        this.f48019h = str6;
        this.f48020i = str7;
        this.f48021j = session;
        this.f48022k = filesPayload;
        this.f48023l = applicationExitInfo;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        CrashlyticsReport.Session session;
        CrashlyticsReport.FilesPayload filesPayload;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.f48013b.equals(crashlyticsReport.getSdkVersion()) && this.f48014c.equals(crashlyticsReport.getGmpAppId()) && this.f48015d == crashlyticsReport.getPlatform() && this.f48016e.equals(crashlyticsReport.getInstallationUuid()) && ((str = this.f48017f) != null ? str.equals(crashlyticsReport.getFirebaseInstallationId()) : crashlyticsReport.getFirebaseInstallationId() == null) && ((str2 = this.f48018g) != null ? str2.equals(crashlyticsReport.getAppQualitySessionId()) : crashlyticsReport.getAppQualitySessionId() == null) && this.f48019h.equals(crashlyticsReport.getBuildVersion()) && this.f48020i.equals(crashlyticsReport.getDisplayVersion()) && ((session = this.f48021j) != null ? session.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() == null) && ((filesPayload = this.f48022k) != null ? filesPayload.equals(crashlyticsReport.getNdkPayload()) : crashlyticsReport.getNdkPayload() == null)) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f48023l;
            if (applicationExitInfo == null) {
                if (crashlyticsReport.getAppExitInfo() == null) {
                    return true;
                }
            } else if (applicationExitInfo.equals(crashlyticsReport.getAppExitInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.f48023l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final String getAppQualitySessionId() {
        return this.f48018g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String getBuildVersion() {
        return this.f48019h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String getDisplayVersion() {
        return this.f48020i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final String getFirebaseInstallationId() {
        return this.f48017f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String getGmpAppId() {
        return this.f48014c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String getInstallationUuid() {
        return this.f48016e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.f48022k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int getPlatform() {
        return this.f48015d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @NonNull
    public final String getSdkVersion() {
        return this.f48013b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    @Nullable
    public final CrashlyticsReport.Session getSession() {
        return this.f48021j;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f48013b.hashCode() ^ 1000003) * 1000003) ^ this.f48014c.hashCode()) * 1000003) ^ this.f48015d) * 1000003) ^ this.f48016e.hashCode()) * 1000003;
        String str = this.f48017f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f48018g;
        int iHashCode3 = (((((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f48019h.hashCode()) * 1000003) ^ this.f48020i.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.f48021j;
        int iHashCode4 = (iHashCode3 ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.f48022k;
        int iHashCode5 = (iHashCode4 ^ (filesPayload == null ? 0 : filesPayload.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f48023l;
        return iHashCode5 ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Builder toBuilder() {
        C0209a c0209a = new C0209a();
        c0209a.f48024a = getSdkVersion();
        c0209a.f48025b = getGmpAppId();
        c0209a.f48026c = Integer.valueOf(getPlatform());
        c0209a.f48027d = getInstallationUuid();
        c0209a.f48028e = getFirebaseInstallationId();
        c0209a.f48029f = getAppQualitySessionId();
        c0209a.f48030g = getBuildVersion();
        c0209a.f48031h = getDisplayVersion();
        c0209a.f48032i = getSession();
        c0209a.f48033j = getNdkPayload();
        c0209a.f48034k = getAppExitInfo();
        return c0209a;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f48013b + ", gmpAppId=" + this.f48014c + ", platform=" + this.f48015d + ", installationUuid=" + this.f48016e + ", firebaseInstallationId=" + this.f48017f + ", appQualitySessionId=" + this.f48018g + ", buildVersion=" + this.f48019h + ", displayVersion=" + this.f48020i + ", session=" + this.f48021j + ", ndkPayload=" + this.f48022k + ", appExitInfo=" + this.f48023l + "}";
    }
}
