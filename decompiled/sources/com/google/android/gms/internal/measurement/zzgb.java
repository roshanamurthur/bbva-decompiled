package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgb extends zzjx implements zzld {
    private static final zzgb zza;
    private int zze;
    private int zzf = 1;
    private zzke zzg = zzjx.zzby();

    static {
        zzgb zzgbVar = new zzgb();
        zza = zzgbVar;
        zzjx.zzbE(zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbs();
    }

    public static /* synthetic */ void zzc(zzgb zzgbVar, zzfq zzfqVar) {
        zzfqVar.getClass();
        zzke zzkeVar = zzgbVar.zzg;
        if (!zzkeVar.zzc()) {
            zzgbVar.zzg = zzjx.zzbz(zzkeVar);
        }
        zzgbVar.zzg.add(zzfqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzga.zza, "zzg", zzfq.class});
        }
        if (i11 == 3) {
            return new zzgb();
        }
        zzff zzffVar = null;
        if (i11 == 4) {
            return new zzfz(zzffVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
