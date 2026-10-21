package xe;

import android.app.PendingIntent;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends SplitInstallSessionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f94539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f94540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f94541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f94542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f94543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f94544i;

    public a(int i10, int i11, int i12, long j10, long j11, @Nullable List list, @Nullable List list2, @Nullable PendingIntent pendingIntent, @Nullable List list3) {
        this.f94536a = i10;
        this.f94537b = i11;
        this.f94538c = i12;
        this.f94539d = j10;
        this.f94540e = j11;
        this.f94541f = list;
        this.f94542g = list2;
        this.f94543h = pendingIntent;
        this.f94544i = list3;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Nullable
    public final List a() {
        return this.f94542g;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Nullable
    public final List b() {
        return this.f94541f;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long bytesDownloaded() {
        return this.f94539d;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Nullable
    public final List c() {
        return this.f94544i;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SplitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
            if (this.f94536a == splitInstallSessionState.sessionId() && this.f94537b == splitInstallSessionState.status() && this.f94538c == splitInstallSessionState.errorCode() && this.f94539d == splitInstallSessionState.bytesDownloaded() && this.f94540e == splitInstallSessionState.totalBytesToDownload() && ((list = this.f94541f) != null ? list.equals(splitInstallSessionState.b()) : splitInstallSessionState.b() == null) && ((list2 = this.f94542g) != null ? list2.equals(splitInstallSessionState.a()) : splitInstallSessionState.a() == null) && ((pendingIntent = this.f94543h) != null ? pendingIntent.equals(splitInstallSessionState.resolutionIntent()) : splitInstallSessionState.resolutionIntent() == null) && ((list3 = this.f94544i) != null ? list3.equals(splitInstallSessionState.c()) : splitInstallSessionState.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @SplitInstallErrorCode
    public final int errorCode() {
        return this.f94538c;
    }

    public final int hashCode() {
        int i10 = ((((this.f94536a ^ 1000003) * 1000003) ^ this.f94537b) * 1000003) ^ this.f94538c;
        long j10 = this.f94539d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f94540e;
        long j13 = (j12 >>> 32) ^ j12;
        List list = this.f94541f;
        int iHashCode = ((((((i10 * 1000003) ^ ((int) j11)) * 1000003) ^ ((int) j13)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f94542g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f94543h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f94544i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Nullable
    @Deprecated
    public final PendingIntent resolutionIntent() {
        return this.f94543h;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int sessionId() {
        return this.f94536a;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @SplitInstallSessionStatus
    public final int status() {
        return this.f94537b;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f94541f);
        String strValueOf2 = String.valueOf(this.f94542g);
        String strValueOf3 = String.valueOf(this.f94543h);
        String strValueOf4 = String.valueOf(this.f94544i);
        StringBuilder sb2 = new StringBuilder("SplitInstallSessionState{sessionId=");
        sb2.append(this.f94536a);
        sb2.append(", status=");
        sb2.append(this.f94537b);
        sb2.append(", errorCode=");
        sb2.append(this.f94538c);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f94539d);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.f94540e);
        sb2.append(", moduleNamesNullable=");
        sb2.append(strValueOf);
        androidx.collection.k.e(sb2, ", languagesNullable=", strValueOf2, ", resolutionIntent=", strValueOf3);
        return androidx.collection.f.c(sb2, ", splitFileIntents=", strValueOf4, "}");
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long totalBytesToDownload() {
        return this.f94540e;
    }
}
