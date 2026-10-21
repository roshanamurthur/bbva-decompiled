package com.adobe.marketing.mobile;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.adobe.marketing.mobile.services.ServiceProvider;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
class App {
    private static final String DATASTORE_NAME = "ADOBE_MOBILE_APP_STATE";
    private static final String LARGE_ICON_RESOURCE_ID_KEY = "LARGE_ICON_RESOURCE_ID";
    private static final String SMALL_ICON_RESOURCE_ID_KEY = "SMALL_ICON_RESOURCE_ID";
    private static volatile Context appContext = null;
    private static volatile WeakReference<Application> application = null;
    private static volatile WeakReference<Activity> currentActivity = null;
    private static volatile int largeIconResourceID = -1;
    private static volatile int smallIconResourceID = -1;

    private App() {
    }

    public static void clearAppResources() {
        if (appContext != null) {
            appContext = null;
        }
        if (application != null) {
            Application application2 = application.get();
            if (application2 != null) {
                application2.unregisterActivityLifecycleCallbacks(AppLifecycleListener.getInstance());
            }
            application.clear();
            application = null;
        }
        if (currentActivity != null) {
            currentActivity.clear();
            currentActivity = null;
        }
        LocalStorageService.DataStore dataStore = new AndroidLocalStorageService().getDataStore(DATASTORE_NAME);
        if (dataStore != null) {
            dataStore.remove(SMALL_ICON_RESOURCE_ID_KEY);
            dataStore.remove(LARGE_ICON_RESOURCE_ID_KEY);
        }
        smallIconResourceID = -1;
        largeIconResourceID = -1;
    }

    public static Context getAppContext() {
        return appContext;
    }

    public static Application getApplication() {
        if (application != null) {
            return application.get();
        }
        return null;
    }

    public static Activity getCurrentActivity() {
        if (currentActivity == null) {
            return null;
        }
        return currentActivity.get();
    }

    public static int getCurrentOrientation() {
        if (currentActivity == null || currentActivity.get() == null) {
            return 0;
        }
        return currentActivity.get().getResources().getConfiguration().orientation;
    }

    public static int getLargeIconResourceID() {
        LocalStorageService.DataStore dataStore;
        if (largeIconResourceID == -1 && (dataStore = new AndroidLocalStorageService().getDataStore(DATASTORE_NAME)) != null) {
            largeIconResourceID = dataStore.getInt(LARGE_ICON_RESOURCE_ID_KEY, -1);
        }
        return largeIconResourceID;
    }

    public static int getSmallIconResourceID() {
        LocalStorageService.DataStore dataStore;
        if (smallIconResourceID == -1 && (dataStore = new AndroidLocalStorageService().getDataStore(DATASTORE_NAME)) != null) {
            smallIconResourceID = dataStore.getInt(SMALL_ICON_RESOURCE_ID_KEY, -1);
        }
        return smallIconResourceID;
    }

    public static void setAppContext(Context context) {
        appContext = context != null ? context.getApplicationContext() : null;
    }

    public static void setApplication(Application application2) {
        if (application == null || application.get() == null) {
            application = new WeakReference<>(application2);
            AppLifecycleListener.getInstance().registerActivityLifecycleCallbacks(application2);
            setAppContext(application2);
            ServiceProvider.getInstance().setContext(application2);
        }
    }

    public static void setCurrentActivity(Activity activity) {
        if (activity == null) {
            return;
        }
        currentActivity = new WeakReference<>(activity);
        setAppContext(activity);
        ServiceProvider.getInstance().setCurrentActivity(currentActivity.get());
    }

    public static void setLargeIconResourceID(int i10) {
        largeIconResourceID = i10;
        LocalStorageService.DataStore dataStore = new AndroidLocalStorageService().getDataStore(DATASTORE_NAME);
        if (dataStore != null) {
            dataStore.setInt(LARGE_ICON_RESOURCE_ID_KEY, largeIconResourceID);
        }
    }

    public static void setSmallIconResourceID(int i10) {
        smallIconResourceID = i10;
        LocalStorageService.DataStore dataStore = new AndroidLocalStorageService().getDataStore(DATASTORE_NAME);
        if (dataStore != null) {
            dataStore.setInt(SMALL_ICON_RESOURCE_ID_KEY, smallIconResourceID);
        }
    }
}
