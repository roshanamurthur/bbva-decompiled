package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhp implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzhw zzb;

    public zzhp(zzhw zzhwVar, Boolean bool) {
        this.zzb = zzhwVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzac(this.zza, true);
    }
}
