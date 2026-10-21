package com.noknok.android.uaf.framework.agent;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.uaf.AppFinder;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes11.dex */
public class UafAppSdkIntent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static UafAppSdkIntent f63552c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63553a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f63554b = null;

    private UafAppSdkIntent() {
    }

    private Outcome a(Activity activity, Intent intent) {
        Outcome outcome = Outcome.SUCCESS;
        int iNextInt = new Random().nextInt(32767) + 1;
        Logger.i("UafAppSdkIntent", "startUAFClientActivity with requestCode " + iNextInt);
        intent.setAction(AppFinder.INTENT_ACTION);
        intent.setType(AppFinder.MIME_TYPE_CLIENT);
        try {
            activity.startActivityForResult(intent, iNextInt);
            return outcome;
        } catch (ActivityNotFoundException e5) {
            Logger.w("UafAppSdkIntent", "Uaf client activity not found", e5);
            this.f63553a = null;
            return Outcome.NOT_INSTALLED;
        } catch (RuntimeException e7) {
            Logger.w("UafAppSdkIntent", "Failed to start uaf client activity", e7);
            this.f63553a = null;
            return Outcome.NOT_COMPATIBLE;
        }
    }

    public static UafAppSdkIntent instance() {
        if (f63552c == null) {
            f63552c = new UafAppSdkIntent();
        }
        return f63552c;
    }

    public void init(Context context) {
        this.f63554b = context;
    }

    public Outcome processUAFMessage(Activity activity, Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("ExplicitComponentName");
        if (componentName != null) {
            intent.setComponent(componentName);
            return a(activity, intent);
        }
        PackageManager packageManager = this.f63554b.getPackageManager();
        Intent intent2 = new Intent();
        intent2.setPackage(this.f63553a);
        AppSDKConfig appSDKConfig = AppSDKConfig.getInstance(this.f63554b);
        AppSDKConfig.Key key = AppSDKConfig.Key.customClient;
        if (appSDKConfig.get(key) == null || AppSDKConfig.getInstance(this.f63554b).get(key).getAsString() == null) {
            intent2.setType(AppFinder.MIME_TYPE_CLIENT);
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 64);
        if (listQueryIntentActivities.isEmpty() || this.f63553a == null) {
            return Outcome.NOT_INSTALLED;
        }
        intent.setComponent(new ComponentName(listQueryIntentActivities.get(0).activityInfo.applicationInfo.packageName, listQueryIntentActivities.get(0).activityInfo.name));
        return a(activity, intent);
    }

    public Outcome init(Context context, Handler handler, String str) {
        this.f63554b = context;
        if (context == null) {
            return Outcome.FAILURE;
        }
        this.f63553a = str;
        if (handler != null) {
            handler.sendEmptyMessage(0);
        }
        return Outcome.SUCCESS;
    }
}
