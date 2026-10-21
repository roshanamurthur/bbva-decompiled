package com.google.android.play.core.appupdate.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.play.integrity.internal.v;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46058b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f46057a = i10;
        this.f46058b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i10 = this.f46057a;
        Object obj = this.f46058b;
        switch (i10) {
            case 0:
                zzx zzxVar = (zzx) obj;
                zzxVar.f46073b.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                zzxVar.zzc().post(new d(this, iBinder));
                break;
            default:
                v vVar = (v) obj;
                vVar.f46388b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                vVar.c().post(new ze.d(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = this.f46057a;
        Object obj = this.f46058b;
        switch (i10) {
            case 0:
                zzx zzxVar = (zzx) obj;
                zzxVar.f46073b.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                zzxVar.zzc().post(new e(this));
                break;
            default:
                v vVar = (v) obj;
                vVar.f46388b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                vVar.c().post(new ze.e(this));
                break;
        }
    }
}
