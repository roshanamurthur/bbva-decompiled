package com.google.firebase.crashlytics.internal.settings;

import bg.c;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SettingsJsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrentTimeProvider f48310a;

    public SettingsJsonParser(SystemCurrentTimeProvider systemCurrentTimeProvider) {
        this.f48310a = systemCurrentTimeProvider;
    }

    public Settings parseSettingsJson(JSONObject jSONObject) throws JSONException {
        c bVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Logger.getLogger().e("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
            bVar = new a();
        } else {
            bVar = new b();
        }
        return bVar.a(this.f48310a, jSONObject);
    }
}
