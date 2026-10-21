package com.bbva.cellscore.web.navigation.actions;

import android.app.Activity;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.navigation.Route;

/* JADX INFO: loaded from: classes2.dex */
public interface NavigationAction {
    void execute(Activity activity, CellsMessage cellsMessage, Route route);
}
