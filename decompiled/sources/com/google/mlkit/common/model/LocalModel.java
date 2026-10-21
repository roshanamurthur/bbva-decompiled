package com.google.mlkit.common.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public class LocalModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f49385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f49386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Uri f49387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f49388d;

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f49389a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f49390b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Uri f49391c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f49392d = false;

        @NonNull
        public LocalModel build() {
            String str = this.f49389a;
            boolean z10 = true;
            if ((str == null || this.f49390b != null || this.f49391c != null) && ((str != null || this.f49390b == null || this.f49391c != null) && (str != null || this.f49390b != null || this.f49391c == null))) {
                z10 = false;
            }
            Preconditions.checkArgument(z10, "Set one of filePath, assetFilePath and URI.");
            return new LocalModel(this.f49389a, this.f49390b, this.f49391c, this.f49392d);
        }

        @NonNull
        public Builder setAbsoluteFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            boolean z10 = false;
            if (this.f49390b == null && this.f49391c == null && !this.f49392d) {
                z10 = true;
            }
            Preconditions.checkArgument(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f49389a = str;
            return this;
        }

        @NonNull
        public Builder setAbsoluteManifestFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Manifest file path can not be empty");
            boolean z10 = false;
            if (this.f49390b == null && this.f49391c == null && (this.f49389a == null || this.f49392d)) {
                z10 = true;
            }
            Preconditions.checkArgument(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f49389a = str;
            this.f49392d = true;
            return this;
        }

        @NonNull
        public Builder setAssetFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            boolean z10 = false;
            if (this.f49389a == null && this.f49391c == null && !this.f49392d) {
                z10 = true;
            }
            Preconditions.checkArgument(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f49390b = str;
            return this;
        }

        @NonNull
        public Builder setAssetManifestFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Manifest file path can not be empty");
            boolean z10 = false;
            if (this.f49389a == null && this.f49391c == null && (this.f49390b == null || this.f49392d)) {
                z10 = true;
            }
            Preconditions.checkArgument(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f49390b = str;
            this.f49392d = true;
            return this;
        }

        @NonNull
        public Builder setUri(@NonNull Uri uri) {
            boolean z10 = false;
            if (this.f49389a == null && this.f49390b == null) {
                z10 = true;
            }
            Preconditions.checkArgument(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.f49391c = uri;
            return this;
        }
    }

    public /* synthetic */ LocalModel(String str, String str2, Uri uri, boolean z10) {
        this.f49385a = str;
        this.f49386b = str2;
        this.f49387c = uri;
        this.f49388d = z10;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalModel)) {
            return false;
        }
        LocalModel localModel = (LocalModel) obj;
        return Objects.equal(this.f49385a, localModel.f49385a) && Objects.equal(this.f49386b, localModel.f49386b) && Objects.equal(this.f49387c, localModel.f49387c) && this.f49388d == localModel.f49388d;
    }

    @Nullable
    @KeepForSdk
    public String getAbsoluteFilePath() {
        return this.f49385a;
    }

    @Nullable
    @KeepForSdk
    public String getAssetFilePath() {
        return this.f49386b;
    }

    @Nullable
    @KeepForSdk
    public Uri getUri() {
        return this.f49387c;
    }

    public int hashCode() {
        return Objects.hashCode(this.f49385a, this.f49386b, this.f49387c, Boolean.valueOf(this.f49388d));
    }

    @KeepForSdk
    public boolean isManifestFile() {
        return this.f49388d;
    }

    @NonNull
    public String toString() {
        zzq zzqVarZza = zzr.zza(this);
        zzqVarZza.zza("absoluteFilePath", this.f49385a);
        zzqVarZza.zza("assetFilePath", this.f49386b);
        zzqVarZza.zza("uri", this.f49387c);
        zzqVarZza.zzb("isManifestFile", this.f49388d);
        return zzqVarZza.toString();
    }
}
