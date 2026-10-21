package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends CrashlyticsReport.FilesPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<CrashlyticsReport.FilesPayload.File> f48084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48085b;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    public static final class a extends CrashlyticsReport.FilesPayload.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<CrashlyticsReport.FilesPayload.File> f48086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48087b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload build() {
            String str = this.f48086a == null ? " files" : "";
            if (str.isEmpty()) {
                return new e(this.f48086a, this.f48087b);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder setFiles(List<CrashlyticsReport.FilesPayload.File> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f48086a = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.f48087b = str;
            return this;
        }
    }

    public e() {
        throw null;
    }

    public e(List list, String str) {
        this.f48084a = list;
        this.f48085b = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final a a() {
        a aVar = new a();
        aVar.f48086a = this.f48084a;
        aVar.f48087b = this.f48085b;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (this.f48084a.equals(filesPayload.getFiles())) {
            String str = this.f48085b;
            if (str == null) {
                if (filesPayload.getOrgId() == null) {
                    return true;
                }
            } else if (str.equals(filesPayload.getOrgId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @NonNull
    public final List<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.f48084a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @Nullable
    public final String getOrgId() {
        return this.f48085b;
    }

    public final int hashCode() {
        int iHashCode = (this.f48084a.hashCode() ^ 1000003) * 1000003;
        String str = this.f48085b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f48084a);
        sb2.append(", orgId=");
        return ad.d.f(sb2, this.f48085b, "}");
    }
}
