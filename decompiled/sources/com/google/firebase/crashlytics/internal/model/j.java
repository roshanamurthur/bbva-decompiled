package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends CrashlyticsReport.Session.Device {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f48140i;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    public static final class a extends CrashlyticsReport.Session.Device.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f48141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f48143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f48144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f48145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f48146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f48147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f48148h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f48149i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device build() {
            String strF = this.f48141a == null ? " arch" : "";
            if (this.f48142b == null) {
                strF = strF.concat(" model");
            }
            if (this.f48143c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " cores");
            }
            if (this.f48144d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " ram");
            }
            if (this.f48145e == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " diskSpace");
            }
            if (this.f48146f == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " simulator");
            }
            if (this.f48147g == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " state");
            }
            if (this.f48148h == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " manufacturer");
            }
            if (this.f48149i == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " modelClass");
            }
            if (strF.isEmpty()) {
                return new j(this.f48141a.intValue(), this.f48142b, this.f48143c.intValue(), this.f48144d.longValue(), this.f48145e.longValue(), this.f48146f.booleanValue(), this.f48147g.intValue(), this.f48148h, this.f48149i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setArch(int i10) {
            this.f48141a = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setCores(int i10) {
            this.f48143c = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setDiskSpace(long j10) {
            this.f48145e = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setManufacturer(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f48148h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setModel(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f48142b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setModelClass(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f48149i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setRam(long j10) {
            this.f48144d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setSimulator(boolean z10) {
            this.f48146f = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setState(int i10) {
            this.f48147g = Integer.valueOf(i10);
            return this;
        }
    }

    public j(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f48132a = i10;
        this.f48133b = str;
        this.f48134c = i11;
        this.f48135d = j10;
        this.f48136e = j11;
        this.f48137f = z10;
        this.f48138g = i12;
        this.f48139h = str2;
        this.f48140i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        return this.f48132a == device.getArch() && this.f48133b.equals(device.getModel()) && this.f48134c == device.getCores() && this.f48135d == device.getRam() && this.f48136e == device.getDiskSpace() && this.f48137f == device.isSimulator() && this.f48138g == device.getState() && this.f48139h.equals(device.getManufacturer()) && this.f48140i.equals(device.getModelClass());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public final int getArch() {
        return this.f48132a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int getCores() {
        return this.f48134c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final long getDiskSpace() {
        return this.f48136e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public final String getManufacturer() {
        return this.f48139h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public final String getModel() {
        return this.f48133b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public final String getModelClass() {
        return this.f48140i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final long getRam() {
        return this.f48135d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int getState() {
        return this.f48138g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f48132a ^ 1000003) * 1000003) ^ this.f48133b.hashCode()) * 1000003) ^ this.f48134c) * 1000003;
        long j10 = this.f48135d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f48136e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f48137f ? 1231 : 1237)) * 1000003) ^ this.f48138g) * 1000003) ^ this.f48139h.hashCode()) * 1000003) ^ this.f48140i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final boolean isSimulator() {
        return this.f48137f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f48132a);
        sb2.append(", model=");
        sb2.append(this.f48133b);
        sb2.append(", cores=");
        sb2.append(this.f48134c);
        sb2.append(", ram=");
        sb2.append(this.f48135d);
        sb2.append(", diskSpace=");
        sb2.append(this.f48136e);
        sb2.append(", simulator=");
        sb2.append(this.f48137f);
        sb2.append(", state=");
        sb2.append(this.f48138g);
        sb2.append(", manufacturer=");
        sb2.append(this.f48139h);
        sb2.append(", modelClass=");
        return ad.d.f(sb2, this.f48140i, "}");
    }
}
