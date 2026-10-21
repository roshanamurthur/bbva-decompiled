package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzvo implements zzwi {
    private static final zzvu zza = new zzvm();
    private final zzvu zzb;

    public zzvo() {
        zzvu zzvuVar = zza;
        int i10 = zzwe.zza;
        zzvn zzvnVar = new zzvn(zzup.zza(), zzvuVar);
        byte[] bArr = zzvc.zzb;
        this.zzb = zzvnVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwi
    public final zzwh zza(Class cls) {
        int i10 = zzwj.zza;
        if (!zzuw.class.isAssignableFrom(cls)) {
            int i11 = zzwe.zza;
        }
        zzvt zzvtVarZzb = this.zzb.zzb(cls);
        if (zzvtVarZzb.zzb()) {
            int i12 = zzwe.zza;
            return zzwa.zzc(zzwj.zzm(), zzuk.zza(), zzvtVarZzb.zza());
        }
        int i13 = zzwe.zza;
        return zzvz.zzl(cls, zzvtVarZzb, zzwd.zza(), zzvk.zza(), zzwj.zzm(), zzvtVarZzb.zzc() + (-1) != 1 ? zzuk.zza() : null, zzvs.zza());
    }
}
