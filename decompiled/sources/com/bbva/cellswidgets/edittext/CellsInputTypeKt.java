package com.bbva.cellswidgets.edittext;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsInputType.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\f\u0010\u0005\u001a\u00020\u0002*\u0004\u0018\u00010\u0004¨\u0006\u0006"}, d2 = {"toAndroidInputType", "", "Lcom/bbva/cellswidgets/edittext/CellsInputType;", "mask", "", "toCellsInputType", "cells-widgets_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CellsInputTypeKt {
    public static final int toAndroidInputType(@Nullable CellsInputType cellsInputType, @Nullable String str) {
        CellsInputType.Companion companion = CellsInputType.INSTANCE;
        if (cellsInputType == null) {
            cellsInputType = CellsInputType.DEFAULT;
        }
        return companion.to(cellsInputType, str);
    }

    public static /* synthetic */ int toAndroidInputType$default(CellsInputType cellsInputType, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return toAndroidInputType(cellsInputType, str);
    }

    @NotNull
    public static final CellsInputType toCellsInputType(@Nullable String str) {
        return CellsInputType.INSTANCE.from(str);
    }
}
