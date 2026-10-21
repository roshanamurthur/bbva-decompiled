package com.bbva.cellswidgets;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CellsVisibility.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/cellswidgets/CellsVisibility;", "", "VISIBLE", "INVISIBLE", "GONE", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class CellsVisibility {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CellsVisibility[] $VALUES;
    public static final CellsVisibility GONE;
    public static final CellsVisibility INVISIBLE;
    public static final CellsVisibility VISIBLE;

    static {
        CellsVisibility cellsVisibility = new CellsVisibility("VISIBLE", 0);
        VISIBLE = cellsVisibility;
        CellsVisibility cellsVisibility2 = new CellsVisibility("INVISIBLE", 1);
        INVISIBLE = cellsVisibility2;
        CellsVisibility cellsVisibility3 = new CellsVisibility("GONE", 2);
        GONE = cellsVisibility3;
        CellsVisibility[] cellsVisibilityArr = {cellsVisibility, cellsVisibility2, cellsVisibility3};
        $VALUES = cellsVisibilityArr;
        $ENTRIES = EnumEntriesKt.enumEntries(cellsVisibilityArr);
    }

    public CellsVisibility() {
        throw null;
    }

    @NotNull
    public static EnumEntries<CellsVisibility> getEntries() {
        return $ENTRIES;
    }

    public static CellsVisibility valueOf(String str) {
        return (CellsVisibility) Enum.valueOf(CellsVisibility.class, str);
    }

    public static CellsVisibility[] values() {
        return (CellsVisibility[]) $VALUES.clone();
    }
}
