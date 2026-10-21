package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlk {
    private static final zzlk zza = new zzlk();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzlo zzb = new zzku();

    private zzlk() {
    }

    public static zzlk zza() {
        return zza;
    }

    public final zzln zzb(Class cls) {
        zzkf.zzf(cls, "messageType");
        zzln zzlnVarZza = (zzln) this.zzc.get(cls);
        if (zzlnVarZza == null) {
            zzlnVarZza = this.zzb.zza(cls);
            zzkf.zzf(cls, "messageType");
            zzkf.zzf(zzlnVarZza, "schema");
            zzln zzlnVar = (zzln) this.zzc.putIfAbsent(cls, zzlnVarZza);
            if (zzlnVar != null) {
                return zzlnVar;
            }
        }
        return zzlnVarZza;
    }
}
