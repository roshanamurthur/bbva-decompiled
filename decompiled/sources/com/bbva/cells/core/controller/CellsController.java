package com.bbva.cells.core.controller;

import com.bbva.cells.components.type.CellsComponent;
import com.bbva.cellscore.app.ComponentManager;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class CellsController {
    public void registerComponent(String str, CellsComponent cellsComponent) {
        ComponentManager.add(str, cellsComponent);
    }

    public void unregisterComponent(String str) {
        ComponentManager.remove(str);
    }
}
