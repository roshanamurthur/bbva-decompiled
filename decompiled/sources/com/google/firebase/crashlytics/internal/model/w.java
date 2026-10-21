package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48258b;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
    public static final class a extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48260b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build() {
            String strConcat = this.f48259a == null ? " rolloutId" : "";
            if (this.f48260b == null) {
                strConcat = strConcat.concat(" variantId");
            }
            if (strConcat.isEmpty()) {
                return new w(this.f48259a, this.f48260b);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f48259a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f48260b = str;
            return this;
        }
    }

    public w(String str, String str2) {
        this.f48257a = str;
        this.f48258b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
        return this.f48257a.equals(rolloutVariant.getRolloutId()) && this.f48258b.equals(rolloutVariant.getVariantId());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public final String getRolloutId() {
        return this.f48257a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public final String getVariantId() {
        return this.f48258b;
    }

    public final int hashCode() {
        return ((this.f48257a.hashCode() ^ 1000003) * 1000003) ^ this.f48258b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f48257a);
        sb2.append(", variantId=");
        return ad.d.f(sb2, this.f48258b, "}");
    }
}
