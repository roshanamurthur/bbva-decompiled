package com.noknok.android.client.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes11.dex */
public class UiConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"ConstantLocale"})
    private static final String f63486a = Locale.getDefault().getLanguage().toLowerCase();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"ConstantLocale"})
    private static final String f63487b = Locale.getDefault().getCountry().toLowerCase();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static JsonWrapper f63488c;

    private static JsonObject a(@NonNull Context context, @NonNull String str) {
        try {
            return (JsonObject) JsonParser.parseReader(new InputStreamReader(context.getResources().openRawResource(context.getResources().getIdentifier(str, "raw", context.getPackageName())), Charsets.utf8Charset));
        } catch (Resources.NotFoundException e5) {
            Logger.w("UiConfig", "ui_config configuration file not found", e5);
            return null;
        } catch (JsonSyntaxException e7) {
            Logger.w("UiConfig", "ui_config configuration file is malformed", e7);
            return null;
        }
    }

    public static void addUiConfig(@NonNull Context context, @NonNull String str, boolean z10) {
        JsonObject jsonObject;
        JsonObject jsonObjectA = a(context, str);
        if (jsonObjectA == null) {
            try {
                jsonObject = (JsonObject) new Gson().fromJson(str, JsonObject.class);
            } catch (JsonSyntaxException e5) {
                Logger.w("UiConfig", e5.getMessage());
                jsonObject = null;
            }
            if (jsonObject != null) {
                getJsonWrapper(context).mergeJsonObjectsRecursively(new JsonWrapper(jsonObject));
                return;
            }
            Logger.w("UiConfig", "config parameter " + str + " is invalid value");
            return;
        }
        getJsonWrapper(context).mergeJsonObjectsRecursively(new JsonWrapper(jsonObjectA));
        if (z10) {
            StringBuilder sbE = androidx.camera.core.processing.f.e(str, PushConstants.GE_PARAMS_SEPARATOR);
            String str2 = f63486a;
            sbE.append(str2);
            JsonObject jsonObjectA2 = a(context, sbE.toString());
            if (jsonObjectA2 != null) {
                getJsonWrapper(context).mergeJsonObjectsRecursively(new JsonWrapper(jsonObjectA2));
            }
            JsonObject jsonObjectA3 = a(context, str + PushConstants.GE_PARAMS_SEPARATOR + str2 + Constant.DASH_STRING + f63487b);
            if (jsonObjectA3 != null) {
                getJsonWrapper(context).mergeJsonObjectsRecursively(new JsonWrapper(jsonObjectA3));
            }
        }
    }

    @NonNull
    public static JsonWrapper getJsonWrapper(@NonNull Context context) {
        if (f63488c == null) {
            JsonObject jsonObject = null;
            try {
                InputStream inputStreamOpen = context.getAssets().open("nnl_ui_cfg_default.json");
                try {
                    int iAvailable = inputStreamOpen.available();
                    byte[] bArr = new byte[iAvailable];
                    JsonObject jsonObject2 = iAvailable != inputStreamOpen.read(bArr) ? null : (JsonObject) JsonParser.parseString(new String(bArr));
                    inputStreamOpen.close();
                    jsonObject = jsonObject2;
                    f63488c = new JsonWrapper(jsonObject);
                } catch (Throwable th2) {
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (JsonParseException | IOException unused) {
                Logger.e("UiConfig", "Missing the default UI configuration");
            }
        }
        return f63488c;
    }

    public static String getText(@NonNull Context context, @NonNull List<String> list, @NonNull String str, int i10) {
        JsonElement jsonElementSearchDown = getJsonWrapper(context).searchDown(list, JsonWrapper.Key.strings.name(), str);
        return jsonElementSearchDown == null ? context.getResources().getString(i10) : jsonElementSearchDown.getAsString();
    }
}
