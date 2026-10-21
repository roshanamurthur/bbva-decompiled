package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public enum zzkb implements zzcs {
    UNKNOWN_PERFORMANCE(0),
    FAST(1),
    ACCURATE(2);

    private final int zze;

    zzkb(int i10) {
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.zze;
    }
}
