package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgm extends zzjx implements zzld {
    private static final zzgm zza;
    private int zze;
    private String zzf = "";
    private zzke zzg = zzjx.zzby();

    static {
        zzgm zzgmVar = new zzgm();
        zza = zzgmVar;
        zzjx.zzbE(zzgm.class, zzgmVar);
    }

    private zzgm() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgt.class});
        }
        if (i11 == 3) {
            return new zzgm();
        }
        zzgi zzgiVar = null;
        if (i11 == 4) {
            return new zzgl(zzgiVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
