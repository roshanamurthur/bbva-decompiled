package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q extends CrashlyticsReport.Session.Event.Application.Execution.Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f48212c;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    public static final class a extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f48214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f48215c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread build() {
            String strF = this.f48213a == null ? " name" : "";
            if (this.f48214b == null) {
                strF = strF.concat(" importance");
            }
            if (this.f48215c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " frames");
            }
            if (strF.isEmpty()) {
                return new q(this.f48213a, this.f48214b.intValue(), this.f48215c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f48215c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i10) {
            this.f48214b = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f48213a = str;
            return this;
        }
    }

    public q() {
        throw null;
    }

    public q(String str, int i10, List list) {
        this.f48210a = str;
        this.f48211b = i10;
        this.f48212c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        return this.f48210a.equals(thread.getName()) && this.f48211b == thread.getImportance() && this.f48212c.equals(thread.getFrames());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @NonNull
    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.f48212c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final int getImportance() {
        return this.f48211b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    @NonNull
    public final String getName() {
        return this.f48210a;
    }

    public final int hashCode() {
        return ((((this.f48210a.hashCode() ^ 1000003) * 1000003) ^ this.f48211b) * 1000003) ^ this.f48212c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Thread{name=");
        sb2.append(this.f48210a);
        sb2.append(", importance=");
        sb2.append(this.f48211b);
        sb2.append(", frames=");
        return androidx.camera.core.imagecapture.a.c(sb2, this.f48212c, "}");
    }
}
