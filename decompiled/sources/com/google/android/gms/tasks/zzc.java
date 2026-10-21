package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.isCanceled()) {
            this.zzb.zzc.zzc();
            return;
        }
        try {
            this.zzb.zzc.zzb(this.zzb.zzb.then(this.zza));
        } catch (RuntimeExecutionException e5) {
            if (e5.getCause() instanceof Exception) {
                this.zzb.zzc.zza((Exception) e5.getCause());
            } else {
                this.zzb.zzc.zza(e5);
            }
        } catch (Exception e7) {
            this.zzb.zzc.zza(e7);
        }
    }
}
