package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* JADX INFO: loaded from: classes10.dex */
public final class y extends CrashlyticsReport.Session.OperatingSystem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48266d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    public static final class a extends CrashlyticsReport.Session.OperatingSystem.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f48267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f48270d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem build() {
            String strF = this.f48267a == null ? " platform" : "";
            if (this.f48268b == null) {
                strF = strF.concat(" version");
            }
            if (this.f48269c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " buildVersion");
            }
            if (this.f48270d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " jailbroken");
            }
            if (strF.isEmpty()) {
                return new y(this.f48267a.intValue(), this.f48268b, this.f48269c, this.f48270d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f48269c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean z10) {
            this.f48270d = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int i10) {
            this.f48267a = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder setVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f48268b = str;
            return this;
        }
    }

    public y(int i10, String str, String str2, boolean z10) {
        this.f48263a = i10;
        this.f48264b = str;
        this.f48265c = str2;
        this.f48266d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
        return this.f48263a == operatingSystem.getPlatform() && this.f48264b.equals(operatingSystem.getVersion()) && this.f48265c.equals(operatingSystem.getBuildVersion()) && this.f48266d == operatingSystem.isJailbroken();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    @NonNull
    public final String getBuildVersion() {
        return this.f48265c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final int getPlatform() {
        return this.f48263a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    @NonNull
    public final String getVersion() {
        return this.f48264b;
    }

    public final int hashCode() {
        return ((((((this.f48263a ^ 1000003) * 1000003) ^ this.f48264b.hashCode()) * 1000003) ^ this.f48265c.hashCode()) * 1000003) ^ (this.f48266d ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final boolean isJailbroken() {
        return this.f48266d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f48263a);
        sb2.append(", version=");
        sb2.append(this.f48264b);
        sb2.append(", buildVersion=");
        sb2.append(this.f48265c);
        sb2.append(", jailbroken=");
        return androidx.appcompat.app.i.c(sb2, this.f48266d, "}");
    }
}
