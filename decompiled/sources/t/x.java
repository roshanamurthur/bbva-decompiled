package t;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x extends Modifier.Node implements CompositionLocalConsumerModifierNode, ObserverModifierNode {

    @Nullable
    public PinnableContainer.PinnedHandle H0;
    public boolean I0;

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverModifierNodeKt.observeReads(this, new w(objectRef, this));
        PinnableContainer pinnableContainer = (PinnableContainer) objectRef.element;
        if (this.I0) {
            PinnableContainer.PinnedHandle pinnedHandle = this.H0;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.H0 = pinnableContainer != null ? pinnableContainer.pin() : null;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.H0;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.H0 = null;
    }
}
