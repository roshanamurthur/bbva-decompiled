package com.salesforce.marketingcloud.http;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.security.ProviderInstaller;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCService;
import com.salesforce.marketingcloud.f;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.util.j;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class c extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f64301j = "com.salesforce.marketingcloud.http.RESPONSE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f64302k = "http_response";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f64303l = "http_request";
    private static final int m = 10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f64304n = g.a("RequestManager");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f64307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SharedPreferences f64308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f64309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BroadcastReceiver f64310i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f64306e = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    final Map<com.salesforce.marketingcloud.http.a, InterfaceC0253c> f64305d = new ArrayMap();

    public class a extends LinkedHashMap<String, String> {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 10;
        }
    }

    public class b extends com.salesforce.marketingcloud.internal.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC0253c f64312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.http.b f64313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.salesforce.marketingcloud.http.d f64314d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, InterfaceC0253c interfaceC0253c, com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar) {
            super(str, objArr);
            this.f64312b = interfaceC0253c;
            this.f64313c = bVar;
            this.f64314d = dVar;
        }

        @Override // com.salesforce.marketingcloud.internal.g
        public void a() {
            this.f64312b.a(this.f64313c, this.f64314d);
        }
    }

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.http.c$c, reason: collision with other inner class name */
    public interface InterfaceC0253c {
        @WorkerThread
        void a(com.salesforce.marketingcloud.http.b bVar, com.salesforce.marketingcloud.http.d dVar);
    }

    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(c.f64304n, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(c.f64304n, "Received null action", new Object[0]);
                return;
            }
            if (!action.equals(c.f64301j)) {
                g.a(c.f64304n, "Received unknown action: %s", action);
                return;
            }
            com.salesforce.marketingcloud.http.b bVarA = com.salesforce.marketingcloud.http.b.a(intent.getBundleExtra(c.f64303l));
            com.salesforce.marketingcloud.http.d dVar = (com.salesforce.marketingcloud.http.d) intent.getParcelableExtra(c.f64302k);
            if (bVarA == null || dVar == null) {
                g.d(c.f64304n, "Received null request/response", new Object[0]);
            } else {
                c.this.a(bVarA, dVar);
            }
        }
    }

    public c(Context context, SharedPreferences sharedPreferences, l lVar) {
        this.f64307f = (Context) j.a(context, "Context is null");
        this.f64308g = (SharedPreferences) j.a(sharedPreferences, "SharedPreferences is null");
        this.f64309h = lVar;
    }

    private void a() throws Exception {
        ProviderInstaller.installIfNeeded(this.f64307f);
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "RequestManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() {
        return new JSONObject(this.f64306e);
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public final void tearDown(boolean z10) {
        synchronized (this.f64305d) {
            this.f64305d.clear();
        }
        Context context = this.f64307f;
        if (context == null || this.f64310i == null) {
            return;
        }
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f64310i);
    }

    @Override // com.salesforce.marketingcloud.f
    public final void a(@NonNull InitializationStatus.a aVar) {
        try {
            a();
        } catch (Exception e5) {
            aVar.e(true);
            aVar.a("Failed to install providers: " + e5.getMessage());
        }
        this.f64310i = new d();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f64301j);
        LocalBroadcastManager.getInstance(this.f64307f).registerReceiver(this.f64310i, intentFilter);
    }

    public void a(@NonNull com.salesforce.marketingcloud.http.a aVar) {
        synchronized (this.f64305d) {
            this.f64305d.remove(aVar);
        }
    }

    public void a(@NonNull com.salesforce.marketingcloud.http.a aVar, @NonNull InterfaceC0253c interfaceC0253c) {
        synchronized (this.f64305d) {
            try {
                if (this.f64305d.put(aVar, interfaceC0253c) != null) {
                    g.a(f64304n, "%s replaces previous listener for $s requests", interfaceC0253c.getClass().getName(), aVar.name());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void a(@NonNull com.salesforce.marketingcloud.http.b bVar) {
        j.a(bVar, "request is null");
        try {
            a();
        } catch (Exception unused) {
            g.e(f64304n, "Failed to verify SSL providers via Google Play Services.", new Object[0]);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC = bVar.p().c(this.f64308g);
        long jA = bVar.p().a(this.f64308g);
        if (jCurrentTimeMillis <= jC || jCurrentTimeMillis <= jA) {
            a(bVar, com.salesforce.marketingcloud.http.d.a("Too Many Requests", 429));
        } else {
            bVar.p().b(this.f64308g);
            MCService.a(this.f64307f, bVar);
        }
    }

    public void a(@NonNull com.salesforce.marketingcloud.http.b bVar, @NonNull com.salesforce.marketingcloud.http.d dVar) {
        com.salesforce.marketingcloud.http.a aVarP = bVar.p();
        g.d(f64304n, "%s request took %dms with code: %d", aVarP.name(), Long.valueOf(dVar.h()), Integer.valueOf(dVar.getCode()));
        aVarP.a(this.f64308g, dVar);
        try {
            this.f64306e.put(bVar.r(), String.format(Locale.ENGLISH, "%s - %d", dVar.getMessage(), Integer.valueOf(dVar.getCode())));
        } catch (Exception e5) {
            g.b(f64304n, e5, "Failed to record response.", new Object[0]);
        }
        synchronized (this.f64305d) {
            InterfaceC0253c interfaceC0253c = this.f64305d.get(aVarP);
            if (interfaceC0253c != null) {
                try {
                    this.f64309h.a().execute(new b("onResponse", new Object[0], interfaceC0253c, bVar, dVar));
                } catch (Exception e7) {
                    g.b(f64304n, e7, "Failed to deliver response.", new Object[0]);
                }
            } else {
                g.e(f64304n, "Request %s complete, but no listener was present to handle response %d.", bVar.r(), Integer.valueOf(dVar.getCode()));
            }
        }
    }
}
