package t;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode {
    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(@NotNull FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        focusProperties.setCanFocus(!InputMode.m3046equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalInputModeManager())).mo3052getInputModeaOaMEAU(), InputMode.INSTANCE.m3051getTouchaOaMEAU()));
    }
}
