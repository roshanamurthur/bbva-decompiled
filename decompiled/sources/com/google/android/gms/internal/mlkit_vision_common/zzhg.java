package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public enum zzhg implements zzag {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);

    private final int zzl;

    zzhg(int i10) {
        this.zzl = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzag
    public final int zza() {
        return this.zzl;
    }
}
