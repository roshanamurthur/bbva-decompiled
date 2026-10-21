package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* JADX INFO: loaded from: classes10.dex */
public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@NonNull String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@NonNull String str, @NonNull Throwable th2) {
        super(str, th2);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
