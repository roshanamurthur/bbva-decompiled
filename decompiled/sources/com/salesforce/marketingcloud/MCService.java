package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.salesforce.marketingcloud.util.l;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MCService extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f63742k = "com.salesforce.marketingcloud.HTTP_REQUEST";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f63743l = "com.salesforce.marketingcloud.ALARM_WAKE";
    static final String m = "com.salesforce.marketingcloud.SYSTEM_BEHAVIOR";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f63744n = "com.salesforce.marketingcloud.TOKEN_REQUEST";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f63745o = "behavior";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f63746p = "data";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f63747q = "alarmName";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f63748r = "senderId";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f63749s = 3000;

    public class a implements OnCompleteListener<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f63750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f63751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f63752c;

        public a(String[] strArr, Context context, String str) {
            this.f63750a = strArr;
            this.f63751b = context;
            this.f63752c = str;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<String> task) {
            if (task.isSuccessful()) {
                this.f63750a[0] = task.getResult();
            }
            com.salesforce.marketingcloud.messages.push.a.a(this.f63751b, !TextUtils.isEmpty(this.f63750a[0]), this.f63752c, this.f63750a[0]);
        }
    }

    public static void a(@NonNull Context context, @NonNull com.salesforce.marketingcloud.behaviors.a aVar, @Nullable Bundle bundle) {
        g.d(c.f64074h, "enqueueSystemBehavior - %s", aVar);
        Bundle bundle2 = new Bundle();
        bundle2.putString(f63745o, aVar.f64059a);
        bundle2.putBundle("data", bundle);
        a(context, m, bundle2);
    }

    private static void b(Context context, com.salesforce.marketingcloud.behaviors.a aVar, Bundle bundle) {
        if (aVar == null) {
            g.d(c.f64074h, "Behavior was null", new Object[0]);
        } else {
            g.d(c.f64074h, "handleSystemBehavior - %s", aVar);
            com.salesforce.marketingcloud.behaviors.c.a(context, aVar, bundle);
        }
    }

    private static void c(Context context, String str) {
        if (str == null) {
            g.d(c.f64074h, "alarm name not provided", new Object[0]);
        } else {
            g.d(c.f64074h, "handleAlarmWakeup - %s", str);
            LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(com.salesforce.marketingcloud.alarms.b.f63824j).putExtra("com.salesforce.marketingcloud.WAKE_FOR_ALARM", str));
        }
    }

    @VisibleForTesting
    public static void d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            g.a(c.f64074h, "Unable to refresh system token.  SenderId was invalid", new Object[0]);
            return;
        }
        g.d(c.f64074h, "handleTokenRequest", new Object[0]);
        try {
            FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new a(new String[]{null}, context, str));
        } catch (Exception e5) {
            g.b(c.f64074h, e5, "Failed to retrieve InstanceId from Firebase.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.c, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(@NonNull Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.salesforce.marketingcloud.c, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.salesforce.marketingcloud.c, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.salesforce.marketingcloud.c, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }

    public static void a(@NonNull Context context, @NonNull com.salesforce.marketingcloud.http.b bVar) {
        g.d(c.f64074h, "handleHttpRequest - %s", bVar.r());
        a(context, f63742k, bVar.s());
    }

    @VisibleForTesting
    public static void b(Context context, com.salesforce.marketingcloud.http.b bVar) {
        if (bVar == null) {
            g.d(c.f64074h, "request was null", new Object[0]);
        } else {
            g.d(c.f64074h, "handleHttpRequest - %s", bVar.r());
            LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(com.salesforce.marketingcloud.http.c.f64301j).putExtra(com.salesforce.marketingcloud.http.c.f64303l, bVar.s()).putExtra(com.salesforce.marketingcloud.http.c.f64302k, a(context) ? bVar.j() : com.salesforce.marketingcloud.http.d.a("No connectivity", -1)));
        }
    }

    @Override // com.salesforce.marketingcloud.c
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // com.salesforce.marketingcloud.c
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    public static void a(@NonNull Context context, String str) {
        g.d(c.f64074h, "enqueueAlarmWake - %s", str);
        Bundle bundle = new Bundle();
        bundle.putString(f63747q, str);
        a(context, f63743l, bundle);
    }

    public static void b(@NonNull Context context, @NonNull String str) {
        g.d(c.f64074h, "enqueueTokenRequest", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putString(f63748r, str);
        a(context, f63744n, bundle);
    }

    private static void a(Context context, String str, Bundle bundle) {
        c.a(context, MCService.class, 3000, new Intent(str).putExtras(bundle));
    }

    @Override // com.salesforce.marketingcloud.c
    public /* bridge */ /* synthetic */ void b(boolean z10) {
        super.b(z10);
    }

    @Override // com.salesforce.marketingcloud.c
    public void a(@NonNull Intent intent) {
        String action = intent.getAction();
        if (action == null) {
        }
        Context applicationContext = getApplicationContext();
        if (!l.a(500L, 50L) || MarketingCloudSdk.getInstance() == null) {
            g.e(c.f64074h, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
            return;
        }
        switch (action) {
            case "com.salesforce.marketingcloud.ALARM_WAKE":
                c(applicationContext, intent.getStringExtra(f63747q));
                break;
            case "com.salesforce.marketingcloud.TOKEN_REQUEST":
                d(applicationContext, intent.getStringExtra(f63748r));
                break;
            case "com.salesforce.marketingcloud.HTTP_REQUEST":
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    b(applicationContext, com.salesforce.marketingcloud.http.b.a(extras));
                    break;
                }
                break;
            case "com.salesforce.marketingcloud.SYSTEM_BEHAVIOR":
                b(applicationContext, com.salesforce.marketingcloud.behaviors.a.a(intent.getStringExtra(f63745o)), intent.getBundleExtra("data"));
                break;
        }
    }

    private static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }
}
