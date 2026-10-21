package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public class FirebaseAuthException extends FirebaseException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f47640p0;

    public FirebaseAuthException(@NonNull String str, @NonNull String str2) {
        super(str2);
        this.f47640p0 = Preconditions.checkNotEmpty(str);
    }

    @NonNull
    public String getErrorCode() {
        return this.f47640p0;
    }
}
