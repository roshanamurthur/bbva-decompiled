package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzmj extends zzmk {
    public zzmj(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(zzk(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(zzj(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzml.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.measurement.zzml.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.measurement.zzml.zzl(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.zzmk
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzml.zzb) {
            zzml.zzk(obj, j10, z10);
        } else {
            zzml.zzl(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzml.zzb) {
            zzml.zzD(obj, j10, b10);
        } else {
            zzml.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final void zze(Object obj, long j10, double d2) {
        zzo(obj, j10, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final void zzf(Object obj, long j10, float f6) {
        zzn(obj, j10, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.measurement.zzmk
    public final boolean zzg(Object obj, long j10) {
        return zzml.zzb ? zzml.zzt(obj, j10) : zzml.zzu(obj, j10);
    }
}
