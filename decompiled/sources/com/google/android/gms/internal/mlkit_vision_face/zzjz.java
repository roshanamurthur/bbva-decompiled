package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public enum zzjz implements zzcs {
    UNKNOWN_CONTOURS(0),
    NO_CONTOURS(1),
    ALL_CONTOURS(2);

    private final int zze;

    zzjz(int i10) {
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.zze;
    }
}
