package com.google.android.play.core.splitinstall.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class s extends zzv {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f46281q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ zzv f46282r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ zzaf f46283s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(zzaf zzafVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzv zzvVar) {
        super(taskCompletionSource);
        this.f46283s0 = zzafVar;
        this.f46281q0 = taskCompletionSource2;
        this.f46282r0 = zzvVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        synchronized (this.f46283s0.f46291f) {
            try {
                final zzaf zzafVar = this.f46283s0;
                final TaskCompletionSource taskCompletionSource = this.f46281q0;
                zzafVar.f46290e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.splitinstall.internal.zzw
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        zzaf zzafVar2 = zzafVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (zzafVar2.f46291f) {
                            zzafVar2.f46290e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.f46283s0.f46296k.getAndIncrement() > 0) {
                    this.f46283s0.f46287b.zzd("Already connected to the service.", new Object[0]);
                }
                zzaf.a(this.f46283s0, this.f46282r0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
