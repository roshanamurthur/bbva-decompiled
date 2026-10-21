package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzb = new ArrayMap();
        this.zza = new ArrayMap();
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j10) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j10;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            a.f(zzdVar.zzs, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j10));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j10) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num == null) {
            zzdVar.zzs.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzid zzidVarZzj = zzdVar.zzs.zzs().zzj(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            zzdVar.zzb.put(str, Integer.valueOf(iIntValue));
            return;
        }
        zzdVar.zzb.remove(str);
        Long l6 = (Long) zzdVar.zza.get(str);
        if (l6 == null) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(zzdVar.zzs, "First ad unit exposure time was never set");
        } else {
            long jLongValue = l6.longValue();
            zzdVar.zza.remove(str);
            zzdVar.zzi(str, j10 - jLongValue, zzidVarZzj);
        }
        if (zzdVar.zzb.isEmpty()) {
            long j11 = zzdVar.zzc;
            if (j11 == 0) {
                bc.org.bouncycastle.math.ec.custom.sec.a.e(zzdVar.zzs, "First ad exposure time was never set");
            } else {
                zzdVar.zzh(j10 - j11, zzidVarZzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    @WorkerThread
    private final void zzh(long j10, zzid zzidVar) {
        if (zzidVar == null) {
            androidx.activity.a.g(this.zzs, "Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        zzkw.zzJ(zzidVar, bundle, true);
        this.zzs.zzq().zzG("am", "_xa", bundle);
    }

    @WorkerThread
    private final void zzi(String str, long j10, zzid zzidVar) {
        if (zzidVar == null) {
            androidx.activity.a.g(this.zzs, "Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        zzkw.zzJ(zzidVar, bundle, true);
        this.zzs.zzq().zzG("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzj(long j10) {
        Iterator it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put((String) it.next(), Long.valueOf(j10));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j10;
    }

    public final void zzd(String str, long j10) {
        if (str == null || str.length() == 0) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new zza(this, str, j10));
        }
    }

    public final void zze(String str, long j10) {
        if (str == null || str.length() == 0) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new zzb(this, str, j10));
        }
    }

    @WorkerThread
    public final void zzf(long j10) {
        zzid zzidVarZzj = this.zzs.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j10 - ((Long) this.zza.get(str)).longValue(), zzidVarZzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j10 - this.zzc, zzidVarZzj);
        }
        zzj(j10);
    }
}
