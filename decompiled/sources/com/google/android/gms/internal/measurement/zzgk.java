package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgk extends zzjx implements zzld {
    private static final zzgk zza;
    private zzke zze = zzjx.zzby();

    static {
        zzgk zzgkVar = new zzgk();
        zza = zzgkVar;
        zzjx.zzbE(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public static zzgk zzc() {
        return zza;
    }

    public final int zza() {
        return this.zze.size();
    }

    public final List zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgm.class});
        }
        if (i11 == 3) {
            return new zzgk();
        }
        zzgi zzgiVar = null;
        if (i11 == 4) {
            return new zzgj(zzgiVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
