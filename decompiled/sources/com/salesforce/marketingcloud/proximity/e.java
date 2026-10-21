package com.salesforce.marketingcloud.proximity;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.f;
import com.salesforce.marketingcloud.g;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public abstract class e extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64859d = "com.salesforce.marketingcloud.proximity.BEACON_REGION_ENTERED";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64860e = "com.salesforce.marketingcloud.proximity.BEACON_REGION_EXITED";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64861f = "beaconRegion";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f64862g = "ProximityManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f64863h = g.a(f64862g);

    public interface a {
        void a(@NonNull c cVar);

        void b(@NonNull c cVar);
    }

    public static e a(Context context, MarketingCloudConfig marketingCloudConfig) {
        String message;
        Boolean boolValueOf = Boolean.valueOf(a(context));
        Boolean bool = null;
        if (!boolValueOf.booleanValue()) {
            message = null;
        } else if (com.salesforce.marketingcloud.util.d.a()) {
            try {
                return new b(context, marketingCloudConfig.proximityNotificationCustomizationOptions());
            } catch (IllegalStateException e5) {
                message = e5.getMessage();
                g.b(f64863h, e5, "Unable to create real instance of %s", f64862g);
            }
        } else {
            Boolean bool2 = Boolean.FALSE;
            g.e(f64863h, "If you wish to use proximity messenger then you need to add the AltBeacon dependency.", new Object[0]);
            message = null;
            bool = bool2;
        }
        return new d(marketingCloudConfig.proximityEnabled(), a(marketingCloudConfig.proximityEnabled(), boolValueOf, bool, message));
    }

    public abstract void a(@NonNull a aVar);

    public abstract void a(List<c> list);

    public abstract void b(@NonNull a aVar);

    public abstract void b(List<c> list);

    public boolean b() {
        return false;
    }

    public abstract void c();

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return f64862g;
    }

    public static JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, true);
        return jSONObject;
    }

    private static JSONObject a(JSONObject jSONObject, boolean z10) throws JSONException {
        jSONObject.put("proximityEnabled", z10);
        return jSONObject;
    }

    public static JSONObject a(boolean z10, Boolean bool, Boolean bool2, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = a(jSONObject, z10);
            jSONObject.put("hardwareAvailable", bool);
            jSONObject.put("libraryDeclared", bool2);
            if (str != null) {
                jSONObject.put("serviceMissing", str);
            }
        } catch (JSONException e5) {
            g.b(f64863h, e5, "Error creating fake ProximityManager state.", new Object[0]);
        }
        return jSONObject;
    }

    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }
}
