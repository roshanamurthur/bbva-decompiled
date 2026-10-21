package com.google.android.datatransport.runtime.backends;

import androidx.collection.h;

/* JADX INFO: compiled from: AutoValue_BackendResponse.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends BackendResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendResponse.Status f43736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43737b;

    public b(BackendResponse.Status status, long j10) {
        if (status == null) {
            throw new NullPointerException("Null status");
        }
        this.f43736a = status;
        this.f43737b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        return this.f43736a.equals(backendResponse.getStatus()) && this.f43737b == backendResponse.getNextRequestWaitMillis();
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final long getNextRequestWaitMillis() {
        return this.f43737b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public final BackendResponse.Status getStatus() {
        return this.f43736a;
    }

    public final int hashCode() {
        int iHashCode = (this.f43736a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f43737b;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f43736a);
        sb2.append(", nextRequestWaitMillis=");
        return h.d(sb2, this.f43737b, "}");
    }
}
