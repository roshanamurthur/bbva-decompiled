package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public enum zzmk implements zzbk {
    UNKNOWN_CLASSIFICATIONS(0),
    NO_CLASSIFICATIONS(1),
    ALL_CLASSIFICATIONS(2);

    private final int zze;

    zzmk(int i10) {
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbk
    public final int zza() {
        return this.zze;
    }
}
