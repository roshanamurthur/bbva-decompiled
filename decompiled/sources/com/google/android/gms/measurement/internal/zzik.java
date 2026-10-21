package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzik extends zzf {

    @VisibleForTesting
    protected zzid zza;
    private volatile zzid zzb;
    private volatile zzid zzc;
    private final Map zzd;

    @GuardedBy("activityLock")
    private Activity zze;

    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zzid zzg;
    private zzid zzh;

    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    @GuardedBy("this")
    private zzid zzk;

    @GuardedBy("this")
    private String zzl;

    public zzik(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    @MainThread
    private final void zzA(Activity activity, zzid zzidVar, boolean z10) {
        zzid zzidVar2;
        zzid zzidVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzidVar.zzb == null) {
            zzidVar2 = new zzid(zzidVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzidVar.zzc, zzidVar.zze, zzidVar.zzf);
        } else {
            zzidVar2 = zzidVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzidVar2;
        this.zzs.zzaz().zzp(new zzif(this, zzidVar2, zzidVar3, this.zzs.zzav().elapsedRealtime(), z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzB(zzid zzidVar, zzid zzidVar2, long j10, boolean z10, Bundle bundle) {
        long j11;
        zzg();
        boolean z11 = false;
        boolean z12 = (zzidVar2 != null && zzidVar2.zzc == zzidVar.zzc && zzkw.zzak(zzidVar2.zzb, zzidVar.zzb) && zzkw.zzak(zzidVar2.zza, zzidVar.zza)) ? false : true;
        if (z10 && this.zza != null) {
            z11 = true;
        }
        if (z12) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzkw.zzJ(zzidVar, bundle2, true);
            if (zzidVar2 != null) {
                String str = zzidVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzidVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzidVar2.zzc);
            }
            if (z11) {
                zzjy zzjyVar = this.zzs.zzu().zzb;
                long j12 = j10 - zzjyVar.zzb;
                zzjyVar.zzb = j10;
                if (j12 > 0) {
                    this.zzs.zzv().zzH(bundle2, j12);
                }
            }
            if (!this.zzs.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzidVar.zze ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "app";
            long jCurrentTimeMillis = this.zzs.zzav().currentTimeMillis();
            if (zzidVar.zze) {
                long j13 = zzidVar.zzf;
                if (j13 != 0) {
                    j11 = j13;
                }
                this.zzs.zzq().zzH(str3, "_vs", j11, bundle2);
            }
            j11 = jCurrentTimeMillis;
            this.zzs.zzq().zzH(str3, "_vs", j11, bundle2);
        }
        if (z11) {
            zzC(this.zza, true, j10);
        }
        this.zza = zzidVar;
        if (zzidVar.zze) {
            this.zzh = zzidVar;
        }
        this.zzs.zzt().zzG(zzidVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzC(zzid zzidVar, boolean z10, long j10) {
        this.zzs.zzd().zzf(this.zzs.zzav().elapsedRealtime());
        if (!this.zzs.zzu().zzb.zzd(zzidVar != null && zzidVar.zzd, z10, j10) || zzidVar == null) {
            return;
        }
        zzidVar.zzd = false;
    }

    public static /* bridge */ /* synthetic */ void zzp(zzik zzikVar, Bundle bundle, zzid zzidVar, zzid zzidVar2, long j10) {
        bundle.remove("screen_name");
        bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        zzikVar.zzB(zzidVar, zzidVar2, j10, true, zzikVar.zzs.zzv().zzy(null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
    }

    @MainThread
    private final zzid zzz(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzid zzidVar = (zzid) this.zzd.get(activity);
        if (zzidVar == null) {
            zzid zzidVar2 = new zzid(null, zzl(activity.getClass(), "Activity"), this.zzs.zzv().zzq());
            this.zzd.put(activity, zzidVar2);
            zzidVar = zzidVar2;
        }
        return this.zzg != null ? this.zzg : zzidVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final zzid zzi() {
        return this.zzb;
    }

    @WorkerThread
    public final zzid zzj(boolean z10) {
        zza();
        zzg();
        if (!z10) {
            return this.zza;
        }
        zzid zzidVar = this.zza;
        return zzidVar != null ? zzidVar : this.zzh;
    }

    @VisibleForTesting
    public final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        this.zzs.zzf();
        if (length2 <= 100) {
            return str2;
        }
        this.zzs.zzf();
        return str2.substring(0, 100);
    }

    @MainThread
    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzs.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzid(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.zzs.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    @MainThread
    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
        if (!this.zzs.zzf().zzu()) {
            this.zzb = null;
            this.zzs.zzaz().zzp(new zzih(this, jElapsedRealtime));
        } else {
            zzid zzidVarZzz = zzz(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            this.zzs.zzaz().zzp(new zzii(this, zzidVarZzz, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzs.zzf().zzu()) {
                    this.zzg = null;
                    this.zzs.zzaz().zzp(new zzij(this));
                }
            }
        }
        if (!this.zzs.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzs.zzaz().zzp(new zzig(this));
        } else {
            zzA(activity, zzz(activity), false);
            zzd zzdVarZzd = this.zzs.zzd();
            zzdVarZzd.zzs.zzaz().zzp(new zzc(zzdVarZzd, zzdVarZzd.zzs.zzav().elapsedRealtime()));
        }
    }

    @MainThread
    public final void zzv(Activity activity, Bundle bundle) {
        zzid zzidVar;
        if (!this.zzs.zzf().zzu() || bundle == null || (zzidVar = (zzid) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzidVar.zzc);
        bundle2.putString("name", zzidVar.zza);
        bundle2.putString("referrer_name", zzidVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzw(@androidx.annotation.NonNull android.app.Activity r4, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r5, @androidx.annotation.Size(max = 36, min = 1) java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzx(android.os.Bundle, long):void");
    }

    @WorkerThread
    public final void zzy(String str, zzid zzidVar) {
        zzg();
        synchronized (this) {
            try {
                String str2 = this.zzl;
                if (str2 == null || str2.equals(str) || zzidVar != null) {
                    this.zzl = str;
                    this.zzk = zzidVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
