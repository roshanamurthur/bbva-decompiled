package x0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,81:1\n728#2,2:82\n735#2,2:84\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n*L\n73#1:82,2\n77#1:84,2\n*E\n"})
public final class h extends Modifier.Node implements FocusRequesterModifierNode {

    @NotNull
    public FocusRequester H0;

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        this.H0.getFocusRequesterNodes$ui_release().add(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        this.H0.getFocusRequesterNodes$ui_release().remove(this);
        super.onDetach();
    }
}
