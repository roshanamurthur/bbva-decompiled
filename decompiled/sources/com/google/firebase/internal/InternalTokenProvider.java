package com.google.firebase.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.GetTokenResult;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public interface InternalTokenProvider {
    @NonNull
    @KeepForSdk
    Task<GetTokenResult> getAccessToken(boolean z10);

    @Nullable
    @KeepForSdk
    String getUid();
}
