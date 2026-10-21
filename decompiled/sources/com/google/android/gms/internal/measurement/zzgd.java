package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgd extends zzjx implements zzld {
    private static final zzgd zza;
    private zzkd zze = zzjx.zzbw();
    private zzkd zzf = zzjx.zzbw();
    private zzke zzg = zzjx.zzby();
    private zzke zzh = zzjx.zzby();

    static {
        zzgd zzgdVar = new zzgd();
        zza = zzgdVar;
        zzjx.zzbE(zzgd.class, zzgdVar);
    }

    private zzgd() {
    }

    public static zzgc zzf() {
        return (zzgc) zza.zzbs();
    }

    public static zzgd zzh() {
        return zza;
    }

    public static /* synthetic */ void zzo(zzgd zzgdVar, Iterable iterable) {
        zzkd zzkdVar = zzgdVar.zze;
        if (!zzkdVar.zzc()) {
            zzgdVar.zze = zzjx.zzbx(zzkdVar);
        }
        zzih.zzbo(iterable, zzgdVar.zze);
    }

    public static /* synthetic */ void zzq(zzgd zzgdVar, Iterable iterable) {
        zzkd zzkdVar = zzgdVar.zzf;
        if (!zzkdVar.zzc()) {
            zzgdVar.zzf = zzjx.zzbx(zzkdVar);
        }
        zzih.zzbo(iterable, zzgdVar.zzf);
    }

    public static /* synthetic */ void zzs(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.zzw();
        zzih.zzbo(iterable, zzgdVar.zzg);
    }

    public static /* synthetic */ void zzt(zzgd zzgdVar, int i10) {
        zzgdVar.zzw();
        zzgdVar.zzg.remove(i10);
    }

    public static /* synthetic */ void zzu(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.zzx();
        zzih.zzbo(iterable, zzgdVar.zzh);
    }

    public static /* synthetic */ void zzv(zzgd zzgdVar, int i10) {
        zzgdVar.zzx();
        zzgdVar.zzh.remove(i10);
    }

    private final void zzw() {
        zzke zzkeVar = this.zzg;
        if (zzkeVar.zzc()) {
            return;
        }
        this.zzg = zzjx.zzbz(zzkeVar);
    }

    private final void zzx() {
        zzke zzkeVar = this.zzh;
        if (zzkeVar.zzc()) {
            return;
        }
        this.zzh = zzjx.zzbz(zzkeVar);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfm zze(int i10) {
        return (zzfm) this.zzg.get(i10);
    }

    public final zzgf zzi(int i10) {
        return (zzgf) this.zzh.get(i10);
    }

    public final List zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzjx.zzbD(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzfm.class, "zzh", zzgf.class});
        }
        if (i11 == 3) {
            return new zzgd();
        }
        zzff zzffVar = null;
        if (i11 == 4) {
            return new zzgc(zzffVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final List zzm() {
        return this.zzh;
    }

    public final List zzn() {
        return this.zze;
    }
}
