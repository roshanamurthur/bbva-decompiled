package com.huawei.hms.feature.remote;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.hms.feature.utils.i;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class RemoteFeatureManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50542a = "RemoteFeatureManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50543b = "huawei_module_dynamicfeature";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50544c = "content://com.huawei.hms";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static RemoteFeatureManager f50545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f50546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ThreadPoolExecutor f50547f = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ClassLoader f50548g;

    public class a implements Callable<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f50549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f50550b;

        public a(Context context, String str) {
            this.f50549a = context;
            this.f50550b = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bundle call() {
            try {
                ContentResolver contentResolver = this.f50549a.getContentResolver();
                if (contentResolver == null) {
                    Logger.e(RemoteFeatureManager.f50542a, "Query remote module failed: null contentResolver.");
                    return null;
                }
                Bundle bundleCall = contentResolver.call(Uri.parse(RemoteFeatureManager.f50544c), this.f50550b, (String) null, (Bundle) null);
                if (bundleCall == null) {
                    Logger.e(RemoteFeatureManager.f50542a, "Failed to get bundle info: null.");
                    return null;
                }
                int i10 = bundleCall.getInt("errcode");
                Logger.d(RemoteFeatureManager.f50542a, "bundle info: errorCode:" + i10 + ", moduleName:" + this.f50550b + ", moduleVersion:" + bundleCall.getInt("module_version") + ", modulePath:" + i.a(bundleCall.getString("module_path"), "/", 2) + ", loader_version:" + bundleCall.getInt("loader_version") + ", loaderPath:" + i.a(bundleCall.getString("loader_path"), "/", 2));
                if (i10 == 0) {
                    Logger.i(RemoteFeatureManager.f50542a, "Query remote module:" + this.f50550b + " success.");
                    return bundleCall;
                }
                Logger.w(RemoteFeatureManager.f50542a, "Query module info error for " + this.f50550b + ", errcode:" + i10);
                return null;
            } catch (Exception unused) {
                Logger.w(RemoteFeatureManager.f50542a, "Query remote module:" + this.f50550b + " failed.");
                return null;
            }
        }
    }

    private RemoteFeatureManager() {
    }

    private static int b() {
        return TextUtils.equals("huawei_module_dynamicfeature", "huawei_module_dynamicfeature") ? 10018300 : 0;
    }

    public static synchronized RemoteFeatureManager getInstance(Context context) {
        try {
            if (f50545d == null) {
                RemoteFeatureManager remoteFeatureManager = new RemoteFeatureManager();
                f50545d = remoteFeatureManager;
                remoteFeatureManager.a(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f50545d;
    }

    public static Bundle queryRemoteVersionByProvider(Context context, String str) {
        a aVar = new a(context, str);
        Logger.i(f50542a, "begin to query for remote module:" + str + " asynchronously .");
        f50547f.allowCoreThreadTimeOut(true);
        try {
            return (Bundle) f50547f.submit(aVar).get(50L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
            Logger.w(f50542a, "Query remote module:" + str + " timed out.");
            return null;
        }
    }

    public boolean isRemoteExist() {
        return this.f50548g != null;
    }

    public boolean isRemoteVersionHigher(Context context) {
        if (this.f50548g != null && context != null) {
            return f50546e > b();
        }
        Logger.w(f50542a, "The remote dynamic feature doesn't exist.");
        return false;
    }

    public ClassLoader remoteClassLoader() {
        return this.f50548g;
    }

    private void a(Context context) {
        if (context == null) {
            Logger.w(f50542a, "context is null.");
            return;
        }
        try {
            Bundle bundleQueryRemoteVersionByProvider = queryRemoteVersionByProvider(context, "huawei_module_dynamicfeature");
            if (bundleQueryRemoteVersionByProvider == null) {
                Logger.w(f50542a, "Get moduleBundle null.");
                return;
            }
            f50546e = bundleQueryRemoteVersionByProvider.getInt("module_version");
            String str = f50542a;
            Logger.i(str, "remoteApk version:" + f50546e);
            String string = bundleQueryRemoteVersionByProvider.getString("module_path");
            if (string == null) {
                Logger.w(str, "remoteApkPath is null.");
                return;
            }
            Logger.i(str, "remoteApk:" + i.a(string, "/", 2));
            if (new File(string).exists()) {
                this.f50548g = new com.huawei.hms.feature.remote.a(string, com.huawei.hms.feature.utils.a.a(context, string, bundleQueryRemoteVersionByProvider.getInt("armeabiType")), ClassLoader.getSystemClassLoader());
            }
        } catch (Exception unused) {
            Logger.w(f50542a, "Query remote dynamic apk error.");
        }
    }
}
