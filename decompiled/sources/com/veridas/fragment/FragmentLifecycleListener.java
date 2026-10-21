package com.veridas.fragment;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public interface FragmentLifecycleListener extends FragmentListener {
    void onActivityCreated(DasFragment dasFragment);

    void onAfterPaused(DasFragment dasFragment);

    void onAfterResumed(DasFragment dasFragment);

    void onAttached(DasFragment dasFragment, Context context);

    void onBeforeCreated(DasFragment dasFragment, Bundle bundle);

    void onBeforeDestroyed(DasFragment dasFragment);

    void onBeforePaused(DasFragment dasFragment);

    void onBeforeResumed(DasFragment dasFragment);

    void onBeforeStopped(DasFragment dasFragment);

    void onCreated(DasFragment dasFragment, Bundle bundle);

    void onDestroyed(DasFragment dasFragment);

    void onDetached(DasFragment dasFragment);

    void onPaused(DasFragment dasFragment);

    void onResumed(DasFragment dasFragment);

    void onStarted(DasFragment dasFragment);

    void onStopped(DasFragment dasFragment);
}
