package com.google.firebase.internal.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class FirebaseNoSignedInUserException extends FirebaseException {
    @KeepForSdk
    public FirebaseNoSignedInUserException(@NonNull String str) {
        super(str);
    }
}
