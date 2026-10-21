package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public BreadcrumbHandler f47712p0;

    @NonNull
    public static String a(@NonNull Bundle bundle, @NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        BreadcrumbHandler breadcrumbHandler = this.f47712p0;
        if (breadcrumbHandler != null) {
            try {
                breadcrumbHandler.handleBreadcrumb("$A$:" + a(bundle, str));
            } catch (JSONException unused) {
                Logger.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(@Nullable BreadcrumbHandler breadcrumbHandler) {
        this.f47712p0 = breadcrumbHandler;
        Logger.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
