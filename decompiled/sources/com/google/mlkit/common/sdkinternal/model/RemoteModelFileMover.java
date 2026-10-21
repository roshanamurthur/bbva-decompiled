package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
import java.io.File;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public interface RemoteModelFileMover {
    @NonNull
    @KeepForSdk
    File getModelFileDestination() throws MlKitException;

    @Nullable
    @KeepForSdk
    File moveAllFilesFromPrivateTempToPrivateDestination(@NonNull File file) throws MlKitException;
}
