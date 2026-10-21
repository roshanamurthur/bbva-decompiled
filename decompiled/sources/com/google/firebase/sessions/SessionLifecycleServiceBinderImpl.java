package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import com.google.firebase.FirebaseApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SessionLifecycleServiceBinder.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl;", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "Landroid/os/Messenger;", "callback", "Landroid/content/ServiceConnection;", "serviceConnection", "", "bindToService", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "<init>", "(Lcom/google/firebase/FirebaseApp;)V", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {

    @NotNull
    public static final String TAG = "LifecycleServiceBinder";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FirebaseApp f48898a;

    public SessionLifecycleServiceBinderImpl(@NotNull FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        this.f48898a = firebaseApp;
    }

    @Override // com.google.firebase.sessions.SessionLifecycleServiceBinder
    public void bindToService(@NotNull Messenger callback, @NotNull ServiceConnection serviceConnection) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        Context applicationContext = this.f48898a.getApplicationContext().getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra(SessionLifecycleService.CLIENT_CALLBACK_MESSENGER, callback);
        applicationContext.bindService(intent, serviceConnection, 65);
    }
}
