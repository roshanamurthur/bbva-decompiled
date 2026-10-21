package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import com.bbva.ethermobilesdk.sharedstorage.extension.CustomCursor;
import com.bbva.notifications.constants.PushConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzkw extends zzgl {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"firebase_", "google_", "ga_"};
    private static final String[] zzc = {"_err"};
    private SecureRandom zzd;
    private final AtomicLong zze;
    private int zzf;
    private Integer zzg;

    public zzkw(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzg = null;
        this.zze = new AtomicLong(0L);
    }

    public static MessageDigest zzE() {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList zzG(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzab zzabVar = (zzab) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzabVar.zza);
            bundle.putString("origin", zzabVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzabVar.zzd);
            bundle.putString("name", zzabVar.zzc.zzb);
            zzgn.zzb(bundle, Preconditions.checkNotNull(zzabVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzabVar.zze);
            String str = zzabVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzau zzauVar = zzabVar.zzg;
            if (zzauVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzauVar.zza);
                zzas zzasVar = zzauVar.zzb;
                if (zzasVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzasVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzabVar.zzh);
            zzau zzauVar2 = zzabVar.zzi;
            if (zzauVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzauVar2.zza);
                zzas zzasVar2 = zzauVar2.zzb;
                if (zzasVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzasVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzabVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzabVar.zzj);
            zzau zzauVar3 = zzabVar.zzk;
            if (zzauVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzauVar3.zza);
                zzas zzasVar3 = zzauVar3.zzb;
                if (zzasVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzasVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    public static void zzJ(zzid zzidVar, Bundle bundle, boolean z10) {
        if (bundle != null && zzidVar != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = zzidVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzidVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzidVar.zzc);
                return;
            }
            z10 = false;
        }
        if (bundle != null && zzidVar == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzag(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(PushConstants.GE_PARAMS_SEPARATOR);
    }

    public static boolean zzah(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean zzai(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean zzaj(Context context, boolean z10) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 24 ? zzat(context, "com.google.android.gms.measurement.AppMeasurementJobService") : zzat(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean zzak(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean zzal(String str) {
        return !zzc[0].equals(str);
    }

    public static final boolean zzao(Bundle bundle, int i10) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    @VisibleForTesting
    public static final boolean zzap(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int zzaq(String str) {
        if ("_ldl".equals(str)) {
            this.zzs.zzf();
            return 2048;
        }
        if (CustomCursor.ID.equals(str)) {
            this.zzs.zzf();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.zzs.zzf();
            return 100;
        }
        this.zzs.zzf();
        return 36;
    }

    private final Object zzar(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return zzC(obj.toString(), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleZzt = zzt((Bundle) parcelable);
                if (!bundleZzt.isEmpty()) {
                    arrayList.add(bundleZzt);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean zzas(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzak(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzat(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @VisibleForTesting
    public static long zzp(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i10 = 0;
        Preconditions.checkState(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (((long) bArr[i11]) & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public final Object zzA(String str, Object obj) {
        int i10 = 256;
        if ("_ev".equals(str)) {
            this.zzs.zzf();
            return zzar(256, obj, true, true);
        }
        if (zzag(str)) {
            this.zzs.zzf();
        } else {
            this.zzs.zzf();
            i10 = 100;
        }
        return zzar(i10, obj, false, true);
    }

    public final Object zzB(String str, Object obj) {
        return "_ldl".equals(str) ? zzar(zzaq(str), obj, true, false) : zzar(zzaq(str), obj, false, false);
    }

    public final String zzC(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public final URL zzD(long j10, String str, String str2, long j11) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 55005L, Integer.valueOf(zzm())), str2, str, Long.valueOf(j11));
            if (str.equals(this.zzs.zzf().zzm())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e5) {
            e = e5;
            this.zzs.zzay().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e7) {
            e = e7;
            this.zzs.zzay().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @EnsuresNonNull({"this.secureRandom"})
    @WorkerThread
    public final SecureRandom zzF() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new SecureRandom();
        }
        return this.zzd;
    }

    @WorkerThread
    public final void zzH(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.zzs.zzay().zzk().zzb("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void zzI(Bundle bundle, int i10, String str, String str2, Object obj) {
        if (zzao(bundle, i10)) {
            this.zzs.zzf();
            bundle.putString("_ev", zzC(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void zzK(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzs.zzv().zzN(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzL(zzei zzeiVar, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(zzeiVar.zzd.keySet())) {
            if (zzah(str) && (i11 = i11 + 1) > i10) {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Event can't contain more than ");
                sb2.append(i10);
                sb2.append(" params");
                this.zzs.zzay().zze().zzc(sb2.toString(), this.zzs.zzj().zzd(zzeiVar.zza), this.zzs.zzj().zzb(zzeiVar.zzd));
                zzao(zzeiVar.zzd, 5);
                zzeiVar.zzd.remove(str);
            }
        }
    }

    public final void zzM(zzkv zzkvVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        zzao(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        zzkvVar.zza(str, "_err", bundle);
    }

    public final void zzN(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.zzs.zzay().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.zzs.zzj().zze(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zzO(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e5) {
            this.zzs.zzay().zzk().zzb("Error returning boolean value to wrapper", e5);
        }
    }

    public final void zzP(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e5) {
            this.zzs.zzay().zzk().zzb("Error returning bundle list to wrapper", e5);
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e5) {
            this.zzs.zzay().zzk().zzb("Error returning bundle value to wrapper", e5);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e5) {
            this.zzs.zzay().zzk().zzb("Error returning byte array to wrapper", e5);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e5) {
            this.zzs.zzay().zzk().zzb("Error returning int value to wrapper", e5);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e5) {
            this.zzs.zzay().zzk().zzb("Error returning long value to wrapper", e5);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e5) {
            this.zzs.zzay().zzk().zzb("Error returning string value to wrapper", e5);
        }
    }

    public final void zzV(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int i10;
        int iZza;
        if (bundle == null) {
            return;
        }
        this.zzs.zzf();
        int i11 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                int iZzj = !z10 ? zzj(str4) : 0;
                if (iZzj == 0) {
                    iZzj = zzi(str4);
                }
                i10 = iZzj;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                zzI(bundle, i10, str4, str4, i10 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (zzae(bundle.get(str4))) {
                    this.zzs.zzay().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    iZza = 22;
                } else {
                    iZza = zza(str, str2, str4, bundle.get(str4), bundle, list, z10, false);
                }
                if (iZza != 0 && !"_ev".equals(str4)) {
                    zzI(bundle, iZza, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzah(str4) && !zzas(str4, zzgp.zzd) && (i11 = i11 + 1) > 0) {
                    this.zzs.zzay().zze().zzc("Item cannot contain custom parameters", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                    zzao(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    public final boolean zzW(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzap(str)) {
                return true;
            }
            if (this.zzs.zzL()) {
                this.zzs.zzay().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzeh.zzn(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.zzs.zzL()) {
                this.zzs.zzay().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (zzap(str2)) {
            return true;
        }
        this.zzs.zzay().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzeh.zzn(str2));
        return false;
    }

    public final boolean zzX(String str, int i10, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.zzs.zzay().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final boolean zzY(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zzb;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.zzs.zzay().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzas(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzas(str2, strArr2)) {
            return true;
        }
        this.zzs.zzay().zze().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zzZ(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i10) {
                this.zzs.zzay().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    @WorkerThread
    public final int zza(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int i11;
        int size;
        zzg();
        if (!zzae(obj)) {
            i10 = 0;
        } else {
            if (!z11) {
                return 21;
            }
            if (!zzas(str3, zzgp.zzc)) {
                return 20;
            }
            zzjk zzjkVarZzt = this.zzs.zzt();
            zzjkVarZzt.zzg();
            zzjkVarZzt.zza();
            if (zzjkVarZzt.zzN() && zzjkVarZzt.zzs.zzv().zzm() < 200900) {
                return 25;
            }
            this.zzs.zzf();
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i10 = 0;
            }
            if (size > 200) {
                this.zzs.zzay().zzl().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                this.zzs.zzf();
                if (z12) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i10 = 17;
            } else {
                i10 = 0;
            }
        }
        if ((this.zzs.zzf().zzs(str, zzdu.zzR) && zzag(str2)) || zzag(str3)) {
            this.zzs.zzf();
            i11 = 256;
        } else {
            this.zzs.zzf();
            i11 = 100;
        }
        if (zzZ("param", str3, i11, obj)) {
            return i10;
        }
        if (!z11) {
            return 4;
        }
        if (obj instanceof Bundle) {
            zzV(str, str2, str3, (Bundle) obj, list, z10);
        } else if (obj instanceof Parcelable[]) {
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (!(parcelable instanceof Bundle)) {
                    this.zzs.zzay().zzl().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                    return 4;
                }
                zzV(str, str2, str3, (Bundle) parcelable, list, z10);
            }
        } else {
            if (!(obj instanceof ArrayList)) {
                return 4;
            }
            ArrayList arrayList2 = (ArrayList) obj;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj2 = arrayList2.get(i12);
                if (!(obj2 instanceof Bundle)) {
                    this.zzs.zzay().zzl().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : AbstractJsonLexerKt.NULL, str3);
                    return 4;
                }
                zzV(str, str2, str3, (Bundle) obj2, list, z10);
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    @WorkerThread
    public final void zzaA() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                a.f(this.zzs, "Utils falling back to Random for random id");
            }
        }
        this.zze.set(jNextLong);
    }

    public final boolean zzaa(String str, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzs.zzay().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.zzs.zzay().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzs.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzab(String str, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzs.zzay().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.zzs.zzay().zze().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzs.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @WorkerThread
    public final boolean zzac(String str) {
        zzg();
        if (Wrappers.packageManager(this.zzs.zzau()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzs.zzay().zzc().zzb("Permission not granted", str);
        return false;
    }

    public final boolean zzad(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strZzl = this.zzs.zzf().zzl();
        this.zzs.zzaw();
        return strZzl.equals(str);
    }

    public final boolean zzae(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @VisibleForTesting
    public final boolean zzaf(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e5) {
            this.zzs.zzay().zzd().zzb("Package name not found", e5);
            return true;
        } catch (CertificateException e7) {
            this.zzs.zzay().zzd().zzb("Error obtaining certificate", e7);
            return true;
        }
    }

    public final boolean zzam(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return !TextUtils.isEmpty(str4);
            }
            return !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public final byte[] zzan(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final int zzd(String str, Object obj) {
        return "_ldl".equals(str) ? zzZ("user property referrer", str, zzaq(str), obj) : zzZ("user property", str, zzaq(str), obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final boolean zzf() {
        return true;
    }

    public final int zzh(String str) {
        if (!zzaa("event", str)) {
            return 2;
        }
        if (!zzY("event", zzgo.zza, zzgo.zzb, str)) {
            return 13;
        }
        this.zzs.zzf();
        return !zzX("event", 40, str) ? 2 : 0;
    }

    public final int zzi(String str) {
        if (!zzaa("event param", str)) {
            return 3;
        }
        if (!zzY("event param", null, null, str)) {
            return 14;
        }
        this.zzs.zzf();
        return !zzX("event param", 40, str) ? 3 : 0;
    }

    public final int zzj(String str) {
        if (!zzab("event param", str)) {
            return 3;
        }
        if (!zzY("event param", null, null, str)) {
            return 14;
        }
        this.zzs.zzf();
        return !zzX("event param", 40, str) ? 3 : 0;
    }

    public final int zzl(String str) {
        if (!zzaa("user property", str)) {
            return 6;
        }
        if (!zzY("user property", zzgq.zza, null, str)) {
            return 15;
        }
        this.zzs.zzf();
        return !zzX("user property", 24, str) ? 6 : 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.zzg == null) {
            this.zzg = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzs.zzau()) / 1000);
        }
        return this.zzg.intValue();
    }

    public final int zzo(int i10) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzs.zzau(), 12451000);
    }

    public final long zzq() {
        long andIncrement;
        long j10;
        if (this.zze.get() != 0) {
            synchronized (this.zze) {
                this.zze.compareAndSet(-1L, 1L);
                andIncrement = this.zze.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zze) {
            long jNextLong = new Random(System.nanoTime() ^ this.zzs.zzav().currentTimeMillis()).nextLong();
            int i10 = this.zzf + 1;
            this.zzf = i10;
            j10 = jNextLong + ((long) i10);
        }
        return j10;
    }

    public final long zzr(long j10, long j11) {
        return ((j11 * 60000) + j10) / 86400000;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x0104  */
    /* JADX WARN: Code duplicated, block: B:70:0x0115  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    public final Bundle zzs(Uri uri, boolean z10) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        Bundle bundle;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String queryParameter10;
        String queryParameter11;
        String queryParameter12;
        String queryParameter13;
        String queryParameter14;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    if (z10) {
                        queryParameter5 = uri.getQueryParameter("utm_id");
                        queryParameter6 = uri.getQueryParameter("dclid");
                    } else {
                        queryParameter5 = null;
                    }
                    if (!TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && (!z10 || (TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6)))) {
                        return null;
                    }
                    bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("campaign", queryParameter);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("source", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("medium", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("gclid", queryParameter4);
                    }
                    queryParameter7 = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM);
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter7);
                    }
                    queryParameter8 = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT);
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("content", queryParameter8);
                    }
                    queryParameter9 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter9);
                    }
                    queryParameter10 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter10);
                    }
                    queryParameter11 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("anid", queryParameter11);
                    }
                    if (z10) {
                        if (!TextUtils.isEmpty(queryParameter5)) {
                            bundle.putString("campaign_id", queryParameter5);
                        }
                        if (!TextUtils.isEmpty(queryParameter6)) {
                            bundle.putString("dclid", queryParameter6);
                        }
                        queryParameter12 = uri.getQueryParameter("utm_source_platform");
                        if (!TextUtils.isEmpty(queryParameter12)) {
                            bundle.putString("source_platform", queryParameter12);
                        }
                        queryParameter13 = uri.getQueryParameter("utm_creative_format");
                        if (!TextUtils.isEmpty(queryParameter13)) {
                            bundle.putString("creative_format", queryParameter13);
                        }
                        queryParameter14 = uri.getQueryParameter("utm_marketing_tactic");
                        if (!TextUtils.isEmpty(queryParameter14)) {
                            bundle.putString("marketing_tactic", queryParameter14);
                        }
                    }
                    return bundle;
                }
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = queryParameter5;
                if (!TextUtils.isEmpty(queryParameter)) {
                }
                bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                queryParameter7 = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM);
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter7);
                }
                queryParameter8 = uri.getQueryParameter(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT);
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("content", queryParameter8);
                }
                queryParameter9 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter9);
                }
                queryParameter10 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter10);
                }
                queryParameter11 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("anid", queryParameter11);
                }
                if (z10) {
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("campaign_id", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("dclid", queryParameter6);
                    }
                    queryParameter12 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("source_platform", queryParameter12);
                    }
                    queryParameter13 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("creative_format", queryParameter13);
                    }
                    queryParameter14 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("marketing_tactic", queryParameter14);
                    }
                }
                return bundle;
            } catch (UnsupportedOperationException e5) {
                this.zzs.zzay().zzk().zzb("Install referrer url isn't a hierarchical URI", e5);
            }
        }
        return null;
    }

    public final Bundle zzt(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objZzA = zzA(str, bundle.get(str));
                if (objZzA == null) {
                    this.zzs.zzay().zzl().zzb("Param value can't be null", this.zzs.zzj().zze(str));
                } else {
                    zzN(bundle2, str, objZzA);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a A[SYNTHETIC] */
    public final Bundle zzy(String str, String str2, Bundle bundle, List list, boolean z10) {
        int i10;
        int i11;
        String str3;
        int i12;
        boolean zZzas = zzas(str2, zzgo.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iZzc = this.zzs.zzf().zzc();
        int i13 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str4)) {
                int iZzj = !z10 ? zzj(str4) : 0;
                if (iZzj == 0) {
                    iZzj = zzi(str4);
                }
                i10 = iZzj;
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                zzI(bundle2, i10, str4, str4, i10 == 3 ? str4 : null);
                bundle2.remove(str4);
                i11 = iZzc;
            } else {
                i11 = iZzc;
                int iZza = zza(str, str2, str4, bundle.get(str4), bundle2, list, z10, zZzas);
                if (iZza == 17) {
                    zzI(bundle2, 17, str4, str4, Boolean.FALSE);
                } else {
                    if (iZza != 0) {
                        str3 = str4;
                        if (!"_ev".equals(str3)) {
                            zzI(bundle2, iZza, iZza == 21 ? str2 : str3, str3, bundle.get(str3));
                            bundle2.remove(str3);
                        }
                    }
                    if (!zzah(str3)) {
                        i12 = i13 + 1;
                        if (i12 > i11) {
                            StringBuilder sb2 = new StringBuilder(48);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i11);
                            sb2.append(" params");
                            this.zzs.zzay().zze().zzc(sb2.toString(), this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                            zzao(bundle2, 5);
                            bundle2.remove(str3);
                        }
                        i13 = i12;
                    }
                }
                str3 = str4;
                if (!zzah(str3)) {
                    i12 = i13 + 1;
                    if (i12 > i11) {
                        StringBuilder sb3 = new StringBuilder(48);
                        sb3.append("Event can't contain more than ");
                        sb3.append(i11);
                        sb3.append(" params");
                        this.zzs.zzay().zze().zzc(sb3.toString(), this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                        zzao(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i13 = i12;
                }
            }
            iZzc = i11;
        }
        return bundle2;
    }

    public final zzau zzz(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional property event name", this.zzs.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleZzy = zzy(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z10) {
            bundleZzy = zzt(bundleZzy);
        }
        Preconditions.checkNotNull(bundleZzy);
        return new zzau(str2, new zzas(bundleZzy), str3, j10);
    }
}
