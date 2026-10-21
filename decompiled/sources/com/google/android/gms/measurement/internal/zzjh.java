package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjh implements Runnable {
    final /* synthetic */ zzjj zza;

    public zzjh(zzjj zzjjVar) {
        this.zza = zzjjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk zzjkVar = this.zza.zza;
        Context contextZzau = zzjkVar.zzs.zzau();
        this.zza.zza.zzs.zzaw();
        zzjk.zzo(zzjkVar, new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
