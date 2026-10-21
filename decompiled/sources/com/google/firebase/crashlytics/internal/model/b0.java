package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_AppData.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends StaticSessionData.AppData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DevelopmentPlatformProvider f48061f;

    public b0(String str, String str2, String str3, String str4, int i10, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f48056a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f48057b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f48058c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f48059d = str4;
        this.f48060e = i10;
        if (developmentPlatformProvider == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f48061f = developmentPlatformProvider;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String appIdentifier() {
        return this.f48056a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final int deliveryMechanism() {
        return this.f48060e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.f48061f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        return this.f48056a.equals(appData.appIdentifier()) && this.f48057b.equals(appData.versionCode()) && this.f48058c.equals(appData.versionName()) && this.f48059d.equals(appData.installUuid()) && this.f48060e == appData.deliveryMechanism() && this.f48061f.equals(appData.developmentPlatformProvider());
    }

    public final int hashCode() {
        return ((((((((((this.f48056a.hashCode() ^ 1000003) * 1000003) ^ this.f48057b.hashCode()) * 1000003) ^ this.f48058c.hashCode()) * 1000003) ^ this.f48059d.hashCode()) * 1000003) ^ this.f48060e) * 1000003) ^ this.f48061f.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String installUuid() {
        return this.f48059d;
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f48056a + ", versionCode=" + this.f48057b + ", versionName=" + this.f48058c + ", installUuid=" + this.f48059d + ", deliveryMechanism=" + this.f48060e + ", developmentPlatformProvider=" + this.f48061f + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String versionCode() {
        return this.f48057b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String versionName() {
        return this.f48058c;
    }
}
