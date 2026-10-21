package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzn extends zzh {
    private final zzp zza;

    public zzn(zzp zzpVar, int i10) {
        super(zzpVar.size(), i10);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzh
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
