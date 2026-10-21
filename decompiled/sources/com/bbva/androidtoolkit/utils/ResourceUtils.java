package com.bbva.androidtoolkit.utils;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceUtils {
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

    public static String getAppName(@NonNull Context context) {
        return (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
    }

    public static int getColor(@NonNull Context context, @NonNull String str) {
        return ContextCompat.getColor(context, getIdentifier(context, str, "color"));
    }

    public static int getDimension(@NonNull Context context, @NonNull String str) {
        return (int) context.getResources().getDimension(getIdentifier(context, str, PluginUtils.IDENTIFIER_DIMENSION));
    }

    public static int getDimensionId(@NonNull Context context, @NonNull String str) {
        return getIdentifier(context, str, PluginUtils.IDENTIFIER_DIMENSION);
    }

    public static int getDrawable(@NonNull Context context, @NonNull String str) {
        return getIdentifier(context, str, PluginUtils.IDENTIFIER_DRAWABLE);
    }

    public static int getId(@NonNull Context context, @NonNull String str) {
        return getIdentifier(context, str, "id");
    }

    public static int getIdentifier(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    public static View getLayout(@NonNull Context context, @NonNull String str) {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getIdentifier(context, str, PluginUtils.IDENTIFIER_LAYOUT), (ViewGroup) null, false);
    }

    public static int getLayoutId(@NonNull Context context, @NonNull String str) {
        return getIdentifier(context, str, PluginUtils.IDENTIFIER_LAYOUT);
    }

    public static String getString(@NonNull Context context, @NonNull String str) {
        return context.getString(getIdentifier(context, str, "string"));
    }

    public static XmlPullParser getXML(@NonNull Context context, @NonNull String str) {
        return context.getResources().getXml(getIdentifier(context, str, "xml"));
    }
}
