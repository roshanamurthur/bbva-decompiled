package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    private void values(String str, String str2) {
        byte b10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "failure");
            jSONObject.put("data", str2);
            int iHashCode = str.hashCode();
            if (iHashCode != -1390007222) {
                if (iHashCode == 1050716216 && str.equals("onInstallConversionFailure")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("onAttributionFailure")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                onInstallConversionFailureNative(jSONObject);
            } else {
                if (b10 != 1) {
                    return;
                }
                onAttributionFailureNative(jSONObject);
            }
        } catch (JSONException e5) {
            AFLogger.afErrorLogForExcManagerOnly("2dx error", e5);
            e5.printStackTrace();
        }
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        values("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        values("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(@NonNull DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(@NonNull DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}
