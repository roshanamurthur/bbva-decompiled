package com.noknok.android.client.utils;

import android.app.Activity;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ProgressObserverFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ProgressObserverFactory f63466a;

    public static synchronized ProgressObserverFactory getInstance() {
        try {
            if (f63466a == null) {
                setInstance(new DefaultProgressObserverFactory());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63466a;
    }

    public static synchronized void setInstance(ProgressObserverFactory progressObserverFactory) {
        f63466a = progressObserverFactory;
    }

    public abstract IProgressObserver createProgressObserver(Activity activity);
}
