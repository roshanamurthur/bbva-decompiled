package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgx extends zzgy {
    public zzgx(Unsafe unsafe) {
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

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzl(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.zzl(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgy
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzgz.zzb) {
            zzgz.zzk(obj, j10, z10);
        } else {
            zzgz.zzl(obj, j10, z10);
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
