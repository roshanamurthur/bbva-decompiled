package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzg {
    private long zzA;

    @Nullable
    private String zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private final zzfr zza;
    private final String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private String zzd;

    @Nullable
    private String zze;

    @Nullable
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    @Nullable
    private String zzj;
    private long zzk;

    @Nullable
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private long zzp;
    private boolean zzq;

    @Nullable
    private String zzr;

    @Nullable
    private Boolean zzs;
    private long zzt;

    @Nullable
    private List zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    @WorkerThread
    public zzg(zzfr zzfrVar, String str) {
        Preconditions.checkNotNull(zzfrVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzfrVar;
        this.zzb = str;
        zzfrVar.zzaz().zzg();
    }

    @Nullable
    @WorkerThread
    public final String zzA() {
        this.zza.zzaz().zzg();
        return this.zze;
    }

    @Nullable
    @WorkerThread
    public final List zzB() {
        this.zza.zzaz().zzg();
        return this.zzu;
    }

    @WorkerThread
    public final void zzC() {
        this.zza.zzaz().zzg();
        this.zzC = false;
    }

    @WorkerThread
    public final void zzD() {
        this.zza.zzaz().zzg();
        long j10 = this.zzg + 1;
        if (j10 > 2147483647L) {
            this.zza.zzay().zzk().zzb("Bundle index overflow. appId", zzeh.zzn(this.zzb));
            j10 = 0;
        }
        this.zzC = true;
        this.zzg = j10;
    }

    @WorkerThread
    public final void zzE(@Nullable String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzC |= true ^ zzkw.zzak(this.zzr, str);
        this.zzr = str;
    }

    @WorkerThread
    public final void zzF(boolean z10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzq != z10;
        this.zzq = z10;
    }

    @WorkerThread
    public final void zzG(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzp != j10;
        this.zzp = j10;
    }

    @WorkerThread
    public final void zzH(@Nullable String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzkw.zzak(this.zzc, str);
        this.zzc = str;
    }

    @WorkerThread
    public final void zzI(@Nullable String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzkw.zzak(this.zzl, str);
        this.zzl = str;
    }

    @WorkerThread
    public final void zzJ(@Nullable String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzkw.zzak(this.zzj, str);
        this.zzj = str;
    }

    @WorkerThread
    public final void zzK(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzk != j10;
        this.zzk = j10;
    }

    @WorkerThread
    public final void zzL(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzD != j10;
        this.zzD = j10;
    }

    @WorkerThread
    public final void zzM(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzy != j10;
        this.zzy = j10;
    }

    @WorkerThread
    public final void zzN(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzz != j10;
        this.zzz = j10;
    }

    @WorkerThread
    public final void zzO(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzx != j10;
        this.zzx = j10;
    }

    @WorkerThread
    public final void zzP(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzw != j10;
        this.zzw = j10;
    }

    @WorkerThread
    public final void zzQ(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzA != j10;
        this.zzA = j10;
    }

    @WorkerThread
    public final void zzR(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzv != j10;
        this.zzv = j10;
    }

    @WorkerThread
    public final void zzS(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzn != j10;
        this.zzn = j10;
    }

    @WorkerThread
    public final void zzT(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzt != j10;
        this.zzt = j10;
    }

    @WorkerThread
    public final void zzU(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzE != j10;
        this.zzE = j10;
    }

    @WorkerThread
    public final void zzV(@Nullable String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzkw.zzak(this.zzf, str);
        this.zzf = str;
    }

    @WorkerThread
    public final void zzW(@Nullable String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzC |= true ^ zzkw.zzak(this.zzd, str);
        this.zzd = str;
    }

    @WorkerThread
    public final void zzX(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzm != j10;
        this.zzm = j10;
    }

    @WorkerThread
    public final void zzY(@Nullable String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzkw.zzak(this.zzB, str);
        this.zzB = str;
    }

    @WorkerThread
    public final void zzZ(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzi != j10;
        this.zzi = j10;
    }

    @WorkerThread
    public final long zza() {
        this.zza.zzaz().zzg();
        return this.zzp;
    }

    @WorkerThread
    public final void zzaa(long j10) {
        Preconditions.checkArgument(j10 >= 0);
        this.zza.zzaz().zzg();
        this.zzC |= this.zzg != j10;
        this.zzg = j10;
    }

    @WorkerThread
    public final void zzab(long j10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzh != j10;
        this.zzh = j10;
    }

    @WorkerThread
    public final void zzac(boolean z10) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzo != z10;
        this.zzo = z10;
    }

    @WorkerThread
    public final void zzad(@Nullable Boolean bool) {
        boolean zEquals;
        this.zza.zzaz().zzg();
        boolean z10 = this.zzC;
        Boolean bool2 = this.zzs;
        if (bool2 == null && bool == null) {
            zEquals = true;
        } else {
            zEquals = bool2 == null ? false : bool2.equals(bool);
        }
        this.zzC = z10 | (!zEquals);
        this.zzs = bool;
    }

    @WorkerThread
    public final void zzae(@Nullable String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzkw.zzak(this.zze, str);
        this.zze = str;
    }

    @WorkerThread
    public final void zzaf(@Nullable List list) {
        this.zza.zzaz().zzg();
        List list2 = this.zzu;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.zzC = true;
        this.zzu = list != null ? new ArrayList(list) : null;
    }

    @WorkerThread
    public final boolean zzag() {
        this.zza.zzaz().zzg();
        return this.zzq;
    }

    @WorkerThread
    public final boolean zzah() {
        this.zza.zzaz().zzg();
        return this.zzo;
    }

    @WorkerThread
    public final boolean zzai() {
        this.zza.zzaz().zzg();
        return this.zzC;
    }

    @WorkerThread
    public final long zzb() {
        this.zza.zzaz().zzg();
        return this.zzk;
    }

    @WorkerThread
    public final long zzc() {
        this.zza.zzaz().zzg();
        return this.zzD;
    }

    @WorkerThread
    public final long zzd() {
        this.zza.zzaz().zzg();
        return this.zzy;
    }

    @WorkerThread
    public final long zze() {
        this.zza.zzaz().zzg();
        return this.zzz;
    }

    @WorkerThread
    public final long zzf() {
        this.zza.zzaz().zzg();
        return this.zzx;
    }

    @WorkerThread
    public final long zzg() {
        this.zza.zzaz().zzg();
        return this.zzw;
    }

    @WorkerThread
    public final long zzh() {
        this.zza.zzaz().zzg();
        return this.zzA;
    }

    @WorkerThread
    public final long zzi() {
        this.zza.zzaz().zzg();
        return this.zzv;
    }

    @WorkerThread
    public final long zzj() {
        this.zza.zzaz().zzg();
        return this.zzn;
    }

    @WorkerThread
    public final long zzk() {
        this.zza.zzaz().zzg();
        return this.zzt;
    }

    @WorkerThread
    public final long zzl() {
        this.zza.zzaz().zzg();
        return this.zzE;
    }

    @WorkerThread
    public final long zzm() {
        this.zza.zzaz().zzg();
        return this.zzm;
    }

    @WorkerThread
    public final long zzn() {
        this.zza.zzaz().zzg();
        return this.zzi;
    }

    @WorkerThread
    public final long zzo() {
        this.zza.zzaz().zzg();
        return this.zzg;
    }

    @WorkerThread
    public final long zzp() {
        this.zza.zzaz().zzg();
        return this.zzh;
    }

    @Nullable
    @WorkerThread
    public final Boolean zzq() {
        this.zza.zzaz().zzg();
        return this.zzs;
    }

    @Nullable
    @WorkerThread
    public final String zzr() {
        this.zza.zzaz().zzg();
        return this.zzr;
    }

    @Nullable
    @WorkerThread
    public final String zzs() {
        this.zza.zzaz().zzg();
        String str = this.zzB;
        zzY(null);
        return str;
    }

    @WorkerThread
    public final String zzt() {
        this.zza.zzaz().zzg();
        return this.zzb;
    }

    @Nullable
    @WorkerThread
    public final String zzu() {
        this.zza.zzaz().zzg();
        return this.zzc;
    }

    @Nullable
    @WorkerThread
    public final String zzv() {
        this.zza.zzaz().zzg();
        return this.zzl;
    }

    @Nullable
    @WorkerThread
    public final String zzw() {
        this.zza.zzaz().zzg();
        return this.zzj;
    }

    @Nullable
    @WorkerThread
    public final String zzx() {
        this.zza.zzaz().zzg();
        return this.zzf;
    }

    @Nullable
    @WorkerThread
    public final String zzy() {
        this.zza.zzaz().zzg();
        return this.zzd;
    }

    @Nullable
    @WorkerThread
    public final String zzz() {
        this.zza.zzaz().zzg();
        return this.zzB;
    }
}
