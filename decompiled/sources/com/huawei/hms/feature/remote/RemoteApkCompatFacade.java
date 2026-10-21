package com.huawei.hms.feature.remote;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamicinstall.FeatureCompat;
import com.huawei.hms.feature.model.e;
import com.huawei.hms.feature.utils.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class RemoteApkCompatFacade extends com.huawei.hms.feature.c.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f50487f = "RemoteApkCompatFacade";

    @Override // com.huawei.hms.feature.c
    public void install(com.huawei.hms.feature.b bVar) throws RemoteException {
        Logger.d(e.f50486c, "RemoteApkCompatFacade install");
        try {
            FeatureCompat.install((Context) b.b(bVar));
        } catch (Exception unused) {
            Logger.e(f50487f, "RemoteApkCompatFacade install failed.");
        }
    }
}
