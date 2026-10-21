package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjq {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzjq zza(Long l6) {
        this.zzc = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjq zzb(Long l6) {
        this.zzd = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjq zzc(Long l6) {
        this.zza = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjq zzd(Long l6) {
        this.zze = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjq zze(Long l6) {
        this.zzb = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjq zzf(Long l6) {
        this.zzf = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjs zzg() {
        return new zzjs(this, null);
    }
}
