package com.google.firebase.crashlytics.internal.settings;

import bg.c;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONObject;

/* JADX INFO: compiled from: DefaultSettingsJsonTransform.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {
    public static Settings b(CurrentTimeProvider currentTimeProvider) {
        return new Settings(currentTimeProvider.getCurrentTimeMillis() + ((long) 3600000), new Settings.SessionData(8, 4), new Settings.FeatureFlagData(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // bg.c
    public final Settings a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) {
        return b(currentTimeProvider);
    }
}
