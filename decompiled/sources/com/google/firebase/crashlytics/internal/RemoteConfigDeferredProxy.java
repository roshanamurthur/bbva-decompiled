package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import wf.b;

/* JADX INFO: loaded from: classes10.dex */
public class RemoteConfigDeferredProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred<FirebaseRemoteConfigInterop> f47706a;

    public RemoteConfigDeferredProxy(Deferred<FirebaseRemoteConfigInterop> deferred) {
        this.f47706a = deferred;
    }

    public void setupListener(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.getLogger().w("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            this.f47706a.whenAvailable(new b(new CrashlyticsRemoteConfigListener(userMetadata)));
        }
    }
}
