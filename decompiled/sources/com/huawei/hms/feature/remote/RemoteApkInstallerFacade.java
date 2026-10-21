package com.huawei.hms.feature.remote;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.dynamiccore.aidl.IDynamicCoreCallback;
import com.huawei.hms.feature.install.FeatureInstallManager;
import com.huawei.hms.feature.install.FeatureInstallManagerFactory;
import com.huawei.hms.feature.listener.InstallStateListener;
import com.huawei.hms.feature.model.FeatureInstallException;
import com.huawei.hms.feature.model.FeatureInstallRequest;
import com.huawei.hms.feature.model.InstallState;
import com.huawei.hms.feature.tasks.FeatureTask;
import com.huawei.hms.feature.tasks.listener.OnFeatureCompleteListener;
import com.huawei.hms.feature.tasks.listener.OnFeatureFailureListener;
import com.huawei.hms.feature.utils.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class RemoteApkInstallerFacade extends com.huawei.hms.feature.d.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f50494p = "LocalApk-RemoteApkInstallerFacade";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private FeatureInstallManager f50495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.huawei.hms.feature.e f50496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private InstallStateListener f50497s = new a();

    public class a implements InstallStateListener {
        public a() {
        }

        @Override // com.huawei.hms.feature.listener.InstallStateListener
        public void onStateUpdate(InstallState installState) {
            try {
                RemoteApkInstallerFacade.this.f50496r.a(InstallState.makeRemoteStateUpdateIntent(installState));
            } catch (RemoteException unused) {
                Logger.e(RemoteApkInstallerFacade.f50494p, "makeRemoteStateUpdateIntent failed.");
            }
        }
    }

    public class b extends OnFeatureCompleteListener<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IDynamicCoreCallback f50499a;

        public b(IDynamicCoreCallback iDynamicCoreCallback) {
            this.f50499a = iDynamicCoreCallback;
        }

        @Override // com.huawei.hms.feature.tasks.listener.OnFeatureCompleteListener
        public void onComplete(FeatureTask<Integer> featureTask) {
            try {
                if (featureTask.isSuccessful()) {
                    Logger.d(RemoteApkInstallerFacade.f50494p, "proxy:install success..");
                    this.f50499a.onInstallFeature(featureTask.getResult().intValue(), new Bundle());
                } else {
                    Logger.d(RemoteApkInstallerFacade.f50494p, "proxy:install failed..");
                    this.f50499a.onInstallFeature(-1, RemoteApkInstallerFacade.this.a(featureTask.getException()));
                }
            } catch (RemoteException unused) {
                Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager installFeature failed.");
            }
        }
    }

    public class c extends OnFeatureCompleteListener<InstallState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IDynamicCoreCallback f50501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50502b;

        public c(IDynamicCoreCallback iDynamicCoreCallback, int i10) {
            this.f50501a = iDynamicCoreCallback;
            this.f50502b = i10;
        }

        @Override // com.huawei.hms.feature.tasks.listener.OnFeatureCompleteListener
        public void onComplete(FeatureTask<InstallState> featureTask) {
            try {
                if (featureTask.isSuccessful()) {
                    this.f50501a.onGetInstallState(this.f50502b, com.huawei.hms.feature.remote.d.a(featureTask.getResult()));
                } else {
                    this.f50501a.onGetInstallState(-1, RemoteApkInstallerFacade.this.a(featureTask.getException()));
                    Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager getInstallState error.");
                }
            } catch (RemoteException unused) {
                Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager getInstallState exception....no callback.");
            }
        }
    }

    public class d extends OnFeatureCompleteListener<List<InstallState>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IDynamicCoreCallback f50504a;

        public d(IDynamicCoreCallback iDynamicCoreCallback) {
            this.f50504a = iDynamicCoreCallback;
        }

        @Override // com.huawei.hms.feature.tasks.listener.OnFeatureCompleteListener
        public void onComplete(FeatureTask<List<InstallState>> featureTask) {
            try {
                this.f50504a.onGetAllInstallStates(com.huawei.hms.feature.remote.d.a(featureTask.getResult()));
            } catch (RemoteException unused) {
                Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager getAllInstallStates exception....no callback.");
            }
        }
    }

    public class e extends OnFeatureFailureListener<List<InstallState>> {
        public e() {
        }

        @Override // com.huawei.hms.feature.tasks.listener.OnFeatureFailureListener
        public void onFailure(Exception exc) {
            Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager getAllInstallStates error.");
        }
    }

    public class f extends OnFeatureCompleteListener<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IDynamicCoreCallback f50507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50508b;

        public f(IDynamicCoreCallback iDynamicCoreCallback, int i10) {
            this.f50507a = iDynamicCoreCallback;
            this.f50508b = i10;
        }

        @Override // com.huawei.hms.feature.tasks.listener.OnFeatureCompleteListener
        public void onComplete(FeatureTask<Void> featureTask) {
            try {
                if (featureTask.isSuccessful()) {
                    this.f50507a.onAbortInstallFeature(this.f50508b, new Bundle());
                } else {
                    this.f50507a.onAbortInstallFeature(this.f50508b, RemoteApkInstallerFacade.this.a(featureTask.getException()));
                    Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager abortInstallFeature error.");
                }
            } catch (RemoteException unused) {
                Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager abortInstallFeature exception....no callback");
            }
        }
    }

    public class g extends OnFeatureCompleteListener<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IDynamicCoreCallback f50510a;

        public g(IDynamicCoreCallback iDynamicCoreCallback) {
            this.f50510a = iDynamicCoreCallback;
        }

        @Override // com.huawei.hms.feature.tasks.listener.OnFeatureCompleteListener
        public void onComplete(FeatureTask<Void> featureTask) {
            try {
                if (featureTask.isSuccessful()) {
                    this.f50510a.onDelayedInstallFeature(new Bundle());
                } else {
                    this.f50510a.onDelayedInstallFeature(RemoteApkInstallerFacade.this.a(featureTask.getException()));
                    Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager delayedInstallFeature error.");
                }
            } catch (RemoteException unused) {
                Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager delayedInstallFeature exception....no callback.");
            }
        }
    }

    public class h extends OnFeatureCompleteListener<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IDynamicCoreCallback f50512a;

        public h(IDynamicCoreCallback iDynamicCoreCallback) {
            this.f50512a = iDynamicCoreCallback;
        }

        @Override // com.huawei.hms.feature.tasks.listener.OnFeatureCompleteListener
        public void onComplete(FeatureTask<Void> featureTask) {
            try {
                if (featureTask.isSuccessful()) {
                    this.f50512a.onDelayedUninstallFeature(new Bundle());
                } else {
                    this.f50512a.onDelayedUninstallFeature(RemoteApkInstallerFacade.this.a(featureTask.getException()));
                    Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager delayedUninstallFeature error.");
                }
            } catch (RemoteException unused) {
                Logger.e(RemoteApkInstallerFacade.f50494p, "mInstallManager delayedUninstallFeature exception....no callback.");
            }
        }
    }

    @Override // com.huawei.hms.feature.d
    public void abortInstallFeature(int i10, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        this.f50495q.abortInstallFeature(i10).addOnListener(new f(iDynamicCoreCallback, i10));
    }

    @Override // com.huawei.hms.feature.d
    public void create(com.huawei.hms.feature.b bVar) throws RemoteException {
        Logger.d(f50494p, "RemoteApkInstallerFacade create");
        try {
            this.f50495q = FeatureInstallManagerFactory.create((Context) com.huawei.hms.feature.remote.b.b(bVar));
        } catch (Exception unused) {
            Logger.w(f50494p, "Create feature install impl strategy failed.");
        }
    }

    @Override // com.huawei.hms.feature.d
    public void delayedInstallFeature(List<String> list, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        this.f50495q.delayedInstallFeature(list).addOnListener(new g(iDynamicCoreCallback));
    }

    @Override // com.huawei.hms.feature.d
    public void delayedUninstallFeature(List<String> list, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        this.f50495q.delayedUninstallFeature(list).addOnListener(new h(iDynamicCoreCallback));
    }

    @Override // com.huawei.hms.feature.d
    public void getAllInstallStates(IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        FeatureTask<List<InstallState>> allInstallStates = this.f50495q.getAllInstallStates();
        allInstallStates.addOnListener(new d(iDynamicCoreCallback));
        allInstallStates.addOnListener(new e());
    }

    @Override // com.huawei.hms.feature.d
    public Map getAllInstalledModules() throws RemoteException {
        Set<String> allInstalledModules = this.f50495q.getAllInstalledModules();
        HashMap map = new HashMap();
        for (String str : allInstalledModules) {
            map.put(str, str);
        }
        return map;
    }

    @Override // com.huawei.hms.feature.d
    public void getInstallState(int i10, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        this.f50495q.getInstallState(i10).addOnListener(new c(iDynamicCoreCallback, i10));
    }

    @Override // com.huawei.hms.feature.d
    public void installFeature(Bundle bundle, IDynamicCoreCallback iDynamicCoreCallback) throws RemoteException {
        FeatureInstallRequest.Builder builderNewBuilder = FeatureInstallRequest.newBuilder();
        Iterator<String> it = com.huawei.hms.feature.remote.d.a(bundle).iterator();
        while (it.hasNext()) {
            builderNewBuilder.addModule(it.next());
        }
        this.f50495q.installFeature(builderNewBuilder.build()).addOnListener(new b(iDynamicCoreCallback));
    }

    @Override // com.huawei.hms.feature.d
    public void registerInstallListener(com.huawei.hms.feature.e eVar) throws RemoteException {
        this.f50496r = eVar;
        this.f50495q.registerInstallListener(this.f50497s);
    }

    @Override // com.huawei.hms.feature.d
    public boolean triggerUserConfirm(InstallState installState, com.huawei.hms.feature.b bVar, int i10) throws RemoteException {
        String str;
        String str2;
        if (com.huawei.hms.feature.remote.b.b(bVar) == null) {
            str = f50494p;
            str2 = "Null activity.";
        } else {
            try {
                return this.f50495q.triggerUserConfirm(installState, (Activity) com.huawei.hms.feature.remote.b.b(bVar), i10);
            } catch (IntentSender.SendIntentException unused) {
                str = f50494p;
                str2 = "mInstallManager delayedUninstallFeature exception....no callback.";
            }
        }
        Logger.e(str, str2);
        return false;
    }

    @Override // com.huawei.hms.feature.d
    public void unregisterInstallListener(com.huawei.hms.feature.e eVar) throws RemoteException {
        this.f50496r = null;
        this.f50495q.unregisterInstallListener(this.f50497s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle a(Exception exc) {
        int errorCode;
        Bundle bundle = new Bundle();
        if (!(exc instanceof FeatureInstallException)) {
            if ((exc instanceof RemoteException) || (exc instanceof RuntimeException)) {
                errorCode = -100;
            }
            return bundle;
        }
        errorCode = ((FeatureInstallException) exc).getErrorCode();
        bundle.putInt("error_code", errorCode);
        return bundle;
    }
}
