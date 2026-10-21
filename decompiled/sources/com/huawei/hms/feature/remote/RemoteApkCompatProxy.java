package com.huawei.hms.feature.remote;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.hms.feature.utils.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class RemoteApkCompatProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50488a = "RemoteApkCompatProxy";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.huawei.hms.feature.c f50489b;

    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean install(Context context) {
        com.huawei.hms.feature.c cVar;
        String str;
        String str2;
        if (f50489b != null) {
            cVar = f50489b;
            if (cVar != null) {
                return false;
            }
            try {
                cVar.install(b.a(context));
                Logger.i(f50488a, "mRemoteDynamicCompat install success.");
                return true;
            } catch (RemoteException unused) {
                str = f50488a;
                str2 = "mRemoteDynamicCompat install failed.";
            }
        } else {
            ClassLoader classLoaderRemoteClassLoader = RemoteFeatureManager.getInstance(context).remoteClassLoader();
            if (classLoaderRemoteClassLoader == null) {
                str = f50488a;
                str2 = "The remoteClassLoader is null.";
            } else {
                try {
                    f50489b = com.huawei.hms.feature.c.b.asInterface((IBinder) classLoaderRemoteClassLoader.loadClass("com.huawei.hms.feature.remote.RemoteApkCompatFacade").newInstance());
                    cVar = f50489b;
                    if (cVar != null) {
                        return false;
                    }
                    cVar.install(b.a(context));
                    Logger.i(f50488a, "mRemoteDynamicCompat install success.");
                    return true;
                } catch (Exception unused2) {
                    str = f50488a;
                    str2 = "Get mRemoteDynamicCompat failed.";
                }
            }
        }
        Logger.w(str, str2);
        return false;
    }
}
