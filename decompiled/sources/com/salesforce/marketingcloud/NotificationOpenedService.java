package com.salesforce.marketingcloud;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.util.l;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class NotificationOpenedService extends IntentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63789a = g.a("NotificationOpenedService");

    public NotificationOpenedService() {
        super(f63789a);
    }

    private static void a(Context context, Bundle bundle) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(com.salesforce.marketingcloud.notifications.a.f64808n).putExtras(bundle));
    }

    @NonNull
    public static Intent b(@NonNull Context context, @NonNull Bundle bundle) {
        return new Intent(context, (Class<?>) NotificationOpenedService.class).setAction(NotificationManager.ACTION_NOTIFICATION_CLICKED).putExtras(bundle);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = null;
        try {
            try {
                PowerManager powerManager = (PowerManager) getSystemService("power");
                String str = f63789a;
                wakeLockNewWakeLock = powerManager.newWakeLock(1, str);
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(TimeUnit.SECONDS.toMillis(30L));
                if (!l.a(500L, 50L) || MarketingCloudSdk.getInstance() == null) {
                    g.e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
                } else if (NotificationManager.ACTION_NOTIFICATION_CLICKED.equals(intent.getAction())) {
                    a(getApplicationContext(), intent.getExtras());
                }
                if (!wakeLockNewWakeLock.isHeld()) {
                    return;
                }
            } catch (Throwable th2) {
                if (0 != 0 && wakeLockNewWakeLock.isHeld()) {
                    try {
                        wakeLockNewWakeLock.release();
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (Exception e5) {
            g.b(f63789a, e5, "Encountered exception while handling action: %s", intent.getAction());
            if (0 == 0 || !wakeLockNewWakeLock.isHeld()) {
                return;
            }
        }
        try {
            wakeLockNewWakeLock.release();
        } catch (Exception unused2) {
        }
    }
}
