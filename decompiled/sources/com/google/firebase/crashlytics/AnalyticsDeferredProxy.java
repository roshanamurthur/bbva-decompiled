package com.google.firebase.crashlytics;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.c;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import java.util.ArrayList;
import vf.a;

/* JADX INFO: loaded from: classes10.dex */
public class AnalyticsDeferredProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred<AnalyticsConnector> f47686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AnalyticsEventLogger f47687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile BreadcrumbSource f47688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    public final ArrayList f47689d;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new a(this);
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new rb.a(this);
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, @NonNull BreadcrumbSource breadcrumbSource, @NonNull AnalyticsEventLogger analyticsEventLogger) {
        this.f47686a = deferred;
        this.f47688c = breadcrumbSource;
        this.f47689d = new ArrayList();
        this.f47687b = analyticsEventLogger;
        deferred.whenAvailable(new c(this));
    }
}
