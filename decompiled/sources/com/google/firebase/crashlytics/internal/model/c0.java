package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends StaticSessionData.DeviceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48076i;

    public c0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f48068a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f48069b = str;
        this.f48070c = i11;
        this.f48071d = j10;
        this.f48072e = j11;
        this.f48073f = z10;
        this.f48074g = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f48075h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f48076i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int arch() {
        return this.f48068a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int availableProcessors() {
        return this.f48070c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final long diskSpace() {
        return this.f48072e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.DeviceData)) {
            return false;
        }
        StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
        return this.f48068a == deviceData.arch() && this.f48069b.equals(deviceData.model()) && this.f48070c == deviceData.availableProcessors() && this.f48071d == deviceData.totalRam() && this.f48072e == deviceData.diskSpace() && this.f48073f == deviceData.isEmulator() && this.f48074g == deviceData.state() && this.f48075h.equals(deviceData.manufacturer()) && this.f48076i.equals(deviceData.modelClass());
    }

    public final int hashCode() {
        int iHashCode = (((((this.f48068a ^ 1000003) * 1000003) ^ this.f48069b.hashCode()) * 1000003) ^ this.f48070c) * 1000003;
        long j10 = this.f48071d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f48072e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f48073f ? 1231 : 1237)) * 1000003) ^ this.f48074g) * 1000003) ^ this.f48075h.hashCode()) * 1000003) ^ this.f48076i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final boolean isEmulator() {
        return this.f48073f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String manufacturer() {
        return this.f48075h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String model() {
        return this.f48069b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String modelClass() {
        return this.f48076i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int state() {
        return this.f48074g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f48068a);
        sb2.append(", model=");
        sb2.append(this.f48069b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f48070c);
        sb2.append(", totalRam=");
        sb2.append(this.f48071d);
        sb2.append(", diskSpace=");
        sb2.append(this.f48072e);
        sb2.append(", isEmulator=");
        sb2.append(this.f48073f);
        sb2.append(", state=");
        sb2.append(this.f48074g);
        sb2.append(", manufacturer=");
        sb2.append(this.f48075h);
        sb2.append(", modelClass=");
        return ad.d.f(sb2, this.f48076i, "}");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final long totalRam() {
        return this.f48071d;
    }
}
