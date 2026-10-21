package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzou implements zzot {
    public static final zzhu zza;
    public static final zzhu zzb;

    static {
        zzhr zzhrVar = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhrVar.zze("measurement.module.pixie.ees", true);
        zzb = zzhrVar.zze("measurement.module.pixie.fix_array", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zzb() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}
