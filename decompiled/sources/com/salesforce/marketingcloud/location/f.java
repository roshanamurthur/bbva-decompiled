package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class f extends com.salesforce.marketingcloud.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64420d = "NO_GPS_HARDWARE";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64421e = "RECEIVER_NOT_DECLARED_IN_MANIFEST";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f64422f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f64423g = "LocationManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f64424h = com.salesforce.marketingcloud.g.a(f64423g);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final String f64425i = "com.salesforce.marketingcloud.location.LOCATION_UPDATE";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final String f64426j = "com.salesforce.marketingcloud.location.GEOFENCE_ERROR";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final String f64427k = "com.salesforce.marketingcloud.location.GEOFENCE_EVENT";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final String f64428l = "extra_location";
    protected static final String m = "extra_transition";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f64429n = "extra_fence_ids";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final String f64430o = "extra_error_code";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected static final String f64431p = "extra_error_message";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Intent a(int i10, String str) {
        return new Intent(f64426j).putExtra(f64430o, i10).putExtra(f64431p, str);
    }

    public abstract void a(c cVar);

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public abstract void a(e eVar);

    public abstract void a(List<String> list);

    public abstract void a(b... bVarArr);

    public abstract void b();

    public abstract void b(c cVar);

    public abstract void b(e eVar);

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return f64423g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Intent a(int i10, @NonNull List<String> list, @Nullable Location location) {
        Intent intent = new Intent(f64427k);
        intent.putExtra(m, i10);
        if (list instanceof ArrayList) {
            intent.putStringArrayListExtra(f64429n, (ArrayList) list);
        } else {
            intent.putStringArrayListExtra(f64429n, new ArrayList<>(list));
        }
        if (location != null) {
            intent.putExtra(f64428l, location);
        }
        return intent;
    }

    public static Intent a(@NonNull Location location) {
        return new Intent(f64425i).putExtra(f64428l, location);
    }

    public static f a(Context context, MarketingCloudConfig marketingCloudConfig) {
        Exception exc;
        boolean zB = com.salesforce.marketingcloud.util.d.b();
        Boolean bool = null;
        Exception exc2 = null;
        if (zB) {
            Boolean boolValueOf = Boolean.valueOf(LocationReceiver.a(context));
            if (boolValueOf.booleanValue()) {
                try {
                    return new h(context, marketingCloudConfig);
                } catch (Exception e5) {
                    exc2 = e5;
                    com.salesforce.marketingcloud.g.b(f64424h, exc2, "Unable to create real instance of %s", f64423g);
                }
            }
            exc = exc2;
            bool = boolValueOf;
        } else {
            com.salesforce.marketingcloud.g.e(f64424h, "GooglePlayServices Location dependency missing from build.", new Object[0]);
            exc = null;
        }
        return new a(marketingCloudConfig, bool, zB, exc);
    }

    private static JSONObject a(MarketingCloudConfig marketingCloudConfig) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("geofencingEnabled", marketingCloudConfig.geofencingEnabled());
            jSONObject.put("proximityEnabled", marketingCloudConfig.proximityEnabled());
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64424h, e5, "Error creating LocationManager state.", new Object[0]);
        }
        return jSONObject;
    }

    public static JSONObject a(MarketingCloudConfig marketingCloudConfig, int i10, String str) {
        JSONObject jSONObjectA = a(marketingCloudConfig);
        try {
            jSONObjectA.put("apiCode", i10);
            jSONObjectA.put("apiMessage", str);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64424h, e5, "Error creating LocationManager state.", new Object[0]);
        }
        return jSONObjectA;
    }

    public static JSONObject a(MarketingCloudConfig marketingCloudConfig, Boolean bool, boolean z10, Exception exc) {
        JSONObject jSONObjectA = a(marketingCloudConfig);
        try {
            jSONObjectA.put("serviceAvailable", bool);
            jSONObjectA.put("gmsLocationDependencyAvailable", z10);
            if (exc != null) {
                jSONObjectA.put("exceptionMessage", exc.getMessage());
            }
        } catch (JSONException e5) {
            com.salesforce.marketingcloud.g.b(f64424h, e5, "Error creating LocationManager state.", new Object[0]);
        }
        return jSONObjectA;
    }

    public boolean a() {
        return false;
    }
}
