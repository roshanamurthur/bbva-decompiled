package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.messaging.Constants;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f47584a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f47585b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f47586c = Arrays.asList(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f47587d = Arrays.asList(NotificationMessage.NOTIF_KEY_REQUEST_ID, "_dbg");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f47588e = Arrays.asList((String[]) ArrayUtils.concat(zzgq.zza, zzgq.zzb));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f47589f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle zza(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.origin;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = conditionalUserProperty.name;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = conditionalUserProperty.value;
        if (obj != null) {
            zzgn.zzb(bundle, obj);
        }
        String str3 = conditionalUserProperty.triggerEventName;
        if (str3 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.triggerTimeout);
        String str4 = conditionalUserProperty.timedOutEventName;
        if (str4 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str4);
        }
        Bundle bundle2 = conditionalUserProperty.timedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
        }
        String str5 = conditionalUserProperty.triggeredEventName;
        if (str5 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str5);
        }
        Bundle bundle3 = conditionalUserProperty.triggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.timeToLive);
        String str6 = conditionalUserProperty.expiredEventName;
        if (str6 != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str6);
        }
        Bundle bundle4 = conditionalUserProperty.expiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.creationTimestamp);
        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.active);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.triggeredTimestamp);
        return bundle;
    }

    public static AnalyticsConnector.ConditionalUserProperty zzb(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = (String) Preconditions.checkNotNull((String) zzgn.zza(bundle, "origin", String.class, null));
        conditionalUserProperty.name = (String) Preconditions.checkNotNull((String) zzgn.zza(bundle, "name", String.class, null));
        conditionalUserProperty.value = zzgn.zza(bundle, "value", Object.class, null);
        conditionalUserProperty.triggerEventName = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        conditionalUserProperty.triggerTimeout = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
        conditionalUserProperty.timedOutEventName = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        conditionalUserProperty.timedOutEventParams = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.triggeredEventName = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        conditionalUserProperty.triggeredEventParams = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.timeToLive = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
        conditionalUserProperty.expiredEventName = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        conditionalUserProperty.expiredEventParams = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.active = ((Boolean) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
        conditionalUserProperty.creationTimestamp = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
        conditionalUserProperty.triggeredTimestamp = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
        return conditionalUserProperty;
    }

    public static String zzc(String str) {
        String strZza = zzgo.zza(str);
        return strZza != null ? strZza : str;
    }

    public static String zzd(String str) {
        String strZzb = zzgo.zzb(str);
        return strZzb != null ? strZzb : str;
    }

    public static void zze(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong(NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
        }
    }

    public static boolean zzf(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int iCodePointAt = str.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            return false;
        }
        int length = str.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public static boolean zzg(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int iCodePointAt = str.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            return false;
        }
        int length = str.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    public static boolean zzh(String str, String str2, Bundle bundle) {
        byte b10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!zzl(str) || bundle == null) {
            return false;
        }
        Iterator it = f47587d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("fdl")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("fcm")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b10 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b10 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    public static boolean zzi(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return false;
        }
        Object obj = conditionalUserProperty.value;
        if ((obj != null && zzic.zza(obj) == null) || !zzl(str) || !zzm(str, conditionalUserProperty.name)) {
            return false;
        }
        String str2 = conditionalUserProperty.expiredEventName;
        if (str2 != null && (!zzj(str2, conditionalUserProperty.expiredEventParams) || !zzh(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
            return false;
        }
        String str3 = conditionalUserProperty.triggeredEventName;
        if (str3 != null && (!zzj(str3, conditionalUserProperty.triggeredEventParams) || !zzh(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
            return false;
        }
        String str4 = conditionalUserProperty.timedOutEventName;
        if (str4 != null) {
            return zzj(str4, conditionalUserProperty.timedOutEventParams) && zzh(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams);
        }
        return true;
    }

    public static boolean zzj(String str, Bundle bundle) {
        if (f47585b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator it = f47587d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzk(String str) {
        return !f47584a.contains(str);
    }

    public static boolean zzl(String str) {
        return !f47586c.contains(str);
    }

    public static boolean zzm(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (f47588e.contains(str2)) {
            return false;
        }
        Iterator it = f47589f.iterator();
        while (it.hasNext()) {
            if (str2.matches((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
