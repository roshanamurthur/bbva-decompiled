package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzif {
    public static zzib zza(zzib zzibVar) {
        if ((zzibVar instanceof zzid) || (zzibVar instanceof zzic)) {
            return zzibVar;
        }
        return zzibVar instanceof Serializable ? new zzic(zzibVar) : new zzid(zzibVar);
    }

    public static zzib zzb(Object obj) {
        return new zzie(obj);
    }
}
