package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48064c;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    public static final class a extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48067c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
            String strF = this.f48065a == null ? " arch" : "";
            if (this.f48066b == null) {
                strF = strF.concat(" libraryName");
            }
            if (this.f48067c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " buildId");
            }
            if (strF.isEmpty()) {
                return new c(this.f48065a, this.f48066b, this.f48067c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f48065a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f48067c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f48066b = str;
            return this;
        }
    }

    public c(String str, String str2, String str3) {
        this.f48062a = str;
        this.f48063b = str2;
        this.f48064c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
        return this.f48062a.equals(buildIdMappingForArch.getArch()) && this.f48063b.equals(buildIdMappingForArch.getLibraryName()) && this.f48064c.equals(buildIdMappingForArch.getBuildId());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public final String getArch() {
        return this.f48062a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public final String getBuildId() {
        return this.f48064c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    @NonNull
    public final String getLibraryName() {
        return this.f48063b;
    }

    public final int hashCode() {
        return ((((this.f48062a.hashCode() ^ 1000003) * 1000003) ^ this.f48063b.hashCode()) * 1000003) ^ this.f48064c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f48062a);
        sb2.append(", libraryName=");
        sb2.append(this.f48063b);
        sb2.append(", buildId=");
        return ad.d.f(sb2, this.f48064c, "}");
    }
}
