package com.huawei.hms.feature.remote;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.huawei.hms.feature.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class RemoteApkConnector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50490a = "RemoteApkConnector";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Handler> f50491b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.huawei.hms.feature.d f50493d;

    public RemoteApkConnector(Context context, String str) {
        this.f50492c = str;
        ClassLoader classLoaderRemoteClassLoader = RemoteFeatureManager.getInstance(context).remoteClassLoader();
        if (classLoaderRemoteClassLoader == null) {
            Logger.w(f50490a, "The remoteClassLoader is null.");
            return;
        }
        try {
            com.huawei.hms.feature.d dVarAsInterface = com.huawei.hms.feature.d.b.asInterface((IBinder) classLoaderRemoteClassLoader.loadClass("com.huawei.hms.feature.remote.RemoteApkInstallerFacade").newInstance());
            this.f50493d = dVarAsInterface;
            dVarAsInterface.create(b.a(context));
        } catch (Exception unused) {
            Logger.w(f50490a, "Get mRemoteDynamicInstall failed.");
        }
    }

    private Handler a() {
        Handler handler;
        Map<String, Handler> map = f50491b;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f50492c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f50492c, 10);
                    handlerThread.start();
                    map.put(this.f50492c, new Handler(handlerThread.getLooper()));
                }
                handler = map.get(this.f50492c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void doRequest(Runnable runnable) {
        a().post(runnable);
    }

    public com.huawei.hms.feature.d getBinderInterface() {
        return this.f50493d;
    }
}
