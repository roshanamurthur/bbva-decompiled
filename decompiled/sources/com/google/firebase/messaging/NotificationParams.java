package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class NotificationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Bundle f48570a;

    public NotificationParams(@NonNull Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f48570a = new Bundle(bundle);
    }

    public static String b(String str) {
        return str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) ? str.substring(6) : str;
    }

    @Nullable
    public final int[] a() {
        JSONArray jSONArray = getJSONArray(Constants.MessageNotificationKeys.LIGHT_SETTINGS);
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArray.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArray.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArray.optInt(1);
            iArr[2] = jSONArray.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e5) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray + ". " + e5.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray + ". Skipping setting LightSettings");
            return null;
        }
    }

    public boolean getBoolean(String str) {
        String string = getString(str);
        return "1".equals(string) || Boolean.parseBoolean(string);
    }

    public Integer getInteger(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(string));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + b(str) + "(" + string + ") into an int");
            return null;
        }
    }

    @Nullable
    public JSONArray getJSONArray(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + b(str) + ": " + string + ", falling back to default");
            return null;
        }
    }

    @Nullable
    public Uri getLink() {
        String string = getString(Constants.MessageNotificationKeys.LINK_ANDROID);
        if (TextUtils.isEmpty(string)) {
            string = getString(Constants.MessageNotificationKeys.LINK);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Uri.parse(string);
    }

    @Nullable
    public Object[] getLocalizationArgsForKey(String str) {
        JSONArray jSONArray = getJSONArray(str + Constants.MessageNotificationKeys.TEXT_ARGS_SUFFIX);
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArray.optString(i10);
        }
        return strArr;
    }

    @Nullable
    public String getLocalizationResourceForKey(String str) {
        return getString(str + Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX);
    }

    @Nullable
    public String getLocalizedString(Resources resources, String str, String str2) {
        String localizationResourceForKey = getLocalizationResourceForKey(str2);
        if (TextUtils.isEmpty(localizationResourceForKey)) {
            return null;
        }
        int identifier = resources.getIdentifier(localizationResourceForKey, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", b(str2 + Constants.MessageNotificationKeys.TEXT_RESOURCE_SUFFIX) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] localizationArgsForKey = getLocalizationArgsForKey(str2);
        if (localizationArgsForKey == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, localizationArgsForKey);
        } catch (MissingFormatArgumentException e5) {
            Log.w("NotificationParams", "Missing format argument for " + b(str2) + ": " + Arrays.toString(localizationArgsForKey) + " Default value will be used.", e5);
            return null;
        }
    }

    public Long getLong(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + b(str) + "(" + string + ") into a long");
            return null;
        }
    }

    public String getNotificationChannelId() {
        return getString(Constants.MessageNotificationKeys.CHANNEL);
    }

    public String getPossiblyLocalizedString(Resources resources, String str, String str2) {
        String string = getString(str2);
        return !TextUtils.isEmpty(string) ? string : getLocalizedString(resources, str, str2);
    }

    @Nullable
    public String getSoundResourceName() {
        String string = getString(Constants.MessageNotificationKeys.SOUND_2);
        return TextUtils.isEmpty(string) ? getString(Constants.MessageNotificationKeys.SOUND) : string;
    }

    public String getString(String str) {
        Bundle bundle = this.f48570a;
        if (!bundle.containsKey(str) && str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX)) {
            String strReplace = !str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) ? str : str.replace(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX, Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD);
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    @Nullable
    public long[] getVibrateTimings() {
        JSONArray jSONArray = getJSONArray(Constants.MessageNotificationKeys.VIBRATE_TIMINGS);
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArray.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArray.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArray + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public boolean hasImage() {
        return !TextUtils.isEmpty(getString(Constants.MessageNotificationKeys.IMAGE_URL));
    }

    public boolean isNotification() {
        return getBoolean(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION);
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle bundle = this.f48570a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith(Constants.AnalyticsKeys.PREFIX) && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public Bundle paramsWithReservedKeysRemoved() {
        Bundle bundle = this.f48570a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (str.startsWith(Constants.MessagePayloadKeys.RESERVED_CLIENT_LIB_PREFIX) || str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX) || str.startsWith(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD)) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public static boolean isNotification(Bundle bundle) {
        return "1".equals(bundle.getString(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION)) || "1".equals(bundle.getString(Constants.MessageNotificationKeys.ENABLE_NOTIFICATION.replace(Constants.MessageNotificationKeys.NOTIFICATION_PREFIX, Constants.MessageNotificationKeys.NOTIFICATION_PREFIX_OLD)));
    }
}
