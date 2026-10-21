package com.bbva.cellswidgets.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CellsEditTextState.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/cellswidgets/model/CellsEditTextState;", "", "DEFAULT", "ERROR", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class CellsEditTextState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CellsEditTextState[] $VALUES;
    public static final CellsEditTextState DEFAULT;
    public static final CellsEditTextState ERROR;

    static {
        CellsEditTextState cellsEditTextState = new CellsEditTextState("DEFAULT", 0);
        DEFAULT = cellsEditTextState;
        CellsEditTextState cellsEditTextState2 = new CellsEditTextState("ERROR", 1);
        ERROR = cellsEditTextState2;
        CellsEditTextState[] cellsEditTextStateArr = {cellsEditTextState, cellsEditTextState2};
        $VALUES = cellsEditTextStateArr;
        $ENTRIES = EnumEntriesKt.enumEntries(cellsEditTextStateArr);
    }

    public CellsEditTextState() {
        throw null;
    }

    @NotNull
    public static EnumEntries<CellsEditTextState> getEntries() {
        return $ENTRIES;
    }

    public static CellsEditTextState valueOf(String str) {
        return (CellsEditTextState) Enum.valueOf(CellsEditTextState.class, str);
    }

    public static CellsEditTextState[] values() {
        return (CellsEditTextState[]) $VALUES.clone();
    }
}
