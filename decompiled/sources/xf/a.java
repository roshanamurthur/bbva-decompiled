package xf;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends CrashlyticsReportWithSessionId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport f94603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f94605c;

    public a(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport == null) {
            throw new NullPointerException("Null report");
        }
        this.f94603a = crashlyticsReport;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f94604b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f94605c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        return this.f94603a.equals(crashlyticsReportWithSessionId.getReport()) && this.f94604b.equals(crashlyticsReportWithSessionId.getSessionId()) && this.f94605c.equals(crashlyticsReportWithSessionId.getReportFile());
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final CrashlyticsReport getReport() {
        return this.f94603a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final File getReportFile() {
        return this.f94605c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final String getSessionId() {
        return this.f94604b;
    }

    public final int hashCode() {
        return ((((this.f94603a.hashCode() ^ 1000003) * 1000003) ^ this.f94604b.hashCode()) * 1000003) ^ this.f94605c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f94603a + ", sessionId=" + this.f94604b + ", reportFile=" + this.f94605c + "}";
    }
}
