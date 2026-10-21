package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfa extends zzjx implements zzld {
    private static final zzfa zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzfa zzfaVar = new zzfa();
        zza = zzfaVar;
        zzjx.zzbE(zzfa.class, zzfaVar);
    }

    private zzfa() {
    }

    public static /* synthetic */ void zzd(zzfa zzfaVar, String str) {
        str.getClass();
        zzfaVar.zze |= 1;
        zzfaVar.zzf = str;
    }

    public final int zza() {
        return this.zzi;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzfa();
        }
        zzey zzeyVar = null;
        if (i11 == 4) {
            return new zzez(zzeyVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
