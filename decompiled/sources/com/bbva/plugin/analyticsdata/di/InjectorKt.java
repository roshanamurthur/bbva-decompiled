package com.bbva.plugin.analyticsdata.di;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.analyticsdata.command.response.AnalyticsDataErrors;
import com.bbva.plugin.analyticsdata.controller.Analytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000¨\u0006\u0007"}, d2 = {"withAnalytics", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "block", "Lkotlin/Function1;", "Lcom/bbva/plugin/analyticsdata/controller/Analytics;", "analyticsdata-plugin_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class InjectorKt {
    public static final void withAnalytics(@NotNull CommandCallback callback, @NotNull Function1<? super Analytics, Unit> block) {
        Unit unit;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(block, "block");
        Analytics analytics$analyticsdata_plugin_release = Injector.INSTANCE.getAnalytics$analyticsdata_plugin_release();
        if (analytics$analyticsdata_plugin_release == null) {
            unit = null;
        } else {
            try {
                block.invoke(analytics$analyticsdata_plugin_release);
            } catch (Exception unused) {
                callback.sendError(Errors.ErrorDefault);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            callback.sendError(AnalyticsDataErrors.ANALYTICS_DATA_NOT_INITIALIZED);
        }
    }
}
