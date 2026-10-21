package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends CrashlyticsReport.CustomAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48078b;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    public static final class a extends CrashlyticsReport.CustomAttribute.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48080b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute build() {
            String strConcat = this.f48079a == null ? " key" : "";
            if (this.f48080b == null) {
                strConcat = strConcat.concat(" value");
            }
            if (strConcat.isEmpty()) {
                return new d(this.f48079a, this.f48080b);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute.Builder setKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f48079a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute.Builder setValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f48080b = str;
            return this;
        }
    }

    public d(String str, String str2) {
        this.f48077a = str;
        this.f48078b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        return this.f48077a.equals(customAttribute.getKey()) && this.f48078b.equals(customAttribute.getValue());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @NonNull
    public final String getKey() {
        return this.f48077a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    @NonNull
    public final String getValue() {
        return this.f48078b;
    }

    public final int hashCode() {
        return ((this.f48077a.hashCode() ^ 1000003) * 1000003) ^ this.f48078b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f48077a);
        sb2.append(", value=");
        return ad.d.f(sb2, this.f48078b, "}");
    }
}
