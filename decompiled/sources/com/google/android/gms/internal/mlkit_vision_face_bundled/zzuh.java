package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzuh {
    static final zzuh zza = new zzuh(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzuh() {
        this.zzd = new HashMap();
    }

    public static zzuh zza() {
        int i10 = zzwe.zza;
        return new zzuh();
    }

    public final zzuu zzb(zzvw zzvwVar, int i10) {
        return (zzuu) this.zzd.get(new zzug(zzvwVar, i10));
    }

    public final void zzc(zzuu zzuuVar) {
        this.zzd.put(new zzug(zzuuVar.zza, 202056002), zzuuVar);
    }

    public zzuh(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
