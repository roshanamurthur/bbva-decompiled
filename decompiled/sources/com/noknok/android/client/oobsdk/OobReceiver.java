package com.noknok.android.client.oobsdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.noknok.android.client.appsdk.AppSDK2;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.AuthenticationData;
import com.noknok.android.client.appsdk_plus.RestClientFactory;
import com.noknok.android.client.utils.ActivityProxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class OobReceiver {
    public static final String APPLINK_DATA = "link_data";
    public static final String MESSAGE_TYPE = "message_type";
    public static final String NNL_SDK_CONFIG = "nnl_sdk_config";
    public static final String NOTIFICATION_ID = "notification_id";
    public static final String OOB_EXTRAS_OPTIONS = "options";
    public static final String OOB_EXTRAS_REMOTE = "remote";
    public static final String OOB_EXTRAS_REST_FACTORY_PARAM = "oob_rest_factory_param";
    public static final String OOB_PREFS = "OOBPreferences";
    public static final String PROCESS_MESSAGE = "process_message";
    public static final String VERSION = "version";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static OobReceiver f63375g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConfigurationListener f63376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppSDK2 f63377b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63378c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63379d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IStartListener f63380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ICompletionListener f63381f;

    public interface ConfigurationListener {
        void configurationDidSave();

        void configurationWasIncorrect();
    }

    public interface ICompletionListener {
        @Deprecated
        void onComplete(Activity activity, ResultType resultType, String str, AppSDK2.Operation operation);

        void onComplete(ActivityProxy activityProxy, ResultType resultType, String str, AppSDK2.Operation operation);
    }

    public interface IStartListener {
        boolean onStart(Activity activity, MessageType messageType, String str);
    }

    public enum MessageType {
        OOB_PUSH_NOTIFICATION,
        OOB_QR_CODE,
        OOB_APPLINK
    }

    private OobReceiver() {
    }

    public static synchronized OobReceiver instance() {
        try {
            if (f63375g == null) {
                f63375g = new OobReceiver();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63375g;
    }

    public boolean areUrlsSet() {
        return (this.f63378c == null || this.f63379d == null) ? false : true;
    }

    public AppSDK2 getAppSDK2() {
        return this.f63377b;
    }

    public ICompletionListener getCompletionListener() {
        return this.f63381f;
    }

    public JsonObject getCustomConfig(Context context) {
        return JsonParser.parseString(context.getApplicationContext().getSharedPreferences(OOB_PREFS, 0).getString(NNL_SDK_CONFIG, "{}")).getAsJsonObject();
    }

    public IStartListener getStartListener() {
        return this.f63380e;
    }

    public boolean processConfig(Context context, String str) {
        try {
            JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            try {
                if (!asJsonObject.has("version")) {
                    throw new AppSDKException(ResultType.INVALID_QR);
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(OOB_PREFS, 0);
                JsonObject asJsonObject2 = JsonParser.parseString(sharedPreferences.getString(NNL_SDK_CONFIG, "{}")).getAsJsonObject();
                if (asJsonObject2.has("version") && !asJsonObject2.get("version").getAsString().equals(asJsonObject.get("version").getAsString())) {
                    throw new AppSDKException(ResultType.INVALID_QR);
                }
                sharedPreferences.edit().putString(NNL_SDK_CONFIG, str).apply();
                ConfigurationListener configurationListener = this.f63376a;
                if (configurationListener == null) {
                    return true;
                }
                configurationListener.configurationDidSave();
                return true;
            } catch (JsonParseException | AppSDKException unused) {
                ConfigurationListener configurationListener2 = this.f63376a;
                if (configurationListener2 == null) {
                    return true;
                }
                configurationListener2.configurationWasIncorrect();
                return true;
            }
        } catch (JsonSyntaxException | IllegalStateException unused2) {
            return false;
        }
    }

    public void processMessage(ActivityProxy activityProxy, String str, ICompletionListener iCompletionListener) {
        processMessage(activityProxy, str, iCompletionListener, null);
    }

    public AuthenticationData processOob(ActivityProxy activityProxy, String str, HashMap<String, String> map) {
        OOBRequestProcessor oOBRequestProcessor = new OOBRequestProcessor();
        oOBRequestProcessor.setRestClient(RestClientFactory.getInstance().createRestClient(activityProxy.getApplicationContext(), map == null ? null : map.get(OOB_EXTRAS_REST_FACTORY_PARAM))).setURLs(this.f63378c, this.f63379d);
        return oOBRequestProcessor.a(activityProxy, oOBRequestProcessor.c(str), map);
    }

    public void setAppSDK2(AppSDK2 appSDK2) {
        this.f63377b = appSDK2;
    }

    public OobReceiver setCompletionListener(ICompletionListener iCompletionListener) {
        this.f63381f = iCompletionListener;
        return this;
    }

    public void setConfigurationListener(ConfigurationListener configurationListener) {
        this.f63376a = configurationListener;
    }

    public void setDefaultConfig(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(OOB_PREFS, 0);
        JsonObject asJsonObject = JsonParser.parseString(sharedPreferences.getString(NNL_SDK_CONFIG, "{}")).getAsJsonObject();
        JsonObject asJsonObject2 = JsonParser.parseString(str).getAsJsonObject();
        if (asJsonObject.size() <= 0 || !asJsonObject.get("version").equals(asJsonObject2.get("version"))) {
            sharedPreferences.edit().putString(NNL_SDK_CONFIG, str).apply();
        }
    }

    public OobReceiver setStartListener(IStartListener iStartListener) {
        this.f63380e = iStartListener;
        return this;
    }

    public void setURLs(String str, String str2) {
        if ((str == null && str2 != null) || (str != null && str2 == null)) {
            throw new IllegalArgumentException("Registration and authentication URLs should be both provided or both not provided");
        }
        this.f63378c = str;
        this.f63379d = str2;
    }

    public void processMessage(ActivityProxy activityProxy, String str, ICompletionListener iCompletionListener, HashMap<String, String> map) {
        OOBRequestProcessor oOBRequestProcessor = new OOBRequestProcessor();
        oOBRequestProcessor.setRestClient(RestClientFactory.getInstance().createRestClient(activityProxy.getApplicationContext(), map == null ? null : map.get(OOB_EXTRAS_REST_FACTORY_PARAM))).setURLs(this.f63378c, this.f63379d);
        oOBRequestProcessor.processMessage(activityProxy, str, iCompletionListener, map);
    }
}
