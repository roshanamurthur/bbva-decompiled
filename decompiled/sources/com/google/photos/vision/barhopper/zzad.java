package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzad extends zzdw implements zzfm {
    public zzad() {
        super(zzae.zza);
    }

    public final zzad zza(int i10) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzae.b(i10, (zzae) this.zza);
        return this;
    }

    public final zzad zzb(int i10) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzae.c(i10, (zzae) this.zza);
        return this;
    }
}
