package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzg;
import com.google.android.play.core.review.internal.zzt;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends zzg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.play.core.review.internal.zzi f46209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TaskCompletionSource f46210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzi f46211g;

    public c(zzi zziVar, TaskCompletionSource taskCompletionSource) {
        com.google.android.play.core.review.internal.zzi zziVar2 = new com.google.android.play.core.review.internal.zzi("OnRequestInstallCallback");
        this.f46211g = zziVar;
        this.f46209e = zziVar2;
        this.f46210f = taskCompletionSource;
    }

    @Override // com.google.android.play.core.review.internal.zzh
    public final void zzb(Bundle bundle) throws RemoteException {
        zzt zztVar = this.f46211g.f46240a;
        TaskCompletionSource taskCompletionSource = this.f46210f;
        if (zztVar != null) {
            zztVar.zzr(taskCompletionSource);
        }
        this.f46209e.zzd("onGetLaunchReviewFlowInfo", new Object[0]);
        taskCompletionSource.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
