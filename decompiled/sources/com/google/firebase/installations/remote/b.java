package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_TokenResult.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends TokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TokenResult.ResponseCode f48506c;

    /* JADX INFO: compiled from: AutoValue_TokenResult.java */
    public static final class a extends TokenResult.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f48508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TokenResult.ResponseCode f48509c;

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final TokenResult build() {
            String str = this.f48508b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.f48507a, this.f48508b.longValue(), this.f48509c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
            this.f48509c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final TokenResult.Builder setToken(String str) {
            this.f48507a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public final TokenResult.Builder setTokenExpirationTimestamp(long j10) {
            this.f48508b = Long.valueOf(j10);
            return this;
        }
    }

    public b(String str, long j10, TokenResult.ResponseCode responseCode) {
        this.f48504a = str;
        this.f48505b = j10;
        this.f48506c = responseCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f48504a;
        if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
            if (this.f48505b == tokenResult.getTokenExpirationTimestamp()) {
                TokenResult.ResponseCode responseCode = this.f48506c;
                if (responseCode == null) {
                    if (tokenResult.getResponseCode() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.getResponseCode())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public final TokenResult.ResponseCode getResponseCode() {
        return this.f48506c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @Nullable
    public final String getToken() {
        return this.f48504a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @NonNull
    public final long getTokenExpirationTimestamp() {
        return this.f48505b;
    }

    public final int hashCode() {
        String str = this.f48504a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f48505b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f48506c;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ i10;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final TokenResult.Builder toBuilder() {
        a aVar = new a();
        aVar.f48507a = getToken();
        aVar.f48508b = Long.valueOf(getTokenExpirationTimestamp());
        aVar.f48509c = getResponseCode();
        return aVar;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f48504a + ", tokenExpirationTimestamp=" + this.f48505b + ", responseCode=" + this.f48506c + "}";
    }
}
