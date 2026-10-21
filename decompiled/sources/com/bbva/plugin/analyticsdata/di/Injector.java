package com.bbva.plugin.analyticsdata.di;

import android.content.Context;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.plugin.analyticsdata.AnalyticsSourceConfig;
import com.bbva.plugin.analyticsdata.controller.Analytics;
import com.bbva.plugin.analyticsdata.controller.AnalyticsController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/analyticsdata/di/Injector;", "", "Landroid/content/Context;", "context", "Lcom/bbva/plugin/analyticsdata/AnalyticsSourceConfig;", "configFile", "", "create", "Lcom/bbva/plugin/analyticsdata/controller/Analytics;", "a", "Lcom/bbva/plugin/analyticsdata/controller/Analytics;", "getAnalytics$analyticsdata_plugin_release", "()Lcom/bbva/plugin/analyticsdata/controller/Analytics;", "setAnalytics$analyticsdata_plugin_release", "(Lcom/bbva/plugin/analyticsdata/controller/Analytics;)V", LandingAEMContentMapper.ANALYTICS, "<init>", "()V", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1})
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Analytics analytics;

    public final void create(@NotNull Context context, @NotNull AnalyticsSourceConfig configFile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configFile, "configFile");
        analytics = new AnalyticsController(context, configFile);
    }

    @Nullable
    public final Analytics getAnalytics$analyticsdata_plugin_release() {
        return analytics;
    }

    public final void setAnalytics$analyticsdata_plugin_release(@Nullable Analytics analytics2) {
        analytics = analytics2;
    }
}
