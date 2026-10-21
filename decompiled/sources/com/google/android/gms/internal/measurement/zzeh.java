package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzeh extends zzjx implements zzld {
    private static final zzeh zza;
    private int zze;
    private int zzf;
    private zzke zzg = zzjx.zzby();
    private zzke zzh = zzjx.zzby();
    private boolean zzi;
    private boolean zzj;

    static {
        zzeh zzehVar = new zzeh();
        zza = zzehVar;
        zzjx.zzbE(zzeh.class, zzehVar);
    }

    private zzeh() {
    }

    public static /* synthetic */ void zzi(zzeh zzehVar, int i10, zzes zzesVar) {
        zzesVar.getClass();
        zzke zzkeVar = zzehVar.zzg;
        if (!zzkeVar.zzc()) {
            zzehVar.zzg = zzjx.zzbz(zzkeVar);
        }
        zzehVar.zzg.set(i10, zzesVar);
    }

    public static /* synthetic */ void zzj(zzeh zzehVar, int i10, zzej zzejVar) {
        zzejVar.getClass();
        zzke zzkeVar = zzehVar.zzh;
        if (!zzkeVar.zzc()) {
            zzehVar.zzh = zzjx.zzbz(zzkeVar);
        }
        zzehVar.zzh.set(i10, zzejVar);
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzh.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final zzej zze(int i10) {
        return (zzej) this.zzh.get(i10);
    }

    public final zzes zzf(int i10) {
        return (zzes) this.zzg.get(i10);
    }

    public final List zzg() {
        return this.zzh;
    }

    public final List zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zzes.class, "zzh", zzej.class, "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzeh();
        }
        zzef zzefVar = null;
        if (i11 == 4) {
            return new zzeg(zzefVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
