package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfo extends zzjx implements zzld {
    private static final zzfo zza;
    private int zze;
    private zzke zzf = zzjx.zzby();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzfo zzfoVar = new zzfo();
        zza = zzfoVar;
        zzjx.zzbE(zzfo.class, zzfoVar);
    }

    private zzfo() {
    }

    public static zzfn zze() {
        return (zzfn) zza.zzbs();
    }

    public static /* synthetic */ void zzj(zzfo zzfoVar, int i10, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzfoVar.zzv();
        zzfoVar.zzf.set(i10, zzfsVar);
    }

    public static /* synthetic */ void zzk(zzfo zzfoVar, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzfoVar.zzv();
        zzfoVar.zzf.add(zzfsVar);
    }

    public static /* synthetic */ void zzm(zzfo zzfoVar, Iterable iterable) {
        zzfoVar.zzv();
        zzih.zzbo(iterable, zzfoVar.zzf);
    }

    public static /* synthetic */ void zzo(zzfo zzfoVar, int i10) {
        zzfoVar.zzv();
        zzfoVar.zzf.remove(i10);
    }

    public static /* synthetic */ void zzp(zzfo zzfoVar, String str) {
        str.getClass();
        zzfoVar.zze |= 1;
        zzfoVar.zzg = str;
    }

    public static /* synthetic */ void zzq(zzfo zzfoVar, long j10) {
        zzfoVar.zze |= 2;
        zzfoVar.zzh = j10;
    }

    public static /* synthetic */ void zzr(zzfo zzfoVar, long j10) {
        zzfoVar.zze |= 4;
        zzfoVar.zzi = j10;
    }

    private final void zzv() {
        zzke zzkeVar = this.zzf;
        if (zzkeVar.zzc()) {
            return;
        }
        this.zzf = zzjx.zzbz(zzkeVar);
    }

    public final int zza() {
        return this.zzj;
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final zzfs zzg(int i10) {
        return (zzfs) this.zzf.get(i10);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzfs.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzfo();
        }
        zzff zzffVar = null;
        if (i11 == 4) {
            return new zzfn(zzffVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzs() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}
