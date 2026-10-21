package com.salesforce.marketingcloud.analytics.piwama;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
abstract class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f63951c = "api_key";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f63952d = "app_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f63953e = "app_name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f63954f = "user_info";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f63955g = "payload";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f63956h = "849f26e2-2df6-11e4-ab12-14109fdc48df";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<String, String> f63957i = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f63958j = "device";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f63959k = "details";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f63960l = "manufacturer";
    private static final String m = "device_id";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f63961n = "push_enabled";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f63962o = "location";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f63963p = "latitude";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f63964q = "longitude";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f63965r = "platform";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f63966s = "platform_version";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f63967t = "device_type";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f63968u = "email";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.salesforce.marketingcloud.storage.j f63969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final MarketingCloudConfig f63970b;

    public class a extends ArrayMap {
        public a() {
            put(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json; charset=utf-8");
            put("Connection", HearingDisabilitiesConstants.CLOSE_MODAL);
        }
    }

    public j(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar) {
        this.f63970b = marketingCloudConfig;
        this.f63969a = jVar;
    }

    @NonNull
    @WorkerThread
    public com.salesforce.marketingcloud.http.b a(@NonNull RegistrationManager registrationManager, @NonNull PushMessageManager pushMessageManager, @NonNull RegionMessageManager regionMessageManager, @NonNull List<com.salesforce.marketingcloud.analytics.b> list) {
        return com.salesforce.marketingcloud.http.a.f64255i.a(this.f63970b, this.f63969a.c(), b(), a(a(a(registrationManager, pushMessageManager, regionMessageManager, list.get(0).f())), list), f63957i);
    }

    @NonNull
    public abstract JSONObject a(@NonNull JSONObject jSONObject);

    @NonNull
    public abstract Object[] b();

    @VisibleForTesting
    public String a(JSONObject jSONObject, List<com.salesforce.marketingcloud.analytics.b> list) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        String string = "{}";
        if (jSONObjectOptJSONObject != null) {
            JSONArray jSONArray = new JSONArray();
            for (com.salesforce.marketingcloud.analytics.b bVar : list) {
                try {
                    if (bVar.e() != null) {
                        jSONArray.put(new JSONObject(bVar.e()));
                    }
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(i.m, e5, "Failed to add the PI AnalyticItem Event to the event list.", new Object[0]);
                }
            }
            if (jSONArray.length() > 0) {
                try {
                    jSONObjectOptJSONObject.put("events", jSONArray);
                    string = jSONObject.toString();
                } catch (Exception e7) {
                    com.salesforce.marketingcloud.g.b(i.m, e7, "Failed to add the PI AnalyticItem Events to the payload.", new Object[0]);
                }
                jSONObjectOptJSONObject.remove("events");
            }
        }
        return string;
    }

    @VisibleForTesting
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("manufacturer", Build.MANUFACTURER);
        jSONObject.put("platform", "Android");
        jSONObject.put("platform_version", Build.VERSION.RELEASE);
        jSONObject.put(f63967t, Build.MODEL);
        return jSONObject;
    }

    @Nullable
    @VisibleForTesting
    @WorkerThread
    public JSONObject a(@NonNull RegionMessageManager regionMessageManager) throws JSONException {
        LatLon latLonL;
        if ((!regionMessageManager.isGeofenceMessagingEnabled() && !regionMessageManager.isProximityMessagingEnabled()) || (latLonL = this.f63969a.r().l(this.f63969a.b())) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("latitude", latLonL.latitude());
        jSONObject.put("longitude", latLonL.longitude());
        return jSONObject;
    }

    @NonNull
    @VisibleForTesting
    public JSONObject a(@NonNull PushMessageManager pushMessageManager) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("push_enabled", pushMessageManager.isPushEnabled());
        return jSONObject;
    }

    @VisibleForTesting
    @WorkerThread
    public JSONObject a(@NonNull RegistrationManager registrationManager, @NonNull PushMessageManager pushMessageManager, @NonNull RegionMessageManager regionMessageManager, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", registrationManager.getDeviceId());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("email", str);
            }
            jSONObject.put("details", a(pushMessageManager));
            JSONObject jSONObjectA = a(regionMessageManager);
            if (jSONObjectA != null) {
                jSONObject.put("location", jSONObjectA);
            }
            jSONObject.put("device", a());
        } catch (JSONException e5) {
            com.salesforce.marketingcloud.g.b(i.m, e5, "Could not create User Info object.", new Object[0]);
        }
        return jSONObject;
    }
}
