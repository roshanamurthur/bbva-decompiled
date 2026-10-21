package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.bbva.semaas.model.Properties;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzph;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdy extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private List zzh;
    private int zzi;
    private String zzj;
    private String zzk;

    public zzdy(zzfr zzfrVar, long j10) {
        super(zzfrVar);
        this.zzg = j10;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:38:0x0108  */
    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:40:0x0128  */
    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:42:0x0140  */
    /* JADX WARN: Code duplicated, block: B:45:0x0152  */
    /* JADX WARN: Code duplicated, block: B:48:0x0172  */
    /* JADX WARN: Code duplicated, block: B:51:0x017b A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0194  */
    /* JADX WARN: Code duplicated, block: B:54:0x0195 A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01a6 A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bf A[Catch: IllegalStateException -> 0x01a2, TryCatch #0 {IllegalStateException -> 0x01a2, blocks: (B:46:0x015a, B:49:0x0173, B:51:0x017b, B:55:0x0199, B:54:0x0195, B:59:0x01a6, B:61:0x01bc, B:63:0x01c1, B:62:0x01bf), top: B:84:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:72:0x0205  */
    /* JADX WARN: Code duplicated, block: B:75:0x020f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0224  */
    /* JADX WARN: Code duplicated, block: B:80:0x0228  */
    /* JADX WARN: Code duplicated, block: B:82:0x0235  */
    /* JADX WARN: Code duplicated, block: B:92:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.measurement.internal.zzf
    @EnsuresNonNull({"appId", "appStore", Properties.APP_NAME, "gmpAppId", "gaAppId"})
    @WorkerThread
    public final void zzd() {
        String str;
        String string;
        Object[] objArr;
        int iZza;
        List listZzp;
        Iterator it;
        String strZzc;
        String str2;
        Context contextZzau;
        String strZzz;
        String packageName = this.zzs.zzau().getPackageName();
        PackageManager packageManager = this.zzs.zzau().getPackageManager();
        int i10 = Integer.MIN_VALUE;
        String installerPackageName = "unknown";
        String str3 = "Unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    this.zzs.zzay().zzd().zzb("Error retrieving app installer package name. appId", zzeh.zzn(packageName));
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = "";
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.zzs.zzau().getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        try {
                            str3 = packageInfo.versionName;
                            i10 = packageInfo.versionCode;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            str = str3;
                            str3 = string;
                            this.zzs.zzay().zzd().zzc("Error retrieving package info. appId, appName", zzeh.zzn(packageName), str3);
                            string = str3;
                            str3 = str;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = "Unknown";
                }
                this.zza = packageName;
                this.zzd = installerPackageName;
                this.zzb = str3;
                this.zzc = i10;
                this.zze = string;
                this.zzf = 0L;
                if (TextUtils.isEmpty(this.zzs.zzw()) && "am".equals(this.zzs.zzx())) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                iZza = this.zzs.zza();
                switch (iZza) {
                    case 0:
                        androidx.activity.a.g(this.zzs, "App measurement collection enabled");
                        break;
                    case 1:
                        this.zzs.zzay().zzi().zza("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        androidx.activity.a.g(this.zzs, "App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        this.zzs.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        this.zzs.zzay().zzi().zza("App measurement disabled via the manifest");
                        break;
                    case 5:
                        androidx.activity.a.g(this.zzs, "App measurement disabled via the init parameters");
                        break;
                    case 6:
                        this.zzs.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        this.zzs.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        this.zzs.zzay().zzi().zza("App measurement disabled due to denied storage consent");
                        break;
                }
                this.zzj = "";
                this.zzk = "";
                this.zzs.zzaw();
                if (objArr != false) {
                    this.zzk = this.zzs.zzw();
                }
                strZzc = zzic.zzc(this.zzs.zzau(), "google_app_id", this.zzs.zzz());
                this.zzj = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
                if (!TextUtils.isEmpty(strZzc)) {
                    contextZzau = this.zzs.zzau();
                    strZzz = this.zzs.zzz();
                    Preconditions.checkNotNull(contextZzau);
                    Resources resources = contextZzau.getResources();
                    if (!TextUtils.isEmpty(strZzz)) {
                        strZzz = zzfj.zza(contextZzau);
                    }
                    this.zzk = zzfj.zzb("admob_app_id", resources, strZzz);
                }
                if (iZza == 0) {
                    zzef zzefVarZzj = this.zzs.zzay().zzj();
                    String str4 = this.zza;
                    if (TextUtils.isEmpty(this.zzj)) {
                        str2 = this.zzk;
                    } else {
                        str2 = this.zzj;
                    }
                    zzefVarZzj.zzc("App measurement enabled for app package, google app id", str4, str2);
                }
                this.zzh = null;
                this.zzs.zzaw();
                listZzp = this.zzs.zzf().zzp("analytics.safelisted_events");
                if (listZzp != null) {
                    this.zzh = listZzp;
                } else if (listZzp.size() == 0) {
                    this.zzs.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
                } else {
                    it = listZzp.iterator();
                    do {
                        if (it.hasNext()) {
                            this.zzh = listZzp;
                        }
                    } while (this.zzs.zzv().zzaa("safelisted event", (String) it.next()));
                }
                if (packageManager != null) {
                    this.zzi = InstantApps.isInstantApp(this.zzs.zzau()) ? 1 : 0;
                } else {
                    this.zzi = 0;
                }
            }
            this.zzs.zzay().zzd().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzeh.zzn(packageName));
            strZzc = zzic.zzc(this.zzs.zzau(), "google_app_id", this.zzs.zzz());
            this.zzj = true != TextUtils.isEmpty(strZzc) ? strZzc : "";
            if (!TextUtils.isEmpty(strZzc)) {
                contextZzau = this.zzs.zzau();
                strZzz = this.zzs.zzz();
                Preconditions.checkNotNull(contextZzau);
                Resources resources2 = contextZzau.getResources();
                if (!TextUtils.isEmpty(strZzz)) {
                    strZzz = zzfj.zza(contextZzau);
                }
                this.zzk = zzfj.zzb("admob_app_id", resources2, strZzz);
            }
            if (iZza == 0) {
                zzef zzefVarZzj2 = this.zzs.zzay().zzj();
                String str5 = this.zza;
                if (TextUtils.isEmpty(this.zzj)) {
                    str2 = this.zzk;
                } else {
                    str2 = this.zzj;
                }
                zzefVarZzj2.zzc("App measurement enabled for app package, google app id", str5, str2);
            }
        } catch (IllegalStateException e5) {
            this.zzs.zzay().zzd().zzc("Fetching Google App Id failed with exception. appId", zzeh.zzn(packageName), e5);
        }
        string = "Unknown";
        this.zza = packageName;
        this.zzd = installerPackageName;
        this.zzb = str3;
        this.zzc = i10;
        this.zze = string;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzs.zzw())) {
            objArr = false;
        } else {
            objArr = false;
        }
        iZza = this.zzs.zza();
        switch (iZza) {
            case 0:
                androidx.activity.a.g(this.zzs, "App measurement collection enabled");
                break;
            case 1:
                this.zzs.zzay().zzi().zza("App measurement deactivated via the manifest");
                break;
            case 2:
                androidx.activity.a.g(this.zzs, "App measurement deactivated via the init parameters");
                break;
            case 3:
                this.zzs.zzay().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                this.zzs.zzay().zzi().zza("App measurement disabled via the manifest");
                break;
            case 5:
                androidx.activity.a.g(this.zzs, "App measurement disabled via the init parameters");
                break;
            case 6:
                this.zzs.zzay().zzl().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                this.zzs.zzay().zzi().zza("App measurement disabled via the global data collection setting");
                break;
            default:
                this.zzs.zzay().zzi().zza("App measurement disabled due to denied storage consent");
                break;
        }
        this.zzj = "";
        this.zzk = "";
        this.zzs.zzaw();
        if (objArr != false) {
            this.zzk = this.zzs.zzw();
        }
        this.zzh = null;
        this.zzs.zzaw();
        listZzp = this.zzs.zzf().zzp("analytics.safelisted_events");
        if (listZzp != null) {
            this.zzh = listZzp;
        } else if (listZzp.size() == 0) {
            this.zzs.zzay().zzl().zza("Safelisted event list is empty. Ignoring");
        } else {
            it = listZzp.iterator();
            do {
                if (it.hasNext()) {
                    this.zzh = listZzp;
                }
            } while (this.zzs.zzv().zzaa("safelisted event", (String) it.next()));
        }
        if (packageManager != null) {
            this.zzi = InstantApps.isInstantApp(this.zzs.zzau()) ? 1 : 0;
        } else {
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return true;
    }

    @WorkerThread
    public final int zzh() {
        zza();
        return this.zzi;
    }

    @WorkerThread
    public final int zzi() {
        zza();
        return this.zzc;
    }

    @WorkerThread
    public final zzp zzj(String str) {
        String str2;
        zzg();
        String strZzl = zzl();
        String strZzm = zzm();
        zza();
        String str3 = this.zzb;
        zza();
        long j10 = this.zzc;
        zza();
        Preconditions.checkNotNull(this.zzd);
        String str4 = this.zzd;
        this.zzs.zzf().zzh();
        zza();
        zzg();
        long j11 = this.zzf;
        if (j11 == 0) {
            zzkw zzkwVarZzv = this.zzs.zzv();
            Context contextZzau = this.zzs.zzau();
            String packageName = this.zzs.zzau().getPackageName();
            zzkwVarZzv.zzg();
            Preconditions.checkNotNull(contextZzau);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = contextZzau.getPackageManager();
            MessageDigest messageDigestZzE = zzkw.zzE();
            long jZzp = -1;
            if (messageDigestZzE == null) {
                bc.org.bouncycastle.math.ec.custom.sec.a.e(zzkwVarZzv.zzs, "Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (zzkwVarZzv.zzaf(contextZzau, packageName)) {
                            jZzp = 0;
                        } else {
                            Signature[] signatureArr = Wrappers.packageManager(contextZzau).getPackageInfo(zzkwVarZzv.zzs.zzau().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                zzkwVarZzv.zzs.zzay().zzk().zza("Could not get signatures");
                            } else {
                                jZzp = zzkw.zzp(messageDigestZzE.digest(signatureArr[0].toByteArray()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e5) {
                        zzkwVarZzv.zzs.zzay().zzd().zzb("Package name not found", e5);
                        j11 = 0;
                    }
                }
                j11 = 0;
                this.zzf = j11;
            }
            j11 = jZzp;
            this.zzf = j11;
        }
        long j12 = j11;
        boolean zZzJ = this.zzs.zzJ();
        boolean z10 = !this.zzs.zzm().zzk;
        zzg();
        if (this.zzs.zzJ()) {
            zzph.zzc();
            if (this.zzs.zzf().zzs(null, zzdu.zzaa)) {
                androidx.activity.a.g(this.zzs, "Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = this.zzs.zzau().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        try {
                            Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zzs.zzau());
                            if (objInvoke == null) {
                                str2 = null;
                            } else {
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                                } catch (Exception unused) {
                                    this.zzs.zzay().zzl().zza("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                            }
                        } catch (Exception unused2) {
                            this.zzs.zzay().zzm().zza("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        zzfr zzfrVar = this.zzs;
        long jZza = zzfrVar.zzm().zzc.zza();
        long jMin = jZza == 0 ? zzfrVar.zzc : Math.min(zzfrVar.zzc, jZza);
        zza();
        int i10 = this.zzi;
        boolean zZzr = this.zzs.zzf().zzr();
        zzew zzewVarZzm = this.zzs.zzm();
        zzewVarZzm.zzg();
        boolean z11 = zzewVarZzm.zza().getBoolean("deferred_analytics_collection", false);
        zza();
        String str5 = this.zzk;
        Boolean boolZzk = this.zzs.zzf().zzk("google_analytics_default_allow_ad_personalization_signals");
        return new zzp(strZzl, strZzm, str3, j10, str4, 55005L, j12, str, zZzJ, z10, str2, 0L, jMin, i10, zZzr, z11, str5, boolZzk == null ? null : Boolean.valueOf(!boolZzk.booleanValue()), this.zzg, this.zzh, (String) null, this.zzs.zzm().zzc().zzh());
    }

    @WorkerThread
    public final String zzk() {
        zza();
        return this.zzk;
    }

    @WorkerThread
    public final String zzl() {
        zza();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    @WorkerThread
    public final String zzm() {
        zznx.zzc();
        if (this.zzs.zzf().zzs(null, zzdu.zzal)) {
            zzg();
        }
        zza();
        Preconditions.checkNotNull(this.zzj);
        return this.zzj;
    }

    @WorkerThread
    public final List zzn() {
        return this.zzh;
    }
}
