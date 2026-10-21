package te;

import androidx.annotation.Nullable;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f93540b;

    public /* synthetic */ a(String str, Long l6) {
        this.f93539a = str;
        this.f93540b = l6;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    @Nullable
    public final Long cloudProjectNumber() {
        return this.f93540b;
    }

    public final boolean equals(Object obj) {
        Long l6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f93539a.equals(integrityTokenRequest.nonce()) && ((l6 = this.f93540b) != null ? l6.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f93539a.hashCode() ^ 1000003;
        Long l6 = this.f93540b;
        return (iHashCode * 1000003) ^ (l6 == null ? 0 : l6.hashCode());
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f93539a;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f93539a + ", cloudProjectNumber=" + this.f93540b + "}";
    }
}
