package com.huawei.secure.android.common.activity.protect;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes10.dex */
public class a implements IActivityProtect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50611a = "a";

    @SuppressLint({"PrivateApi"})
    private void a(IBinder iBinder) throws Exception {
        Object objInvoke = Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
        objInvoke.getClass().getDeclaredMethod("finishActivity", IBinder.class, Integer.TYPE, Intent.class).invoke(objInvoke, iBinder, 0, null);
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishLaunchActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f50611a, "finishLaunchActivity: ");
        try {
            Object obj = message.obj;
            Field declaredField = obj.getClass().getDeclaredField("token");
            declaredField.setAccessible(true);
            a((IBinder) declaredField.get(obj));
        } catch (Exception unused) {
            com.huawei.secure.android.common.activity.a.a(f50611a, "finishLaunchActivity exception ");
        }
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishPauseActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f50611a, "finishPauseActivity: ");
        try {
            a((IBinder) message.obj);
        } catch (Exception unused) {
            com.huawei.secure.android.common.activity.a.a(f50611a, "finishPauseActivity exception ");
        }
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishResumeActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f50611a, "finishResumeActivity: ");
        try {
            a((IBinder) message.obj);
        } catch (Exception unused) {
            com.huawei.secure.android.common.activity.a.a(f50611a, "finishResumeActivity exception ");
        }
    }

    @Override // com.huawei.secure.android.common.activity.protect.IActivityProtect
    public void finishStopActivity(Message message) {
        com.huawei.secure.android.common.activity.a.b(f50611a, "finishStopActivity: ");
        try {
            a((IBinder) message.obj);
        } catch (Exception unused) {
            com.huawei.secure.android.common.activity.a.a(f50611a, "finishStopActivity exception ");
        }
    }
}
