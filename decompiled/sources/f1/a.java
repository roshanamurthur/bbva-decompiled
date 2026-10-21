package f1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RotaryInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Modifier.Node implements RotaryInputModifierNode {

    @Nullable
    public Function1<? super RotaryScrollEvent, Boolean> H0;

    @Nullable
    public Function1<? super RotaryScrollEvent, Boolean> I0;

    public a() {
        throw null;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public final boolean onPreRotaryScrollEvent(@NotNull RotaryScrollEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1<? super RotaryScrollEvent, Boolean> function1 = this.I0;
        if (function1 != null) {
            return function1.invoke(event).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public final boolean onRotaryScrollEvent(@NotNull RotaryScrollEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1<? super RotaryScrollEvent, Boolean> function1 = this.H0;
        if (function1 != null) {
            return function1.invoke(event).booleanValue();
        }
        return false;
    }
}
