package com.bbva.component.dm.analytics;

import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.dispatcher.WebMessage;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnalyticsManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/analytics/AnalyticsManager;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "", "isDebug", "", "setDebugMode", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "analyticsEvent", "trackEvent", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Companion", "component-dm-analytics_release"}, k = 1, mv = {1, 9, 0})
public final class AnalyticsManager extends ReactiveComponent {

    @NotNull
    public static final String ID = "component-dm-analytics";

    @NotNull
    public static final String NATIVE_ANALYTIC_CHANNEL = "global_native_analytic";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final MessageDispatcher f27410p0;

    public AnalyticsManager(@NotNull MessageDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f27410p0 = dispatcher;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getK0() {
        return ID;
    }

    public final void setDebugMode(boolean isDebug) {
        if (isDebug) {
            MobileCore.setLogLevel(LoggingMode.VERBOSE);
        }
    }

    public final void trackEvent(@NotNull AnalyticsEvent analyticsEvent) {
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        this.f27410p0.sendMessage(new WebMessage(NATIVE_ANALYTIC_CHANNEL, analyticsEvent.convertToMap()));
        analyticsEvent.cleanData();
    }
}
