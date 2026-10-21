package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbq extends zzbf {
    final /* synthetic */ zzbs zza;
    private final Object zzb;
    private int zzc;

    public zzbq(zzbs zzbsVar, int i10) {
        this.zza = zzbsVar;
        this.zzb = zzbs.zzg(zzbsVar, i10);
        this.zzc = i10;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 == -1 || i10 >= this.zza.size() || !zzam.zza(this.zzb, zzbs.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzv(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzbs.zzj(this.zza, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object objZzj = zzbs.zzj(this.zza, i10);
        zzbs.zzm(this.zza, this.zzc, obj);
        return objZzj;
    }
}
