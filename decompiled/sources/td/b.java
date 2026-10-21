package td;

import androidx.collection.h;
import com.google.android.datatransport.cct.internal.LogResponse;

/* JADX INFO: compiled from: AutoValue_LogResponse.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends LogResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93538a;

    public b(long j10) {
        this.f93538a = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LogResponse) && this.f93538a == ((LogResponse) obj).getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public final long getNextRequestWaitMillis() {
        return this.f93538a;
    }

    public final int hashCode() {
        long j10 = this.f93538a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return h.d(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f93538a, "}");
    }
}
