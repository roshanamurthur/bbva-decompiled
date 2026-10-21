package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zziu extends zzan {
    final /* synthetic */ zzjk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziu(zzjk zzjkVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzjkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        zzjk zzjkVar = this.zza;
        zzjkVar.zzg();
        if (zzjkVar.zzL()) {
            zzjkVar.zzs.zzay().zzj().zza("Inactivity, disconnecting from the service");
            zzjkVar.zzs();
        }
    }
}
