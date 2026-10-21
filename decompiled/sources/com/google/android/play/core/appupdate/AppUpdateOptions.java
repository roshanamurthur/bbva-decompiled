package com.google.android.play.core.appupdate;

import androidx.annotation.NonNull;
import com.google.android.play.core.install.model.AppUpdateType;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AppUpdateOptions {

    /* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
    public static abstract class Builder {
        @NonNull
        public abstract AppUpdateOptions build();

        @NonNull
        public abstract Builder setAllowAssetPackDeletion(boolean z10);

        @NonNull
        public abstract Builder setAppUpdateType(@AppUpdateType int i10);
    }

    @NonNull
    public static AppUpdateOptions defaultOptions(@AppUpdateType int i10) {
        return newBuilder(i10).build();
    }

    @NonNull
    public static Builder newBuilder(@AppUpdateType int i10) {
        j jVar = new j();
        jVar.setAppUpdateType(i10);
        jVar.setAllowAssetPackDeletion(false);
        return jVar;
    }

    public abstract boolean allowAssetPackDeletion();

    @AppUpdateType
    public abstract int appUpdateType();
}
