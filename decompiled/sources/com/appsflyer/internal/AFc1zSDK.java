package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public interface AFc1zSDK {
    @NonNull
    AFb1cSDK AFInAppEventParameterName();

    @NonNull
    AFc1qSDK AFInAppEventType();

    @NonNull
    AFb1fSDK AFKeystoreWrapper();

    @NonNull
    AFe1lSDK AFLogger();

    @NonNull
    AFf1kSDK AFLogger$LogLevel();

    @NonNull
    AFe1xSDK AFVersionDeclaration();

    @NonNull
    AFa1fSDK AppsFlyer2dXConversionCallback();

    @NonNull
    AFc1tSDK afDebugLog();

    @NonNull
    AFb1wSDK afErrorLogForExcManagerOnly();

    @NonNull
    PurchaseHandler afInfoLog();

    @NonNull
    AFe1tSDK afRDLog();

    @NonNull
    AFf1fSDK afWarnLog();

    @NonNull
    AFd1tSDK getLevel();

    @NonNull
    AFb1uSDK init();

    @NonNull
    AFb1bSDK onAppOpenAttributionNative();

    @NonNull
    AFb1jSDK onConversionDataSuccess();

    @NonNull
    AFb1iSDK onDeepLinkingNative();

    @NonNull
    AFc1cSDK onInstallConversionDataLoadedNative();

    @NonNull
    AFf1mSDK onInstallConversionFailureNative();

    @NonNull
    AFc1vSDK onResponseErrorNative();

    @NonNull
    AFf1tSDK onResponseNative();

    @NonNull
    ExecutorService valueOf();

    @NonNull
    ScheduledExecutorService values();
}
