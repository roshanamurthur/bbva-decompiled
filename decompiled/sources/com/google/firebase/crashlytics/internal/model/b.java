package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends CrashlyticsReport.ApplicationExitInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f48044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f48045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> f48046i;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    public static final class a extends CrashlyticsReport.ApplicationExitInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f48047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f48049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f48050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f48051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f48052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Long f48053g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f48054h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> f48055i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo build() {
            String strF = this.f48047a == null ? " pid" : "";
            if (this.f48048b == null) {
                strF = strF.concat(" processName");
            }
            if (this.f48049c == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " reasonCode");
            }
            if (this.f48050d == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " importance");
            }
            if (this.f48051e == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " pss");
            }
            if (this.f48052f == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " rss");
            }
            if (this.f48053g == null) {
                strF = androidx.camera.camera2.internal.compat.u.f(strF, " timestamp");
            }
            if (strF.isEmpty()) {
                return new b(this.f48047a.intValue(), this.f48048b, this.f48049c.intValue(), this.f48050d.intValue(), this.f48051e.longValue(), this.f48052f.longValue(), this.f48053g.longValue(), this.f48054h, this.f48055i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(@Nullable List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list) {
            this.f48055i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i10) {
            this.f48050d = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i10) {
            this.f48047a = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f48048b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j10) {
            this.f48051e = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i10) {
            this.f48049c = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j10) {
            this.f48052f = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j10) {
            this.f48053g = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(@Nullable String str) {
            this.f48054h = str;
            return this;
        }
    }

    public b() {
        throw null;
    }

    public b(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f48038a = i10;
        this.f48039b = str;
        this.f48040c = i11;
        this.f48041d = i12;
        this.f48042e = j10;
        this.f48043f = j11;
        this.f48044g = j12;
        this.f48045h = str2;
        this.f48046i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.f48038a == applicationExitInfo.getPid() && this.f48039b.equals(applicationExitInfo.getProcessName()) && this.f48040c == applicationExitInfo.getReasonCode() && this.f48041d == applicationExitInfo.getImportance() && this.f48042e == applicationExitInfo.getPss() && this.f48043f == applicationExitInfo.getRss() && this.f48044g == applicationExitInfo.getTimestamp() && ((str = this.f48045h) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null)) {
            List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.f48046i;
            if (list == null) {
                if (applicationExitInfo.getBuildIdMappingForArch() == null) {
                    return true;
                }
            } else if (list.equals(applicationExitInfo.getBuildIdMappingForArch())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @Nullable
    public final List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch() {
        return this.f48046i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public final int getImportance() {
        return this.f48041d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public final int getPid() {
        return this.f48038a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public final String getProcessName() {
        return this.f48039b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public final long getPss() {
        return this.f48042e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public final int getReasonCode() {
        return this.f48040c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public final long getRss() {
        return this.f48043f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public final long getTimestamp() {
        return this.f48044g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @Nullable
    public final String getTraceFile() {
        return this.f48045h;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f48038a ^ 1000003) * 1000003) ^ this.f48039b.hashCode()) * 1000003) ^ this.f48040c) * 1000003) ^ this.f48041d) * 1000003;
        long j10 = this.f48042e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f48043f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f48044g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f48045h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> list = this.f48046i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationExitInfo{pid=");
        sb2.append(this.f48038a);
        sb2.append(", processName=");
        sb2.append(this.f48039b);
        sb2.append(", reasonCode=");
        sb2.append(this.f48040c);
        sb2.append(", importance=");
        sb2.append(this.f48041d);
        sb2.append(", pss=");
        sb2.append(this.f48042e);
        sb2.append(", rss=");
        sb2.append(this.f48043f);
        sb2.append(", timestamp=");
        sb2.append(this.f48044g);
        sb2.append(", traceFile=");
        sb2.append(this.f48045h);
        sb2.append(", buildIdMappingForArch=");
        return androidx.camera.core.imagecapture.a.c(sb2, this.f48046i, "}");
    }
}
