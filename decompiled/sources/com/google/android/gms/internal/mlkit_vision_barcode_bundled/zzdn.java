package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdn {
    static final zzdn zza = new zzdn(true);
    private static volatile boolean zzb = false;
    private static volatile zzdn zzc;
    private final Map zzd;

    public zzdn() {
        this.zzd = new HashMap();
    }

    public static zzdn zza() {
        zzdn zzdnVar = zzc;
        if (zzdnVar == null) {
            synchronized (zzdn.class) {
                try {
                    zzdnVar = zzc;
                    if (zzdnVar == null) {
                        zzdnVar = zza;
                        zzc = zzdnVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zzdnVar;
    }

    public final zzea zzb(zzfl zzflVar, int i10) {
        return (zzea) this.zzd.get(new zzdm(zzflVar, i10));
    }

    public zzdn(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
