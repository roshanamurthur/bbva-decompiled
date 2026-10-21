package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzn;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends zzn {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f46034q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f46035r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ h f46036s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h hVar, String str) {
        super(taskCompletionSource);
        this.f46036s0 = hVar;
        this.f46034q0 = taskCompletionSource2;
        this.f46035r0 = str;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IInterface, com.google.android.play.core.appupdate.internal.zzf] */
    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        TaskCompletionSource taskCompletionSource = this.f46034q0;
        h hVar = this.f46036s0;
        try {
            hVar.f46044a.zze().zzc(hVar.f46045b, h.b(), new f(hVar, new zzm("OnCompleteUpdateCallback"), taskCompletionSource));
        } catch (RemoteException e5) {
            h.f46042e.zzc(e5, "completeUpdate(%s)", this.f46035r0);
            taskCompletionSource.trySetException(new RuntimeException(e5));
        }
    }
}
