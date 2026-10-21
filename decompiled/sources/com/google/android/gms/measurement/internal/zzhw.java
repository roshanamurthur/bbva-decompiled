package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhw extends zzf {

    @VisibleForTesting
    protected zzhv zza;
    final zzr zzb;

    @VisibleForTesting
    protected boolean zzc;
    private zzgr zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;

    @GuardedBy("consentLock")
    private zzah zzi;

    @GuardedBy("consentLock")
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzkv zzn;

    public zzhw(zzfr zzfrVar) {
        super(zzfrVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzhk(this);
        this.zzg = new AtomicReference();
        this.zzi = new zzah(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzr(zzfrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzab, reason: merged with bridge method [inline-methods] */
    public final void zzB(Bundle bundle, long j10) {
        if (TextUtils.isEmpty(this.zzs.zzh().zzm())) {
            zzR(bundle, 0, j10);
        } else {
            this.zzs.zzay().zzl().zza("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzac(Boolean bool, boolean z10) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().zzh(bool);
        if (z10) {
            zzew zzewVarZzm = this.zzs.zzm();
            zzfr zzfrVar = zzewVarZzm.zzs;
            zzewVarZzm.zzg();
            SharedPreferences.Editor editorEdit = zzewVarZzm.zza().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzs.zzK() || !(bool == null || bool.booleanValue())) {
            zzad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzad() {
        zzg();
        String strZza = this.zzs.zzm().zzh.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                zzZ("app", "_npa", null, this.zzs.zzav().currentTimeMillis());
            } else {
                zzZ("app", "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), this.zzs.zzav().currentTimeMillis());
            }
        }
        if (!this.zzs.zzJ() || !this.zzc) {
            this.zzs.zzay().zzc().zza("Updating Scion state (FE)");
            this.zzs.zzt().zzI();
            return;
        }
        this.zzs.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzy();
        zzod.zzc();
        if (this.zzs.zzf().zzs(null, zzdu.zzad)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzs.zzaz().zzp(new zzgz(this));
    }

    public static /* synthetic */ void zzv(zzhw zzhwVar, zzah zzahVar, int i10, long j10, boolean z10, boolean z11) {
        zzhwVar.zzg();
        zzhwVar.zza();
        if (j10 <= zzhwVar.zzl && zzah.zzj(zzhwVar.zzm, i10)) {
            zzhwVar.zzs.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzahVar);
            return;
        }
        zzew zzewVarZzm = zzhwVar.zzs.zzm();
        zzfr zzfrVar = zzewVarZzm.zzs;
        zzewVarZzm.zzg();
        if (!zzewVarZzm.zzl(i10)) {
            zzhwVar.zzs.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
            return;
        }
        SharedPreferences.Editor editorEdit = zzewVarZzm.zza().edit();
        editorEdit.putString("consent_settings", zzahVar.zzh());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        zzhwVar.zzl = j10;
        zzhwVar.zzm = i10;
        zzhwVar.zzs.zzt().zzF(z10);
        if (z11) {
            zzhwVar.zzs.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA() {
        if (!(this.zzs.zzau().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzs.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().zzr.zzb(new Bundle());
            return;
        }
        Bundle bundleZza = this.zzs.zzm().zzr.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().zzae(obj)) {
                    this.zzs.zzv().zzM(this.zzn, null, 27, null, null, 0);
                }
                this.zzs.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzkw.zzag(str)) {
                this.zzs.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleZza.remove(str);
            } else {
                zzkw zzkwVarZzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzkwVarZzv.zzZ("param", str, 100, obj)) {
                    this.zzs.zzv().zzN(bundleZza, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int iZzc = this.zzs.zzf().zzc();
        if (bundleZza.size() > iZzc) {
            int i10 = 0;
            for (String str2 : new TreeSet(bundleZza.keySet())) {
                i10++;
                if (i10 > iZzc) {
                    bundleZza.remove(str2);
                }
            }
            this.zzs.zzv().zzM(this.zzn, null, 26, null, null, 0);
            this.zzs.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().zzr.zzb(bundleZza);
        this.zzs.zzt().zzH(bundleZza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzkw.zzak(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.zzs.zzs().zzx(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.zzd != null && !zzkw.zzag(str2)) {
            z12 = false;
        }
        zzM(str3, str2, j10, bundle2, z11, z12, z10, null);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzfr.zzO();
        zzM(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, this.zzs.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @WorkerThread
    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzs.zzav().currentTimeMillis(), bundle);
    }

    @WorkerThread
    public final void zzH(String str, String str2, long j10, Bundle bundle) {
        zzg();
        zzI(str, str2, j10, bundle, true, this.zzd == null || zzkw.zzag(str2), true, null);
    }

    @WorkerThread
    public final void zzI(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        Bundle[] bundleArr;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzs.zzJ()) {
            this.zzs.zzay().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzn = this.zzs.zzh().zzn();
        if (listZzn != null && !listZzn.contains(str2)) {
            this.zzs.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzs.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzs.zzau().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzs.zzau());
                } catch (Exception e5) {
                    this.zzs.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e5);
                }
            } catch (ClassNotFoundException unused) {
                this.zzs.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzs.zzaw();
            zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lgclid", bundle.getString("gclid"), this.zzs.zzav().currentTimeMillis());
        }
        this.zzs.zzaw();
        if (z10 && zzkw.zzal(str2)) {
            this.zzs.zzv().zzK(bundle, this.zzs.zzm().zzr.zza());
        }
        if (!z12) {
            this.zzs.zzaw();
            if (!"_iap".equals(str2)) {
                zzkw zzkwVarZzv = this.zzs.zzv();
                int i10 = 2;
                if (zzkwVarZzv.zzab("event", str2)) {
                    if (zzkwVarZzv.zzY("event", zzgo.zza, zzgo.zzb, str2)) {
                        zzkwVarZzv.zzs.zzf();
                        if (zzkwVarZzv.zzX("event", 40, str2)) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 13;
                    }
                }
                if (i10 != 0) {
                    this.zzs.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                    zzkw zzkwVarZzv2 = this.zzs.zzv();
                    this.zzs.zzf();
                    this.zzs.zzv().zzM(this.zzn, null, i10, "_ev", zzkwVarZzv2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzpb.zzc();
        if (this.zzs.zzf().zzs(null, zzdu.zzat)) {
            this.zzs.zzaw();
            zzid zzidVarZzj = this.zzs.zzs().zzj(false);
            if (zzidVarZzj != null && !bundle.containsKey("_sc")) {
                zzidVarZzj.zzd = true;
            }
            zzkw.zzJ(zzidVarZzj, bundle, z10 && !z12);
        } else {
            this.zzs.zzaw();
            zzid zzidVarZzj2 = this.zzs.zzs().zzj(false);
            if (zzidVarZzj2 != null && !bundle.containsKey("_sc")) {
                zzidVarZzj2.zzd = true;
            }
            zzkw.zzJ(zzidVarZzj2, bundle, z10 && !z12);
        }
        boolean zEquals = "am".equals(str);
        boolean zZzag = zzkw.zzag(str2);
        if (!z10 || this.zzd == null || zZzag) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                this.zzs.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        if (this.zzs.zzM()) {
            int iZzh = this.zzs.zzv().zzh(str2);
            if (iZzh != 0) {
                this.zzs.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                zzkw zzkwVarZzv3 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().zzM(this.zzn, str3, iZzh, "_ev", zzkwVarZzv3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzy = this.zzs.zzv().zzy(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z12);
            Preconditions.checkNotNull(bundleZzy);
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) != null && "_ae".equals(str2)) {
                zzjy zzjyVar = this.zzs.zzu().zzb;
                long jElapsedRealtime = zzjyVar.zzc.zzs.zzav().elapsedRealtime();
                long j11 = jElapsedRealtime - zzjyVar.zzb;
                zzjyVar.zzb = jElapsedRealtime;
                if (j11 > 0) {
                    this.zzs.zzv().zzH(bundleZzy, j11);
                }
            }
            zznu.zzc();
            if (this.zzs.zzf().zzs(null, zzdu.zzac)) {
                if (!DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) && "_ssr".equals(str2)) {
                    zzkw zzkwVarZzv4 = this.zzs.zzv();
                    String string = bundleZzy.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzkw.zzak(string, zzkwVarZzv4.zzs.zzm().zzo.zza())) {
                        zzkwVarZzv4.zzs.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzkwVarZzv4.zzs.zzm().zzo.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String strZza = this.zzs.zzv().zzs.zzm().zzo.zza();
                    if (!TextUtils.isEmpty(strZza)) {
                        bundleZzy.putString("_ffr", strZza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzy);
            if (this.zzs.zzm().zzj.zza() > 0 && this.zzs.zzm().zzk(j10) && this.zzs.zzm().zzl.zzb()) {
                androidx.activity.a.g(this.zzs, "Current session is expired, remove the session number, ID, and engagement time");
                zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, NotificationMessage.NOTIF_KEY_SID, null, this.zzs.zzav().currentTimeMillis());
                zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sno", null, this.zzs.zzav().currentTimeMillis());
                zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_se", null, this.zzs.zzav().currentTimeMillis());
            }
            if (bundleZzy.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, 0L) == 1) {
                androidx.activity.a.g(this.zzs, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzs.zzu().zza.zzb(j10, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleZzy.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str4 = (String) arrayList2.get(i11);
                if (str4 != null) {
                    this.zzs.zzv();
                    Object obj = bundleZzy.get(str4);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzy.putParcelableArray(str4, bundleArr);
                    }
                }
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                Bundle bundleZzt = (Bundle) arrayList.get(i12);
                String str5 = i12 != 0 ? "_ep" : str2;
                bundleZzt.putString("_o", str);
                if (z11) {
                    bundleZzt = this.zzs.zzv().zzt(bundleZzt);
                }
                Bundle bundle2 = bundleZzt;
                this.zzs.zzt().zzA(new zzau(str5, new zzas(bundle2), str, j10), str3);
                if (!z13) {
                    Iterator it = this.zze.iterator();
                    while (it.hasNext()) {
                        ((zzgs) it.next()).onEvent(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i12++;
            }
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                return;
            }
            this.zzs.zzu().zzb.zzd(true, true, this.zzs.zzav().elapsedRealtime());
        }
    }

    public final void zzJ(zzgs zzgsVar) {
        zza();
        Preconditions.checkNotNull(zzgsVar);
        if (this.zze.add(zzgsVar)) {
            return;
        }
        a.f(this.zzs, "OnEventListener already registered");
    }

    public final void zzK(long j10) {
        this.zzg.set(null);
        this.zzs.zzaz().zzp(new zzhe(this, j10));
    }

    public final void zzL(long j10, boolean z10) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zza("Resetting analytics data (FE)");
        zzka zzkaVarZzu = this.zzs.zzu();
        zzkaVarZzu.zzg();
        zzkaVarZzu.zzb.zza();
        boolean zZzJ = this.zzs.zzJ();
        zzew zzewVarZzm = this.zzs.zzm();
        zzewVarZzm.zzc.zzb(j10);
        if (!TextUtils.isEmpty(zzewVarZzm.zzs.zzm().zzo.zza())) {
            zzewVarZzm.zzo.zzb(null);
        }
        zzod.zzc();
        zzaf zzafVarZzf = zzewVarZzm.zzs.zzf();
        zzdt zzdtVar = zzdu.zzad;
        if (zzafVarZzf.zzs(null, zzdtVar)) {
            zzewVarZzm.zzj.zzb(0L);
        }
        if (!zzewVarZzm.zzs.zzf().zzv()) {
            zzewVarZzm.zzi(!zZzJ);
        }
        zzewVarZzm.zzp.zzb(null);
        zzewVarZzm.zzq.zzb(0L);
        zzewVarZzm.zzr.zzb(null);
        if (z10) {
            this.zzs.zzt().zzC();
        }
        zzod.zzc();
        if (this.zzs.zzf().zzs(null, zzdtVar)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzc = !zZzJ;
    }

    public final void zzM(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.zzs.zzaz().zzp(new zzhb(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    public final void zzN(String str, String str2, long j10, Object obj) {
        this.zzs.zzaz().zzp(new zzhc(this, str, str2, obj, j10));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j10) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            a.f(this.zzs, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgn.zza(bundle2, "app_id", String.class, null);
        zzgn.zza(bundle2, "origin", String.class, null);
        zzgn.zza(bundle2, "name", String.class, null);
        zzgn.zza(bundle2, "value", Object.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgn.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzs.zzv().zzl(string) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
            return;
        }
        if (this.zzs.zzv().zzd(string, obj) != 0) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        Object objZzB = this.zzs.zzv().zzB(string, obj);
        if (objZzB == null) {
            this.zzs.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
            return;
        }
        zzgn.zzb(bundle2, objZzB);
        long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzs.zzf();
            if (j11 > 15552000000L || j11 < 1) {
                this.zzs.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzs.zzf();
        if (j12 > 15552000000L || j12 < 1) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j12));
        } else {
            this.zzs.zzaz().zzp(new zzhf(this, bundle2));
        }
    }

    public final void zzR(Bundle bundle, int i10, long j10) {
        zza();
        String strZzg = zzah.zzg(bundle);
        if (strZzg != null) {
            this.zzs.zzay().zzl().zzb("Ignoring invalid consent setting", strZzg);
            this.zzs.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzah.zza(bundle), i10, j10);
    }

    public final void zzS(zzah zzahVar, int i10, long j10) {
        boolean z10;
        zzah zzahVar2;
        boolean z11;
        boolean zZzk;
        zza();
        if (i10 != -10 && zzahVar.zze() == null && zzahVar.zzf() == null) {
            this.zzs.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            try {
                z10 = false;
                if (zzah.zzj(i10, this.zzj)) {
                    zZzk = zzahVar.zzk(this.zzi);
                    zzag zzagVar = zzag.ANALYTICS_STORAGE;
                    if (zzahVar.zzi(zzagVar) && !this.zzi.zzi(zzagVar)) {
                        z10 = true;
                    }
                    zzah zzahVarZzd = zzahVar.zzd(this.zzi);
                    this.zzi = zzahVarZzd;
                    this.zzj = i10;
                    zzahVar2 = zzahVarZzd;
                    z11 = z10;
                    z10 = true;
                } else {
                    zzahVar2 = zzahVar;
                    z11 = false;
                    zZzk = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            this.zzs.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzahVar2);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (zZzk) {
            this.zzg.set(null);
            this.zzs.zzaz().zzq(new zzhq(this, zzahVar2, j10, i10, andIncrement, z11));
        } else if (i10 == 30 || i10 == -10) {
            this.zzs.zzaz().zzq(new zzhr(this, zzahVar2, i10, andIncrement, z11));
        } else {
            this.zzs.zzaz().zzp(new zzhs(this, zzahVar2, i10, andIncrement, z11));
        }
    }

    public final void zzT(final Bundle bundle, final long j10) {
        zznx.zzc();
        if (this.zzs.zzf().zzs(null, zzdu.zzal)) {
            this.zzs.zzaz().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzB(bundle, j10);
                }
            });
        } else {
            zzB(bundle, j10);
        }
    }

    @WorkerThread
    public final void zzU(zzgr zzgrVar) {
        zzgr zzgrVar2;
        zzg();
        zza();
        if (zzgrVar != null && zzgrVar != (zzgrVar2 = this.zzd)) {
            Preconditions.checkState(zzgrVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzgrVar;
    }

    public final void zzV(Boolean bool) {
        zza();
        this.zzs.zzaz().zzp(new zzhp(this, bool));
    }

    @WorkerThread
    public final void zzW(zzah zzahVar) {
        zzg();
        boolean z10 = (zzahVar.zzi(zzag.ANALYTICS_STORAGE) && zzahVar.zzi(zzag.AD_STORAGE)) || this.zzs.zzt().zzM();
        if (z10 != this.zzs.zzK()) {
            this.zzs.zzG(z10);
            zzew zzewVarZzm = this.zzs.zzm();
            zzfr zzfrVar = zzewVarZzm.zzs;
            zzewVarZzm.zzg();
            Boolean boolValueOf = zzewVarZzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzewVarZzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                zzac(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void zzX(String str, String str2, Object obj, boolean z10) {
        zzY(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", obj, true, this.zzs.zzav().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public final void zzY(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int iZzl;
        int iZzd;
        Object objZzB;
        String str3 = str == null ? "app" : str;
        if (!z10) {
            zzkw zzkwVarZzv = this.zzs.zzv();
            if (!zzkwVarZzv.zzab("user property", str2)) {
                i10 = 6;
            } else if (zzkwVarZzv.zzY("user property", zzgq.zza, null, str2)) {
                zzkwVarZzv.zzs.zzf();
                if (zzkwVarZzv.zzX("user property", 24, str2)) {
                    i10 = 0;
                } else {
                    i10 = 6;
                }
            } else {
                iZzl = 15;
            }
            if (i10 != 0) {
                zzkw zzkwVarZzv2 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().zzM(this.zzn, null, i10, "_ev", zzkwVarZzv2.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
            } else {
                if (obj != null) {
                    zzN(str3, str2, j10, null);
                    return;
                }
                iZzd = this.zzs.zzv().zzd(str2, obj);
                if (iZzd != 0) {
                    zzkw zzkwVarZzv3 = this.zzs.zzv();
                    this.zzs.zzf();
                    this.zzs.zzv().zzM(this.zzn, null, iZzd, "_ev", zzkwVarZzv3.zzC(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                } else {
                    objZzB = this.zzs.zzv().zzB(str2, obj);
                    if (objZzB != null) {
                        zzN(str3, str2, j10, objZzB);
                    }
                }
            }
        }
        iZzl = this.zzs.zzv().zzl(str2);
        i10 = iZzl;
        if (i10 != 0) {
            zzkw zzkwVarZzv4 = this.zzs.zzv();
            this.zzs.zzf();
            this.zzs.zzv().zzM(this.zzn, null, i10, "_ev", zzkwVarZzv4.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
        } else {
            if (obj != null) {
                zzN(str3, str2, j10, null);
                return;
            }
            iZzd = this.zzs.zzv().zzd(str2, obj);
            if (iZzd != 0) {
                zzkw zzkwVarZzv5 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().zzM(this.zzn, null, iZzd, "_ev", zzkwVarZzv5.zzC(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
            } else {
                objZzB = this.zzs.zzv().zzB(str2, obj);
                if (objZzB != null) {
                    zzN(str3, str2, j10, objZzB);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    @WorkerThread
    public final void zzZ(String str, String str2, Object obj, long j10) {
        String str3;
        Object obj2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    Long lValueOf = Long.valueOf(true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    this.zzs.zzm().zzh.zzb(lValueOf.longValue() == 1 ? "true" : "false");
                    obj2 = lValueOf;
                } else if (obj == null) {
                    this.zzs.zzm().zzh.zzb("unset");
                    obj2 = obj;
                } else {
                    str3 = str2;
                    obj2 = obj;
                }
            } else if (obj == null) {
                this.zzs.zzm().zzh.zzb("unset");
                obj2 = obj;
            } else {
                str3 = str2;
                obj2 = obj;
            }
            str3 = "_npa";
        } else {
            str3 = str2;
            obj2 = obj;
        }
        if (!this.zzs.zzJ()) {
            androidx.activity.a.g(this.zzs, "User property not set since app measurement is disabled");
        } else if (this.zzs.zzM()) {
            this.zzs.zzt().zzK(new zzks(str3, j10, obj2, str));
        }
    }

    public final void zzaa(zzgs zzgsVar) {
        zza();
        Preconditions.checkNotNull(zzgsVar);
        if (this.zze.remove(zzgsVar)) {
            return;
        }
        a.f(this.zzs, "OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaz().zzd(atomicReference, 15000L, "boolean test flag value", new zzhh(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaz().zzd(atomicReference, 15000L, "double test flag value", new zzho(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaz().zzd(atomicReference, 15000L, "int test flag value", new zzhn(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaz().zzd(atomicReference, 15000L, "long test flag value", new zzhm(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzid zzidVarZzi = this.zzs.zzs().zzi();
        if (zzidVarZzi != null) {
            return zzidVarZzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzid zzidVarZzi = this.zzs.zzs().zzi();
        if (zzidVarZzi != null) {
            return zzidVarZzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaz().zzd(atomicReference, 15000L, "String test flag value", new zzhl(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get conditional user properties", new zzhi(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzkw.zzG(list);
        }
        this.zzs.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z10) {
        zza();
        androidx.activity.a.g(this.zzs, "Getting user properties (FE)");
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhd(this, atomicReference, z10));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzs.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z10));
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z10) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhj(this, atomicReference, null, str, str2, z10));
        List<zzks> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzks zzksVar : list) {
            Object objZza = zzksVar.zza();
            if (objZza != null) {
                arrayMap.put(zzksVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    @WorkerThread
    public final void zzy() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs(null, zzdu.zzX)) {
                zzaf zzafVarZzf = this.zzs.zzf();
                zzafVarZzf.zzs.zzaw();
                Boolean boolZzk = zzafVarZzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (boolZzk != null && boolZzk.booleanValue()) {
                    this.zzs.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzhw zzhwVar = this.zza;
                            zzhwVar.zzg();
                            if (zzhwVar.zzs.zzm().zzm.zzb()) {
                                zzhwVar.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jZza = zzhwVar.zzs.zzm().zzn.zza();
                            zzhwVar.zzs.zzm().zzn.zzb(1 + jZza);
                            zzhwVar.zzs.zzf();
                            if (jZza < 5) {
                                zzhwVar.zzs.zzE();
                            } else {
                                a.f(zzhwVar.zzs, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzhwVar.zzs.zzm().zzm.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            zzew zzewVarZzm = this.zzs.zzm();
            zzewVarZzm.zzg();
            String string = zzewVarZzm.zza().getString("previous_os_version", null);
            zzewVarZzm.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzewVarZzm.zza().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzs.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ou", bundle);
        }
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = this.zzs.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaz().zzp(new zzhg(this, bundle2));
    }
}
