package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1mSDK {

    @Nullable
    public final AFf1ySDK AFInAppEventParameterName;

    @Nullable
    public final AFe1pSDK values;

    public AFe1mSDK() {
    }

    public AFe1mSDK(JSONObject jSONObject) {
        AFe1pSDK aFe1pSDK;
        AFf1ySDK aFf1ySDK = null;
        if (jSONObject.has("exc_mngr")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.getJSONArray("exc_mngr").optJSONObject(0).optJSONObject("data");
                Objects.requireNonNull(jSONObjectOptJSONObject);
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(ConfigConstantsKt.CUSTOMERS_API_VERSION);
                aFe1pSDK = new AFe1pSDK(jSONObjectOptJSONObject2.getString("sdk_ver"), jSONObjectOptJSONObject2.optInt("min", -1), jSONObjectOptJSONObject2.optInt("expire", -1), jSONObjectOptJSONObject2.optLong("ttl", -1L));
            } catch (NullPointerException | JSONException unused) {
                aFe1pSDK = null;
            }
        } else {
            aFe1pSDK = null;
        }
        if (jSONObject.has("meta_data")) {
            try {
                JSONObject jSONObjectOptJSONObject3 = jSONObject.getJSONArray("meta_data").optJSONObject(0).optJSONObject("data");
                Objects.requireNonNull(jSONObjectOptJSONObject3);
                aFf1ySDK = new AFf1ySDK(jSONObjectOptJSONObject3.optJSONObject(ConfigConstantsKt.CUSTOMERS_API_VERSION).optDouble("send_rate", 1.0d));
            } catch (NullPointerException | JSONException unused2) {
            }
        }
        this.values = aFe1pSDK;
        this.AFInAppEventParameterName = aFf1ySDK;
    }

    public static boolean AFInAppEventParameterName(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e5) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e5, true);
            return false;
        }
    }

    public final boolean equals(Object obj) {
        AFf1ySDK aFf1ySDK;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFe1mSDK.class == obj.getClass()) {
            AFe1mSDK aFe1mSDK = (AFe1mSDK) obj;
            AFe1pSDK aFe1pSDK = this.values;
            if (aFe1pSDK != null && aFe1pSDK.equals(aFe1mSDK.values) && (aFf1ySDK = this.AFInAppEventParameterName) != null && aFf1ySDK.equals(aFe1mSDK.AFInAppEventParameterName)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        AFe1pSDK aFe1pSDK = this.values;
        if (aFe1pSDK != null) {
            return aFe1pSDK.hashCode();
        }
        return 0;
    }
}
