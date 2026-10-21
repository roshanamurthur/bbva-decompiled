package com.bbva.glomohybrid.cellsweb.presentation.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ScreenState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/model/ScreenState;", "", "", "isVisible", "Visible", "Hidden", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ScreenState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenState[] $VALUES;
    public static final ScreenState Hidden;
    public static final ScreenState Visible;

    static {
        ScreenState screenState = new ScreenState("Visible", 0);
        Visible = screenState;
        ScreenState screenState2 = new ScreenState("Hidden", 1);
        Hidden = screenState2;
        ScreenState[] screenStateArr = {screenState, screenState2};
        $VALUES = screenStateArr;
        $ENTRIES = EnumEntriesKt.enumEntries(screenStateArr);
    }

    public ScreenState() {
        throw null;
    }

    @NotNull
    public static EnumEntries<ScreenState> getEntries() {
        return $ENTRIES;
    }

    public static ScreenState valueOf(String str) {
        return (ScreenState) Enum.valueOf(ScreenState.class, str);
    }

    public static ScreenState[] values() {
        return (ScreenState[]) $VALUES.clone();
    }

    public final boolean isVisible() {
        return this == Visible;
    }
}
