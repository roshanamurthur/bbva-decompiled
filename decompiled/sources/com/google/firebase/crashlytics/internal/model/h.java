package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends CrashlyticsReport.Session.Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.Session.Application.Organization f48119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f48121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48122g;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    public static final class a extends CrashlyticsReport.Session.Application.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.Session.Application.Organization f48126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f48127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f48128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f48129g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application build() {
            String strConcat = this.f48123a == null ? " identifier" : "";
            if (this.f48124b == null) {
                strConcat = strConcat.concat(" version");
            }
            if (strConcat.isEmpty()) {
                return new h(this.f48123a, this.f48124b, this.f48125c, this.f48126d, this.f48127e, this.f48128f, this.f48129g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(@Nullable String str) {
            this.f48128f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(@Nullable String str) {
            this.f48129g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setDisplayVersion(String str) {
            this.f48125c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f48123a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setInstallationUuid(String str) {
            this.f48127e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setOrganization(CrashlyticsReport.Session.Application.Organization organization) {
            this.f48126d = organization;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f48124b = str;
            return this;
        }
    }

    public h(String str, String str2, String str3, CrashlyticsReport.Session.Application.Organization organization, String str4, String str5, String str6) {
        this.f48116a = str;
        this.f48117b = str2;
        this.f48118c = str3;
        this.f48119d = organization;
        this.f48120e = str4;
        this.f48121f = str5;
        this.f48122g = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (this.f48116a.equals(application.getIdentifier()) && this.f48117b.equals(application.getVersion()) && ((str = this.f48118c) != null ? str.equals(application.getDisplayVersion()) : application.getDisplayVersion() == null) && ((organization = this.f48119d) != null ? organization.equals(application.getOrganization()) : application.getOrganization() == null) && ((str2 = this.f48120e) != null ? str2.equals(application.getInstallationUuid()) : application.getInstallationUuid() == null) && ((str3 = this.f48121f) != null ? str3.equals(application.getDevelopmentPlatform()) : application.getDevelopmentPlatform() == null)) {
            String str4 = this.f48122g;
            if (str4 == null) {
                if (application.getDevelopmentPlatformVersion() == null) {
                    return true;
                }
            } else if (str4.equals(application.getDevelopmentPlatformVersion())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public final String getDevelopmentPlatform() {
        return this.f48121f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public final String getDevelopmentPlatformVersion() {
        return this.f48122g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public final String getDisplayVersion() {
        return this.f48118c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @NonNull
    public final String getIdentifier() {
        return this.f48116a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public final String getInstallationUuid() {
        return this.f48120e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @Nullable
    public final CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.f48119d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    @NonNull
    public final String getVersion() {
        return this.f48117b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f48116a.hashCode() ^ 1000003) * 1000003) ^ this.f48117b.hashCode()) * 1000003;
        String str = this.f48118c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.Session.Application.Organization organization = this.f48119d;
        int iHashCode3 = (iHashCode2 ^ (organization == null ? 0 : organization.hashCode())) * 1000003;
        String str2 = this.f48120e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f48121f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f48122g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final CrashlyticsReport.Session.Application.Builder toBuilder() {
        a aVar = new a();
        aVar.f48123a = getIdentifier();
        aVar.f48124b = getVersion();
        aVar.f48125c = getDisplayVersion();
        aVar.f48126d = getOrganization();
        aVar.f48127e = getInstallationUuid();
        aVar.f48128f = getDevelopmentPlatform();
        aVar.f48129g = getDevelopmentPlatformVersion();
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f48116a);
        sb2.append(", version=");
        sb2.append(this.f48117b);
        sb2.append(", displayVersion=");
        sb2.append(this.f48118c);
        sb2.append(", organization=");
        sb2.append(this.f48119d);
        sb2.append(", installationUuid=");
        sb2.append(this.f48120e);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f48121f);
        sb2.append(", developmentPlatformVersion=");
        return ad.d.f(sb2, this.f48122g, "}");
    }
}
