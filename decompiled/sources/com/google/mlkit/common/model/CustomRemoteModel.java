package com.google.mlkit.common.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.ModelType;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class CustomRemoteModel extends RemoteModel {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RemoteModelSource f49379f;

    /* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final RemoteModelSource f49380a;

        public Builder(@NonNull RemoteModelSource remoteModelSource) {
            Preconditions.checkNotNull(remoteModelSource);
            this.f49380a = remoteModelSource;
        }

        @NonNull
        public CustomRemoteModel build() {
            return new CustomRemoteModel(this.f49380a);
        }
    }

    public /* synthetic */ CustomRemoteModel(RemoteModelSource remoteModelSource) {
        super(TextUtils.isEmpty(remoteModelSource.zza()) ? "no_model_name" : remoteModelSource.zza(), null, ModelType.CUSTOM);
        this.f49379f = remoteModelSource;
    }

    @NonNull
    @KeepForSdk
    public RemoteModelSource getRemoteModelSource() {
        return this.f49379f;
    }
}
