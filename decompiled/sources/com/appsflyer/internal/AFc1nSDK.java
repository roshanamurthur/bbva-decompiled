package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1nSDK<ResponseBody> {
    private final AFc1fSDK<ResponseBody> AFInAppEventParameterName;
    private final AtomicBoolean AFInAppEventType = new AtomicBoolean(false);
    private final AFc1mSDK AFKeystoreWrapper;
    public final AFb1ySDK valueOf;
    private final ExecutorService values;

    public AFc1nSDK(AFb1ySDK aFb1ySDK, ExecutorService executorService, AFc1mSDK aFc1mSDK, AFc1fSDK<ResponseBody> aFc1fSDK) {
        this.valueOf = aFb1ySDK;
        this.values = executorService;
        this.AFKeystoreWrapper = aFc1mSDK;
        this.AFInAppEventParameterName = aFc1fSDK;
    }

    public final AFc1gSDK<ResponseBody> AFInAppEventParameterName() throws Throwable {
        if (this.AFInAppEventType.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        AFc1gSDK<String> aFc1gSDKAFInAppEventType = this.AFKeystoreWrapper.AFInAppEventType(this.valueOf);
        try {
            return new AFc1gSDK<>(this.AFInAppEventParameterName.values(aFc1gSDKAFInAppEventType.getBody()), aFc1gSDKAFInAppEventType.AFKeystoreWrapper, aFc1gSDKAFInAppEventType.valueOf, aFc1gSDKAFInAppEventType.values, aFc1gSDKAFInAppEventType.AFInAppEventParameterName);
        } catch (JSONException e5) {
            AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e5);
            throw new ParsingException(e5.getMessage(), e5, aFc1gSDKAFInAppEventType);
        }
    }
}
