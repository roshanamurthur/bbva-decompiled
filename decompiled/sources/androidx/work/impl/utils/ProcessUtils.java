package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Logger;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ProcessUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24623a = Logger.tagWithPrefix("ProcessUtils");

    @Nullable
    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    public static String getProcessName(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, ProcessUtils.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th2) {
            Logger.get().debug(f24623a, "Unable to check ActivityThread for processName", th2);
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    public static boolean isDefaultProcess(@NonNull Context context, @NonNull Configuration configuration) {
        String processName = getProcessName(context);
        return !TextUtils.isEmpty(configuration.getDefaultProcessName()) ? TextUtils.equals(processName, configuration.getDefaultProcessName()) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
