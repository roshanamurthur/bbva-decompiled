package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.play.core.splitinstall.internal.l;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f48436p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PowerManager.WakeLock f48437q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final FirebaseInstanceId f48438r0;

    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    @VisibleForTesting
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public b f48439a;

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            b bVar = this.f48439a;
            if (bVar == null) {
                return;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) bVar.a().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return;
            }
            com.google.firebase.iid.a aVar = FirebaseInstanceId.f48403j;
            b bVar2 = this.f48439a;
            bVar2.f48438r0.getClass();
            FirebaseInstanceId.d(bVar2, 0L);
            this.f48439a.a().unregisterReceiver(this);
            this.f48439a = null;
        }
    }

    @VisibleForTesting
    public b(FirebaseInstanceId firebaseInstanceId, long j10) {
        l.a();
        this.f48438r0 = firebaseInstanceId;
        this.f48436p0 = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f48437q0 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final Context a() {
        return this.f48438r0.f48407b.getApplicationContext();
    }

    @VisibleForTesting
    public final boolean b() throws IOException {
        FirebaseInstanceId firebaseInstanceId = this.f48438r0;
        if (!firebaseInstanceId.j(firebaseInstanceId.g(Metadata.getDefaultSenderId(firebaseInstanceId.f48407b), ProxyConfig.MATCH_ALL_SCHEMES))) {
            return true;
        }
        try {
            return firebaseInstanceId.getToken(Metadata.getDefaultSenderId(firebaseInstanceId.f48407b), ProxyConfig.MATCH_ALL_SCHEMES) != null;
        } catch (IOException e5) {
            String message = e5.getMessage();
            if (!GmsRpc.ERROR_SERVICE_NOT_AVAILABLE.equals(message) && !GmsRpc.ERROR_INTERNAL_SERVER_ERROR.equals(message) && !"InternalServerError".equals(message)) {
                if (e5.getMessage() != null) {
                    throw e5;
                }
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            String message2 = e5.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 52);
            sb2.append("Token retrieval failed: ");
            sb2.append(message2);
            sb2.append(". Will retry token retrieval");
            Log.w("FirebaseInstanceId", sb2.toString());
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public final void run() {
        FirebaseInstanceId firebaseInstanceId = this.f48438r0;
        boolean zB = ServiceStarter.getInstance().b(a());
        PowerManager.WakeLock wakeLock = this.f48437q0;
        if (zB) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseInstanceId) {
                    firebaseInstanceId.f48412g = true;
                }
                if (!firebaseInstanceId.isGmsCorePresent()) {
                    firebaseInstanceId.h(false);
                    if (ServiceStarter.getInstance().b(a())) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (ServiceStarter.getInstance().a(a())) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        a aVar = new a();
                        aVar.f48439a = this;
                        com.google.firebase.iid.a aVar2 = FirebaseInstanceId.f48403j;
                        aVar.f48439a.a().registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (ServiceStarter.getInstance().b(a())) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                }
                if (b()) {
                    firebaseInstanceId.h(false);
                } else {
                    firebaseInstanceId.i(this.f48436p0);
                }
                if (ServiceStarter.getInstance().b(a())) {
                    wakeLock.release();
                }
            } catch (IOException e5) {
                new StringBuilder(String.valueOf(e5.getMessage()).length() + 93);
                firebaseInstanceId.h(false);
                if (ServiceStarter.getInstance().b(a())) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th2) {
            if (ServiceStarter.getInstance().b(a())) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
