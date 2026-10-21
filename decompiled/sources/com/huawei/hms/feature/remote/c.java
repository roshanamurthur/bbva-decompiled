package com.huawei.hms.feature.remote;

import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.dynamiccore.aidl.IDynamicCoreCallback;
import com.huawei.hms.feature.tasks.FeatureTaskHolder;

/* JADX INFO: loaded from: classes10.dex */
public class c<TResult> extends IDynamicCoreCallback.Stub {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final FeatureTaskHolder<TResult> f50553k;

    public c(FeatureTaskHolder<TResult> featureTaskHolder) {
        this.f50553k = featureTaskHolder;
    }

    public void onDelayedInstallFeature(Bundle bundle) throws RemoteException {
    }

    public void onDelayedUninstallFeature(Bundle bundle) throws RemoteException {
    }

    public void onGetAllInstallStates(Bundle bundle) throws RemoteException {
    }

    public void onAbortInstallFeature(int i10, Bundle bundle) throws RemoteException {
    }

    public void onGetInstallState(int i10, Bundle bundle) throws RemoteException {
    }

    public void onInstallFeature(int i10, Bundle bundle) throws RemoteException {
    }
}
