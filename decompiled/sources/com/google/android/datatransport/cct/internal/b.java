package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_ClientInfo.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends ClientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientInfo.ClientType f43634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidClientInfo f43635b;

    /* JADX INFO: compiled from: AutoValue_ClientInfo.java */
    public static final class a extends ClientInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClientInfo.ClientType f43636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AndroidClientInfo f43637b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo build() {
            return new b(this.f43636a, this.f43637b);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo.Builder setAndroidClientInfo(@Nullable AndroidClientInfo androidClientInfo) {
            this.f43637b = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo.Builder setClientType(@Nullable ClientInfo.ClientType clientType) {
            this.f43636a = clientType;
            return this;
        }
    }

    public b(ClientInfo.ClientType clientType, AndroidClientInfo androidClientInfo) {
        this.f43634a = clientType;
        this.f43635b = androidClientInfo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f43634a;
        if (clientType != null ? clientType.equals(clientInfo.getClientType()) : clientInfo.getClientType() == null) {
            AndroidClientInfo androidClientInfo = this.f43635b;
            if (androidClientInfo == null) {
                if (clientInfo.getAndroidClientInfo() == null) {
                    return true;
                }
            } else if (androidClientInfo.equals(clientInfo.getAndroidClientInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final AndroidClientInfo getAndroidClientInfo() {
        return this.f43635b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    @Nullable
    public final ClientInfo.ClientType getClientType() {
        return this.f43634a;
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f43634a;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f43635b;
        return (androidClientInfo != null ? androidClientInfo.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f43634a + ", androidClientInfo=" + this.f43635b + "}";
    }
}
