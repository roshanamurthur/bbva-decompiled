package com.adobe.marketing.mobile.internal.context;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class App {
    private static App INSTANCE = new App();
    private AppContextProvider appContextProvider;

    public interface AppContextProvider {
        Context getAppContext();

        Activity getCurrentActivity();
    }

    private App() {
    }

    public static App getInstance() {
        return INSTANCE;
    }

    public Context getAppContext() {
        AppContextProvider appContextProvider = this.appContextProvider;
        if (appContextProvider == null) {
            return null;
        }
        return appContextProvider.getAppContext();
    }

    public Activity getCurrentActivity() {
        AppContextProvider appContextProvider = this.appContextProvider;
        if (appContextProvider == null) {
            return null;
        }
        return appContextProvider.getCurrentActivity();
    }

    public int getCurrentOrientation() {
        AppContextProvider appContextProvider = this.appContextProvider;
        if (appContextProvider == null || appContextProvider.getCurrentActivity() == null) {
            return 0;
        }
        return this.appContextProvider.getCurrentActivity().getResources().getConfiguration().orientation;
    }

    public void initializeApp(AppContextProvider appContextProvider) {
        this.appContextProvider = appContextProvider;
    }
}
