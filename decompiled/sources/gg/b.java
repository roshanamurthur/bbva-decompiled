package gg;

import androidx.collection.h;
import com.google.firebase.heartbeatinfo.SdkHeartBeatResult;

/* JADX INFO: compiled from: AutoValue_SdkHeartBeatResult.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends SdkHeartBeatResult {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f68606p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f68607q0;

    public b(String str, long j10) {
        if (str == null) {
            throw new NullPointerException("Null sdkName");
        }
        this.f68606p0 = str;
        this.f68607q0 = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkHeartBeatResult)) {
            return false;
        }
        SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
        return this.f68606p0.equals(sdkHeartBeatResult.getSdkName()) && this.f68607q0 == sdkHeartBeatResult.getMillis();
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public final long getMillis() {
        return this.f68607q0;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public final String getSdkName() {
        return this.f68606p0;
    }

    public final int hashCode() {
        int iHashCode = (this.f68606p0.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f68607q0;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SdkHeartBeatResult{sdkName=");
        sb2.append(this.f68606p0);
        sb2.append(", millis=");
        return h.d(sb2, this.f68607q0, "}");
    }
}
