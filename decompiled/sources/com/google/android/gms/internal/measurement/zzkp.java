package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkp extends zzkq {
    public /* synthetic */ zzkp(zzkn zzknVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zza(Object obj, long j10) {
        ((zzke) zzml.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zzb(Object obj, Object obj2, long j10) {
        zzke zzkeVarZzd = (zzke) zzml.zzf(obj, j10);
        zzke zzkeVar = (zzke) zzml.zzf(obj2, j10);
        int size = zzkeVarZzd.size();
        int size2 = zzkeVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzkeVarZzd.zzc()) {
                zzkeVarZzd = zzkeVarZzd.zzd(size2 + size);
            }
            zzkeVarZzd.addAll(zzkeVar);
        }
        if (size > 0) {
            zzkeVar = zzkeVarZzd;
        }
        zzml.zzs(obj, j10, zzkeVar);
    }

    private zzkp() {
        super(null);
    }
}
