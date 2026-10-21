package com.google.firebase.appcheck.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.AppCheckTokenResult;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultAppCheckTokenResult extends AppCheckTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseException f47599b;

    public DefaultAppCheckTokenResult(@NonNull String str, @Nullable FirebaseException firebaseException) {
        Preconditions.checkNotEmpty(str);
        this.f47598a = str;
        this.f47599b = firebaseException;
    }

    @NonNull
    public static DefaultAppCheckTokenResult constructFromAppCheckToken(@NonNull AppCheckToken appCheckToken) {
        Preconditions.checkNotNull(appCheckToken);
        return new DefaultAppCheckTokenResult(appCheckToken.getToken(), null);
    }

    @NonNull
    public static DefaultAppCheckTokenResult constructFromError(@NonNull FirebaseException firebaseException) {
        return new DefaultAppCheckTokenResult("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", (FirebaseException) Preconditions.checkNotNull(firebaseException));
    }

    @Override // com.google.firebase.appcheck.AppCheckTokenResult
    @Nullable
    public Exception getError() {
        return this.f47599b;
    }

    @Override // com.google.firebase.appcheck.AppCheckTokenResult
    @NonNull
    public String getToken() {
        return this.f47598a;
    }
}
