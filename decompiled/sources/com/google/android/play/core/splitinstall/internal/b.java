package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends zzv {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ IBinder f46261q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ d f46262r0;

    public b(d dVar, IBinder iBinder) {
        this.f46262r0 = dVar;
        this.f46261q0 = iBinder;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        d dVar = this.f46262r0;
        dVar.f46264a.m = zzbn.zzb(this.f46261q0);
        zzaf zzafVar = dVar.f46264a;
        zzafVar.f46287b.zzd("linkToDeath", new Object[0]);
        try {
            zzafVar.m.asBinder().linkToDeath(zzafVar.f46295j, 0);
        } catch (RemoteException e5) {
            zzafVar.f46287b.zzc(e5, "linkToDeath failed", new Object[0]);
        }
        zzafVar.f46292g = false;
        Iterator it = zzafVar.f46289d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zzafVar.f46289d.clear();
    }
}
