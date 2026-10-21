package com.google.android.play.core.review;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends com.google.android.play.core.review.internal.zzj {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f46207q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ zzi f46208r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zzi zziVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f46208r0 = zziVar;
        this.f46207q0 = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.IInterface, com.google.android.play.core.review.internal.zzf] */
    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        TaskCompletionSource taskCompletionSource = this.f46207q0;
        zzi zziVar = this.f46208r0;
        try {
            zziVar.f46240a.zze().zzc(zziVar.f46241b, zzj.zza(), new c(zziVar, taskCompletionSource));
        } catch (RemoteException e5) {
            zzi.f46239c.zzc(e5, "error requesting in-app review for %s", zziVar.f46241b);
            taskCompletionSource.trySetException(new RuntimeException(e5));
        }
    }
}
