package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zac {

    @GuardedBy("cache")
    private static final SimpleArrayMap zaa = new SimpleArrayMap();

    @Nullable
    @GuardedBy("cache")
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @NonNull
    public static String zab(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i10 != 2) {
            return i10 != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button);
        }
        return resources.getString(R.string.common_google_play_services_update_button);
    }

    @NonNull
    public static String zac(Context context, int i10) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strZaa);
        }
        if (i10 == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strZaa);
        }
        if (i10 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strZaa);
        }
        if (i10 == 5) {
            return zag(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i10 == 7) {
            return zag(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i10 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strZaa);
        }
        if (i10 == 20) {
            return zag(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i10) {
            case 16:
                return zag(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return zag(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strZaa);
            default:
                return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    @NonNull
    public static String zad(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaa(context)) : zac(context, i10);
    }

    @NonNull
    public static String zae(Context context, int i10) {
        String strZah = i10 == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaf(context, i10);
        return strZah == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : strZah;
    }

    @Nullable
    public static String zaf(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_title);
        }
        if (i10 == 2) {
            return resources.getString(R.string.common_google_play_services_update_title);
        }
        if (i10 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_title);
        }
        if (i10 == 5) {
            return zah(context, "common_google_play_services_invalid_account_title");
        }
        if (i10 == 7) {
            return zah(context, "common_google_play_services_network_error_title");
        }
        if (i10 == 17) {
            return zah(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i10 != 20) {
            return null;
        }
        return zah(context, "common_google_play_services_restricted_profile_title");
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }

    @Nullable
    private static String zah(Context context, String str) {
        SimpleArrayMap simpleArrayMap = zaa;
        synchronized (simpleArrayMap) {
            try {
                Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(zab)) {
                    simpleArrayMap.clear();
                    zab = locale;
                }
                String str2 = (String) simpleArrayMap.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
                if (remoteResource == null) {
                    return null;
                }
                int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = remoteResource.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    simpleArrayMap.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
