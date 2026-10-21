package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes10.dex */
public final class FirebaseOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47564g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f47568d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f47569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f47570f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f47571g;

        public Builder() {
        }

        public Builder(@NonNull FirebaseOptions firebaseOptions) {
            this.f47566b = firebaseOptions.f47559b;
            this.f47565a = firebaseOptions.f47558a;
            this.f47567c = firebaseOptions.f47560c;
            this.f47568d = firebaseOptions.f47561d;
            this.f47569e = firebaseOptions.f47562e;
            this.f47570f = firebaseOptions.f47563f;
            this.f47571g = firebaseOptions.f47564g;
        }

        @NonNull
        public FirebaseOptions build() {
            return new FirebaseOptions(this.f47566b, this.f47565a, this.f47567c, this.f47568d, this.f47569e, this.f47570f, this.f47571g);
        }

        @NonNull
        public Builder setApiKey(@NonNull String str) {
            this.f47565a = Preconditions.checkNotEmpty(str, "ApiKey must be set.");
            return this;
        }

        @NonNull
        public Builder setApplicationId(@NonNull String str) {
            this.f47566b = Preconditions.checkNotEmpty(str, "ApplicationId must be set.");
            return this;
        }

        @NonNull
        public Builder setDatabaseUrl(@Nullable String str) {
            this.f47567c = str;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setGaTrackingId(@Nullable String str) {
            this.f47568d = str;
            return this;
        }

        @NonNull
        public Builder setGcmSenderId(@Nullable String str) {
            this.f47569e = str;
            return this;
        }

        @NonNull
        public Builder setProjectId(@Nullable String str) {
            this.f47571g = str;
            return this;
        }

        @NonNull
        public Builder setStorageBucket(@Nullable String str) {
            this.f47570f = str;
            return this;
        }
    }

    public FirebaseOptions(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f47559b = str;
        this.f47558a = str2;
        this.f47560c = str3;
        this.f47561d = str4;
        this.f47562e = str5;
        this.f47563f = str6;
        this.f47564g = str7;
    }

    @Nullable
    public static FirebaseOptions fromResource(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new FirebaseOptions(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return Objects.equal(this.f47559b, firebaseOptions.f47559b) && Objects.equal(this.f47558a, firebaseOptions.f47558a) && Objects.equal(this.f47560c, firebaseOptions.f47560c) && Objects.equal(this.f47561d, firebaseOptions.f47561d) && Objects.equal(this.f47562e, firebaseOptions.f47562e) && Objects.equal(this.f47563f, firebaseOptions.f47563f) && Objects.equal(this.f47564g, firebaseOptions.f47564g);
    }

    @NonNull
    public String getApiKey() {
        return this.f47558a;
    }

    @NonNull
    public String getApplicationId() {
        return this.f47559b;
    }

    @Nullable
    public String getDatabaseUrl() {
        return this.f47560c;
    }

    @Nullable
    @KeepForSdk
    public String getGaTrackingId() {
        return this.f47561d;
    }

    @Nullable
    public String getGcmSenderId() {
        return this.f47562e;
    }

    @Nullable
    public String getProjectId() {
        return this.f47564g;
    }

    @Nullable
    public String getStorageBucket() {
        return this.f47563f;
    }

    public int hashCode() {
        return Objects.hashCode(this.f47559b, this.f47558a, this.f47560c, this.f47561d, this.f47562e, this.f47563f, this.f47564g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f47559b).add("apiKey", this.f47558a).add("databaseUrl", this.f47560c).add("gcmSenderId", this.f47562e).add("storageBucket", this.f47563f).add("projectId", this.f47564g).toString();
    }
}
