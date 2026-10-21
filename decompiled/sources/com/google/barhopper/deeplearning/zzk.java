package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzk extends zzdw<BarhopperV3Options, zzk> implements zzfm {
    public zzk() {
        super(BarhopperV3Options.zza);
    }

    public final zzk zza(zzh zzhVar) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        BarhopperV3Options.b((BarhopperV3Options) this.zza, (zzi) zzhVar.zzl());
        return this;
    }

    public final zzk zzb(zzm zzmVar) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        BarhopperV3Options.c((BarhopperV3Options) this.zza, (zzn) zzmVar.zzl());
        return this;
    }
}
