package com.google.firebase.installations.remote;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_InstallationResponse.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends InstallationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TokenResult f48497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InstallationResponse.ResponseCode f48498e;

    /* JADX INFO: renamed from: com.google.firebase.installations.remote.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_InstallationResponse.java */
    public static final class C0214a extends InstallationResponse.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TokenResult f48502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InstallationResponse.ResponseCode f48503e;

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse build() {
            return new a(this.f48499a, this.f48500b, this.f48501c, this.f48502d, this.f48503e);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setAuthToken(TokenResult tokenResult) {
            this.f48502d = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setFid(String str) {
            this.f48500b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setRefreshToken(String str) {
            this.f48501c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setResponseCode(InstallationResponse.ResponseCode responseCode) {
            this.f48503e = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public final InstallationResponse.Builder setUri(String str) {
            this.f48499a = str;
            return this;
        }
    }

    public a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f48494a = str;
        this.f48495b = str2;
        this.f48496c = str3;
        this.f48497d = tokenResult;
        this.f48498e = responseCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f48494a;
        if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
            String str2 = this.f48495b;
            if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                String str3 = this.f48496c;
                if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                    TokenResult tokenResult = this.f48497d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f48498e;
                        if (responseCode == null) {
                            if (installationResponse.getResponseCode() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.getResponseCode())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final TokenResult getAuthToken() {
        return this.f48497d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final String getFid() {
        return this.f48495b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final String getRefreshToken() {
        return this.f48496c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final InstallationResponse.ResponseCode getResponseCode() {
        return this.f48498e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @Nullable
    public final String getUri() {
        return this.f48494a;
    }

    public final int hashCode() {
        String str = this.f48494a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f48495b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f48496c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f48497d;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f48498e;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ iHashCode4;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final InstallationResponse.Builder toBuilder() {
        C0214a c0214a = new C0214a();
        c0214a.f48499a = getUri();
        c0214a.f48500b = getFid();
        c0214a.f48501c = getRefreshToken();
        c0214a.f48502d = getAuthToken();
        c0214a.f48503e = getResponseCode();
        return c0214a;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f48494a + ", fid=" + this.f48495b + ", refreshToken=" + this.f48496c + ", authToken=" + this.f48497d + ", responseCode=" + this.f48498e + "}";
    }
}
