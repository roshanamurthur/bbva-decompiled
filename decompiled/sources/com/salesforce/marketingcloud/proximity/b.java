package com.salesforce.marketingcloud.proximity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.util.h;
import com.salesforce.marketingcloud.util.j;
import java.util.List;
import java.util.Set;
import org.altbeacon.beacon.service.BeaconService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class b extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f64847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set<e.a> f64848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.salesforce.marketingcloud.proximity.a f64849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private BroadcastReceiver f64850l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f64851n;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(e.f64863h, "Received null intent.", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(e.f64863h, "Received null action", new Object[0]);
                return;
            }
            if (action.equals(e.f64859d)) {
                b.this.a((c) intent.getParcelableExtra(e.f64861f));
            } else if (action.equals(e.f64860e)) {
                b.this.b((c) intent.getParcelableExtra(e.f64861f));
            } else {
                g.a(e.f64863h, "Received unknown action: ", action);
            }
        }
    }

    public b(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        aVar.d(false);
        this.f64850l = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(e.f64859d);
        intentFilter.addAction(e.f64860e);
        LocalBroadcastManager.getInstance(this.f64847i).registerReceiver(this.f64850l, intentFilter);
    }

    @VisibleForTesting
    public void b(c cVar) {
        synchronized (this.f64848j) {
            try {
                this.f64851n++;
                if (cVar != null && !this.f64848j.isEmpty()) {
                    g.c(e.f64863h, "Exited %s", cVar);
                    for (e.a aVar : this.f64848j) {
                        if (aVar != null) {
                            aVar.a(cVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void c() {
        com.salesforce.marketingcloud.proximity.a aVar = this.f64849k;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public JSONObject componentState() {
        JSONObject jSONObjectA;
        try {
            jSONObjectA = e.a();
            try {
                jSONObjectA.put("enteredEvents", this.m);
                jSONObjectA.put("exitedEvents", this.f64851n);
            } catch (JSONException e5) {
                e = e5;
                g.b(e.f64863h, e, "Failed to create component state.", new Object[0]);
            }
        } catch (JSONException e7) {
            e = e7;
            jSONObjectA = null;
        }
        return jSONObjectA;
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        c();
        Context context = this.f64847i;
        if (context == null || this.f64850l == null) {
            return;
        }
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f64850l);
    }

    public b(@NonNull Context context, @Nullable ProximityNotificationCustomizationOptions proximityNotificationCustomizationOptions) throws IllegalStateException {
        this.f64848j = new ArraySet();
        j.a(context, "Context is null");
        this.f64847i = context;
        if (!h.b(context.getPackageManager(), new Intent(context, (Class<?>) BeaconService.class))) {
            throw new IllegalStateException("AltBeacon service not found");
        }
        this.f64849k = new com.salesforce.marketingcloud.proximity.a(context, proximityNotificationCustomizationOptions);
    }

    @VisibleForTesting
    public void a(c cVar) {
        synchronized (this.f64848j) {
            try {
                this.m++;
                if (cVar != null && !this.f64848j.isEmpty()) {
                    g.c(e.f64863h, "Entered %s", cVar);
                    for (e.a aVar : this.f64848j) {
                        if (aVar != null) {
                            aVar.b(cVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void b(@NonNull e.a aVar) {
        synchronized (this.f64848j) {
            this.f64848j.remove(aVar);
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void a(@NonNull e.a aVar) {
        synchronized (this.f64848j) {
            if (aVar != null) {
                try {
                    this.f64848j.add(aVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void b(List<c> list) {
        if (list != null) {
            g.c(e.f64863h, "unmonitorBeaconRegions(%d region)", Integer.valueOf(list.size()));
            this.f64849k.b(list);
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void a(List<c> list) {
        if (list != null) {
            g.c(e.f64863h, "monitorBeaconRegions(%d region)", Integer.valueOf(list.size()));
            this.f64849k.a(list);
        }
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public boolean b() {
        return true;
    }
}
