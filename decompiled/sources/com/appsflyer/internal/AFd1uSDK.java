package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFd1uSDK<Result> implements Comparable<AFd1uSDK<?>>, Callable<AFd1ySDK> {
    private static final AtomicInteger afInfoLog = new AtomicInteger();
    public volatile int AFInAppEventParameterName;

    @NonNull
    public final Set<AFd1vSDK> AFInAppEventType;

    @Nullable
    public AFd1ySDK AFKeystoreWrapper;
    private long AFLogger;
    private boolean AFVersionDeclaration;

    @Nullable
    private Throwable afDebugLog;
    private final int afErrorLog;
    private final String afRDLog;

    @NonNull
    public final Set<AFd1vSDK> valueOf;

    @NonNull
    public final AFd1vSDK values;

    public AFd1uSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, @Nullable String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventType = hashSet;
        this.valueOf = new HashSet();
        int iIncrementAndGet = afInfoLog.incrementAndGet();
        this.afErrorLog = iIncrementAndGet;
        this.AFVersionDeclaration = false;
        this.AFInAppEventParameterName = 0;
        this.values = aFd1vSDK;
        Collections.addAll(hashSet, aFd1vSDKArr);
        if (str != null) {
            this.afRDLog = str;
        } else {
            this.afRDLog = String.valueOf(iIncrementAndGet);
        }
    }

    @CallSuper
    @WorkerThread
    public void AFInAppEventParameterName() {
        this.AFVersionDeclaration = true;
    }

    @WorkerThread
    public abstract boolean AFInAppEventType();

    public abstract long AFKeystoreWrapper();

    public final boolean AFLogger() {
        return this.AFVersionDeclaration;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: afErrorLog, reason: merged with bridge method [inline-methods] */
    public final AFd1ySDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.AFKeystoreWrapper = null;
        this.afDebugLog = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.AFInAppEventParameterName++;
        try {
            AFd1ySDK aFd1ySDKValues = values();
            this.AFKeystoreWrapper = aFd1ySDKValues;
            this.AFLogger = System.currentTimeMillis() - jCurrentTimeMillis;
            valueOf();
            return aFd1ySDKValues;
        } catch (Throwable th2) {
            try {
                this.afDebugLog = th2;
                this.AFKeystoreWrapper = AFd1ySDK.FAILURE;
                valueOf(th2);
                throw th2;
            } catch (Throwable th3) {
                this.AFLogger = System.currentTimeMillis() - jCurrentTimeMillis;
                valueOf();
                throw th3;
            }
        }
    }

    @Nullable
    public final Throwable afInfoLog() {
        return this.afDebugLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1uSDK aFd1uSDK = (AFd1uSDK) obj;
        if (this.values != aFd1uSDK.values) {
            return false;
        }
        return this.afRDLog.equals(aFd1uSDK.afRDLog);
    }

    public final int hashCode() {
        return this.afRDLog.hashCode() + (this.values.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.values);
        sb2.append(Constant.DASH_STRING);
        sb2.append(this.afRDLog);
        String string = sb2.toString();
        if (String.valueOf(this.afErrorLog).equals(this.afRDLog)) {
            return string;
        }
        StringBuilder sbE = androidx.camera.core.processing.f.e(string, Constant.DASH_STRING);
        sbE.append(this.afErrorLog);
        return sbE.toString();
    }

    @WorkerThread
    public void valueOf() {
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFd1uSDK<?> aFd1uSDK) {
        int i10 = this.values.onAttributionFailureNative - aFd1uSDK.values.onAttributionFailureNative;
        if (i10 != 0) {
            return i10;
        }
        if (this.afRDLog.equals(aFd1uSDK.afRDLog)) {
            return 0;
        }
        return this.afErrorLog - aFd1uSDK.afErrorLog;
    }

    @NonNull
    @WorkerThread
    public abstract AFd1ySDK values() throws Exception;

    @WorkerThread
    public void valueOf(Throwable th2) {
    }
}
