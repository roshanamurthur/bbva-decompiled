package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznn implements zznm {
    public static final zzhu zza;
    public static final zzhu zzb;

    static {
        zzhr zzhrVarZza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zza();
        zza = zzhrVarZza.zze("measurement.enhanced_campaign.client", false);
        zzb = zzhrVarZza.zze("measurement.enhanced_campaign.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznm
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}
