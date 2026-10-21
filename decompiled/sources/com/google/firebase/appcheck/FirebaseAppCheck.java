package com.google.firebase.appcheck;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;

/* JADX INFO: loaded from: classes10.dex */
public abstract class FirebaseAppCheck implements InteropAppCheckTokenProvider {

    public interface AppCheckListener {
        void onAppCheckTokenChanged(@NonNull AppCheckToken appCheckToken);
    }

    @NonNull
    public static FirebaseAppCheck getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public abstract void addAppCheckListener(@NonNull AppCheckListener appCheckListener);

    @NonNull
    public abstract Task<AppCheckToken> getAppCheckToken(boolean z10);

    @NonNull
    public abstract Task<AppCheckToken> getLimitedUseAppCheckToken();

    public abstract void installAppCheckProviderFactory(@NonNull AppCheckProviderFactory appCheckProviderFactory);

    @SuppressLint({"FirebaseLambdaLast"})
    public abstract void installAppCheckProviderFactory(@NonNull AppCheckProviderFactory appCheckProviderFactory, boolean z10);

    public abstract void removeAppCheckListener(@NonNull AppCheckListener appCheckListener);

    public abstract void setTokenAutoRefreshEnabled(boolean z10);

    @NonNull
    public static FirebaseAppCheck getInstance(@NonNull FirebaseApp firebaseApp) {
        return (FirebaseAppCheck) firebaseApp.get(FirebaseAppCheck.class);
    }
}
