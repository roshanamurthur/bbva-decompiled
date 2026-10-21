package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1vSDK {

    @NonNull
    public final String AFInAppEventParameterName;

    @Nullable
    public final AFe1mSDK AFInAppEventType;
    private final boolean AFKeystoreWrapper;

    @NonNull
    public final AFf1xSDK valueOf;

    @NonNull
    public final String values;

    public AFf1vSDK(@NonNull String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.values = string;
            this.AFKeystoreWrapper = jSONObject.optBoolean("test_mode");
            this.AFInAppEventParameterName = str;
            this.valueOf = string.startsWith("default") ? AFf1xSDK.DEFAULT : AFf1xSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.AFInAppEventType = jSONObjectOptJSONObject != null ? new AFe1mSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e5) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e5);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFf1vSDK.class != obj.getClass()) {
            return false;
        }
        AFf1vSDK aFf1vSDK = (AFf1vSDK) obj;
        if (this.AFKeystoreWrapper == aFf1vSDK.AFKeystoreWrapper && this.values.equals(aFf1vSDK.values)) {
            return this.AFInAppEventParameterName.equals(aFf1vSDK.AFInAppEventParameterName);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.AFInAppEventParameterName.hashCode() + ((this.values.hashCode() + ((this.AFKeystoreWrapper ? 1 : 0) * 31)) * 31);
        AFe1mSDK aFe1mSDK = this.AFInAppEventType;
        return aFe1mSDK != null ? (iHashCode * 31) + aFe1mSDK.hashCode() : iHashCode;
    }
}
