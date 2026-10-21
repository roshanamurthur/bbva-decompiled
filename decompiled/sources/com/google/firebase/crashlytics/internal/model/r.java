package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* JADX INFO: loaded from: classes10.dex */
public final class r extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48220e;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    public static final class a extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f48221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f48224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f48225e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String strF = this.f48221a == null ? " pc" : "";
            if (this.f48222b == null) {
                strF = strF.concat(" symbol");
            }
            if (this.f48224d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " offset");
            }
            if (this.f48225e == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " importance");
            }
            if (strF.isEmpty()) {
                return new r(this.f48221a.longValue(), this.f48222b, this.f48223c, this.f48224d.longValue(), this.f48225e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.f48223c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i10) {
            this.f48225e = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j10) {
            this.f48224d = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j10) {
            this.f48221a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f48222b = str;
            return this;
        }
    }

    public r(long j10, String str, String str2, long j11, int i10) {
        this.f48216a = j10;
        this.f48217b = str;
        this.f48218c = str2;
        this.f48219d = j11;
        this.f48220e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        return this.f48216a == frame.getPc() && this.f48217b.equals(frame.getSymbol()) && ((str = this.f48218c) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.f48219d == frame.getOffset() && this.f48220e == frame.getImportance();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @Nullable
    public final String getFile() {
        return this.f48218c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final int getImportance() {
        return this.f48220e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long getOffset() {
        return this.f48219d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long getPc() {
        return this.f48216a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @NonNull
    public final String getSymbol() {
        return this.f48217b;
    }

    public final int hashCode() {
        long j10 = this.f48216a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f48217b.hashCode()) * 1000003;
        String str = this.f48218c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f48219d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f48220e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f48216a);
        sb2.append(", symbol=");
        sb2.append(this.f48217b);
        sb2.append(", file=");
        sb2.append(this.f48218c);
        sb2.append(", offset=");
        sb2.append(this.f48219d);
        sb2.append(", importance=");
        return androidx.appcompat.widget.a.c(sb2, this.f48220e, "}");
    }
}
