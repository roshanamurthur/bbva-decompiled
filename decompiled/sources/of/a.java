package of;

import androidx.collection.h;
import com.google.firebase.StartupTime;

/* JADX INFO: compiled from: AutoValue_StartupTime.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends StartupTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f85396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f85397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85398c;

    public a(long j10, long j11, long j12) {
        this.f85396a = j10;
        this.f85397b = j11;
        this.f85398c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        return this.f85396a == startupTime.getEpochMillis() && this.f85397b == startupTime.getElapsedRealtime() && this.f85398c == startupTime.getUptimeMillis();
    }

    @Override // com.google.firebase.StartupTime
    public final long getElapsedRealtime() {
        return this.f85397b;
    }

    @Override // com.google.firebase.StartupTime
    public final long getEpochMillis() {
        return this.f85396a;
    }

    @Override // com.google.firebase.StartupTime
    public final long getUptimeMillis() {
        return this.f85398c;
    }

    public final int hashCode() {
        long j10 = this.f85396a;
        long j11 = this.f85397b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f85398c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f85396a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f85397b);
        sb2.append(", uptimeMillis=");
        return h.d(sb2, this.f85398c, "}");
    }
}
