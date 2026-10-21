package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: FirebaseStorageComponent.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f49099a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseApp f49100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Provider<InternalAuthProvider> f49101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Provider<InteropAppCheckTokenProvider> f49102d;

    public c(@NonNull FirebaseApp firebaseApp, @Nullable Provider<InternalAuthProvider> provider, @Nullable Provider<InteropAppCheckTokenProvider> provider2, @NonNull @Blocking Executor executor, @NonNull @UiThread Executor executor2) {
        this.f49100b = firebaseApp;
        this.f49101c = provider;
        this.f49102d = provider2;
        StorageTaskScheduler.initializeExecutors(executor, executor2);
    }
}
