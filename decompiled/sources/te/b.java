package te;

import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93541a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenResponse) {
            return this.f93541a.equals(((IntegrityTokenResponse) obj).token());
        }
        return false;
    }

    public final int hashCode() {
        return this.f93541a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ad.d.f(new StringBuilder("IntegrityTokenResponse{token="), this.f93541a, "}");
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f93541a;
    }
}
