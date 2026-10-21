package com.bbva.glomohybrid.infoscreen.maintenanceflowmeter;

import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import kotlin.Metadata;

/* JADX INFO: compiled from: MaintenanceFlowmeterReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/maintenanceflowmeter/MaintenanceFlowmeterReaction;", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "", "configure", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class MaintenanceFlowmeterReaction extends BaseReaction {
    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        super.configure();
        addComponent(new InfoScreenComponent(null, 1, null));
    }
}
