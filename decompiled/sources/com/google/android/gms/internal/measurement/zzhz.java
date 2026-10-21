package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzhz implements Serializable {
    public static zzhz zzc() {
        return zzhx.zza;
    }

    public static zzhz zzd(Object obj) {
        return new zzia(obj);
    }

    public abstract Object zza();

    public abstract boolean zzb();
}
