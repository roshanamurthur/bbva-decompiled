package com.noknok.android.client.utils;

import android.content.Context;
import android.content.res.Resources;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class AppSDKConfig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AppSDKConfig f63423b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JsonObject f63424a = new JsonObject();

    public enum Key {
        usePreloadedOnly,
        useAidlService,
        customClient,
        sendPlayIntegrity,
        sendLocation,
        sendMetrics,
        sendWifiSSID,
        sendKSAttestation,
        sendJailBreakRiskSignal,
        asmSelectionEnabled,
        allowedSslProtocols,
        clientOrder,
        duplicateAuthenticatorSets,
        multiProtocolSupport,
        customExtensions,
        asmFixes,
        sendFakeUVI,
        pinConfig,
        allowedBrowsers,
        startOnNotification,
        requestTimeout,
        enableRsa,
        expireKeysIn2038,
        strictUpv10,
        defaultExtensions,
        fingerprintUI,
        pinSha256Only,
        useRemoteASM,
        conformanceTestEnabled,
        publicSuffixList,
        fido2ExcludeCredentials,
        keyguardValidityDuration,
        inactivityTimeout,
        adaptiveTimeout,
        otpConfig,
        metricConfig,
        maxLengthTransactionText
    }

    private AppSDKConfig(Context context) {
        b(context);
        a(context);
    }

    private void a(Context context) {
        try {
            try {
                Resources resources = context.getResources();
                InputStreamReader inputStreamReader = new InputStreamReader(resources.openRawResource(resources.getIdentifier("mfac_config", "raw", context.getPackageName())), Charsets.utf8Charset);
                try {
                    try {
                        JsonObject jsonObject = (JsonObject) JsonParser.parseReader(inputStreamReader);
                        Logger.i(Logger.TAG_CONFIG_REPORTER, "--- Read from mfac_config ---");
                        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                            String key = entry.getKey();
                            JsonElement value = entry.getValue();
                            if (Key.pinConfig.name().equals(key)) {
                                value = a(this.f63424a.get(key), value);
                            }
                            a(key, value);
                        }
                        Logger.i(Logger.TAG_CONFIG_REPORTER, "-----------------------------");
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException unused) {
                            Logger.w("AppSDKConfig", "Could not close mfac_config configuration file");
                        }
                        throw th2;
                    }
                } catch (JsonParseException unused2) {
                    Logger.w("AppSDKConfig", "Could not read mfac_config configuration file");
                    inputStreamReader.close();
                }
            } catch (Resources.NotFoundException unused3) {
                Logger.w("AppSDKConfig", "mfac_config configuration file not found");
            }
        } catch (IOException unused4) {
            Logger.w("AppSDKConfig", "Could not close mfac_config configuration file");
        }
    }

    private void b(Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open("mfac_config_defaults.json");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            for (Map.Entry<String, JsonElement> entry : ((JsonObject) JsonParser.parseString(new String(bArr, StandardCharsets.UTF_8))).entrySet()) {
                this.f63424a.add(entry.getKey(), entry.getValue());
            }
        } catch (JsonParseException | IOException unused) {
            Logger.w("AppSDKConfig", "Could not read mfac_config_defaults configuration file");
        }
    }

    public static synchronized AppSDKConfig getInstance(Context context) {
        try {
            if (f63423b == null) {
                f63423b = new AppSDKConfig(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63423b;
    }

    public synchronized JsonElement get(Key key) {
        return a(this.f63424a.get(key.name()));
    }

    public synchronized void set(String str, JsonElement jsonElement) {
        a(str, a(jsonElement));
    }

    public synchronized JsonElement get(String str) {
        return a(this.f63424a.get(str));
    }

    public synchronized void set(Key key, JsonElement jsonElement) {
        a(key.name(), a(jsonElement));
    }

    private JsonElement a(JsonElement jsonElement, JsonElement jsonElement2) {
        JsonObject asJsonObject = jsonElement2.getAsJsonObject();
        JsonObject asJsonObject2 = jsonElement.getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            asJsonObject2.add(entry.getKey(), entry.getValue());
        }
        return asJsonObject2;
    }

    private void a(String str, JsonElement jsonElement) {
        this.f63424a.add(str, jsonElement);
        Logger.i(Logger.TAG_CONFIG_REPORTER, str + ": " + this.f63424a.get(str));
    }

    private JsonElement a(JsonElement jsonElement) {
        if (jsonElement != null) {
            return JsonParser.parseString(jsonElement.toString());
        }
        return null;
    }
}
