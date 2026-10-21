package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: AutoValue_StaticSessionData.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends StaticSessionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StaticSessionData.AppData f48035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StaticSessionData.OsData f48036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StaticSessionData.DeviceData f48037c;

    public a0(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        if (appData == null) {
            throw new NullPointerException("Null appData");
        }
        this.f48035a = appData;
        if (osData == null) {
            throw new NullPointerException("Null osData");
        }
        this.f48036b = osData;
        if (deviceData == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f48037c = deviceData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.AppData appData() {
        return this.f48035a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.DeviceData deviceData() {
        return this.f48037c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        return this.f48035a.equals(staticSessionData.appData()) && this.f48036b.equals(staticSessionData.osData()) && this.f48037c.equals(staticSessionData.deviceData());
    }

    public final int hashCode() {
        return ((((this.f48035a.hashCode() ^ 1000003) * 1000003) ^ this.f48036b.hashCode()) * 1000003) ^ this.f48037c.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.OsData osData() {
        return this.f48036b;
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f48035a + ", osData=" + this.f48036b + ", deviceData=" + this.f48037c + "}";
    }
}
