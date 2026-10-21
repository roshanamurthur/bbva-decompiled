package com.adobe.marketing.mobile.services;

import android.app.Activity;
import android.content.Context;
import com.adobe.marketing.mobile.services.ui.AndroidUIService;
import com.adobe.marketing.mobile.services.ui.FullscreenMessageDelegate;
import com.adobe.marketing.mobile.services.ui.UIService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceProvider {
    private volatile WeakReference<Context> applicationContext;
    private volatile WeakReference<Activity> currentActivity;
    private DataQueueService dataQueueService;
    private DataStoring defaultDataStoreService;
    private DeviceInfoService defaultDeviceInfoService;
    private NetworkService defaultNetworkService;
    private UIService defaultUIService;
    private FullscreenMessageDelegate messageDelegate;
    private DeviceInforming overrideDeviceInfoService;
    private Networking overrideNetworkService;

    public static class ServiceProviderSingleton {
        private static final ServiceProvider INSTANCE = new ServiceProvider();

        private ServiceProviderSingleton() {
        }
    }

    public static ServiceProvider getInstance() {
        return ServiceProviderSingleton.INSTANCE;
    }

    public Context getApplicationContext() {
        if (this.applicationContext != null) {
            return this.applicationContext.get();
        }
        return null;
    }

    public Activity getCurrentActivity() {
        if (this.currentActivity != null) {
            return this.currentActivity.get();
        }
        return null;
    }

    public DataQueuing getDataQueueService() {
        return this.dataQueueService;
    }

    public DataStoring getDataStoreService() {
        return this.defaultDataStoreService;
    }

    public DeviceInforming getDeviceInfoService() {
        DeviceInforming deviceInforming = this.overrideDeviceInfoService;
        return deviceInforming != null ? deviceInforming : this.defaultDeviceInfoService;
    }

    public FullscreenMessageDelegate getMessageDelegate() {
        return this.messageDelegate;
    }

    public Networking getNetworkService() {
        Networking networking = this.overrideNetworkService;
        return networking != null ? networking : this.defaultNetworkService;
    }

    public UIService getUIService() {
        return this.defaultUIService;
    }

    public void reset() {
        this.defaultDeviceInfoService = new DeviceInfoService();
        this.defaultNetworkService = new NetworkService();
        this.dataQueueService = new DataQueueService();
        this.defaultDataStoreService = new LocalDataStoreService();
        this.overrideDeviceInfoService = null;
        this.overrideNetworkService = null;
        this.messageDelegate = null;
    }

    public void setContext(Context context) {
        this.applicationContext = new WeakReference<>(context);
    }

    public void setCurrentActivity(Activity activity) {
        this.currentActivity = new WeakReference<>(activity);
    }

    public void setDeviceInfoService(DeviceInforming deviceInforming) {
        this.overrideDeviceInfoService = deviceInforming;
    }

    public void setMessageDelegate(FullscreenMessageDelegate fullscreenMessageDelegate) {
        this.messageDelegate = fullscreenMessageDelegate;
    }

    public void setNetworkService(Networking networking) {
        this.overrideNetworkService = networking;
    }

    private ServiceProvider() {
        this.defaultNetworkService = new NetworkService();
        this.defaultDeviceInfoService = new DeviceInfoService();
        this.dataQueueService = new DataQueueService();
        this.defaultDataStoreService = new LocalDataStoreService();
        this.defaultUIService = new AndroidUIService();
        this.messageDelegate = null;
    }
}
