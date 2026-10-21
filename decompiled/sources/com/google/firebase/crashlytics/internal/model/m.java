package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m extends CrashlyticsReport.Session.Event.Application.Execution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread> f48176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception f48177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsReport.ApplicationExitInfo f48178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal f48179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> f48180e;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    public static final class a extends CrashlyticsReport.Session.Event.Application.Execution.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<CrashlyticsReport.Session.Event.Application.Execution.Thread> f48181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception f48182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CrashlyticsReport.ApplicationExitInfo f48183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Signal f48184d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> f48185e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution build() {
            String strConcat = this.f48184d == null ? " signal" : "";
            if (this.f48185e == null) {
                strConcat = strConcat.concat(" binaries");
            }
            if (strConcat.isEmpty()) {
                return new m(this.f48181a, this.f48182b, this.f48183c, this.f48184d, this.f48185e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f48183c = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f48185e = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setException(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f48182b = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal == null) {
                throw new NullPointerException("Null signal");
            }
            this.f48184d = signal;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list) {
            this.f48181a = list;
            return this;
        }
    }

    public m() {
        throw null;
    }

    public m(List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, List list2) {
        this.f48176a = list;
        this.f48177b = exception;
        this.f48178c = applicationExitInfo;
        this.f48179d = signal;
        this.f48180e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
        List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list = this.f48176a;
        if (list != null ? list.equals(execution.getThreads()) : execution.getThreads() == null) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f48177b;
            if (exception != null ? exception.equals(execution.getException()) : execution.getException() == null) {
                CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f48178c;
                if (applicationExitInfo != null ? applicationExitInfo.equals(execution.getAppExitInfo()) : execution.getAppExitInfo() == null) {
                    if (this.f48179d.equals(execution.getSignal()) && this.f48180e.equals(execution.getBinaries())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public final CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.f48178c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @NonNull
    public final List<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> getBinaries() {
        return this.f48180e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception getException() {
        return this.f48177b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @NonNull
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal getSignal() {
        return this.f48179d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    @Nullable
    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread> getThreads() {
        return this.f48176a;
    }

    public final int hashCode() {
        List<CrashlyticsReport.Session.Event.Application.Execution.Thread> list = this.f48176a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f48177b;
        int iHashCode2 = (iHashCode ^ (exception == null ? 0 : exception.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f48178c;
        return (((((applicationExitInfo != null ? applicationExitInfo.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f48179d.hashCode()) * 1000003) ^ this.f48180e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Execution{threads=");
        sb2.append(this.f48176a);
        sb2.append(", exception=");
        sb2.append(this.f48177b);
        sb2.append(", appExitInfo=");
        sb2.append(this.f48178c);
        sb2.append(", signal=");
        sb2.append(this.f48179d);
        sb2.append(", binaries=");
        return androidx.camera.core.imagecapture.a.c(sb2, this.f48180e, "}");
    }
}
