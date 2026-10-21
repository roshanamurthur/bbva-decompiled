package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.f;
import androidx.work.Logger;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WakeLocks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24650a = Logger.tagWithPrefix("WakeLocks");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f24651b = new WeakHashMap<>();

    public static void checkWakeLocks() {
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f24651b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger.get().warning(f24650a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock newWakeLock(@NonNull Context context, @NonNull String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strD = f.d("WorkManager: ", str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strD);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f24651b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strD);
        }
        return wakeLockNewWakeLock;
    }
}
