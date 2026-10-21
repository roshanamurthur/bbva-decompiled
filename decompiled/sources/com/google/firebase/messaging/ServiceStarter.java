package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class ServiceStarter {

    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    public static final int SUCCESS = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ServiceStarter f48603e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public String f48604a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f48605b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f48606c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f48607d = new ArrayDeque();

    public static synchronized ServiceStarter a() {
        try {
            if (f48603e == null) {
                f48603e = new ServiceStarter();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f48603e;
    }

    @VisibleForTesting
    public static void setForTesting(ServiceStarter serviceStarter) {
        f48603e = serviceStarter;
    }

    public final boolean b(Context context) {
        if (this.f48606c == null) {
            this.f48606c = Boolean.valueOf(context.checkCallingOrSelfPermission(MagiskApp.ACCESS_NETWORK_STATE) == 0);
        }
        this.f48605b.booleanValue();
        return this.f48606c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f48605b == null) {
            this.f48605b = Boolean.valueOf(context.checkCallingOrSelfPermission(MagiskApp.WAKE_LOCK) == 0);
        }
        this.f48605b.booleanValue();
        return this.f48605b.booleanValue();
    }

    @MainThread
    public int startMessagingService(Context context, Intent intent) {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        this.f48607d.offer(intent);
        Intent intent2 = new Intent(com.google.firebase.iid.ServiceStarter.ACTION_MESSAGING_EVENT);
        intent2.setPackage(context.getPackageName());
        synchronized (this) {
            try {
                str = this.f48604a;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null || !context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                        str = null;
                    } else {
                        if (str2.startsWith(Constant.DOT_STRING)) {
                            this.f48604a = context.getPackageName() + serviceInfo.name;
                        } else {
                            this.f48604a = serviceInfo.name;
                        }
                        str = this.f48604a;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str != null) {
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if ((c(context) ? x.b(context, intent2) : context.startService(intent2)) == null) {
                return ResultCode.ERROR_REPO_CORRUPT;
            }
            return -1;
        } catch (IllegalStateException e5) {
            e5.toString();
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }
}
