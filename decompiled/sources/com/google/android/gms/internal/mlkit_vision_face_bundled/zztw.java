package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zztw extends zzty {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zztw(byte[] bArr, int i10, int i11, boolean z10, zztv zztvVar) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i10) throws zzve {
        int i11 = this.zzd;
        this.zzd = 0;
        int i12 = this.zzb + this.zzc;
        this.zzb = i12;
        if (i12 > 0) {
            this.zzc = i12;
            this.zzb = i12 - i12;
        } else {
            this.zzc = 0;
        }
        return i11;
    }
}
