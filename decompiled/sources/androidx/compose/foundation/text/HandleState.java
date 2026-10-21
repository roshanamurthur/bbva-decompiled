package androidx.compose.foundation.text;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/HandleState;", "", "None", "Selection", "Cursor", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class HandleState {
    private static final /* synthetic */ HandleState[] $VALUES;
    public static final HandleState Cursor;
    public static final HandleState None;
    public static final HandleState Selection;

    static {
        HandleState handleState = new HandleState("None", 0);
        None = handleState;
        HandleState handleState2 = new HandleState("Selection", 1);
        Selection = handleState2;
        HandleState handleState3 = new HandleState("Cursor", 2);
        Cursor = handleState3;
        $VALUES = new HandleState[]{handleState, handleState2, handleState3};
    }

    public HandleState() {
        throw null;
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) $VALUES.clone();
    }
}
