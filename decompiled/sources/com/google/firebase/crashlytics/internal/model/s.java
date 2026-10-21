package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* JADX INFO: loaded from: classes10.dex */
public final class s extends CrashlyticsReport.Session.Event.Application.ProcessDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48229d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    public static final class a extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f48231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f48232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f48233d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails build() {
            String strF = this.f48230a == null ? " processName" : "";
            if (this.f48231b == null) {
                strF = strF.concat(" pid");
            }
            if (this.f48232c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " importance");
            }
            if (this.f48233d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " defaultProcess");
            }
            if (strF.isEmpty()) {
                return new s(this.f48230a, this.f48231b.intValue(), this.f48232c.intValue(), this.f48233d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean z10) {
            this.f48233d = Boolean.valueOf(z10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int i10) {
            this.f48232c = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int i10) {
            this.f48231b = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f48230a = str;
            return this;
        }
    }

    public s(String str, int i10, int i11, boolean z10) {
        this.f48226a = str;
        this.f48227b = i10;
        this.f48228c = i11;
        this.f48229d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        return this.f48226a.equals(processDetails.getProcessName()) && this.f48227b == processDetails.getPid() && this.f48228c == processDetails.getImportance() && this.f48229d == processDetails.isDefaultProcess();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final int getImportance() {
        return this.f48228c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final int getPid() {
        return this.f48227b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    @NonNull
    public final String getProcessName() {
        return this.f48226a;
    }

    public final int hashCode() {
        return ((((((this.f48226a.hashCode() ^ 1000003) * 1000003) ^ this.f48227b) * 1000003) ^ this.f48228c) * 1000003) ^ (this.f48229d ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final boolean isDefaultProcess() {
        return this.f48229d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails{processName=");
        sb2.append(this.f48226a);
        sb2.append(", pid=");
        sb2.append(this.f48227b);
        sb2.append(", importance=");
        sb2.append(this.f48228c);
        sb2.append(", defaultProcess=");
        return androidx.appcompat.app.i.c(sb2, this.f48229d, "}");
    }
}
