package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48189d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    public static final class a extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f48190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f48191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f48193d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build() {
            String strF = this.f48190a == null ? " baseAddress" : "";
            if (this.f48191b == null) {
                strF = strF.concat(" size");
            }
            if (this.f48192c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " name");
            }
            if (strF.isEmpty()) {
                return new n(this.f48190a.longValue(), this.f48191b.longValue(), this.f48192c, this.f48193d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long j10) {
            this.f48190a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f48192c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long j10) {
            this.f48191b = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(@Nullable String str) {
            this.f48193d = str;
            return this;
        }
    }

    public n(long j10, long j11, String str, String str2) {
        this.f48186a = j10;
        this.f48187b = j11;
        this.f48188c = str;
        this.f48189d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.f48186a == binaryImage.getBaseAddress() && this.f48187b == binaryImage.getSize() && this.f48188c.equals(binaryImage.getName())) {
            String str = this.f48189d;
            if (str == null) {
                if (binaryImage.getUuid() == null) {
                    return true;
                }
            } else if (str.equals(binaryImage.getUuid())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @NonNull
    public final long getBaseAddress() {
        return this.f48186a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @NonNull
    public final String getName() {
        return this.f48188c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final long getSize() {
        return this.f48187b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    @Nullable
    @Encodable.Ignore
    public final String getUuid() {
        return this.f48189d;
    }

    public final int hashCode() {
        long j10 = this.f48186a;
        long j11 = this.f48187b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f48188c.hashCode()) * 1000003;
        String str = this.f48189d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f48186a);
        sb2.append(", size=");
        sb2.append(this.f48187b);
        sb2.append(", name=");
        sb2.append(this.f48188c);
        sb2.append(", uuid=");
        return ad.d.f(sb2, this.f48189d, "}");
    }
}
