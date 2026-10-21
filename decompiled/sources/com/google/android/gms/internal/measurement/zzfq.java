package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfq extends zzjx implements zzld {
    private static final zzfq zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzfq zzfqVar = new zzfq();
        zza = zzfqVar;
        zzjx.zzbE(zzfq.class, zzfqVar);
    }

    private zzfq() {
    }

    public static zzfp zza() {
        return (zzfp) zza.zzbs();
    }

    public static /* synthetic */ void zzc(zzfq zzfqVar, String str) {
        str.getClass();
        zzfqVar.zze |= 1;
        zzfqVar.zzf = str;
    }

    public static /* synthetic */ void zzd(zzfq zzfqVar, long j10) {
        zzfqVar.zze |= 2;
        zzfqVar.zzg = j10;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzfq();
        }
        zzff zzffVar = null;
        if (i11 == 4) {
            return new zzfp(zzffVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
