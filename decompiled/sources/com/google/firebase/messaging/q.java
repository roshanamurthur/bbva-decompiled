package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.iid.GmsRpc;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: SyncTask.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f48662p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PowerManager.WakeLock f48663q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final FirebaseMessaging f48664r0;

    /* JADX INFO: compiled from: SyncTask.java */
    @VisibleForTesting
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public q f48665a;

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            q qVar = this.f48665a;
            if (qVar != null && qVar.a()) {
                q qVar2 = this.f48665a;
                qVar2.f48664r0.getClass();
                FirebaseMessaging.b(qVar2, 0L);
                this.f48665a.f48664r0.f48553d.unregisterReceiver(this);
                this.f48665a = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public q(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f48664r0 = firebaseMessaging;
        this.f48662p0 = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f48553d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f48663q0 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f48664r0.f48553d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public final boolean b() throws IOException {
        try {
            return this.f48664r0.a() != null;
        } catch (IOException e5) {
            String message = e5.getMessage();
            if (!GmsRpc.ERROR_SERVICE_NOT_AVAILABLE.equals(message) && !GmsRpc.ERROR_INTERNAL_SERVER_ERROR.equals(message) && !"InternalServerError".equals(message)) {
                if (e5.getMessage() != null) {
                    throw e5;
                }
                Log.w(Constants.TAG, "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w(Constants.TAG, "Token retrieval failed: " + e5.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w(Constants.TAG, "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public final void run() {
        ServiceStarter serviceStarterA = ServiceStarter.a();
        FirebaseMessaging firebaseMessaging = this.f48664r0;
        boolean zC = serviceStarterA.c(firebaseMessaging.f48553d);
        PowerManager.WakeLock wakeLock = this.f48663q0;
        if (zC) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.m = true;
                }
                if (!firebaseMessaging.f48561l.e()) {
                    firebaseMessaging.g(false);
                    if (ServiceStarter.a().c(firebaseMessaging.f48553d)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (!ServiceStarter.a().b(firebaseMessaging.f48553d) || a()) {
                    if (b()) {
                        firebaseMessaging.g(false);
                    } else {
                        firebaseMessaging.i(this.f48662p0);
                    }
                    if (!ServiceStarter.a().c(firebaseMessaging.f48553d)) {
                        return;
                    }
                    wakeLock.release();
                    return;
                }
                a aVar = new a();
                aVar.f48665a = this;
                aVar.f48665a.f48664r0.f48553d.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (ServiceStarter.a().c(firebaseMessaging.f48553d)) {
                    wakeLock.release();
                }
            } catch (IOException e5) {
                e5.getMessage();
                firebaseMessaging.g(false);
                if (!ServiceStarter.a().c(firebaseMessaging.f48553d)) {
                }
            }
        } catch (Throwable th2) {
            if (ServiceStarter.a().c(firebaseMessaging.f48553d)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
