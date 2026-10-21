package com.google.firebase.iid;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class ServiceStarter {
    public static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";

    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ServiceStarter f48426c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f48427a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f48428b = null;

    @KeepForSdk
    public static synchronized ServiceStarter getInstance() {
        try {
            if (f48426c == null) {
                f48426c = new ServiceStarter();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f48426c;
    }

    @VisibleForTesting
    public static void setForTesting(ServiceStarter serviceStarter) {
        f48426c = serviceStarter;
    }

    public final boolean a(Context context) {
        if (this.f48428b == null) {
            this.f48428b = Boolean.valueOf(context.checkCallingOrSelfPermission(MagiskApp.ACCESS_NETWORK_STATE) == 0);
        }
        this.f48427a.booleanValue();
        return this.f48428b.booleanValue();
    }

    public final boolean b(Context context) {
        if (this.f48427a == null) {
            this.f48427a = Boolean.valueOf(context.checkCallingOrSelfPermission(MagiskApp.WAKE_LOCK) == 0);
        }
        this.f48427a.booleanValue();
        return this.f48427a.booleanValue();
    }
}
