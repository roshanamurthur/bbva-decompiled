package com.veridas.activity;

import android.os.Bundle;

/* JADX INFO: loaded from: classes9.dex */
public interface ActivityLifecycleListener {
    void onBeforeCreated(DasActivity dasActivity, Bundle bundle);

    void onBeforeDestroyed(DasActivity dasActivity);

    void onBeforeStopped(DasActivity dasActivity);

    void onCreated(DasActivity dasActivity, Bundle bundle);

    void onDestroyed(DasActivity dasActivity);

    void onPaused(DasActivity dasActivity);

    void onRestarted(DasActivity dasActivity);

    void onResumed(DasActivity dasActivity);

    void onStarted(DasActivity dasActivity);

    void onStopped(DasActivity dasActivity);
}
