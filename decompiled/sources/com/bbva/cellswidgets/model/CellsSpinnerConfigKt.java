package com.bbva.cellswidgets.model;

import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CellsSpinnerConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cells-widgets_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsSpinnerConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsSpinnerConfig.kt\ncom/bbva/cellswidgets/model/CellsSpinnerConfigKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final class CellsSpinnerConfigKt {
    public static final PropertiesHelper.Property access$toProperty(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null) {
            return PropertiesHelper.Property.from((Map<String, String>) map);
        }
        return null;
    }
}
