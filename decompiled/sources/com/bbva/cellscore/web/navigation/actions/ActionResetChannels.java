package com.bbva.cellscore.web.navigation.actions;

import android.app.Activity;
import com.bbva.cellscore.pubsub.PubSubController;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.navigation.Route;

/* JADX INFO: loaded from: classes2.dex */
public class ActionResetChannels implements NavigationAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PubSubController f27193a;

    public ActionResetChannels(PubSubController pubSubController) {
        this.f27193a = pubSubController;
    }

    @Override // com.bbva.cellscore.web.navigation.actions.NavigationAction
    public void execute(Activity activity, CellsMessage cellsMessage, Route route) {
        this.f27193a.cleanAllChannels(false);
    }
}
