package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.nulabinc.zxcvbn.Guess;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzaf extends zzgk {
    private Boolean zza;
    private zzae zzb;
    private Boolean zzc;

    public zzaf(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzb = new zzae() { // from class: com.google.android.gms.measurement.internal.zzad
            @Override // com.google.android.gms.measurement.internal.zzae
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzdu.zzC.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str3);
            return str3;
        } catch (ClassNotFoundException e5) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties class", e5);
            return "";
        } catch (IllegalAccessException e7) {
            this.zzs.zzay().zzd().zzb("Could not access SystemProperties.get()", e7);
            return "";
        } catch (NoSuchMethodException e10) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties.get() method", e10);
            return "";
        } catch (InvocationTargetException e11) {
            this.zzs.zzay().zzd().zzb("SystemProperties.get() threw an exception", e11);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzdu.zzc.zza(null)).longValue();
    }

    @WorkerThread
    public final double zza(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Double) zzdtVar.zza(null)).doubleValue();
        }
        String strZza = this.zzb.zza(str, zzdtVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Double) zzdtVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzdtVar.zza(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzdtVar.zza(null)).doubleValue();
        }
    }

    public final int zzb(@Size(min = 1) String str) {
        return zzf(str, zzdu.zzG, 500, Guess.REFERENCE_YEAR);
    }

    public final int zzc() {
        zzkw zzkwVarZzv = this.zzs.zzv();
        Boolean boolZzj = zzkwVarZzv.zzs.zzt().zzj();
        if (zzkwVarZzv.zzm() < 201500) {
            return (boolZzj == null || boolZzj.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzf(str, zzdu.zzH, 25, 100);
    }

    @WorkerThread
    public final int zze(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Integer) zzdtVar.zza(null)).intValue();
        }
        String strZza = this.zzb.zza(str, zzdtVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Integer) zzdtVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzdtVar.zza(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzdtVar.zza(null)).intValue();
        }
    }

    @WorkerThread
    public final int zzf(String str, zzdt zzdtVar, int i10, int i11) {
        return Math.max(Math.min(zze(str, zzdtVar), i11), i10);
    }

    public final long zzh() {
        this.zzs.zzaw();
        return 55005L;
    }

    @WorkerThread
    public final long zzi(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Long) zzdtVar.zza(null)).longValue();
        }
        String strZza = this.zzb.zza(str, zzdtVar.zzb());
        if (TextUtils.isEmpty(strZza)) {
            return ((Long) zzdtVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzdtVar.zza(Long.valueOf(Long.parseLong(strZza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzdtVar.zza(null)).longValue();
        }
    }

    @VisibleForTesting
    public final Bundle zzj() {
        try {
            if (this.zzs.zzau().getPackageManager() == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzs.zzau()).getApplicationInfo(this.zzs.zzau().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            this.zzs.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e5) {
            this.zzs.zzay().zzd().zzb("Failed to load metadata: Package name not found", e5);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean zzk(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzj = zzj();
        if (bundleZzj == null) {
            bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzj.containsKey(str)) {
            return Boolean.valueOf(bundleZzj.getBoolean(str));
        }
        return null;
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    public final String zzn() {
        this.zzs.zzaw();
        return "FA";
    }

    @WorkerThread
    public final String zzo(String str, zzdt zzdtVar) {
        return str == null ? (String) zzdtVar.zza(null) : (String) zzdtVar.zza(this.zzb.zza(str, zzdtVar.zzb()));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: NotFoundException -> 0x0040, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0040, blocks: (B:11:0x0026, B:14:0x003b), top: B:19:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @VisibleForTesting
    public final List zzp(@Size(min = 1) String str) {
        Integer numValueOf;
        String[] stringArray;
        Preconditions.checkNotEmpty("analytics.safelisted_events");
        Bundle bundleZzj = zzj();
        if (bundleZzj != null) {
            if (bundleZzj.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleZzj.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = this.zzs.zzau().getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e5) {
                    this.zzs.zzay().zzd().zzb("Failed to load string array from metadata: resource not found", e5);
                }
            }
            return null;
        }
        bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zzs, "Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = this.zzs.zzau().getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                return null;
            }
            return Arrays.asList(stringArray);
        }
        return null;
    }

    public final void zzq(zzae zzaeVar) {
        this.zzb = zzaeVar;
    }

    public final boolean zzr() {
        Boolean boolZzk = zzk("google_analytics_adid_collection_enabled");
        return boolZzk == null || boolZzk.booleanValue();
    }

    @WorkerThread
    public final boolean zzs(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Boolean) zzdtVar.zza(null)).booleanValue();
        }
        String strZza = this.zzb.zza(str, zzdtVar.zzb());
        return TextUtils.isEmpty(strZza) ? ((Boolean) zzdtVar.zza(null)).booleanValue() : ((Boolean) zzdtVar.zza(Boolean.valueOf("1".equals(strZza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean boolZzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return boolZzk == null || boolZzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzs.zzaw();
        Boolean boolZzk = zzk("firebase_analytics_collection_deactivated");
        return boolZzk != null && boolZzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    public final boolean zzx() {
        if (this.zza == null) {
            Boolean boolZzk = zzk("app_measurement_lite");
            this.zza = boolZzk;
            if (boolZzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzs.zzN();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                try {
                    if (this.zzc == null) {
                        ApplicationInfo applicationInfo = this.zzs.zzau().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(myProcessName)) {
                                z10 = true;
                            }
                            this.zzc = Boolean.valueOf(z10);
                        }
                        if (this.zzc == null) {
                            this.zzc = Boolean.TRUE;
                            this.zzs.zzay().zzd().zza("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
