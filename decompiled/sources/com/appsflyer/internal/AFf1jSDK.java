package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFf1jSDK extends Observable {
    public final String AFInAppEventParameterName;
    final Runnable AFInAppEventType;
    long AFLogger;
    public final String afInfoLog;
    public final Map<String, Object> AFKeystoreWrapper = new HashMap();
    public AFa1vSDK afRDLog = AFa1vSDK.NOT_STARTED;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1jSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements Observer {
        public AnonymousClass5() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFf1jSDK.this.AFInAppEventType.run();
        }
    }

    public enum AFa1vSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFf1jSDK(String str, String str2, Runnable runnable) {
        this.AFInAppEventType = runnable;
        this.AFInAppEventParameterName = str2;
        this.afInfoLog = str;
    }

    public final void AFInAppEventType() {
        this.AFKeystoreWrapper.put("source", this.AFInAppEventParameterName);
        this.AFKeystoreWrapper.put("type", this.afInfoLog);
        this.AFKeystoreWrapper.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFLogger));
        this.afRDLog = AFa1vSDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void AFKeystoreWrapper(Context context);
}
