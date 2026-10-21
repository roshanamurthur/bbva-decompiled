package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhg extends zzhi {
    public zzhg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzhj.zza) {
            zzhj.zzi(obj, j10, z10);
        } else {
            zzhj.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzd(Object obj, long j10, double d2) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zze(Object obj, long j10, float f6) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean zzf(Object obj, long j10) {
        return zzhj.zza ? zzhj.zzq(obj, j10) : zzhj.zzr(obj, j10);
    }
}
