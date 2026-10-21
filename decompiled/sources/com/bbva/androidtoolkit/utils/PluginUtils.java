package com.bbva.androidtoolkit.utils;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class PluginUtils {
    public static final String IDENTIFIER_COLOR = "color";
    public static final String IDENTIFIER_DIMENSION = "dimen";
    public static final String IDENTIFIER_DRAWABLE = "drawable";
    public static final String IDENTIFIER_ID = "id";
    public static final String IDENTIFIER_LAYOUT = "layout";
    public static final String IDENTIFIER_STRING = "string";
    public static final String IDENTIFIER_XML = "xml";

    public static Map<String, String> convertBundleToMap(Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    map.put(str, (String) obj);
                }
            }
        }
        return map;
    }

    @Nullable
    public static JSONObject convertMapToJsonObject(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    if (StringUtils.isNotNullOrEmpty(str2)) {
                        jSONObject.put(str, str2);
                    }
                }
            } catch (JSONException unused) {
            }
            return jSONObject;
        } catch (JSONException unused2) {
            return null;
        }
    }

    public static String getAppName(@NonNull Context context) {
        return (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
    }

    public static int getColor(@NonNull Context context, @NonNull String str) {
        return ContextCompat.getColor(context, getIdentifier(context, str, "color"));
    }

    public static int getDimension(@NonNull Context context, @NonNull String str) {
        return (int) context.getResources().getDimension(getIdentifier(context, str, IDENTIFIER_DIMENSION));
    }

    public static int getDimensionId(@NonNull Context context, @NonNull String str) {
        return getIdentifier(context, str, IDENTIFIER_DIMENSION);
    }

    public static int getDrawable(@NonNull Context context, @NonNull String str) {
        return getIdentifier(context, str, IDENTIFIER_DRAWABLE);
    }

    public static int getId(@NonNull Context context, @NonNull String str) {
        return getIdentifier(context, str, "id");
    }

    public static int getIdentifier(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    public static View getLayout(@NonNull Context context, @NonNull String str) {
        return LayoutInflater.from(context).inflate(getIdentifier(context, str, IDENTIFIER_LAYOUT), (ViewGroup) null, false);
    }

    public static int getLayoutId(@NonNull Context context, @NonNull String str) {
        return getIdentifier(context, str, IDENTIFIER_LAYOUT);
    }

    public static String getString(@NonNull Context context, @NonNull String str) {
        return context.getString(getIdentifier(context, str, "string"));
    }

    public static XmlPullParser getXML(@NonNull Context context, @NonNull String str) {
        return context.getResources().getXml(getIdentifier(context, str, "xml"));
    }
}
