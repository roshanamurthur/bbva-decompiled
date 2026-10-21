package com.appsflyer.internal;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFd1nSDK<Result> extends AFd1uSDK<AFc1gSDK<Result>> {

    @Nullable
    public AFc1gSDK<Result> AFLogger;
    protected final AFb1wSDK afDebugLog;
    protected final AFc1qSDK afErrorLog;
    private AFa1fSDK afInfoLog;
    public final AFe1xSDK afRDLog;

    @Nullable
    private String afWarnLog;

    private AFd1nSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, @NonNull AFc1qSDK aFc1qSDK, @NonNull AFe1xSDK aFe1xSDK, @NonNull AFb1wSDK aFb1wSDK, @NonNull AFa1fSDK aFa1fSDK, @Nullable String str) {
        super(aFd1vSDK, aFd1vSDKArr, str);
        this.afErrorLog = aFc1qSDK;
        this.afRDLog = aFe1xSDK;
        this.afDebugLog = aFb1wSDK;
        this.afInfoLog = aFa1fSDK;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFInAppEventParameterName() {
        String str;
        super.AFInAppEventParameterName();
        if (!afRDLog() || (str = this.afRDLog.AFInAppEventType) == null || str.trim().isEmpty()) {
            return;
        }
        valueOf(AFKeystoreWrapper(str).valueOf);
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public boolean AFInAppEventType() {
        if (afInfoLog() instanceof AFd1rSDK) {
            return false;
        }
        if (this.AFKeystoreWrapper == AFd1ySDK.TIMEOUT) {
            return true;
        }
        Throwable thAfInfoLog = afInfoLog();
        return (thAfInfoLog instanceof IOException) && !(thAfInfoLog instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public long AFKeystoreWrapper() {
        return 60000L;
    }

    @WorkerThread
    public abstract AFc1nSDK<Result> AFKeystoreWrapper(@NonNull String str);

    @Nullable
    public abstract AppsFlyerRequestListener afDebugLog();

    public abstract boolean afRDLog();

    public boolean afWarnLog() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    @CallSuper
    public final void valueOf(Throwable th2) {
        AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(th2)), th2, true, !(th2 instanceof HttpException));
        AppsFlyerRequestListener appsFlyerRequestListenerAfDebugLog = afDebugLog();
        if (appsFlyerRequestListenerAfDebugLog != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            appsFlyerRequestListenerAfDebugLog.onError(40, message);
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    @NonNull
    @CallSuper
    public AFd1ySDK values() throws Exception {
        if (afWarnLog() && this.afRDLog.values()) {
            AppsFlyerRequestListener appsFlyerRequestListenerAfDebugLog = afDebugLog();
            if (appsFlyerRequestListenerAfDebugLog != null) {
                appsFlyerRequestListenerAfDebugLog.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFd1rSDK();
        }
        String str = this.afRDLog.AFInAppEventType;
        if (str == null || str.trim().isEmpty()) {
            AppsFlyerRequestListener appsFlyerRequestListenerAfDebugLog2 = afDebugLog();
            if (appsFlyerRequestListenerAfDebugLog2 != null) {
                appsFlyerRequestListenerAfDebugLog2.onError(41, "No dev key");
            }
            throw new AFd1wSDK();
        }
        AFc1nSDK<Result> aFc1nSDKAFKeystoreWrapper = AFKeystoreWrapper(str);
        if (afRDLog()) {
            valueOf(aFc1nSDKAFKeystoreWrapper.valueOf);
        }
        AFc1gSDK<Result> aFc1gSDKAFInAppEventParameterName = aFc1nSDKAFKeystoreWrapper.AFInAppEventParameterName();
        this.AFLogger = aFc1gSDKAFInAppEventParameterName;
        this.afDebugLog.values(aFc1nSDKAFKeystoreWrapper.valueOf.AFInAppEventParameterName, aFc1gSDKAFInAppEventParameterName.getStatusCode(), aFc1gSDKAFInAppEventParameterName.getBody().toString());
        AppsFlyerRequestListener appsFlyerRequestListenerAfDebugLog3 = afDebugLog();
        if (appsFlyerRequestListenerAfDebugLog3 != null) {
            if (aFc1gSDKAFInAppEventParameterName.isSuccessful()) {
                appsFlyerRequestListenerAfDebugLog3.onSuccess();
            } else {
                StringBuilder sb2 = new StringBuilder("Status code failure ");
                sb2.append(aFc1gSDKAFInAppEventParameterName.getStatusCode());
                appsFlyerRequestListenerAfDebugLog3.onError(50, sb2.toString());
            }
        }
        return aFc1gSDKAFInAppEventParameterName.isSuccessful() ? AFd1ySDK.SUCCESS : AFd1ySDK.FAILURE;
    }

    public AFd1nSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, @NonNull AFc1zSDK aFc1zSDK, @Nullable String str) {
        this(aFd1vSDK, aFd1vSDKArr, aFc1zSDK.AFInAppEventType(), aFc1zSDK.AFVersionDeclaration(), aFc1zSDK.afErrorLogForExcManagerOnly(), aFc1zSDK.AppsFlyer2dXConversionCallback(), str);
    }

    @WorkerThread
    private void valueOf(AFb1ySDK aFb1ySDK) {
        String str = this.afWarnLog;
        this.afWarnLog = this.afInfoLog.valueOf(new AFa1rSDK(aFb1ySDK.AFInAppEventParameterName, aFb1ySDK.values(), "6.12.1", this.values));
        if (str != null) {
            this.afInfoLog.valueOf(str);
        }
    }

    public AFd1nSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, @NonNull AFc1zSDK aFc1zSDK, @Nullable String str, @Nullable String str2) {
        this(aFd1vSDK, aFd1vSDKArr, aFc1zSDK.AFInAppEventType(), aFc1zSDK.AFVersionDeclaration(), aFc1zSDK.afErrorLogForExcManagerOnly(), aFc1zSDK.AppsFlyer2dXConversionCallback(), str);
        this.afWarnLog = str2;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    @CallSuper
    public void valueOf() {
        String str;
        if (this.AFKeystoreWrapper == AFd1ySDK.SUCCESS) {
            String str2 = this.afWarnLog;
            if (str2 != null) {
                this.afInfoLog.valueOf(str2);
                return;
            }
            return;
        }
        if (AFInAppEventType() || (str = this.afWarnLog) == null) {
            return;
        }
        this.afInfoLog.valueOf(str);
    }
}
