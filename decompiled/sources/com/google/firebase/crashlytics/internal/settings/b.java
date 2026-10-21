package com.google.firebase.crashlytics.internal.settings;

import bg.c;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SettingsV3JsonTransform.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {
    @Override // bg.c
    public final Settings a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        long currentTimeMillis;
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        Settings.SessionData sessionData = jSONObject.has("session") ? new Settings.SessionData(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4) : new Settings.SessionData(new JSONObject().optInt("max_custom_exception_events", 8), 4);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        Settings.FeatureFlagData featureFlagData = new Settings.FeatureFlagData(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = iOptInt2;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j10 * 1000) + currentTimeProvider.getCurrentTimeMillis();
        }
        return new Settings(currentTimeMillis, sessionData, featureFlagData, iOptInt, iOptInt2, dOptDouble, dOptDouble2, iOptInt3);
    }
}
