package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WakeLockHolder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f48730a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f48731b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("WakeLockHolder.syncObject")
    public static WakeLock f48732c;

    public static void a(@NonNull Intent intent) {
        synchronized (f48731b) {
            try {
                if (f48732c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f48732c.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName b(@NonNull Context context, @NonNull Intent intent) {
        synchronized (f48731b) {
            try {
                if (f48732c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f48732c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f48732c.acquire(f48730a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
