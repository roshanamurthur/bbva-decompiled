package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends CrashlyticsReport.Session.Application.Organization {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48130a;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
    public static final class a extends CrashlyticsReport.Session.Application.Organization.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48131a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public final CrashlyticsReport.Session.Application.Organization build() {
            String str = this.f48131a == null ? " clsId" : "";
            if (str.isEmpty()) {
                return new i(this.f48131a);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public final CrashlyticsReport.Session.Application.Organization.Builder setClsId(String str) {
            if (str == null) {
                throw new NullPointerException("Null clsId");
            }
            this.f48131a = str;
            return this;
        }
    }

    public i(String str) {
        this.f48130a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.f48130a.equals(((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    @NonNull
    public final String getClsId() {
        return this.f48130a;
    }

    public final int hashCode() {
        return this.f48130a.hashCode() ^ 1000003;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public final CrashlyticsReport.Session.Application.Organization.Builder toBuilder() {
        a aVar = new a();
        aVar.f48131a = getClsId();
        return aVar;
    }

    public final String toString() {
        return ad.d.f(new StringBuilder("Organization{clsId="), this.f48130a, "}");
    }
}
