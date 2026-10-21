package x0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FocusChangedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Modifier.Node implements FocusEventModifierNode {

    @NotNull
    public Function1<? super FocusState, Unit> H0;

    @Nullable
    public FocusState I0;

    public a() {
        throw null;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (Intrinsics.areEqual(this.I0, focusState)) {
            return;
        }
        this.I0 = focusState;
        this.H0.invoke(focusState);
    }
}
