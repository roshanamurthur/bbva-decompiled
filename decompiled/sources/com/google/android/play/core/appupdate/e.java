package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzg;
import com.google.android.play.core.appupdate.internal.zzm;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class e extends zzg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzm f46037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TaskCompletionSource f46038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f46039g;

    public e(h hVar, zzm zzmVar, TaskCompletionSource taskCompletionSource) {
        this.f46039g = hVar;
        this.f46037e = zzmVar;
        this.f46038f = taskCompletionSource;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzh
    public void zzb(Bundle bundle) throws RemoteException {
        this.f46039g.f46044a.zzu(this.f46038f);
        this.f46037e.zzd("onCompleteUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.appupdate.internal.zzh
    public void zzc(Bundle bundle) throws RemoteException {
        this.f46039g.f46044a.zzu(this.f46038f);
        this.f46037e.zzd("onRequestInfo", new Object[0]);
    }
}
