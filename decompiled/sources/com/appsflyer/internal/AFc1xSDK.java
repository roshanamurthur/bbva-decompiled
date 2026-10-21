package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1xSDK implements AFc1zSDK {
    private static final int AFKeystoreWrapper = (int) TimeUnit.SECONDS.toMillis(30);
    public final AFb1bSDK AFInAppEventParameterName = new AFb1bSDK();
    private ExecutorService AFInAppEventType;
    private AFc1pSDK AFLogger;
    private AFd1tSDK AFLogger$LogLevel;
    private AFe1tSDK AFVersionDeclaration;
    private AFc1cSDK AppsFlyer2dXConversionCallback;
    private AFb1cSDK afDebugLog;
    private PurchaseHandler afErrorLog;
    private AFf1fSDK afErrorLogForExcManagerOnly;
    private AFe1lSDK afInfoLog;
    private AFc1tSDK afRDLog;
    private AFb1wSDK afWarnLog;
    private AFf1kSDK getLevel;
    private AFf1mSDK init;
    private AFa1fSDK onAppOpenAttributionNative;
    private AFb1vSDK onAttributionFailure;
    private AFb1iSDK onAttributionFailureNative;
    private AFb1uSDK onConversionDataSuccess;
    private AFa1iSDK onDeepLinkingNative;
    private AFe1xSDK onInstallConversionDataLoadedNative;
    private AFc1wSDK onInstallConversionFailureNative;
    private AFf1tSDK onResponse;
    private AFb1jSDK onResponseErrorNative;
    private AFa1gSDK onResponseNative;
    private ScheduledExecutorService valueOf;
    private ExecutorService values;

    public static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger values = new AtomicInteger();
        private final AtomicInteger AFInAppEventParameterName = new AtomicInteger();

        public AFa1zSDK() {
            values.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i10 = values.get();
            int iIncrementAndGet = this.AFInAppEventParameterName.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i10);
            sb2.append(Constant.DASH_STRING);
            sb2.append(iIncrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    /* JADX INFO: renamed from: onAttributionFailure, reason: merged with bridge method [inline-methods] */
    public synchronized AFc1wSDK onResponseErrorNative() {
        try {
            if (this.onInstallConversionFailureNative == null) {
                this.onInstallConversionFailureNative = new AFc1wSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.onInstallConversionFailureNative;
    }

    @NonNull
    private synchronized AFc1pSDK onAttributionFailureNative() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new AFc1pSDK(new AFc1mSDK(AFKeystoreWrapper), valueOf());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger;
    }

    @NonNull
    private synchronized ExecutorService onConversionDataFail() {
        try {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFb1cSDK AFInAppEventParameterName() {
        try {
            if (this.afDebugLog == null) {
                AFb1bSDK aFb1bSDKOnAppOpenAttributionNative = onAppOpenAttributionNative();
                Context context = this.AFInAppEventParameterName.AFInAppEventParameterName;
                if (context == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.afDebugLog = new AFb1cSDK(aFb1bSDKOnAppOpenAttributionNative, new AFb1gSDK(AFa1dSDK.values(context)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final AFc1qSDK AFInAppEventType() {
        return new AFc1qSDK(onAttributionFailureNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), onInstallConversionDataLoadedNative());
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final AFb1fSDK AFKeystoreWrapper() {
        Context context = this.AFInAppEventParameterName.AFInAppEventParameterName;
        if (context != null) {
            return new AFb1gSDK(AFa1dSDK.values(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFe1lSDK AFLogger() {
        try {
            if (this.afInfoLog == null) {
                this.afInfoLog = new AFe1lSDK(AFKeystoreWrapper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFf1kSDK AFLogger$LogLevel() {
        try {
            if (this.getLevel == null) {
                this.getLevel = new AFf1kSDK();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFe1xSDK AFVersionDeclaration() {
        try {
            if (this.onInstallConversionDataLoadedNative == null) {
                this.onInstallConversionDataLoadedNative = new AFe1xSDK(onAppOpenAttributionNative(), new AFe1wSDK());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.onInstallConversionDataLoadedNative;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFa1fSDK AppsFlyer2dXConversionCallback() {
        try {
            if (this.onAppOpenAttributionNative == null) {
                this.onAppOpenAttributionNative = new AFa1jSDK(onAppOpenAttributionNative());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.onAppOpenAttributionNative;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFc1tSDK afDebugLog() {
        try {
            if (this.afRDLog == null) {
                AFb1tSDK aFb1tSDK = new AFb1tSDK(AFKeystoreWrapper());
                this.afRDLog = new AFc1tSDK(new AFd1bSDK(), AFInAppEventParameterName(), AFVersionDeclaration(), aFb1tSDK, new AFc1qSDK(onAttributionFailureNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), onInstallConversionDataLoadedNative()), new AFe1vSDK(AFInAppEventParameterName(), aFb1tSDK), getLevel());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afRDLog;
    }

    @NonNull
    public final synchronized AFb1vSDK afErrorLog() {
        try {
            if (this.onAttributionFailure == null) {
                this.onAttributionFailure = new AFb1vSDK(onAppOpenAttributionNative(), AFInAppEventParameterName());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.onAttributionFailure;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFb1wSDK afErrorLogForExcManagerOnly() {
        try {
            if (this.afWarnLog == null) {
                this.afWarnLog = new AFb1rSDK();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized PurchaseHandler afInfoLog() {
        try {
            if (this.afErrorLog == null) {
                this.afErrorLog = new PurchaseHandler(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final AFe1tSDK afRDLog() {
        if (this.AFVersionDeclaration == null) {
            Context context = this.AFInAppEventParameterName.AFInAppEventParameterName;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.init == null) {
                this.init = new AFf1lSDK();
            }
            AFf1mSDK aFf1mSDK = this.init;
            if (this.onResponseErrorNative == null) {
                this.onResponseErrorNative = new AFa1xSDK();
            }
            AFb1jSDK aFb1jSDK = this.onResponseErrorNative;
            if (this.afErrorLogForExcManagerOnly == null) {
                Context context2 = this.AFInAppEventParameterName.AFInAppEventParameterName;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.afErrorLogForExcManagerOnly = new AFf1bSDK(context2);
            }
            AFf1fSDK aFf1fSDK = this.afErrorLogForExcManagerOnly;
            if (this.onResponseNative == null) {
                this.onResponseNative = new AFa1hSDK();
            }
            AFa1gSDK aFa1gSDK = this.onResponseNative;
            AFe1lSDK aFe1lSDKAFLogger = AFLogger();
            AFb1fSDK aFb1fSDKAFKeystoreWrapper = AFKeystoreWrapper();
            AFb1cSDK aFb1cSDKAFInAppEventParameterName = AFInAppEventParameterName();
            if (this.onDeepLinkingNative == null) {
                this.onDeepLinkingNative = new AFa1iSDK();
            }
            this.AFVersionDeclaration = new AFe1uSDK(context, aFf1mSDK, aFb1jSDK, aFf1fSDK, aFa1gSDK, aFe1lSDKAFLogger, aFb1fSDKAFKeystoreWrapper, aFb1cSDKAFInAppEventParameterName, this.onDeepLinkingNative, AFVersionDeclaration(), new AFb1xSDK());
        }
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final AFf1fSDK afWarnLog() {
        if (this.afErrorLogForExcManagerOnly == null) {
            Context context = this.AFInAppEventParameterName.AFInAppEventParameterName;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.afErrorLogForExcManagerOnly = new AFf1bSDK(context);
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFd1tSDK getLevel() {
        try {
            if (this.AFLogger$LogLevel == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1xSDK.5
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1zSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new h());
                this.AFLogger$LogLevel = new AFd1tSDK(threadPoolExecutor);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFb1uSDK init() {
        try {
            if (this.onConversionDataSuccess == null) {
                this.onConversionDataSuccess = new AFb1uSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.onConversionDataSuccess;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFb1bSDK onAppOpenAttributionNative() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final AFb1jSDK onConversionDataSuccess() {
        if (this.onResponseErrorNative == null) {
            this.onResponseErrorNative = new AFa1xSDK();
        }
        return this.onResponseErrorNative;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final AFb1iSDK onDeepLinkingNative() {
        if (this.onAttributionFailureNative == null) {
            ExecutorService executorServiceOnConversionDataFail = onConversionDataFail();
            AFb1uSDK aFb1uSDKInit = init();
            if (this.onResponse == null) {
                this.onResponse = new AFf1qSDK();
            }
            this.onAttributionFailureNative = new AFb1lSDK(executorServiceOnConversionDataFail, aFb1uSDKInit, this.onResponse);
        }
        return this.onAttributionFailureNative;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized AFc1cSDK onInstallConversionDataLoadedNative() {
        try {
            if (this.AppsFlyer2dXConversionCallback == null) {
                this.AppsFlyer2dXConversionCallback = new AFc1cSDK(AFInAppEventParameterName(), AFKeystoreWrapper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final AFf1mSDK onInstallConversionFailureNative() {
        if (this.init == null) {
            this.init = new AFf1lSDK();
        }
        return this.init;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final AFf1tSDK onResponseNative() {
        if (this.onResponse == null) {
            this.onResponse = new AFf1qSDK();
        }
        return this.onResponse;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized ExecutorService valueOf() {
        try {
            if (this.values == null) {
                this.values = Executors.newCachedThreadPool();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    @NonNull
    public final synchronized ScheduledExecutorService values() {
        try {
            if (this.valueOf == null) {
                this.valueOf = Executors.newScheduledThreadPool(2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void values(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e5) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e5);
            Thread.currentThread().interrupt();
        }
    }
}
