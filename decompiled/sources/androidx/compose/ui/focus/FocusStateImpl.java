package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FocusState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Landroidx/compose/ui/focus/FocusState;", "", "isFocused", "()Z", "getHasFocus", "hasFocus", "isCaptured", "Active", "ActiveParent", "Captured", "Inactive", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class FocusStateImpl implements FocusState {
    private static final /* synthetic */ FocusStateImpl[] $VALUES;
    public static final FocusStateImpl Active;
    public static final FocusStateImpl ActiveParent;
    public static final FocusStateImpl Captured;
    public static final FocusStateImpl Inactive;

    /* JADX INFO: compiled from: FocusState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        FocusStateImpl focusStateImpl = new FocusStateImpl("Active", 0);
        Active = focusStateImpl;
        FocusStateImpl focusStateImpl2 = new FocusStateImpl("ActiveParent", 1);
        ActiveParent = focusStateImpl2;
        FocusStateImpl focusStateImpl3 = new FocusStateImpl("Captured", 2);
        Captured = focusStateImpl3;
        FocusStateImpl focusStateImpl4 = new FocusStateImpl("Inactive", 3);
        Inactive = focusStateImpl4;
        $VALUES = new FocusStateImpl[]{focusStateImpl, focusStateImpl2, focusStateImpl3, focusStateImpl4};
    }

    public FocusStateImpl() {
        throw null;
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) $VALUES.clone();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean getHasFocus() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isCaptured() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public boolean isFocused() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
