package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfs extends zzjx implements zzld {
    private static final zzfs zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private zzke zzk = zzjx.zzby();

    static {
        zzfs zzfsVar = new zzfs();
        zza = zzfsVar;
        zzjx.zzbE(zzfs.class, zzfsVar);
    }

    private zzfs() {
    }

    public static zzfr zze() {
        return (zzfr) zza.zzbs();
    }

    public static /* synthetic */ void zzj(zzfs zzfsVar, String str) {
        str.getClass();
        zzfsVar.zze |= 1;
        zzfsVar.zzf = str;
    }

    public static /* synthetic */ void zzk(zzfs zzfsVar, String str) {
        str.getClass();
        zzfsVar.zze |= 2;
        zzfsVar.zzg = str;
    }

    public static /* synthetic */ void zzm(zzfs zzfsVar) {
        zzfsVar.zze &= -3;
        zzfsVar.zzg = zza.zzg;
    }

    public static /* synthetic */ void zzn(zzfs zzfsVar, long j10) {
        zzfsVar.zze |= 4;
        zzfsVar.zzh = j10;
    }

    public static /* synthetic */ void zzo(zzfs zzfsVar) {
        zzfsVar.zze &= -5;
        zzfsVar.zzh = 0L;
    }

    public static /* synthetic */ void zzp(zzfs zzfsVar, double d2) {
        zzfsVar.zze |= 16;
        zzfsVar.zzj = d2;
    }

    public static /* synthetic */ void zzq(zzfs zzfsVar) {
        zzfsVar.zze &= -17;
        zzfsVar.zzj = 0.0d;
    }

    public static /* synthetic */ void zzr(zzfs zzfsVar, zzfs zzfsVar2) {
        zzfsVar2.getClass();
        zzfsVar.zzz();
        zzfsVar.zzk.add(zzfsVar2);
    }

    public static /* synthetic */ void zzs(zzfs zzfsVar, Iterable iterable) {
        zzfsVar.zzz();
        zzih.zzbo(iterable, zzfsVar.zzk);
    }

    private final void zzz() {
        zzke zzkeVar = this.zzk;
        if (zzkeVar.zzc()) {
            return;
        }
        this.zzk = zzjx.zzbz(zzkeVar);
    }

    public final double zza() {
        return this.zzj;
    }

    public final float zzb() {
        return this.zzi;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final long zzd() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzfs.class});
        }
        if (i11 == 3) {
            return new zzfs();
        }
        zzff zzffVar = null;
        if (i11 == 4) {
            return new zzfr(zzffVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzu() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zze & 2) != 0;
    }
}
