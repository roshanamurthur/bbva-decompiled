package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzey extends zzez {
    public /* synthetic */ zzey(zzew zzewVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez
    public final void zza(Object obj, long j10) {
        ((zzek) zzgz.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez
    public final void zzb(Object obj, Object obj2, long j10) {
        zzek zzekVarZzd = (zzek) zzgz.zzf(obj, j10);
        zzek zzekVar = (zzek) zzgz.zzf(obj2, j10);
        int size = zzekVarZzd.size();
        int size2 = zzekVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzekVarZzd.zzc()) {
                zzekVarZzd = zzekVarZzd.zzd(size2 + size);
            }
            zzekVarZzd.addAll(zzekVar);
        }
        if (size > 0) {
            zzekVar = zzekVarZzd;
        }
        zzgz.zzs(obj, j10, zzekVar);
    }

    private zzey() {
        super(null);
    }
}
