package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends zzn {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ IBinder f46054q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ f f46055r0;

    public d(f fVar, IBinder iBinder) {
        this.f46055r0 = fVar;
        this.f46054q0 = iBinder;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        f fVar = this.f46055r0;
        ((zzx) fVar.f46058b).m = zze.zzb(this.f46054q0);
        Object obj = fVar.f46058b;
        zzx zzxVar = (zzx) obj;
        zzxVar.f46073b.zzd("linkToDeath", new Object[0]);
        try {
            zzxVar.m.asBinder().linkToDeath(zzxVar.f46081j, 0);
        } catch (RemoteException e5) {
            zzxVar.f46073b.zzc(e5, "linkToDeath failed", new Object[0]);
        }
        zzx zzxVar2 = (zzx) obj;
        zzxVar2.f46078g = false;
        Iterator it = zzxVar2.f46075d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((zzx) obj).f46075d.clear();
    }
}
