package com.bbva.cells.componentkit;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/cells/componentkit/FlagState;", "", "Enable", "Disable", "Hide", "componentkit_release"}, k = 1, mv = {1, 6, 0})
public final class FlagState {
    private static final /* synthetic */ FlagState[] $VALUES;
    public static final FlagState Disable;
    public static final FlagState Enable;
    public static final FlagState Hide;

    static {
        FlagState flagState = new FlagState("Enable", 0);
        Enable = flagState;
        FlagState flagState2 = new FlagState("Disable", 1);
        Disable = flagState2;
        FlagState flagState3 = new FlagState("Hide", 2);
        Hide = flagState3;
        $VALUES = new FlagState[]{flagState, flagState2, flagState3};
    }

    public FlagState() {
        throw null;
    }

    public static FlagState valueOf(String str) {
        return (FlagState) Enum.valueOf(FlagState.class, str);
    }

    public static FlagState[] values() {
        return (FlagState[]) $VALUES.clone();
    }
}
