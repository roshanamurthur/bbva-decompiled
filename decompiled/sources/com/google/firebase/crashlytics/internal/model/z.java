package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* JADX INFO: loaded from: classes10.dex */
public final class z extends CrashlyticsReport.Session.User {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48271a;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    public static final class a extends CrashlyticsReport.Session.User.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48272a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User build() {
            String str = this.f48272a == null ? " identifier" : "";
            if (str.isEmpty()) {
                return new z(this.f48272a);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User.Builder setIdentifier(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f48272a = str;
            return this;
        }
    }

    public z(String str) {
        this.f48271a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.f48271a.equals(((CrashlyticsReport.Session.User) obj).getIdentifier());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    @NonNull
    public final String getIdentifier() {
        return this.f48271a;
    }

    public final int hashCode() {
        return this.f48271a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ad.d.f(new StringBuilder("User{identifier="), this.f48271a, "}");
    }
}
