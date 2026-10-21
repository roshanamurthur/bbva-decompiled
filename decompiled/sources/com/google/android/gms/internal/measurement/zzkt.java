package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkt implements zzla {
    private final zzla[] zza;

    public zzkt(zzla... zzlaVarArr) {
        this.zza = zzlaVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final zzkz zzb(Class cls) {
        zzla[] zzlaVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzla zzlaVar = zzlaVarArr[i10];
            if (zzlaVar.zzc(cls)) {
                return zzlaVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.measurement.zzla
    public final boolean zzc(Class cls) {
        zzla[] zzlaVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzlaVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
