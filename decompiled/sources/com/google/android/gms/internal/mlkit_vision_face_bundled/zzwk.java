package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzwk extends zzwr {
    public zzwk() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwr
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                Map.Entry entryZzg = zzg(i10);
                ((zzul) ((zzwl) entryZzg).zza()).zze();
                entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
            }
            for (Map.Entry entry : zzd()) {
                ((zzul) entry.getKey()).zze();
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        super.zza();
    }
}
