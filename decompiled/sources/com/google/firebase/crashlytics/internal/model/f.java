package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends CrashlyticsReport.FilesPayload.File {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f48089b;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_FilesPayload_File.java */
    public static final class a extends CrashlyticsReport.FilesPayload.File.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f48091b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File build() {
            String strConcat = this.f48090a == null ? " filename" : "";
            if (this.f48091b == null) {
                strConcat = strConcat.concat(" contents");
            }
            if (strConcat.isEmpty()) {
                return new f(this.f48090a, this.f48091b);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f48091b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder setFilename(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f48090a = str;
            return this;
        }
    }

    public f(String str, byte[] bArr) {
        this.f48088a = str;
        this.f48089b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.f48088a.equals(file.getFilename())) {
            if (Arrays.equals(this.f48089b, file instanceof f ? ((f) file).f48089b : file.getContents())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    @NonNull
    public final byte[] getContents() {
        return this.f48089b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    @NonNull
    public final String getFilename() {
        return this.f48088a;
    }

    public final int hashCode() {
        return ((this.f48088a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f48089b);
    }

    public final String toString() {
        return "File{filename=" + this.f48088a + ", contents=" + Arrays.toString(this.f48089b) + "}";
    }
}
