package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzb extends zzdw implements zzfm {
    public zzb() {
        super(zzc.zza);
    }

    public final zzb zza(int i10, zzae zzaeVar) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzc.b((zzc) this.zza, i10, zzaeVar);
        return this;
    }
}
