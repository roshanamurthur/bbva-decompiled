package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgf extends zzjx implements zzld {
    private static final zzgf zza;
    private int zze;
    private int zzf;
    private zzkd zzg = zzjx.zzbw();

    static {
        zzgf zzgfVar = new zzgf();
        zza = zzgfVar;
        zzjx.zzbE(zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static zzge zzd() {
        return (zzge) zza.zzbs();
    }

    public static /* synthetic */ void zzg(zzgf zzgfVar, int i10) {
        zzgfVar.zze |= 1;
        zzgfVar.zzf = i10;
    }

    public static /* synthetic */ void zzh(zzgf zzgfVar, Iterable iterable) {
        zzkd zzkdVar = zzgfVar.zzg;
        if (!zzkdVar.zzc()) {
            zzgfVar.zzg = zzjx.zzbx(zzkdVar);
        }
        zzih.zzbo(iterable, zzgfVar.zzg);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int i10) {
        return this.zzg.zza(i10);
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzgf();
        }
        zzff zzffVar = null;
        if (i11 == 4) {
            return new zzge(zzffVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
