package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzn;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends zzn {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f46031q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f46032r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ h f46033s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, h hVar, String str) {
        super(taskCompletionSource);
        this.f46033s0 = hVar;
        this.f46031q0 = str;
        this.f46032r0 = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.IInterface, com.google.android.play.core.appupdate.internal.zzf] */
    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        TaskCompletionSource taskCompletionSource = this.f46032r0;
        String str = this.f46031q0;
        h hVar = this.f46033s0;
        try {
            hVar.f46044a.zze().zzd(hVar.f46045b, h.a(hVar, str), new g(hVar, taskCompletionSource, str));
        } catch (RemoteException e5) {
            h.f46042e.zzc(e5, "requestUpdateInfo(%s)", str);
            taskCompletionSource.trySetException(new RuntimeException(e5));
        }
    }
}
