package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.util.Util;

/* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ c.e f38735p0;

    public e(c.e eVar) {
        this.f38735p0 = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f38735p0.f38727d;
        c.e eVar = this.f38735p0;
        eVar.f38727d = eVar.b();
        if (z10 != this.f38735p0.f38727d) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                boolean z11 = this.f38735p0.f38727d;
            }
            c.e eVar2 = this.f38735p0;
            boolean z12 = eVar2.f38727d;
            eVar2.getClass();
            Util.postOnUiThread(new f(eVar2, z12));
        }
    }
}
