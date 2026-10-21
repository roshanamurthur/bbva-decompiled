package com.google.firebase.installations;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.u;
import androidx.collection.h;

/* JADX INFO: compiled from: AutoValue_InstallationTokenResult.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends InstallationTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48464c;

    /* JADX INFO: renamed from: com.google.firebase.installations.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_InstallationTokenResult.java */
    public static final class C0212a extends InstallationTokenResult.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f48466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f48467c;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult build() {
            String strF = this.f48465a == null ? " token" : "";
            if (this.f48466b == null) {
                strF = strF.concat(" tokenExpirationTimestamp");
            }
            if (this.f48467c == null) {
                strF = u.f(strF, " tokenCreationTimestamp");
            }
            if (strF.isEmpty()) {
                return new a(this.f48465a, this.f48466b.longValue(), this.f48467c.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult.Builder setToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f48465a = str;
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult.Builder setTokenCreationTimestamp(long j10) {
            this.f48467c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public final InstallationTokenResult.Builder setTokenExpirationTimestamp(long j10) {
            this.f48466b = Long.valueOf(j10);
            return this;
        }
    }

    public a(String str, long j10, long j11) {
        this.f48462a = str;
        this.f48463b = j10;
        this.f48464c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        return this.f48462a.equals(installationTokenResult.getToken()) && this.f48463b == installationTokenResult.getTokenExpirationTimestamp() && this.f48464c == installationTokenResult.getTokenCreationTimestamp();
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public final String getToken() {
        return this.f48462a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public final long getTokenCreationTimestamp() {
        return this.f48464c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public final long getTokenExpirationTimestamp() {
        return this.f48463b;
    }

    public final int hashCode() {
        int iHashCode = (this.f48462a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f48463b;
        long j11 = this.f48464c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final InstallationTokenResult.Builder toBuilder() {
        C0212a c0212a = new C0212a();
        c0212a.f48465a = getToken();
        c0212a.f48466b = Long.valueOf(getTokenExpirationTimestamp());
        c0212a.f48467c = Long.valueOf(getTokenCreationTimestamp());
        return c0212a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f48462a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f48463b);
        sb2.append(", tokenCreationTimestamp=");
        return h.d(sb2, this.f48464c, "}");
    }
}
