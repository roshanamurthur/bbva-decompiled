package gg;

import com.google.firebase.heartbeatinfo.HeartBeatResult;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_HeartBeatResult.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends HeartBeatResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f68605b;

    public a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f68604a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f68605b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        return this.f68604a.equals(heartBeatResult.getUserAgent()) && this.f68605b.equals(heartBeatResult.getUsedDates());
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final List<String> getUsedDates() {
        return this.f68605b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final String getUserAgent() {
        return this.f68604a;
    }

    public final int hashCode() {
        return ((this.f68604a.hashCode() ^ 1000003) * 1000003) ^ this.f68605b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeartBeatResult{userAgent=");
        sb2.append(this.f68604a);
        sb2.append(", usedDates=");
        return androidx.camera.core.imagecapture.a.c(sb2, this.f68605b, "}");
    }
}
