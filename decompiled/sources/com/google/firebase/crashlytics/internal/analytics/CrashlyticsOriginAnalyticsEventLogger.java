package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* JADX INFO: loaded from: classes10.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final AnalyticsConnector f47713p0;

    public CrashlyticsOriginAnalyticsEventLogger(@NonNull AnalyticsConnector analyticsConnector) {
        this.f47713p0 = analyticsConnector;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String str, @Nullable Bundle bundle) {
        this.f47713p0.logEvent("clx", str, bundle);
    }
}
