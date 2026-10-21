package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzm extends zzdw implements zzfm {
    public zzm() {
        super(zzn.zza);
    }

    public final zzm zza(zzdb zzdbVar) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzn.c((zzn) this.zza, zzdbVar);
        return this;
    }

    public final zzm zzb(zzdb zzdbVar) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzn.b((zzn) this.zza, zzdbVar);
        return this;
    }
}
