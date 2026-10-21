package com.google.android.play.core.splitinstall.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzaf f46264a;

    public /* synthetic */ d(zzaf zzafVar) {
        this.f46264a = zzafVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzaf zzafVar = this.f46264a;
        zzafVar.f46287b.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzafVar.zzc().post(new b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzaf zzafVar = this.f46264a;
        zzafVar.f46287b.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzafVar.zzc().post(new c(this));
    }
}
