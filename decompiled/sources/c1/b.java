package c1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KeyInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Modifier.Node implements KeyInputModifierNode {

    @Nullable
    public Function1<? super KeyEvent, Boolean> H0;

    @Nullable
    public Function1<? super KeyEvent, Boolean> I0;

    public b() {
        throw null;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
    public final boolean mo114onKeyEventZmokQxo(@NotNull android.view.KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1<? super KeyEvent, Boolean> function1 = this.H0;
        if (function1 != null) {
            return function1.invoke(KeyEvent.m3349boximpl(event)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
    public final boolean mo116onPreKeyEventZmokQxo(@NotNull android.view.KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1<? super KeyEvent, Boolean> function1 = this.I0;
        if (function1 != null) {
            return function1.invoke(KeyEvent.m3349boximpl(event)).booleanValue();
        }
        return false;
    }
}
