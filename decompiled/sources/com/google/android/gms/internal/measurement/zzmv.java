package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzmv implements zzmu {
    public static final zzhu zza;
    public static final zzhu zzb;
    public static final zzhu zzc;
    public static final zzhu zzd;
    public static final zzhu zze;
    public static final zzhu zzf;
    public static final zzhu zzg;

    static {
        zzhr zzhrVarZza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zza();
        zza = zzhrVarZza.zze("measurement.adid_zero.app_instance_id_fix", true);
        zzb = zzhrVarZza.zze("measurement.adid_zero.service", true);
        zzc = zzhrVarZza.zze("measurement.adid_zero.adid_uid", false);
        zzd = zzhrVarZza.zzc("measurement.id.adid_zero.service", 0L);
        zze = zzhrVarZza.zze("measurement.adid_zero.remove_lair_if_adidzero_false", true);
        zzf = zzhrVarZza.zze("measurement.adid_zero.remove_lair_if_userid_cleared", true);
        zzg = zzhrVarZza.zze("measurement.adid_zero.remove_lair_on_id_value_change_only", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzd() {
        return ((Boolean) zzc.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zze() {
        return ((Boolean) zze.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzf() {
        return ((Boolean) zzf.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzg() {
        return ((Boolean) zzg.zzb()).booleanValue();
    }
}
