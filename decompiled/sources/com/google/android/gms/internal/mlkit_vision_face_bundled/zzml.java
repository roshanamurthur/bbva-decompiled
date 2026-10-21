package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public enum zzml implements zzbk {
    UNKNOWN_CONTOURS(0),
    NO_CONTOURS(1),
    ALL_CONTOURS(2);

    private final int zze;

    zzml(int i10) {
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbk
    public final int zza() {
        return this.zze;
    }
}
