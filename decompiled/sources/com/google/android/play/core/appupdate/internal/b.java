package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends zzn {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f46050q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ zzn f46051r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ zzx f46052s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zzx zzxVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzn zznVar) {
        super(taskCompletionSource);
        this.f46052s0 = zzxVar;
        this.f46050q0 = taskCompletionSource2;
        this.f46051r0 = zznVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        synchronized (this.f46052s0.f46077f) {
            try {
                final zzx zzxVar = this.f46052s0;
                final TaskCompletionSource taskCompletionSource = this.f46050q0;
                zzxVar.f46076e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.appupdate.internal.zzo
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        zzx zzxVar2 = zzxVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (zzxVar2.f46077f) {
                            zzxVar2.f46076e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.f46052s0.f46082k.getAndIncrement() > 0) {
                    this.f46052s0.f46073b.zzd("Already connected to the service.", new Object[0]);
                }
                zzx.a(this.f46052s0, this.f46051r0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
