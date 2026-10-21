package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* JADX INFO: loaded from: classes10.dex */
public final class t extends CrashlyticsReport.Session.Event.Device {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f48235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48240f;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    public static final class a extends CrashlyticsReport.Session.Event.Device.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f48241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f48242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f48243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f48244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f48245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f48246f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device build() {
            String strF = this.f48242b == null ? " batteryVelocity" : "";
            if (this.f48243c == null) {
                strF = strF.concat(" proximityOn");
            }
            if (this.f48244d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " orientation");
            }
            if (this.f48245e == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " ramUsed");
            }
            if (this.f48246f == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " diskUsed");
            }
            if (strF.isEmpty()) {
                return new t(this.f48241a, this.f48242b.intValue(), this.f48243c.booleanValue(), this.f48244d.intValue(), this.f48245e.longValue(), this.f48246f.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(Double d2) {
            this.f48241a = d2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i10) {
            this.f48242b = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j10) {
            this.f48246f = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i10) {
            this.f48244d = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z10) {
            this.f48243c = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j10) {
            this.f48245e = Long.valueOf(j10);
            return this;
        }
    }

    public t(Double d2, int i10, boolean z10, int i11, long j10, long j11) {
        this.f48235a = d2;
        this.f48236b = i10;
        this.f48237c = z10;
        this.f48238d = i11;
        this.f48239e = j10;
        this.f48240f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
        Double d2 = this.f48235a;
        if (d2 != null ? d2.equals(device.getBatteryLevel()) : device.getBatteryLevel() == null) {
            if (this.f48236b == device.getBatteryVelocity() && this.f48237c == device.isProximityOn() && this.f48238d == device.getOrientation() && this.f48239e == device.getRamUsed() && this.f48240f == device.getDiskUsed()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    @Nullable
    public final Double getBatteryLevel() {
        return this.f48235a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int getBatteryVelocity() {
        return this.f48236b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long getDiskUsed() {
        return this.f48240f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int getOrientation() {
        return this.f48238d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long getRamUsed() {
        return this.f48239e;
    }

    public final int hashCode() {
        Double d2 = this.f48235a;
        int iHashCode = ((((((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.f48236b) * 1000003) ^ (this.f48237c ? 1231 : 1237)) * 1000003) ^ this.f48238d) * 1000003;
        long j10 = this.f48239e;
        long j11 = this.f48240f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final boolean isProximityOn() {
        return this.f48237c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f48235a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f48236b);
        sb2.append(", proximityOn=");
        sb2.append(this.f48237c);
        sb2.append(", orientation=");
        sb2.append(this.f48238d);
        sb2.append(", ramUsed=");
        sb2.append(this.f48239e);
        sb2.append(", diskUsed=");
        return androidx.collection.h.d(sb2, this.f48240f, "}");
    }
}
