package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* JADX INFO: loaded from: classes10.dex */
public final class u extends CrashlyticsReport.Session.Event.Log {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48247a;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    public static final class a extends CrashlyticsReport.Session.Event.Log.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48248a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public final CrashlyticsReport.Session.Event.Log build() {
            String str = this.f48248a == null ? " content" : "";
            if (str.isEmpty()) {
                return new u(this.f48248a);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public final CrashlyticsReport.Session.Event.Log.Builder setContent(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f48248a = str;
            return this;
        }
    }

    public u(String str) {
        this.f48247a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.f48247a.equals(((CrashlyticsReport.Session.Event.Log) obj).getContent());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    @NonNull
    public final String getContent() {
        return this.f48247a;
    }

    public final int hashCode() {
        return this.f48247a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ad.d.f(new StringBuilder("Log{content="), this.f48247a, "}");
    }
}
