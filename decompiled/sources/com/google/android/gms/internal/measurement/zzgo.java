package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgo extends zzjx implements zzld {
    private static final zzgo zza;
    private int zze;
    private zzke zzf = zzjx.zzby();
    private zzgk zzg;

    static {
        zzgo zzgoVar = new zzgo();
        zza = zzgoVar;
        zzjx.zzbE(zzgo.class, zzgoVar);
    }

    private zzgo() {
    }

    public final zzgk zza() {
        zzgk zzgkVar = this.zzg;
        return zzgkVar == null ? zzgk.zzc() : zzgkVar;
    }

    public final List zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgt.class, "zzg"});
        }
        if (i11 == 3) {
            return new zzgo();
        }
        zzgi zzgiVar = null;
        if (i11 == 4) {
            return new zzgn(zzgiVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
