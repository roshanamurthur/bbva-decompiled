package com.bbva.glomohybrid.infoscreen.biometric;

import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.glomohybrid.base.cells.DeepLinkScreenComponentReaction;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import kotlin.Metadata;
import u4.e;
import u4.f;

/* JADX INFO: compiled from: FriendlyFraudReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/biometric/FriendlyFraudReaction;", "Lcom/bbva/glomohybrid/base/cells/DeepLinkScreenComponentReaction;", "()V", "configure", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FriendlyFraudReaction extends DeepLinkScreenComponentReaction {
    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        super.configure();
        addPageComponent(new InfoScreenComponent(null, 1, null));
        whenever("biometry-friendly-fraud").doAction(InfoScreenActivity.INSTANCE.getACTION_POSITIVE_BUTTON()).then().inside("biometry-friendly-fraud", FriendlyFraudErrorActivity.class).doReaction(new e(1));
        whenever("biometry-friendly-fraud").doAction(FriendlyFraudErrorActivity.INSTANCE.getACTION_SCREEN_START()).then().inside(AnalyticsManager.ID, AnalyticsManager.class).doReaction(new f(2));
    }
}
