package com.google.firebase.appcheck;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes10.dex */
public interface AppCheckProviderFactory {
    @NonNull
    AppCheckProvider create(@NonNull FirebaseApp firebaseApp);
}
