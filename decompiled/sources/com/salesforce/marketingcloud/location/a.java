package com.salesforce.marketingcloud.location;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
final class a extends f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JSONObject f64399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Boolean f64400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Exception f64401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f64402t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f64403u;

    public a(MarketingCloudConfig marketingCloudConfig, Boolean bool, boolean z10, Exception exc) {
        this.f64402t = marketingCloudConfig.geofencingEnabled();
        this.f64403u = marketingCloudConfig.proximityEnabled();
        this.f64400r = bool;
        this.f64401s = exc;
        this.f64399q = f.a(marketingCloudConfig, bool, z10, exc);
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        if (!this.f64402t && !this.f64403u) {
            aVar.b(false);
            return;
        }
        aVar.b(true);
        Exception exc = this.f64401s;
        if (exc == null) {
            Boolean bool = this.f64400r;
            if (bool == null || bool.booleanValue()) {
                return;
            }
            aVar.a(f.f64421e);
            return;
        }
        String message = exc.getMessage();
        if (message != null) {
            aVar.a(message);
        }
        Exception exc2 = this.f64401s;
        if (exc2 instanceof g) {
            aVar.a(((g) exc2).a());
        }
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void b() {
        com.salesforce.marketingcloud.g.e(f.f64424h, "LocationManager unavailable. unmonitorAllGeofences ignored", new Object[0]);
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() {
        return this.f64399q;
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void a(c cVar) {
        com.salesforce.marketingcloud.g.e(f.f64424h, "LocationManager unavailable. registerForGeofenceRegionEvents ignored", new Object[0]);
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void b(c cVar) {
        com.salesforce.marketingcloud.g.e(f.f64424h, "LocationManager unavailable. unregisterForGeofenceRegionEvents ignored", new Object[0]);
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void a(e eVar) {
        com.salesforce.marketingcloud.g.e(f.f64424h, "LocationManager unavailable. registerForLocationUpdate ignored", new Object[0]);
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void b(e eVar) {
        com.salesforce.marketingcloud.g.e(f.f64424h, "LocationManager unavailable. unregisterForLocationUpdate ignored", new Object[0]);
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void a(List<String> list) {
        com.salesforce.marketingcloud.g.e(f.f64424h, "LocationManager unavailable. unmonitorGeofences ignored", new Object[0]);
    }

    @Override // com.salesforce.marketingcloud.location.f
    public void a(b... bVarArr) {
        com.salesforce.marketingcloud.g.e(f.f64424h, "LocationManager unavailable. monitorGeofences ignored", new Object[0]);
    }
}
