package com.google.mlkit.common.model;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public class DownloadConditions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49382b;

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f49383a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f49384b = false;

        @NonNull
        public DownloadConditions build() {
            return new DownloadConditions(this.f49383a, this.f49384b);
        }

        @NonNull
        @RequiresApi(24)
        @TargetApi(24)
        public Builder requireCharging() {
            this.f49383a = true;
            return this;
        }

        @NonNull
        public Builder requireWifi() {
            this.f49384b = true;
            return this;
        }
    }

    public /* synthetic */ DownloadConditions(boolean z10, boolean z11) {
        this.f49381a = z10;
        this.f49382b = z11;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadConditions)) {
            return false;
        }
        DownloadConditions downloadConditions = (DownloadConditions) obj;
        return this.f49381a == downloadConditions.f49381a && this.f49382b == downloadConditions.f49382b;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f49381a), Boolean.valueOf(this.f49382b));
    }

    public boolean isChargingRequired() {
        return this.f49381a;
    }

    public boolean isWifiRequired() {
        return this.f49382b;
    }
}
