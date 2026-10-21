package com.noknok.android.client.appsdk.jsonapi;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.camera.core.processing.f;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppUtils;

/* JADX INFO: loaded from: classes11.dex */
public class App {

    @Expose
    public String displayName;

    @Expose
    public String id;

    @Expose
    public String name;

    @Expose
    public boolean qrSupported;

    private void a(Context context, String str) {
        this.id = AppUtils.computeFacetID(context, str, AppUtils.Algorithm.SHA1);
        PackageManager packageManager = context.getPackageManager();
        try {
            this.displayName = packageManager.getPackageInfo(str, 0).applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public App computeForCallingApp(ActivityProxy activityProxy) {
        String callingPackage = activityProxy.getCallingPackage();
        this.name = f.d("android:", callingPackage);
        a(activityProxy.getApplicationContext(), callingPackage);
        return this;
    }

    public App computeForThisApp(Context context) {
        String packageName = context.getPackageName();
        this.name = f.d("android:", packageName);
        a(context, packageName);
        return this;
    }

    public App setQrSupported(boolean z10) {
        this.qrSupported = z10;
        return this;
    }
}
