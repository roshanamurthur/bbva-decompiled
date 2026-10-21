package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjf implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzjj zzb;

    public zzjf(zzjj zzjjVar, ComponentName componentName) {
        this.zzb = zzjjVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk.zzo(this.zzb.zza, this.zza);
    }
}
