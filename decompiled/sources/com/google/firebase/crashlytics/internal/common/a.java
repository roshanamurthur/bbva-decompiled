package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends InstallIdProvider.InstallIds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47781b;

    public a(String str, @Nullable String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f47780a = str;
        this.f47781b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallIdProvider.InstallIds)) {
            return false;
        }
        InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
        if (this.f47780a.equals(installIds.getCrashlyticsInstallId())) {
            String str = this.f47781b;
            if (str == null) {
                if (installIds.getFirebaseInstallationId() == null) {
                    return true;
                }
            } else if (str.equals(installIds.getFirebaseInstallationId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @NonNull
    public final String getCrashlyticsInstallId() {
        return this.f47780a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    @Nullable
    public final String getFirebaseInstallationId() {
        return this.f47781b;
    }

    public final int hashCode() {
        int iHashCode = (this.f47780a.hashCode() ^ 1000003) * 1000003;
        String str = this.f47781b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f47780a);
        sb2.append(", firebaseInstallationId=");
        return ad.d.f(sb2, this.f47781b, "}");
    }
}
