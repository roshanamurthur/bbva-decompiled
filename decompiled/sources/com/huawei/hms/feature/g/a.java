package com.huawei.hms.feature.g;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.dynamiccore.aidl.IDynamicCoreCallback;
import com.huawei.hms.feature.tasks.FeatureTaskHolder;

/* JADX INFO: loaded from: classes10.dex */
public class a<TResult> extends IDynamicCoreCallback.Stub {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final FeatureTaskHolder<TResult> f50281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f50282l;

    public a(b bVar, FeatureTaskHolder<TResult> featureTaskHolder) {
        this.f50282l = bVar;
        this.f50281k = featureTaskHolder;
    }

    @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
    public void onAbortInstallFeature(int i10, Bundle bundle) throws RemoteException {
        this.f50282l.e().b();
    }

    @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
    public void onDelayedInstallFeature(Bundle bundle) throws RemoteException {
        this.f50282l.e().b();
    }

    @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
    public void onDelayedUninstallFeature(Bundle bundle) throws RemoteException {
        this.f50282l.e().b();
    }

    @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
    public void onGetAllInstallStates(Bundle bundle) throws RemoteException {
        this.f50282l.e().b();
    }

    @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
    public void onGetInstallState(int i10, Bundle bundle) throws RemoteException {
        this.f50282l.e().b();
    }

    @Override // com.huawei.dynamiccore.aidl.IDynamicCoreCallback
    public void onInstallFeature(int i10, Bundle bundle) throws RemoteException {
        this.f50282l.e().b();
    }
}
