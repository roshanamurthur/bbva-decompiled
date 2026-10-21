package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzad extends zzv {
    private final zzaf zza;

    public zzad(zzaf zzafVar, int i10) {
        super(zzafVar.size(), i10);
        this.zza = zzafVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzv
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
