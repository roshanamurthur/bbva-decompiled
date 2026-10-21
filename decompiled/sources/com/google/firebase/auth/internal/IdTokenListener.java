package com.google.firebase.auth.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.internal.InternalTokenResult;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public interface IdTokenListener {
    @KeepForSdk
    void onIdTokenChanged(@NonNull InternalTokenResult internalTokenResult);
}
