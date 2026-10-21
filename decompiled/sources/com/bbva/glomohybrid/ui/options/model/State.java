package com.bbva.glomohybrid.ui.options.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/model/State;", "", "SELECTED", "UNSELECTED", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class State {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ State[] $VALUES;
    public static final State SELECTED;
    public static final State UNSELECTED;

    static {
        State state = new State("SELECTED", 0);
        SELECTED = state;
        State state2 = new State("UNSELECTED", 1);
        UNSELECTED = state2;
        State[] stateArr = {state, state2};
        $VALUES = stateArr;
        $ENTRIES = EnumEntriesKt.enumEntries(stateArr);
    }

    public State() {
        throw null;
    }

    @NotNull
    public static EnumEntries<State> getEntries() {
        return $ENTRIES;
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) $VALUES.clone();
    }
}
