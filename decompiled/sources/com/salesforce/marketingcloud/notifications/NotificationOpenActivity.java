package com.salesforce.marketingcloud.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.room.RoomDatabase;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.util.l;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class NotificationOpenActivity extends FragmentActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f64805b = g.a("NotificationOpenActivity");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f64806a;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NotificationOpenActivity.this.a();
        }
    }

    @NonNull
    public static Intent a(@NonNull Context context, @NonNull Bundle bundle) {
        return new Intent(context, (Class<?>) NotificationOpenActivity.class).setAction(NotificationManager.ACTION_NOTIFICATION_CLICKED).putExtras(bundle).setFlags(8388608);
    }

    private void b(Context context, Bundle bundle) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(com.salesforce.marketingcloud.notifications.a.f64808n).putExtras(bundle));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            a();
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.salesforce.marketingcloud.notifications.a.f64809o);
        intentFilter.setPriority(RoomDatabase.MAX_BIND_PARAMETER_CNT);
        this.f64806a = new a();
        LocalBroadcastManager.getInstance(this).registerReceiver(this.f64806a, intentFilter);
        PowerManager.WakeLock wakeLockNewWakeLock = null;
        try {
            try {
                PowerManager powerManager = (PowerManager) getSystemService("power");
                String str = f64805b;
                wakeLockNewWakeLock = powerManager.newWakeLock(1, str);
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(TimeUnit.SECONDS.toMillis(30L));
                if (!l.a(500L, 50L) || MarketingCloudSdk.getInstance() == null) {
                    g.e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
                } else if (NotificationManager.ACTION_NOTIFICATION_CLICKED.equals(getIntent().getAction())) {
                    b(getApplicationContext(), getIntent().getExtras());
                }
                if (!wakeLockNewWakeLock.isHeld()) {
                    return;
                }
            } catch (Exception e5) {
                g.b(f64805b, e5, "Encountered exception while handling action: %s", getIntent().getAction());
                if (0 == 0 || !wakeLockNewWakeLock.isHeld()) {
                    return;
                }
            }
            try {
                wakeLockNewWakeLock.release();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            if (0 != 0 && wakeLockNewWakeLock.isHeld()) {
                try {
                    wakeLockNewWakeLock.release();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    public void a() {
        BroadcastReceiver broadcastReceiver = this.f64806a;
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
                g.e(f64805b, "com.salesforce.marketingcloud.notifications.open.RECEIVED Receiver is not registered.", new Object[0]);
            }
        }
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
