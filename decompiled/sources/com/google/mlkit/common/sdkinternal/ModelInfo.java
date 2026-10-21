package com.google.mlkit.common.sdkinternal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class ModelInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f49419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ModelType f49421d;

    @KeepForSdk
    public ModelInfo(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull ModelType modelType) {
        this.f49418a = str;
        this.f49419b = uri;
        this.f49420c = str2;
        this.f49421d = modelType;
    }

    @NonNull
    @KeepForSdk
    public String getModelHash() {
        return this.f49420c;
    }

    @NonNull
    @KeepForSdk
    public String getModelNameForPersist() {
        return this.f49418a;
    }

    @NonNull
    @KeepForSdk
    public ModelType getModelType() {
        return this.f49421d;
    }

    @NonNull
    @KeepForSdk
    public Uri getModelUri() {
        return this.f49419b;
    }
}
