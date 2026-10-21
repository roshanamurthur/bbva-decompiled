package com.salesforce.marketingcloud.alarms;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCReceiver;
import com.salesforce.marketingcloud.f;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.l;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class b extends f implements com.salesforce.marketingcloud.behaviors.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f63824j = "com.salesforce.marketingcloud.ACTION_ALARM_WAKE_EVENT";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f63825k = "com.salesforce.marketingcloud.WAKE_FOR_ALARM";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f63826l = "pending_alarms";
    static final String m = g.a("AlarmScheduler");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f63827n = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<com.salesforce.marketingcloud.alarms.a.b, InterfaceC0239b> f63828d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.salesforce.marketingcloud.behaviors.c f63829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    BroadcastReceiver f63830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f63831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j f63832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private SharedPreferences f63833i;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63834a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f63834a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63834a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.alarms.b$b, reason: collision with other inner class name */
    public interface InterfaceC0239b {
        void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar);
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(b.m, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(b.m, "Received null action", new Object[0]);
                return;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                g.d(b.m, "Intent had no extras", new Object[0]);
                return;
            }
            if (!action.equals(b.f63824j)) {
                g.a(b.m, "Received unknown action: %s", action);
                return;
            }
            String string = extras.getString("com.salesforce.marketingcloud.WAKE_FOR_ALARM", null);
            if (string != null) {
                g.d(b.m, "ACTION_ALARM_WAKE_EVENT had extra: %s", string);
                try {
                    b.this.a(com.salesforce.marketingcloud.alarms.a.b.valueOf(string));
                } catch (IllegalArgumentException unused) {
                    g.e(b.m, "Woke for an unknown alarm: %s", string);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public b(@NonNull Context context, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar) {
        this.f63831g = context;
        this.f63832h = jVar;
        this.f63829e = (com.salesforce.marketingcloud.behaviors.c) com.salesforce.marketingcloud.util.j.a(cVar, "BehaviorManager is null");
        this.f63833i = jVar.f();
    }

    @NonNull
    private static PendingIntent a(@NonNull Context context, @Nullable String str, @NonNull Integer num) {
        return PendingIntent.getBroadcast(context, num.intValue(), MCReceiver.a(context, str), l.a(134217728));
    }

    @VisibleForTesting
    public final long b(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        long j10 = this.f63833i.getLong(bVar.b().c(), 0L);
        long jD = j10 == 0 ? bVar.b().d() : (long) (bVar.b().e() * j10);
        if (jD <= bVar.b().f()) {
            return jD;
        }
        long jF = bVar.b().f();
        g.a(m, "%s MAX INTERVAL exceeded. Setting interval to %s milliseconds.", bVar.name(), Long.valueOf(jF));
        return jF;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void c(@NonNull @Size(min = 1) com.salesforce.marketingcloud.alarms.a.b... bVarArr) {
        for (com.salesforce.marketingcloud.alarms.a.b bVar : bVarArr) {
            g.a(m, "Resetting %s Alarm Interval.", bVar.name());
            this.f63833i.edit().putLong(bVar.b().c(), 0L).apply();
        }
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "AlarmScheduler";
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            for (com.salesforce.marketingcloud.alarms.a.b bVar : com.salesforce.marketingcloud.alarms.a.b.values()) {
                if (a(bVar, jCurrentTimeMillis)) {
                    jSONObject2.put(bVar.name(), l.a(new Date(this.f63833i.getLong(bVar.b().a(), 0L) + this.f63833i.getLong(bVar.b().c(), 0L))));
                }
            }
            jSONObject.put(f63826l, jSONObject2);
        } catch (JSONException e5) {
            g.b(m, e5, "Failed to generate Component State JSONObject.", new Object[0]);
        }
        return jSONObject;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void d(@NonNull @Size(min = 1) com.salesforce.marketingcloud.alarms.a.b... bVarArr) {
        for (com.salesforce.marketingcloud.alarms.a.b bVar : bVarArr) {
            c(bVar);
            a(bVar);
            try {
                ((AlarmManager) this.f63831g.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(a(this.f63831g, bVar.name(), Integer.valueOf(bVar.b().b())));
                g.a(m, "Reset %s alarm.", bVar.name());
            } catch (Exception e5) {
                g.e(m, e5, "Could not cancel %s alarm.", bVar.name());
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void e(@NonNull com.salesforce.marketingcloud.alarms.a.b... bVarArr) {
        synchronized (this.f63828d) {
            try {
                for (com.salesforce.marketingcloud.alarms.a.b bVar : bVarArr) {
                    this.f63828d.remove(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public final void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        int i10 = a.f63834a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            a(bundle.getLong("timestamp"));
        }
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public final void tearDown(boolean z10) {
        if (z10) {
            d(com.salesforce.marketingcloud.alarms.a.b.values());
        }
        Context context = this.f63831g;
        if (context != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f63830f);
        }
        this.f63829e.a(this);
    }

    private void a(long j10) {
        for (com.salesforce.marketingcloud.alarms.a.b bVar : com.salesforce.marketingcloud.alarms.a.b.values()) {
            com.salesforce.marketingcloud.alarms.a aVarB = bVar.b();
            long j11 = this.f63833i.getLong(aVarB.a(), 0L);
            if (j11 > 0) {
                if (a(bVar, j10)) {
                    a(this.f63831g, bVar, this.f63833i.getLong(aVarB.c(), aVarB.d()), j11);
                } else {
                    a(bVar);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void b(@NonNull @Size(min = 1) com.salesforce.marketingcloud.alarms.a.b... bVarArr) {
        for (com.salesforce.marketingcloud.alarms.a.b bVar : bVarArr) {
            a(bVar, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar) {
        return bVar.b().g() && a(bVar, true);
    }

    @SuppressLint({"MissingPermission"})
    @VisibleForTesting
    public void a(@NonNull Context context, @NonNull com.salesforce.marketingcloud.alarms.a.b bVar, @IntRange(from = 0, to = 86400000) long j10, @IntRange(from = 0) long j11) {
        PendingIntent pendingIntentA = a(context, bVar.name(), Integer.valueOf(bVar.b().b()));
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        long j12 = j11 + j10;
        String strA = l.a(new Date(j12));
        try {
            if (Build.VERSION.SDK_INT < 31 || alarmManager.canScheduleExactAlarms()) {
                alarmManager.setExact(0, j12, pendingIntentA);
            } else {
                alarmManager.set(0, j12, pendingIntentA);
            }
            g.d(m, "%s Alarm scheduled to wake at %s.", bVar.name(), strA);
        } catch (Exception e5) {
            g.e(m, e5, "Failed to schedule alarm %s for %s", bVar.name(), strA);
        }
    }

    @Override // com.salesforce.marketingcloud.f
    public final void a(@NonNull InitializationStatus.a aVar) {
        this.f63829e.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED));
        this.f63830f = new c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f63824j);
        LocalBroadcastManager.getInstance(this.f63831g).registerReceiver(this.f63830f, intentFilter);
    }

    @VisibleForTesting
    public void a(com.salesforce.marketingcloud.alarms.a.b bVar) {
        a(bVar);
        InterfaceC0239b interfaceC0239b = this.f63828d.get(bVar);
        if (interfaceC0239b != null) {
            interfaceC0239b.a(bVar);
        }
    }

    private void a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar, @IntRange(from = 0) long j10, @IntRange(from = 0, to = 86400000) long j11) {
        g.a(m, "Setting the %s Alarm Flag ...", bVar.name());
        this.f63833i.edit().putLong(bVar.b().a(), j10).putLong(bVar.b().c(), j11).apply();
    }

    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(@NonNull InterfaceC0239b interfaceC0239b, @NonNull com.salesforce.marketingcloud.alarms.a.b... bVarArr) {
        synchronized (this.f63828d) {
            try {
                for (com.salesforce.marketingcloud.alarms.a.b bVar : bVarArr) {
                    this.f63828d.put(bVar, interfaceC0239b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public void a(@NonNull @Size(min = 1) com.salesforce.marketingcloud.alarms.a.b... bVarArr) {
        for (com.salesforce.marketingcloud.alarms.a.b bVar : bVarArr) {
            g.a(m, "Resetting %s Alarm Active Flag to FALSE", bVar.name());
            this.f63833i.edit().putLong(bVar.b().a(), 0L).apply();
        }
    }

    @VisibleForTesting
    public final boolean a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar, @IntRange(from = 0) long j10) {
        return this.f63833i.getLong(bVar.b().a(), 0L) > j10 - this.f63833i.getLong(bVar.b().c(), 0L);
    }

    private boolean a(@NonNull com.salesforce.marketingcloud.alarms.a.b bVar, boolean z10) {
        if (!bVar.a(this.f63832h)) {
            g.a(m, "shouldCreateAlarm() for %s Alarm was FALSE.  Aborting alarm creation.", bVar.name());
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jB = b(bVar);
        if (a(bVar, jCurrentTimeMillis)) {
            if (!z10) {
                g.a(m, "%s Send Pending ... will send at %s", bVar.name(), l.a(new Date(this.f63832h.f().getLong(bVar.b().a(), 0L) + jB)));
            }
            return false;
        }
        g.a(m, "No pending %s Alarm. Creating one ...", bVar.name());
        a(bVar, jCurrentTimeMillis, jB);
        a(this.f63831g, bVar, z10 ? 1000L : jB, jCurrentTimeMillis);
        return true;
    }
}
