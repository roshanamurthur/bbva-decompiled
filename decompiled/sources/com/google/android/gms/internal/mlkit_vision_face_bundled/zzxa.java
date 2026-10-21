package com.google.android.gms.internal.mlkit_vision_face_bundled;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzxa extends zzxb {
    public zzxa(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_face_bundled.zzxc.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_face_bundled.zzxc.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_face_bundled.zzxc.zzi(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_face_bundled.zzxc.zzj(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzxc.zzb) {
            zzxc.zzi(obj, j10, z10);
        } else {
            zzxc.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzxc.zzb) {
            zzxc.zzD(obj, j10, b10);
        } else {
            zzxc.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb
    public final void zze(Object obj, long j10, double d2) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb
    public final void zzf(Object obj, long j10, float f6) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzxb
    public final boolean zzg(Object obj, long j10) {
        return zzxc.zzb ? zzxc.zzt(obj, j10) : zzxc.zzu(obj, j10);
    }
}
