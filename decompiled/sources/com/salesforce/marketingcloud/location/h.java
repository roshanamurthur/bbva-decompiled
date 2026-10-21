package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class h extends f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final d f64433q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Set<e> f64434r = new ArraySet();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Set<c> f64435s = new ArraySet();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MarketingCloudConfig f64436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f64437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f64438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f64439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f64440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Context f64441y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BroadcastReceiver f64442z;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                com.salesforce.marketingcloud.g.d(f.f64424h, "Received null intent", new Object[0]);
            }
            String action = intent.getAction();
            if (action == null) {
                com.salesforce.marketingcloud.g.d(f.f64424h, "Received null action", new Object[0]);
                return;
            }
            switch (action) {
                case "com.salesforce.marketingcloud.location.LOCATION_UPDATE":
                    com.salesforce.marketingcloud.g.a(f.f64424h, "Received location update.", new Object[0]);
                    h.this.b((Location) intent.getParcelableExtra("extra_location"));
                    break;
                case "com.salesforce.marketingcloud.location.GEOFENCE_ERROR":
                    int intExtra = intent.getIntExtra("extra_error_code", -1);
                    String stringExtra = intent.getStringExtra("extra_error_message");
                    if (intExtra != -1 && stringExtra != null) {
                        h.this.b(intExtra, stringExtra);
                        break;
                    }
                    break;
                case "com.salesforce.marketingcloud.location.GEOFENCE_EVENT":
                    int intExtra2 = intent.getIntExtra("extra_transition", -1);
                    if (intExtra2 != -1) {
                        com.salesforce.marketingcloud.g.a(f.f64424h, "Received geofence transition %d", Integer.valueOf(intExtra2));
                        h.this.b(intExtra2, intent.getStringArrayListExtra("extra_fence_ids"), (Location) intent.getParcelableExtra("extra_location"));
                        break;
                    }
                    break;
                default:
                    com.salesforce.marketingcloud.g.a(f.f64424h, "Received unknown action: %s", action);
                    break;
            }
        }
    }

    public h(@NonNull Context context, MarketingCloudConfig marketingCloudConfig) throws IllegalStateException {
        this.f64441y = context;
        this.f64433q = new d(context);
        this.f64436t = marketingCloudConfig;
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        this.f64442z = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.salesforce.marketingcloud.location.LOCATION_UPDATE");
        intentFilter.addAction("com.salesforce.marketingcloud.location.GEOFENCE_EVENT");
        intentFilter.addAction("com.salesforce.marketingcloud.location.GEOFENCE_ERROR");
        LocalBroadcastManager.getInstance(this.f64441y).registerReceiver(this.f64442z, intentFilter);
        aVar.a(this.f64433q.c());
        aVar.a(this.f64433q.b());
        aVar.b(!this.f64433q.d());
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void b() {
        this.f64433q.a();
    }

    @Override // com.salesforce.marketingcloud.d
    public JSONObject componentState() {
        JSONObject jSONObjectA = f.a(this.f64436t, this.f64433q.c(), this.f64433q.b());
        try {
            jSONObjectA.put("locationRequests", this.f64437u);
            jSONObjectA.put("locationsReceived", this.f64438v);
            jSONObjectA.put("lastLocationRequester", this.f64439w);
            jSONObjectA.put("geofenceEvents", this.f64440x);
        } catch (JSONException e5) {
            com.salesforce.marketingcloud.g.b(f.f64424h, e5, "Error creating state for RealLocationManager.", new Object[0]);
        }
        return jSONObjectA;
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public void tearDown(boolean z10) {
        d dVar = this.f64433q;
        if (dVar != null && z10) {
            dVar.a();
        }
        Context context = this.f64441y;
        if (context == null || this.f64442z == null) {
            return;
        }
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f64442z);
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public h(Context context, d dVar) {
        this.f64441y = context;
        this.f64433q = dVar;
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void a(@NonNull c cVar) {
        com.salesforce.marketingcloud.g.d(f.f64424h, "registerForGeofenceRegionEvents(%s)", cVar.getClass().getName());
        synchronized (this.f64435s) {
            this.f64435s.add(cVar);
        }
    }

    @VisibleForTesting
    public void b(int i10, String str) {
        synchronized (this.f64435s) {
            try {
                if (!this.f64435s.isEmpty()) {
                    for (c cVar : this.f64435s) {
                        if (cVar != null) {
                            cVar.a(i10, str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    @SuppressLint({"MissingPermission"})
    public void a(@NonNull e eVar) {
        boolean z10;
        if (eVar == null) {
            return;
        }
        synchronized (this.f64434r) {
            try {
                z10 = this.f64434r.add(eVar) && this.f64434r.size() == 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f64437u++;
            this.f64439w = eVar.getClass().getName();
            this.f64433q.e();
        }
    }

    @VisibleForTesting
    public void b(int i10, @NonNull List<String> list, @Nullable Location location) {
        String str = f.f64424h;
        com.salesforce.marketingcloud.g.d(str, "onGeofenceRegionEvent", new Object[0]);
        if (list == null || list.isEmpty()) {
            com.salesforce.marketingcloud.g.c(str, "No fenceIds were provided.", new Object[0]);
            return;
        }
        this.f64440x++;
        synchronized (this.f64435s) {
            try {
                if (this.f64435s.isEmpty()) {
                    com.salesforce.marketingcloud.g.c(str, "Geofence region event occured with no one listening.", new Object[0]);
                } else {
                    for (c cVar : this.f64435s) {
                        if (cVar != null) {
                            for (String str2 : list) {
                                com.salesforce.marketingcloud.g.a(f.f64424h, "Notifiying %s of geofence [%s] region event [d]", cVar.getClass().getName(), str2, Integer.valueOf(i10));
                                cVar.a(str2, i10, location);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void a(List<String> list) {
        if (list == null || list.size() == 0) {
            com.salesforce.marketingcloud.g.c(f.f64424h, "unmonitorGeofences - No geofenceRegionIds provided.", new Object[0]);
        } else {
            this.f64433q.a(list);
        }
    }

    @VisibleForTesting
    public void b(Location location) {
        if (location == null) {
            return;
        }
        this.f64438v++;
        synchronized (this.f64434r) {
            try {
                if (!this.f64434r.isEmpty()) {
                    for (e eVar : this.f64434r) {
                        if (eVar != null) {
                            eVar.a(location);
                        }
                    }
                    this.f64434r.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public void a(b... bVarArr) {
        if (bVarArr == null || bVarArr.length == 0) {
            com.salesforce.marketingcloud.g.a(f.f64424h, "monitorGeofences - No geofenceRegions provided.", new Object[0]);
        } else {
            com.salesforce.marketingcloud.g.d(f.f64424h, "Monitoring %s fence(s).", Integer.valueOf(bVarArr.length));
            this.f64433q.a(bVarArr);
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void b(@NonNull c cVar) {
        if (cVar != null) {
            synchronized (this.f64435s) {
                this.f64435s.remove(cVar);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    public boolean a() {
        return this.f64433q.d();
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void b(@NonNull e eVar) {
        synchronized (this.f64434r) {
            this.f64434r.remove(eVar);
        }
    }
}
