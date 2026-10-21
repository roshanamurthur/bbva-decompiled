package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzz implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ Callable zzb;

    public zzz(zzw zzwVar, Callable callable) {
        this.zza = zzwVar;
        this.zzb = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.zzb(this.zzb.call());
        } catch (Exception e5) {
            this.zza.zza(e5);
        } catch (Throwable th2) {
            this.zza.zza(new RuntimeException(th2));
        }
    }
}
