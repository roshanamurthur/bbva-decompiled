package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdd extends zzde {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzdd(byte[] bArr, int i10, int i11, boolean z10, zzdc zzdcVar) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i10) throws zzen {
        int i11 = this.zze;
        this.zze = 0;
        int i12 = this.zzc + this.zzd;
        this.zzc = i12;
        if (i12 > 0) {
            this.zzd = i12;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i11;
    }
}
