package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgw extends zzgy {
    public zzgw(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(zzk(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(zzj(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzgz.zzb) {
            zzgz.zzD(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzgz.zzE(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzgz.zzb) {
            zzgz.zzD(obj, j10, b10);
        } else {
            zzgz.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zze(Object obj, long j10, double d2) {
        zzo(obj, j10, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzf(Object obj, long j10, float f6) {
        zzn(obj, j10, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final boolean zzg(Object obj, long j10) {
        return zzgz.zzb ? zzgz.zzt(obj, j10) : zzgz.zzu(obj, j10);
    }
}
