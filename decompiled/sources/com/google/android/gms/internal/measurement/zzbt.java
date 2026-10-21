package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@TargetApi(24)
public final class zzbt {

    @Nullable
    private static final Method zza;

    @Nullable
    private static final Method zzb;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                declaredMethod = null;
            }
        } else {
            declaredMethod = null;
        }
        zza = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
            }
        }
        zzb = declaredMethod2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
        int iIntValue;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (zza == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        Method method = zzb;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        } else {
            iIntValue = 0;
        }
        Method method2 = zza;
        if (method2 != null) {
            try {
                Integer num2 = (Integer) method2.invoke(jobScheduler, jobInfo, "com.google.android.gms", Integer.valueOf(iIntValue), "UploadAlarm");
                if (num2 != null) {
                    return num2.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return jobScheduler.schedule(jobInfo);
    }
}
