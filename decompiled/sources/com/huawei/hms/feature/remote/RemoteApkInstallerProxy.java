package com.huawei.hms.feature.remote;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hms.feature.install.FeatureInstallManager;
import com.huawei.hms.feature.listener.InstallStateListener;
import com.huawei.hms.feature.model.FeatureInstallException;
import com.huawei.hms.feature.model.FeatureInstallRequest;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.tasks.FeatureTask;
import com.huawei.hms.feature.tasks.FeatureTaskHolder;
import com.huawei.hms.feature.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class RemoteApkInstallerProxy implements FeatureInstallManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50514a = "LocalApk-RemoteApkInstallerProxy";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RemoteApkConnector f50515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<InstallStateListener> f50516c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.huawei.hms.feature.e f50517d = new a();

    public class a extends com.huawei.hms.feature.e.b {
        public a() {
        }

        @Override // com.huawei.hms.feature.e
        public void a(Intent intent) throws RemoteException {
            RemoteApkInstallerProxy.this.a(InstallState.makeSessionState(intent.getBundleExtra(com.huawei.hms.feature.model.b.f50444o)));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FeatureInstallRequest f50519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50520b;

        public class a extends com.huawei.hms.feature.remote.c<Integer> {
            public a(FeatureTaskHolder featureTaskHolder) {
                super(featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.remote.c, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onInstallFeature(int i10, Bundle bundle) throws RemoteException {
                super.onInstallFeature(i10, bundle);
                b bVar = b.this;
                RemoteApkInstallerProxy.this.a(i10, bundle, bVar.f50520b, bVar.f50519a);
            }
        }

        public b(FeatureInstallRequest featureInstallRequest, FeatureTaskHolder featureTaskHolder) {
            this.f50519a = featureInstallRequest;
            this.f50520b = featureTaskHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                RemoteApkInstallerProxy.this.f50515b.getBinderInterface().installFeature(com.huawei.hms.feature.remote.d.a(this.f50519a.getModuleNames()), new a(this.f50520b));
            } catch (RemoteException e5) {
                Logger.e(RemoteApkInstallerProxy.f50514a, "mRemoteApkConnector getBinderInterface installFeature failed.");
                this.f50520b.notifyFailure(new RuntimeException(e5));
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f50523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50524b;

        public class a extends com.huawei.hms.feature.remote.c<Void> {
            public a(FeatureTaskHolder featureTaskHolder) {
                super(featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.remote.c, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onAbortInstallFeature(int i10, Bundle bundle) throws RemoteException {
                super.onAbortInstallFeature(i10, bundle);
                c.this.f50524b.notifyResult(null);
                Logger.d(RemoteApkInstallerProxy.f50514a, "cancel install notifyResult");
            }
        }

        public c(int i10, FeatureTaskHolder featureTaskHolder) {
            this.f50523a = i10;
            this.f50524b = featureTaskHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                RemoteApkInstallerProxy.this.f50515b.getBinderInterface().abortInstallFeature(this.f50523a, new a(this.f50524b));
                Logger.d(RemoteApkInstallerProxy.f50514a, "cancel install end");
            } catch (RemoteException e5) {
                Logger.e(RemoteApkInstallerProxy.f50514a, "Execute remote abortInstallFeature error.");
                this.f50524b.notifyFailure(new RuntimeException(e5));
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f50527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50528b;

        public class a extends com.huawei.hms.feature.remote.c<InstallState> {
            public a(FeatureTaskHolder featureTaskHolder) {
                super(featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.remote.c, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onGetInstallState(int i10, Bundle bundle) throws RemoteException {
                super.onGetInstallState(i10, bundle);
                d.this.f50528b.notifyResult(InstallState.makeSessionState(bundle));
                Logger.d(RemoteApkInstallerProxy.f50514a, "get Session State notifyResult");
            }
        }

        public d(int i10, FeatureTaskHolder featureTaskHolder) {
            this.f50527a = i10;
            this.f50528b = featureTaskHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                RemoteApkInstallerProxy.this.f50515b.getBinderInterface().getInstallState(this.f50527a, new a(this.f50528b));
                Logger.d(RemoteApkInstallerProxy.f50514a, "get Session State end");
            } catch (RemoteException e5) {
                Logger.e(RemoteApkInstallerProxy.f50514a, "Execute remote getInstallState error.");
                this.f50528b.notifyFailure(new RuntimeException(e5));
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50531a;

        public class a extends com.huawei.hms.feature.remote.c<List<InstallState>> {
            public a(FeatureTaskHolder featureTaskHolder) {
                super(featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.remote.c, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onGetAllInstallStates(Bundle bundle) throws RemoteException {
                super.onGetAllInstallStates(bundle);
                e.this.f50531a.notifyResult(InstallState.makeSessionStatesList(bundle));
                Logger.d(RemoteApkInstallerProxy.f50514a, "get Session States notifyResult");
            }
        }

        public e(FeatureTaskHolder featureTaskHolder) {
            this.f50531a = featureTaskHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                RemoteApkInstallerProxy.this.f50515b.getBinderInterface().getAllInstallStates(new a(this.f50531a));
                Logger.d(RemoteApkInstallerProxy.f50514a, "get Session States end");
            } catch (RemoteException e5) {
                Logger.e(RemoteApkInstallerProxy.f50514a, "Execute remote getAllInstallStates error.");
                this.f50531a.notifyFailure(new RuntimeException(e5));
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f50534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50535b;

        public class a extends com.huawei.hms.feature.remote.c<Void> {
            public a(FeatureTaskHolder featureTaskHolder) {
                super(featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.remote.c, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onDelayedInstallFeature(Bundle bundle) throws RemoteException {
                super.onDelayedInstallFeature(bundle);
                f.this.f50535b.notifyResult(null);
                Logger.d(RemoteApkInstallerProxy.f50514a, "deferred install notifyResult");
            }
        }

        public f(List list, FeatureTaskHolder featureTaskHolder) {
            this.f50534a = list;
            this.f50535b = featureTaskHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                RemoteApkInstallerProxy.this.f50515b.getBinderInterface().delayedInstallFeature(this.f50534a, new a(this.f50535b));
                Logger.d(RemoteApkInstallerProxy.f50514a, "deferred install end");
            } catch (RemoteException e5) {
                Logger.e(RemoteApkInstallerProxy.f50514a, "Execute remote delayedInstallFeature error.");
                this.f50535b.notifyFailure(new RuntimeException(e5));
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f50538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeatureTaskHolder f50539b;

        public class a extends com.huawei.hms.feature.remote.c<Void> {
            public a(FeatureTaskHolder featureTaskHolder) {
                super(featureTaskHolder);
            }

            @Override // com.huawei.hms.feature.remote.c, com.huawei.dynamiccore.aidl.IDynamicCoreCallback
            public void onDelayedUninstallFeature(Bundle bundle) throws RemoteException {
                super.onDelayedUninstallFeature(bundle);
                g.this.f50539b.notifyResult(null);
                Logger.d(RemoteApkInstallerProxy.f50514a, "deferred uninstall notifyResult");
            }
        }

        public g(List list, FeatureTaskHolder featureTaskHolder) {
            this.f50538a = list;
            this.f50539b = featureTaskHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                RemoteApkInstallerProxy.this.f50515b.getBinderInterface().delayedUninstallFeature(this.f50538a, new a(this.f50539b));
                Logger.d(RemoteApkInstallerProxy.f50514a, "deferred uninstall end");
            } catch (RemoteException e5) {
                Logger.e(RemoteApkInstallerProxy.f50514a, "Execute remote delayedUninstallFeature error.");
                this.f50539b.notifyFailure(new RuntimeException(e5));
            }
        }
    }

    public RemoteApkInstallerProxy(Context context) {
        Logger.i(f50514a, "RemoteApkInstallerProxy init");
        this.f50515b = new RemoteApkConnector(context, "remote-apk");
    }

    private FeatureInstallException a(Bundle bundle) {
        if (bundle != null) {
            return new FeatureInstallException(bundle.getInt("error_code"));
        }
        Logger.e(f50514a, "Inner error:  bundle from remote apk is null");
        return new FeatureInstallException(-100);
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<Void> abortInstallFeature(int i10) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50515b.doRequest(new c(i10, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<Void> delayedInstallFeature(List<String> list) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50515b.doRequest(new f(list, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<Void> delayedUninstallFeature(List<String> list) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50515b.doRequest(new g(list, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<List<InstallState>> getAllInstallStates() {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50515b.doRequest(new e(featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public Set<String> getAllInstalledModules() {
        HashSet hashSet = new HashSet();
        try {
            hashSet.addAll(((HashMap) this.f50515b.getBinderInterface().getAllInstalledModules()).keySet());
            Logger.d(f50514a, "getAllInstalledModules:size=" + hashSet.size());
        } catch (RemoteException unused) {
            Logger.e(f50514a, "mRemoteApkConnector getInstallModules failed.");
        }
        return hashSet;
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<InstallState> getInstallState(int i10) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        this.f50515b.doRequest(new d(i10, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public FeatureTask<Integer> installFeature(FeatureInstallRequest featureInstallRequest) {
        FeatureTaskHolder featureTaskHolder = new FeatureTaskHolder();
        Logger.d(f50514a, "installFeature with request");
        this.f50515b.doRequest(new b(featureInstallRequest, featureTaskHolder));
        return featureTaskHolder.getTask();
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public void registerInstallListener(InstallStateListener installStateListener) {
        this.f50516c.add(installStateListener);
        if (this.f50516c.size() == 1) {
            try {
                this.f50515b.getBinderInterface().registerInstallListener(this.f50517d);
                Logger.d(f50514a, "registerInstallListener ..");
            } catch (RemoteException unused) {
                Logger.e(f50514a, "mRemoteApkConnector registerInstallListener failed.");
            }
        }
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public boolean triggerUserConfirm(InstallState installState, Activity activity, int i10) throws IntentSender.SendIntentException {
        boolean zTriggerUserConfirm;
        try {
            zTriggerUserConfirm = this.f50515b.getBinderInterface().triggerUserConfirm(installState, com.huawei.hms.feature.remote.b.a(activity), i10);
            try {
                Logger.d(f50514a, "triggerUserConfirm");
            } catch (RemoteException unused) {
                Logger.e(f50514a, "Execute remote triggerUserConfirm error.");
            }
        } catch (RemoteException unused2) {
            zTriggerUserConfirm = false;
        }
        return zTriggerUserConfirm;
    }

    @Override // com.huawei.hms.feature.install.FeatureInstallManager
    public void unregisterInstallListener(InstallStateListener installStateListener) {
        this.f50516c.remove(installStateListener);
        if (this.f50516c.size() == 0) {
            try {
                Logger.d(f50514a, "unregisterInstallListener");
                this.f50515b.getBinderInterface().unregisterInstallListener(this.f50517d);
            } catch (RemoteException unused) {
                Logger.e(f50514a, "mRemoteApkConnector unregisterInstallListener failed.");
            }
        }
    }

    private static List<String> a(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Locale> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toLanguageTag());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Bundle bundle, FeatureTaskHolder<Integer> featureTaskHolder, FeatureInstallRequest featureInstallRequest) {
        if (-1 != i10) {
            Logger.d(f50514a, "proxy:install success..");
            featureTaskHolder.notifyResult(Integer.valueOf(i10));
            return;
        }
        FeatureInstallException featureInstallExceptionA = a(bundle);
        if (featureInstallExceptionA.getErrorCode() != 10) {
            Logger.d(f50514a, "proxy:install failed..");
            featureTaskHolder.notifyFailure(featureInstallExceptionA);
        } else {
            Logger.d(f50514a, "error code:10. feature has already installed. Please do not worry, do nothing.");
            featureTaskHolder.notifyResult(0);
            a(InstallState.makeSessionState(com.huawei.hms.feature.utils.b.a(featureInstallRequest.getModuleNames(), a(featureInstallRequest.getLanguages()))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(InstallState installState) {
        Iterator<InstallStateListener> it = this.f50516c.iterator();
        while (it.hasNext()) {
            it.next().onStateUpdate(installState);
        }
    }
}
