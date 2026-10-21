package com.adobe.marketing.mobile;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class AppLifecycleListener implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static AppLifecycleListener instance;
    private static boolean registered;
    private volatile UIService.AppState appState = UIService.AppState.UNKNOWN;
    private List<UIService.AppStateListener> appStateListeners = new ArrayList();

    private AppLifecycleListener() {
    }

    public static synchronized AppLifecycleListener getInstance() {
        try {
            if (instance == null) {
                instance = new AppLifecycleListener();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return instance;
    }

    private void notifyListeners() {
        for (UIService.AppStateListener appStateListener : this.appStateListeners) {
            if (this.appState == UIService.AppState.FOREGROUND) {
                appStateListener.onForeground();
            } else if (this.appState == UIService.AppState.BACKGROUND) {
                appStateListener.onBackground();
            }
        }
    }

    private void setForegroundIfNeeded() {
        UIService.AppState appState = this.appState;
        UIService.AppState appState2 = UIService.AppState.FOREGROUND;
        if (appState == appState2) {
            return;
        }
        this.appState = appState2;
        notifyListeners();
    }

    public UIService.AppState getAppState() {
        return this.appState;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        setForegroundIfNeeded();
        MobileCore.collectLaunchInfo(activity);
        App.setCurrentActivity(activity);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 >= 20) {
            UIService.AppState appState = this.appState;
            UIService.AppState appState2 = UIService.AppState.BACKGROUND;
            if (appState == appState2) {
                return;
            }
            this.appState = appState2;
            notifyListeners();
        }
    }

    public void registerActivityLifecycleCallbacks(Application application) {
        if (application == null || registered) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        application.registerComponentCallbacks(this);
        registered = true;
    }

    public void registerListener(UIService.AppStateListener appStateListener) {
        this.appStateListeners.add(appStateListener);
    }

    public void unregisterListener(UIService.AppStateListener appStateListener) {
        this.appStateListeners.remove(appStateListener);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
