package td;

import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_BatchedLogRequest.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends BatchedLogRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<LogRequest> f93537a;

    public a(List<LogRequest> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f93537a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f93537a.equals(((BatchedLogRequest) obj).getLogRequests());
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    @NonNull
    @Encodable.Field(name = "logRequest")
    public final List<LogRequest> getLogRequests() {
        return this.f93537a;
    }

    public final int hashCode() {
        return this.f93537a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.camera.core.imagecapture.a.c(new StringBuilder("BatchedLogRequest{logRequests="), this.f93537a, "}");
    }
}
