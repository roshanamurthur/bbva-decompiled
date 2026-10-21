package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcw extends zzcz {
    private final int zzc;
    private final int zzd;

    public zzcw(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzdb.zzo(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zza(int i10) {
        zzdb.zzw(i10, this.zzd);
        return this.zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final byte zzb(int i10) {
        return this.zza[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcz, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, this.zzc + i10, bArr, i11, i12);
    }
}
