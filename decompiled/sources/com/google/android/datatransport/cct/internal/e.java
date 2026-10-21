package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_NetworkConnectionInfo.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e extends NetworkConnectionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkConnectionInfo.NetworkType f43666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetworkConnectionInfo.MobileSubtype f43667b;

    /* JADX INFO: compiled from: AutoValue_NetworkConnectionInfo.java */
    public static final class a extends NetworkConnectionInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public NetworkConnectionInfo.NetworkType f43668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public NetworkConnectionInfo.MobileSubtype f43669b;

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final NetworkConnectionInfo build() {
            return new e(this.f43668a, this.f43669b);
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final NetworkConnectionInfo.Builder setMobileSubtype(@Nullable NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.f43669b = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final NetworkConnectionInfo.Builder setNetworkType(@Nullable NetworkConnectionInfo.NetworkType networkType) {
            this.f43668a = networkType;
            return this;
        }
    }

    public e(NetworkConnectionInfo.NetworkType networkType, NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.f43666a = networkType;
        this.f43667b = mobileSubtype;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectionInfo)) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
        NetworkConnectionInfo.NetworkType networkType = this.f43666a;
        if (networkType != null ? networkType.equals(networkConnectionInfo.getNetworkType()) : networkConnectionInfo.getNetworkType() == null) {
            NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f43667b;
            if (mobileSubtype == null) {
                if (networkConnectionInfo.getMobileSubtype() == null) {
                    return true;
                }
            } else if (mobileSubtype.equals(networkConnectionInfo.getMobileSubtype())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public final NetworkConnectionInfo.MobileSubtype getMobileSubtype() {
        return this.f43667b;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    @Nullable
    public final NetworkConnectionInfo.NetworkType getNetworkType() {
        return this.f43666a;
    }

    public final int hashCode() {
        NetworkConnectionInfo.NetworkType networkType = this.f43666a;
        int iHashCode = ((networkType == null ? 0 : networkType.hashCode()) ^ 1000003) * 1000003;
        NetworkConnectionInfo.MobileSubtype mobileSubtype = this.f43667b;
        return (mobileSubtype != null ? mobileSubtype.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f43666a + ", mobileSubtype=" + this.f43667b + "}";
    }
}
