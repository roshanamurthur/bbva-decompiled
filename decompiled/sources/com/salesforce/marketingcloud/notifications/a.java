package com.salesforce.marketingcloud.notifications;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.e;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.h;
import com.salesforce.marketingcloud.storage.j;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a extends NotificationManager implements e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f64808n = "com.salesforce.marketingcloud.notifications.OPENED";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f64809o = "com.salesforce.marketingcloud.notifications.open.RECEIVED";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f64810p = "com.salesforce.marketingcloud.notifications.MESSAGE";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f64811q = "com.salesforce.marketingcloud.notifications.EXTRA_OPEN_INTENT";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f64812r = "com.salesforce.marketingcloud.notifications.EXTRA_AUTO_CANCEL";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f64813s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f64814t = "com.marketingcloud.salesforce.notifications.TAG";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @VisibleForTesting
    static final String f64815u = "com.marketingcloud.salesforce.notifications.ENABLED";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @VisibleForTesting
    static final String f64816v = "notification_id_key";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final com.salesforce.marketingcloud.notifications.b f64817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Context f64818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f64819h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.salesforce.marketingcloud.analytics.j f64821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private NotificationManager.ShouldShowNotificationListener f64822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BroadcastReceiver f64823l;
    private boolean m = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set<NotificationManager.NotificationMessageDisplayedListener> f64820i = new ArraySet();

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.notifications.a$a, reason: collision with other inner class name */
    public class C0265a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NotificationMessage f64824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f64825b;

        public C0265a(NotificationMessage notificationMessage, b bVar) {
            this.f64824a = notificationMessage;
            this.f64825b = bVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            int iNotificationId;
            a aVar = a.this;
            NotificationCompat.Builder builder = aVar.f64817f.setupNotificationBuilder(aVar.f64818g, this.f64824a);
            try {
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) a.this.f64818g.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.notify(a.f64814t, this.f64824a.notificationId(), builder.build());
                    a.this.a(this.f64824a);
                    iNotificationId = this.f64824a.notificationId();
                } else {
                    iNotificationId = -1;
                }
            } catch (Exception e5) {
                g.b(NotificationManager.f64803d, e5, "Unable to show notification due to an exception thrown by Android.", new Object[0]);
            }
            b bVar = this.f64825b;
            if (bVar != null) {
                bVar.a(iNotificationId);
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.a(NotificationManager.f64803d, "Received null intent", new Object[0]);
                return;
            }
            LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(a.f64809o));
            String action = intent.getAction();
            if (action == null) {
                g.a(NotificationManager.f64803d, "Received null action", new Object[0]);
            } else if (a.f64808n.equals(action)) {
                a.this.a(context, NotificationManager.extractMessage(intent), (PendingIntent) intent.getParcelableExtra(a.f64811q), intent.getBooleanExtra(a.f64812r, true));
            } else {
                g.a(NotificationManager.f64803d, "Received unknown action: %s", action);
            }
        }
    }

    @VisibleForTesting
    public a(Context context, j jVar, com.salesforce.marketingcloud.notifications.b bVar, com.salesforce.marketingcloud.analytics.j jVar2) {
        this.f64818g = context;
        this.f64819h = jVar;
        this.f64817f = bVar;
        this.f64821j = (com.salesforce.marketingcloud.analytics.j) com.salesforce.marketingcloud.util.j.a(jVar2, "MessageAnalyticEventListener is null.");
    }

    @SuppressLint({"LambdaLast"})
    public static a a(@NonNull Context context, @NonNull j jVar, @NonNull NotificationCustomizationOptions notificationCustomizationOptions, @NonNull com.salesforce.marketingcloud.analytics.j jVar2) {
        return new a(context, jVar, new com.salesforce.marketingcloud.notifications.b(notificationCustomizationOptions.smallIconResId, notificationCustomizationOptions.launchIntentProvider, notificationCustomizationOptions.notificationBuilder, notificationCustomizationOptions.channelIdProvider), jVar2);
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final synchronized boolean areNotificationsEnabled() {
        return this.m;
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "NotificationManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notificationsEnabled", areNotificationsEnabled());
            NotificationManager.ShouldShowNotificationListener shouldShowNotificationListener = this.f64822k;
            if (shouldShowNotificationListener != null) {
                jSONObject.put("shouldShowNotificationListener", shouldShowNotificationListener.getClass().getName());
            }
        } catch (JSONException e5) {
            g.b(NotificationManager.f64803d, e5, "Unable to create component state for %s", componentName());
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final synchronized void disableNotifications() {
        if (this.m) {
            this.m = false;
            a();
        }
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final synchronized void enableNotifications() {
        if (this.m) {
            return;
        }
        this.m = true;
        a();
    }

    @Override // com.salesforce.marketingcloud.e
    public final void init(@NonNull InitializationStatus.a aVar, int i10) {
        this.m = this.f64819h.f().getBoolean(f64815u, true);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f64808n);
        this.f64823l = new c();
        LocalBroadcastManager.getInstance(this.f64818g).registerReceiver(this.f64823l, intentFilter);
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final void registerNotificationMessageDisplayedListener(@NonNull NotificationManager.NotificationMessageDisplayedListener notificationMessageDisplayedListener) {
        if (notificationMessageDisplayedListener == null) {
            return;
        }
        synchronized (this.f64820i) {
            this.f64820i.add(notificationMessageDisplayedListener);
        }
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public void setShouldShowNotificationListener(@Nullable NotificationManager.ShouldShowNotificationListener shouldShowNotificationListener) {
        this.f64822k = shouldShowNotificationListener;
    }

    @Override // com.salesforce.marketingcloud.d
    public final void tearDown(boolean z10) {
        if (z10) {
            a(this.f64818g);
        }
        Context context = this.f64818g;
        if (context != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f64823l);
        }
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final void unregisterNotificationMessageDisplayedListener(@NonNull NotificationManager.NotificationMessageDisplayedListener notificationMessageDisplayedListener) {
        synchronized (this.f64820i) {
            this.f64820i.remove(notificationMessageDisplayedListener);
        }
    }

    private void a() {
        j jVar = this.f64819h;
        if (jVar != null) {
            jVar.f().edit().putBoolean(f64815u, this.m).apply();
        }
    }

    private void a(@NonNull Context context) {
        if (this.f64819h == null) {
            return;
        }
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        int i10 = this.f64819h.f().getInt(f64816v, -1);
        for (int i11 = 0; i10 >= 0 && i11 < 100; i11++) {
            notificationManagerCompatFrom.cancel(f64814t, i10);
            i10--;
        }
    }

    public void a(Context context, NotificationMessage notificationMessage, PendingIntent pendingIntent, boolean z10) {
        g.a(NotificationManager.f64803d, "Notification open Event Logged for id : (%s)", notificationMessage.id());
        this.f64821j.b(notificationMessage);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e5) {
                g.b(NotificationManager.f64803d, e5, "Failed to send notification's open action PendingIntent.", new Object[0]);
            }
        }
        if (z10) {
            NotificationManager.cancelNotificationMessage(context, notificationMessage);
        }
        if (Build.VERSION.SDK_INT <= 30) {
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(f64810p, notificationMessage);
        com.salesforce.marketingcloud.behaviors.c.a(context, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_NOTIFICATION_OPENED, bundle);
    }

    public void a(NotificationMessage notificationMessage) {
        synchronized (this.f64820i) {
            if (!this.f64820i.isEmpty()) {
                for (NotificationManager.NotificationMessageDisplayedListener notificationMessageDisplayedListener : this.f64820i) {
                    if (notificationMessageDisplayedListener != null) {
                        try {
                            notificationMessageDisplayedListener.onNotificationMessageDisplayed(notificationMessage);
                        } catch (Exception e5) {
                            g.b(NotificationManager.f64803d, e5, "%s threw an exception while processing notification message (%s)", notificationMessageDisplayedListener.getClass().getName(), notificationMessage.id());
                        }
                    }
                }
            }
        }
        try {
            this.f64821j.a(notificationMessage);
        } catch (Exception e7) {
            g.b(NotificationManager.f64803d, e7, "Failed to log analytics for message displayed.", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[Catch: all -> 0x001f, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:13:0x0024, B:15:0x002e, B:17:0x0039, B:20:0x003e, B:23:0x0046, B:26:0x004b, B:29:0x0050, B:34:0x0072, B:40:0x008b, B:42:0x00a8, B:37:0x0079, B:32:0x0056, B:43:0x00ac, B:45:0x00ca, B:46:0x00cf), top: B:55:0x0001, inners: #0, #1 }] */
    public synchronized void a(@NonNull NotificationMessage notificationMessage, @Nullable b bVar) {
        boolean zShouldShowNotification;
        if (!areNotificationsEnabled()) {
            g.a(NotificationManager.f64803d, "Notifications are not enabled.  Message %s will not be displayed", notificationMessage.id());
            if (bVar != null) {
                bVar.a(-1);
            }
            return;
        }
        if (TextUtils.getTrimmedLength(notificationMessage.alert()) == 0) {
            g.a(NotificationManager.f64803d, "Notifications with no alert message are not shown.", new Object[0]);
            if (bVar != null) {
                bVar.a(-1);
            }
            return;
        }
        if (notificationMessage.notificationId() >= 0) {
            if (bVar != null) {
                bVar.a(-1);
            }
            return;
        }
        NotificationManager.ShouldShowNotificationListener shouldShowNotificationListener = this.f64822k;
        if (shouldShowNotificationListener != null) {
            try {
                zShouldShowNotification = shouldShowNotificationListener.shouldShowNotification(notificationMessage);
            } catch (Exception e5) {
                g.b(NotificationManager.f64803d, e5, "%s threw an exception while processing shouldShowNotification() for messageId: %s", this.f64822k.getClass().getName(), notificationMessage.id());
                zShouldShowNotification = true;
            }
            try {
                this.f64821j.a(notificationMessage, zShouldShowNotification);
            } catch (Exception e7) {
                g.b(NotificationManager.f64803d, e7, "Failed to log Should Show Notification analytic for messageId: %s", notificationMessage.id());
            }
            if (zShouldShowNotification) {
                SharedPreferences sharedPreferencesF = this.f64819h.f();
                h.a(notificationMessage, sharedPreferencesF.getInt(f64816v, 0));
                sharedPreferencesF.edit().putInt(f64816v, notificationMessage.notificationId() < Integer.MAX_VALUE ? notificationMessage.notificationId() + 1 : 0).apply();
                new C0265a(notificationMessage, bVar).start();
            } else {
                g.a(NotificationManager.f64803d, "%s responded false to shouldShowNotification() for messageId: %s", this.f64822k.getClass().getName(), notificationMessage.id());
                if (bVar != null) {
                    bVar.a(-1);
                }
            }
        } else {
            SharedPreferences sharedPreferencesF2 = this.f64819h.f();
            h.a(notificationMessage, sharedPreferencesF2.getInt(f64816v, 0));
            sharedPreferencesF2.edit().putInt(f64816v, notificationMessage.notificationId() < Integer.MAX_VALUE ? notificationMessage.notificationId() + 1 : 0).apply();
            new C0265a(notificationMessage, bVar).start();
        }
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i10) {
    }
}
