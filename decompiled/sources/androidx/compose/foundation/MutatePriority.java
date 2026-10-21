package androidx.compose.foundation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/MutatePriority;", "", "Default", "UserInput", "PreventUserInput", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class MutatePriority {
    private static final /* synthetic */ MutatePriority[] $VALUES;
    public static final MutatePriority Default;
    public static final MutatePriority PreventUserInput;
    public static final MutatePriority UserInput;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        Default = mutatePriority;
        MutatePriority mutatePriority2 = new MutatePriority("UserInput", 1);
        UserInput = mutatePriority2;
        MutatePriority mutatePriority3 = new MutatePriority("PreventUserInput", 2);
        PreventUserInput = mutatePriority3;
        $VALUES = new MutatePriority[]{mutatePriority, mutatePriority2, mutatePriority3};
    }

    public MutatePriority() {
        throw null;
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) $VALUES.clone();
    }
}
