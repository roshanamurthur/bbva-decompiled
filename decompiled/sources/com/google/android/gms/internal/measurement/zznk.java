package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznk implements zznj {
    public static final zzhu zza;
    public static final zzhu zzb;
    public static final zzhu zzc;
    public static final zzhu zzd;

    static {
        zzhr zzhrVar = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhrVar.zze("measurement.client.consent_state_v1", true);
        zzb = zzhrVar.zze("measurement.client.3p_consent_state_v1", true);
        zzc = zzhrVar.zze("measurement.service.consent_state_v1_W36", true);
        zzd = zzhrVar.zzc("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.zznj
    public final long zza() {
        return ((Long) zzd.zzb()).longValue();
    }
}
