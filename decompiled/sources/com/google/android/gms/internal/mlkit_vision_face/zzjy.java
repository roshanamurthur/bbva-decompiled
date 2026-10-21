package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public enum zzjy implements zzcs {
    UNKNOWN_CLASSIFICATIONS(0),
    NO_CLASSIFICATIONS(1),
    ALL_CLASSIFICATIONS(2);

    private final int zze;

    zzjy(int i10) {
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.zze;
    }
}
