package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: TopicsSyncTask.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Object f48722u0 = new Object();

    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    public static Boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    public static Boolean f48723w0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f48724p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final l f48725q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PowerManager.WakeLock f48726r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final v f48727s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final long f48728t0;

    /* JADX INFO: compiled from: TopicsSyncTask.java */
    @VisibleForTesting
    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        @GuardedBy("this")
        public w f48729a;

        public a(w wVar, w wVar2) {
            this.f48729a = wVar2;
        }

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            w wVar = this.f48729a;
            if (wVar == null) {
                return;
            }
            if (wVar.c()) {
                Object obj = w.f48722u0;
                w wVar2 = this.f48729a;
                wVar2.f48727s0.f48719f.schedule(wVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f48729a = null;
            }
        }
    }

    public w(v vVar, Context context, l lVar, long j10) {
        this.f48727s0 = vVar;
        this.f48724p0 = context;
        this.f48728t0 = j10;
        this.f48725q0 = lVar;
        this.f48726r0 = ((PowerManager) context.getSystemService("power")).newWakeLock(1, Constants.FCM_WAKE_LOCK);
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (f48722u0) {
            try {
                Boolean bool = f48723w0;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission(MagiskApp.ACCESS_NETWORK_STATE) == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                f48723w0 = boolValueOf;
                zBooleanValue2 = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue2;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        synchronized (f48722u0) {
            try {
                Boolean bool = v0;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission(MagiskApp.WAKE_LOCK) == 0;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                v0 = boolValueOf;
                zBooleanValue2 = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue2;
    }

    public final synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f48724p0.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        v vVar = this.f48727s0;
        Context context = this.f48724p0;
        boolean zB = b(context);
        PowerManager.WakeLock wakeLock = this.f48726r0;
        if (zB) {
            wakeLock.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                synchronized (vVar) {
                    vVar.f48720g = true;
                }
                if (!this.f48725q0.e()) {
                    vVar.g(false);
                    if (b(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused) {
                            return;
                        }
                    }
                    return;
                }
                if (a(context) && !c()) {
                    context.registerReceiver(new a(this, this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (b(context)) {
                        try {
                            wakeLock.release();
                            return;
                        } catch (RuntimeException unused2) {
                            return;
                        }
                    }
                    return;
                }
                if (vVar.i()) {
                    vVar.g(false);
                } else {
                    vVar.j(this.f48728t0);
                }
                if (!b(context)) {
                    return;
                }
                try {
                    wakeLock.release();
                } catch (RuntimeException unused3) {
                }
            } catch (IOException e5) {
                e5.getMessage();
                vVar.g(false);
                if (!b(context)) {
                }
            }
        } catch (Throwable th2) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th2;
        }
    }
}
