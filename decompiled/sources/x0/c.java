package x0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusEventModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Modifier.Node implements FocusEventModifierNode {

    @NotNull
    public Function1<? super FocusState, Unit> H0;

    public c() {
        throw null;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        this.H0.invoke(focusState);
    }
}
