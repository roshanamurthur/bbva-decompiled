package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzvn implements zzvu {
    private final zzvu[] zza;

    public zzvn(zzvu... zzvuVarArr) {
        this.zza = zzvuVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvu
    public final zzvt zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzvu zzvuVar = this.zza[i10];
            if (zzvuVar.zzc(cls)) {
                return zzvuVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvu
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
