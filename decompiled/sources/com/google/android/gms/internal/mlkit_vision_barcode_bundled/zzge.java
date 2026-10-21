package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzge extends zzgl {
    public zzge(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                ((zzdr) zzg(i10).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzdr) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
