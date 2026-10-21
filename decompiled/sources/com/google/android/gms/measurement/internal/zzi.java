package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzi implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ zzau zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ AppMeasurementDynamiteService zzd;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcf zzcfVar, zzau zzauVar, String str) {
        this.zzd = appMeasurementDynamiteService;
        this.zza = zzcfVar;
        this.zzb = zzauVar;
        this.zzc = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzt().zzB(this.zza, this.zzb, this.zzc);
    }
}
