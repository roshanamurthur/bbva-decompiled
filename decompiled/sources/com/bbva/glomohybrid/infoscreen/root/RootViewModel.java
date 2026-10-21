package com.bbva.glomohybrid.infoscreen.root;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RootViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/root/RootViewModel;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenViewModel;", "()V", "sendAnalytics", "", "event", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "id", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RootViewModel extends InfoScreenViewModel {
    public final void sendAnalytics(@NotNull AnalyticsEvent event, @NotNull String id) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(id, "id");
        MessageDispatcher messageDispatcher = (MessageDispatcher) ComponentManager.get("web-dispatcher");
        if (messageDispatcher != null) {
            if (Intrinsics.areEqual(id, InfoScreenType.RootRestrictedScreen.INSTANCE.getId())) {
                event.putData(AnalyticsConstants.ROOTED_TYPE, AnalyticsConstants.RESTRICTIVE);
            } else {
                event.putData(AnalyticsConstants.ROOTED_TYPE, AnalyticsConstants.NON_RESTRICTIVE);
            }
            new AnalyticsManager(messageDispatcher).trackEvent(event);
        }
    }
}
