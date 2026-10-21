package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* JADX INFO: loaded from: classes10.dex */
public final class o extends CrashlyticsReport.Session.Event.Application.Execution.Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f48196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception f48197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48198e;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    public static final class a extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> f48201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception f48202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f48203e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception build() {
            String strF = this.f48199a == null ? " type" : "";
            if (this.f48201c == null) {
                strF = strF.concat(" frames");
            }
            if (this.f48203e == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " overflowCount");
            }
            if (strF.isEmpty()) {
                return new o(this.f48199a, this.f48200b, this.f48201c, this.f48202d, this.f48203e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f48202d = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f48201c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int i10) {
            this.f48203e = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(String str) {
            this.f48200b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f48199a = str;
            return this;
        }
    }

    public o() {
        throw null;
    }

    public o(String str, String str2, List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i10) {
        this.f48194a = str;
        this.f48195b = str2;
        this.f48196c = list;
        this.f48197d = exception;
        this.f48198e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        return this.f48194a.equals(exception2.getType()) && ((str = this.f48195b) != null ? str.equals(exception2.getReason()) : exception2.getReason() == null) && this.f48196c.equals(exception2.getFrames()) && ((exception = this.f48197d) != null ? exception.equals(exception2.getCausedBy()) : exception2.getCausedBy() == null) && this.f48198e == exception2.getOverflowCount();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @Nullable
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy() {
        return this.f48197d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @NonNull
    public final List<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.f48196c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final int getOverflowCount() {
        return this.f48198e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @Nullable
    public final String getReason() {
        return this.f48195b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    @NonNull
    public final String getType() {
        return this.f48194a;
    }

    public final int hashCode() {
        int iHashCode = (this.f48194a.hashCode() ^ 1000003) * 1000003;
        String str = this.f48195b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f48196c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f48197d;
        return ((iHashCode2 ^ (exception != null ? exception.hashCode() : 0)) * 1000003) ^ this.f48198e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f48194a);
        sb2.append(", reason=");
        sb2.append(this.f48195b);
        sb2.append(", frames=");
        sb2.append(this.f48196c);
        sb2.append(", causedBy=");
        sb2.append(this.f48197d);
        sb2.append(", overflowCount=");
        return androidx.appcompat.widget.a.c(sb2, this.f48198e, "}");
    }
}
