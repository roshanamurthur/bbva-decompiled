package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjj {
    static final zzjj zza = new zzjj(true);
    private static volatile boolean zzb = false;
    private static volatile zzjj zzc;
    private static volatile zzjj zzd;
    private final Map zze;

    public zzjj() {
        this.zze = new HashMap();
    }

    public static zzjj zza() {
        zzjj zzjjVar = zzc;
        if (zzjjVar == null) {
            synchronized (zzjj.class) {
                try {
                    zzjjVar = zzc;
                    if (zzjjVar == null) {
                        zzjjVar = zza;
                        zzc = zzjjVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zzjjVar;
    }

    public static zzjj zzb() {
        zzjj zzjjVar = zzd;
        if (zzjjVar != null) {
            return zzjjVar;
        }
        synchronized (zzjj.class) {
            try {
                zzjj zzjjVar2 = zzd;
                if (zzjjVar2 != null) {
                    return zzjjVar2;
                }
                zzjj zzjjVarZzb = zzjr.zzb(zzjj.class);
                zzd = zzjjVarZzb;
                return zzjjVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzjv zzc(zzlc zzlcVar, int i10) {
        return (zzjv) this.zze.get(new zzji(zzlcVar, i10));
    }

    public zzjj(boolean z10) {
        this.zze = Collections.emptyMap();
    }
}
