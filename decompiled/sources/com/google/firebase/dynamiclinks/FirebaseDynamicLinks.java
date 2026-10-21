package com.google.firebase.dynamiclinks;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FirebaseDynamicLinks {
    @NonNull
    public static synchronized FirebaseDynamicLinks getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    public abstract DynamicLink.Builder createDynamicLink();

    @NonNull
    public abstract Task<PendingDynamicLinkData> getDynamicLink(@Nullable Intent intent);

    @NonNull
    public abstract Task<PendingDynamicLinkData> getDynamicLink(@NonNull Uri uri);

    @NonNull
    public static synchronized FirebaseDynamicLinks getInstance(@NonNull FirebaseApp firebaseApp) {
        return (FirebaseDynamicLinks) firebaseApp.get(FirebaseDynamicLinks.class);
    }
}
