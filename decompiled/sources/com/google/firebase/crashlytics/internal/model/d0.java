package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_OsData.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends StaticSessionData.OsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48083c;

    public d0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f48081a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f48082b = str2;
        this.f48083c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.OsData)) {
            return false;
        }
        StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
        return this.f48081a.equals(osData.osRelease()) && this.f48082b.equals(osData.osCodeName()) && this.f48083c == osData.isRooted();
    }

    public final int hashCode() {
        return ((((this.f48081a.hashCode() ^ 1000003) * 1000003) ^ this.f48082b.hashCode()) * 1000003) ^ (this.f48083c ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public final boolean isRooted() {
        return this.f48083c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public final String osCodeName() {
        return this.f48082b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public final String osRelease() {
        return this.f48081a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OsData{osRelease=");
        sb2.append(this.f48081a);
        sb2.append(", osCodeName=");
        sb2.append(this.f48082b);
        sb2.append(", isRooted=");
        return androidx.appcompat.app.i.c(sb2, this.f48083c, "}");
    }
}
