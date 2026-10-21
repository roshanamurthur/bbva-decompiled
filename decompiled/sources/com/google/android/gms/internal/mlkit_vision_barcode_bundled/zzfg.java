package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzfg {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzff zzffVar = (zzff) obj;
        if (zzffVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzffVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzff zzffVarZzb = (zzff) obj;
        zzff zzffVar = (zzff) obj2;
        if (!zzffVar.isEmpty()) {
            if (!zzffVarZzb.zze()) {
                zzffVarZzb = zzffVarZzb.zzb();
            }
            zzffVarZzb.zzd(zzffVar);
        }
        return zzffVarZzb;
    }
}
