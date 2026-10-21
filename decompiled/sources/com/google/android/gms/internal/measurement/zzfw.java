package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfw extends zzjx implements zzld {
    private static final zzfw zza;
    private zzke zze = zzjx.zzby();

    static {
        zzfw zzfwVar = new zzfw();
        zza = zzfwVar;
        zzjx.zzbE(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfv zza() {
        return (zzfv) zza.zzbs();
    }

    public static /* synthetic */ void zze(zzfw zzfwVar, zzfy zzfyVar) {
        zzfyVar.getClass();
        zzke zzkeVar = zzfwVar.zze;
        if (!zzkeVar.zzc()) {
            zzfwVar.zze = zzjx.zzbz(zzkeVar);
        }
        zzfwVar.zze.add(zzfyVar);
    }

    public final zzfy zzc(int i10) {
        return (zzfy) this.zze.get(0);
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
            return zzjx.zzbD(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfy.class});
        }
        if (i11 == 3) {
            return new zzfw();
        }
        zzff zzffVar = null;
        if (i11 == 4) {
            return new zzfv(zzffVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
