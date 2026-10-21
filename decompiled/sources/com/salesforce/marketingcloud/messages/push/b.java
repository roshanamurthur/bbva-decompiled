package com.salesforce.marketingcloud.messages.push;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.firebase.FirebaseApp;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f64800a = "com.google.android.c2dm.intent.RECEIVE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f64801b = "com.google.firebase.INSTANCE_ID_EVENT";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f64802c = "com.google.firebase.MESSAGING_EVENT";

    private b() {
    }

    private static ComponentInfo a(ResolveInfo resolveInfo) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        if (activityInfo != null) {
            return activityInfo;
        }
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            return serviceInfo;
        }
        return null;
    }

    private static JSONArray a(Context context) {
        JSONArray jSONArray = new JSONArray();
        try {
            List<FirebaseApp> apps = FirebaseApp.getApps(context);
            if (!apps.isEmpty()) {
                Iterator<FirebaseApp> it = apps.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toString());
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    private static JSONArray a(String str, List<ResolveInfo> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            for (ResolveInfo resolveInfo : list) {
                ComponentInfo componentInfoA = a(resolveInfo);
                if (componentInfoA != null && str.equals(componentInfoA.processName)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", componentInfoA.name);
                    jSONObject.put("priority", resolveInfo.priority);
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static JSONObject a(Context context, String str, String str2) throws JSONException {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        JSONObject jSONObject = new JSONObject();
        Object obj = str;
        if (str == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("senderId", obj);
        Object obj2 = str2;
        if (str2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("deviceToken", obj2);
        jSONObject.put("firebaseApps", a(context));
        jSONObject.put("c2dmReceiver", a(packageName, packageManager.queryBroadcastReceivers(new Intent(f64800a), 0)));
        jSONObject.put("instanceIdService", a(packageName, packageManager.queryIntentServices(new Intent(f64801b), 0)));
        jSONObject.put("messagingService", a(packageName, packageManager.queryIntentServices(new Intent("com.google.firebase.MESSAGING_EVENT"), 0)));
        return jSONObject;
    }
}
