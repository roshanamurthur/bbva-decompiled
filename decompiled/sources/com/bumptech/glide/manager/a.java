package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: DefaultConnectivityMonitor.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements ConnectivityMonitor {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f38704p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ConnectivityMonitor.ConnectivityListener f38705q0;

    public a(@NonNull Context context, @NonNull ConnectivityMonitor.ConnectivityListener connectivityListener) {
        this.f38704p0 = context.getApplicationContext();
        this.f38705q0 = connectivityListener;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        c cVarA = c.a(this.f38704p0);
        ConnectivityMonitor.ConnectivityListener connectivityListener = this.f38705q0;
        synchronized (cVarA) {
            cVarA.f38714b.add(connectivityListener);
            if (!cVarA.f38715c && !cVarA.f38714b.isEmpty()) {
                cVarA.f38715c = cVarA.f38713a.a();
            }
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        c cVarA = c.a(this.f38704p0);
        ConnectivityMonitor.ConnectivityListener connectivityListener = this.f38705q0;
        synchronized (cVarA) {
            cVarA.f38714b.remove(connectivityListener);
            if (cVarA.f38715c && cVarA.f38714b.isEmpty()) {
                cVarA.f38713a.unregister();
                cVarA.f38715c = false;
            }
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }
}
