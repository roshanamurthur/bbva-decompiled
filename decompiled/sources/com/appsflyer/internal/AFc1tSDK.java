package com.appsflyer.internal;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1tSDK.AnonymousClass5;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public class AFc1tSDK implements AFc1uSDK, AFc1ySDK, AFd1zSDK {
    private final Object AFInAppEventParameterName;
    private final AFd1bSDK AFInAppEventType;
    private final AFe1xSDK AFKeystoreWrapper;
    private final AFd1tSDK AFLogger;
    private final AFe1vSDK afDebugLog;

    @Nullable
    private AFe1zSDK afErrorLog;

    @Nullable
    private AFf1uSDK afInfoLog;
    private final AFc1qSDK afRDLog;
    private final AFb1tSDK valueOf;
    private final AFb1cSDK values;

    public AFc1tSDK() {
    }

    public AFc1tSDK(AFd1bSDK aFd1bSDK, AFb1cSDK aFb1cSDK, AFe1xSDK aFe1xSDK, AFb1tSDK aFb1tSDK, AFc1qSDK aFc1qSDK, AFe1vSDK aFe1vSDK, AFd1tSDK aFd1tSDK) {
        this.AFInAppEventParameterName = new Object();
        this.AFInAppEventType = aFd1bSDK;
        this.values = aFb1cSDK;
        this.AFKeystoreWrapper = aFe1xSDK;
        this.valueOf = aFb1tSDK;
        this.afRDLog = aFc1qSDK;
        this.afDebugLog = aFe1vSDK;
        this.AFLogger = aFd1tSDK;
        aFd1tSDK.values.add(this);
    }

    private void AFKeystoreWrapper(AFe1zSDK aFe1zSDK, AFd1cSDK aFd1cSDK) {
        synchronized (this.AFInAppEventParameterName) {
            this.afErrorLog = aFe1zSDK;
        }
        if (aFd1cSDK != null) {
            aFd1cSDK.onRemoteConfigUpdateFinished(aFe1zSDK);
        }
    }

    @Nullable
    public AFf1uSDK AFInAppEventParameterName() {
        AFf1uSDK aFf1uSDK;
        synchronized (this.AFInAppEventParameterName) {
            aFf1uSDK = this.afInfoLog;
            this.afInfoLog = null;
        }
        return aFf1uSDK;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public void AFInAppEventType(AFd1uSDK<?> aFd1uSDK) {
    }

    @Nullable
    public AFf1vSDK valueOf() {
        return this.valueOf.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public void AFInAppEventType(AFd1uSDK<?> aFd1uSDK, AFd1ySDK aFd1ySDK) {
        if (aFd1uSDK instanceof AFd1aSDK) {
            AFd1aSDK aFd1aSDK = (AFd1aSDK) aFd1uSDK;
            AFe1zSDK aFe1zSDK = aFd1aSDK.afErrorLog;
            if (aFe1zSDK == null) {
                AFLogger.afWarnLog("CFG: update RC returned null result, something went wrong!");
                aFe1zSDK = AFe1zSDK.FAILURE;
            }
            if (aFe1zSDK != AFe1zSDK.USE_CACHED) {
                AFf1uSDK aFf1uSDK = aFd1aSDK.afInfoLog;
                synchronized (this.AFInAppEventParameterName) {
                    this.afInfoLog = aFf1uSDK;
                }
            }
            AFKeystoreWrapper(aFe1zSDK, aFd1aSDK.afRDLog);
        }
    }

    public void valueOf(AFd1cSDK aFd1cSDK) {
        AFd1aSDK aFd1aSDK = new AFd1aSDK(this.AFInAppEventType, this.values, this.AFKeystoreWrapper, this.valueOf, this.afRDLog, this.afDebugLog, ConfigConstantsKt.CUSTOMERS_API_VERSION, aFd1cSDK);
        AFd1tSDK aFd1tSDK = this.AFLogger;
        aFd1tSDK.AFKeystoreWrapper.execute(aFd1tSDK.new AnonymousClass5(aFd1aSDK));
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public void AFKeystoreWrapper(AFd1uSDK<?> aFd1uSDK) {
        if (aFd1uSDK instanceof AFd1aSDK) {
            AFd1aSDK aFd1aSDK = (AFd1aSDK) aFd1uSDK;
            synchronized (this.AFInAppEventParameterName) {
                this.afInfoLog = null;
            }
            AFKeystoreWrapper(AFe1zSDK.FAILURE, aFd1aSDK.afRDLog);
        }
    }
}
