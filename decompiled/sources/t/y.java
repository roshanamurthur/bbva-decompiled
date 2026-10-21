package t;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y extends Modifier.Node implements SemanticsModifierNode, FocusRequesterModifierNode {
    public boolean H0;

    /* JADX INFO: compiled from: Focusable.kt */
    public static final class a extends Lambda implements Function0<Boolean> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(FocusRequesterModifierNodeKt.requestFocus(y.this));
        }
    }

    public y() {
        new SemanticsConfiguration();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.H0);
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new a(), 1, null);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldClearDescendantSemantics */
    public final /* synthetic */ boolean getIsClearingSemantics() {
        return i1.p.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return i1.p.b(this);
    }
}
