package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InnerNodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/TailModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "toString", "", "onAttach", "onDetach", "", "H0", "Z", "getAttachHasBeenRun", "()Z", "setAttachHasBeenRun", "(Z)V", "attachHasBeenRun", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class TailModifierNode extends Modifier.Node {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public boolean attachHasBeenRun;

    public TailModifierNode() {
        setAggregateChildKindSet$ui_release(0);
    }

    public final boolean getAttachHasBeenRun() {
        return this.attachHasBeenRun;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.attachHasBeenRun = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.attachHasBeenRun = false;
    }

    public final void setAttachHasBeenRun(boolean z10) {
        this.attachHasBeenRun = z10;
    }

    @NotNull
    public String toString() {
        return "<tail>";
    }
}
