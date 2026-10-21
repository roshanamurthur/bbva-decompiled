package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfc implements zzfj {
    private final zzfj[] zza;

    public zzfc(zzfj... zzfjVarArr) {
        this.zza = zzfjVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final zzfi zzb(Class cls) {
        zzfj[] zzfjVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzfj zzfjVar = zzfjVarArr[i10];
            if (zzfjVar.zzc(cls)) {
                return zzfjVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final boolean zzc(Class cls) {
        zzfj[] zzfjVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzfjVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
