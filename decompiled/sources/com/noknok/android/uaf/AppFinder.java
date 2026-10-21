package com.noknok.android.uaf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.noknok.android.client.utils.AppSDKConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AppFinder {
    public static final String INTENT_ACTION = "org.fidoalliance.intent.FIDO_OPERATION";
    public static final String MIME_TYPE_ASM = "application/fido.uaf_asm+json";
    public static final String MIME_TYPE_CLIENT = "application/fido.uaf_client+json";
    public static final String SERVICE_ACTION = "org.fidoalliance.aidl.FIDO_OPERATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f63518b;

    public AppFinder(Context context, String str) {
        this.f63517a = context;
        this.f63518b = str;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private List<ResolveInfo> a(String str, String str2) {
        List<ResolveInfo> listQueryIntentActivities;
        Intent intent = new Intent();
        intent.setAction(str);
        if (str2 == null) {
            intent.setType(this.f63518b);
        } else {
            intent.setPackage(str2);
        }
        if (str.equals(SERVICE_ACTION)) {
            listQueryIntentActivities = this.f63517a.getPackageManager().queryIntentServices(intent, 64);
        } else {
            if (!str.equals(INTENT_ACTION)) {
                throw new IllegalArgumentException("unexpected action");
            }
            listQueryIntentActivities = this.f63517a.getPackageManager().queryIntentActivities(intent, 64);
        }
        return listQueryIntentActivities == null ? new ArrayList() : listQueryIntentActivities;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    public List<ResolveInfo> getIntentApps() {
        String asString;
        if (MIME_TYPE_CLIENT.equals(this.f63518b)) {
            AppSDKConfig appSDKConfig = AppSDKConfig.getInstance(this.f63517a);
            AppSDKConfig.Key key = AppSDKConfig.Key.customClient;
            if (appSDKConfig.get(key) != null) {
                asString = AppSDKConfig.getInstance(this.f63517a).get(key).getAsString();
            } else {
                asString = null;
            }
        } else {
            asString = null;
        }
        List<ResolveInfo> listA = a(INTENT_ACTION, asString);
        if (!listA.isEmpty()) {
            a(listA, false);
        }
        return listA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    public List<ResolveInfo> getServiceApps() {
        String asString;
        if (MIME_TYPE_CLIENT.equals(this.f63518b)) {
            AppSDKConfig appSDKConfig = AppSDKConfig.getInstance(this.f63517a);
            AppSDKConfig.Key key = AppSDKConfig.Key.customClient;
            if (appSDKConfig.get(key) != null) {
                asString = AppSDKConfig.getInstance(this.f63517a).get(key).getAsString();
            } else {
                asString = null;
            }
        } else {
            asString = null;
        }
        List<ResolveInfo> listA = a(SERVICE_ACTION, asString);
        if (!listA.isEmpty()) {
            a(listA, true);
        }
        return listA;
    }

    public void removeAidlApps(List<ResolveInfo> list) {
        Iterator<ResolveInfo> it = getServiceApps().iterator();
        while (it.hasNext()) {
            String str = it.next().serviceInfo.applicationInfo.packageName;
            Iterator<ResolveInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().activityInfo.applicationInfo.packageName.equals(str)) {
                    it2.remove();
                }
            }
        }
    }

    public void removeUserApps(List<ResolveInfo> list) {
        Iterator<ResolveInfo> it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo next = it.next();
            ActivityInfo activityInfo = next.activityInfo;
            if (((activityInfo != null ? activityInfo.applicationInfo : next.serviceInfo.applicationInfo).flags & 1) == 0) {
                it.remove();
            }
        }
    }

    private void a(List<ResolveInfo> list, boolean z10) {
        Iterator<ResolveInfo> it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo next = it.next();
            String str = z10 ? next.serviceInfo.packageName : next.activityInfo.packageName;
            if (str.startsWith("com.samsung.") || str.startsWith("com.sec.")) {
                it.remove();
            }
        }
    }
}
