package com.google.firebase.installations.local;

import ad.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.u;

/* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends PersistedInstallationEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f48476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f48481g;

    /* JADX INFO: renamed from: com.google.firebase.installations.local.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
    public static final class C0213a extends PersistedInstallationEntry.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f48483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f48485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f48486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f48487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f48488g;

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry build() {
            String strF = this.f48483b == null ? " registrationStatus" : "";
            if (this.f48486e == null) {
                strF = strF.concat(" expiresInSecs");
            }
            if (this.f48487f == null) {
                strF = u.f(strF, " tokenCreationEpochInSecs");
            }
            if (strF.isEmpty()) {
                return new a(this.f48482a, this.f48483b, this.f48484c, this.f48485d, this.f48486e.longValue(), this.f48487f.longValue(), this.f48488g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setAuthToken(@Nullable String str) {
            this.f48484c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setExpiresInSecs(long j10) {
            this.f48486e = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.f48482a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setFisError(@Nullable String str) {
            this.f48488g = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setRefreshToken(@Nullable String str) {
            this.f48485d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f48483b = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j10) {
            this.f48487f = Long.valueOf(j10);
            return this;
        }
    }

    public a(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j10, long j11, String str4) {
        this.f48475a = str;
        this.f48476b = registrationStatus;
        this.f48477c = str2;
        this.f48478d = str3;
        this.f48479e = j10;
        this.f48480f = j11;
        this.f48481g = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str3 = this.f48475a;
        if (str3 != null ? str3.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
            if (this.f48476b.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.f48477c) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.f48478d) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.f48479e == persistedInstallationEntry.getExpiresInSecs() && this.f48480f == persistedInstallationEntry.getTokenCreationEpochInSecs()) {
                String str4 = this.f48481g;
                if (str4 == null) {
                    if (persistedInstallationEntry.getFisError() == null) {
                        return true;
                    }
                } else if (str4.equals(persistedInstallationEntry.getFisError())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public final String getAuthToken() {
        return this.f48477c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long getExpiresInSecs() {
        return this.f48479e;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public final String getFirebaseInstallationId() {
        return this.f48475a;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public final String getFisError() {
        return this.f48481g;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @Nullable
    public final String getRefreshToken() {
        return this.f48478d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    @NonNull
    public final PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.f48476b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long getTokenCreationEpochInSecs() {
        return this.f48480f;
    }

    public final int hashCode() {
        String str = this.f48475a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f48476b.hashCode()) * 1000003;
        String str2 = this.f48477c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f48478d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f48479e;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f48480f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f48481g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final PersistedInstallationEntry.Builder toBuilder() {
        C0213a c0213a = new C0213a();
        c0213a.f48482a = getFirebaseInstallationId();
        c0213a.f48483b = getRegistrationStatus();
        c0213a.f48484c = getAuthToken();
        c0213a.f48485d = getRefreshToken();
        c0213a.f48486e = Long.valueOf(getExpiresInSecs());
        c0213a.f48487f = Long.valueOf(getTokenCreationEpochInSecs());
        c0213a.f48488g = getFisError();
        return c0213a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f48475a);
        sb2.append(", registrationStatus=");
        sb2.append(this.f48476b);
        sb2.append(", authToken=");
        sb2.append(this.f48477c);
        sb2.append(", refreshToken=");
        sb2.append(this.f48478d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f48479e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f48480f);
        sb2.append(", fisError=");
        return d.f(sb2, this.f48481g, "}");
    }
}
