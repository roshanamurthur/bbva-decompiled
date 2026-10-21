package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzh extends zzdw implements zzfm {
    public zzh() {
        super(zzi.zza);
    }

    public final zzh zza(zze zzeVar) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzi.b((zzi) this.zza, (zzf) zzeVar.zzl());
        return this;
    }

    public final zzh zzb(zzdb zzdbVar) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzi.c((zzi) this.zza, zzdbVar);
        return this;
    }
}
