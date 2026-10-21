package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* JADX INFO: loaded from: classes10.dex */
public final class v extends CrashlyticsReport.Session.Event.RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f48249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48252d;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    public static final class a extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f48253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f48256d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment build() {
            String strF = this.f48253a == null ? " rolloutVariant" : "";
            if (this.f48254b == null) {
                strF = strF.concat(" parameterKey");
            }
            if (this.f48255c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " parameterValue");
            }
            if (this.f48256d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " templateVersion");
            }
            if (strF.isEmpty()) {
                return new v(this.f48253a, this.f48254b, this.f48255c, this.f48256d.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f48254b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f48255c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f48253a = rolloutVariant;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j10) {
            this.f48256d = Long.valueOf(j10);
            return this;
        }
    }

    public v(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j10) {
        this.f48249a = rolloutVariant;
        this.f48250b = str;
        this.f48251c = str2;
        this.f48252d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        return this.f48249a.equals(rolloutAssignment.getRolloutVariant()) && this.f48250b.equals(rolloutAssignment.getParameterKey()) && this.f48251c.equals(rolloutAssignment.getParameterValue()) && this.f48252d == rolloutAssignment.getTemplateVersion();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public final String getParameterKey() {
        return this.f48250b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public final String getParameterValue() {
        return this.f48251c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
        return this.f48249a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    @NonNull
    public final long getTemplateVersion() {
        return this.f48252d;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f48249a.hashCode() ^ 1000003) * 1000003) ^ this.f48250b.hashCode()) * 1000003) ^ this.f48251c.hashCode()) * 1000003;
        long j10 = this.f48252d;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f48249a);
        sb2.append(", parameterKey=");
        sb2.append(this.f48250b);
        sb2.append(", parameterValue=");
        sb2.append(this.f48251c);
        sb2.append(", templateVersion=");
        return androidx.collection.h.d(sb2, this.f48252d, "}");
    }
}
