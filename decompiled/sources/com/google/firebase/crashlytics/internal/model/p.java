package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p extends CrashlyticsReport.Session.Event.Application.Execution.Signal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48206c;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    public static final class a extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f48209c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            String strF = this.f48207a == null ? " name" : "";
            if (this.f48208b == null) {
                strF = strF.concat(" code");
            }
            if (this.f48209c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " address");
            }
            if (strF.isEmpty()) {
                return new p(this.f48207a, this.f48208b, this.f48209c.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j10) {
            this.f48209c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f48208b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f48207a = str;
            return this;
        }
    }

    public p(String str, String str2, long j10) {
        this.f48204a = str;
        this.f48205b = str2;
        this.f48206c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        return this.f48204a.equals(signal.getName()) && this.f48205b.equals(signal.getCode()) && this.f48206c == signal.getAddress();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public final long getAddress() {
        return this.f48206c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public final String getCode() {
        return this.f48205b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    @NonNull
    public final String getName() {
        return this.f48204a;
    }

    public final int hashCode() {
        int iHashCode = (((this.f48204a.hashCode() ^ 1000003) * 1000003) ^ this.f48205b.hashCode()) * 1000003;
        long j10 = this.f48206c;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f48204a);
        sb2.append(", code=");
        sb2.append(this.f48205b);
        sb2.append(", address=");
        return androidx.collection.h.d(sb2, this.f48206c, "}");
    }
}
