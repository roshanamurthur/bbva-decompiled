package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes10.dex */
public interface InstallIdProvider {

    @AutoValue
    public static abstract class InstallIds {
        @VisibleForTesting(otherwise = 3)
        public static InstallIds createWithoutFid(String str) {
            return new a(str, null);
        }

        @NonNull
        public abstract String getCrashlyticsInstallId();

        @Nullable
        public abstract String getFirebaseInstallationId();
    }

    InstallIds getInstallIds();
}
