package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR3\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\n¨\u0006 "}, d2 = {"Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "", "H0", "Z", "getMergeDescendants", "()Z", "setMergeDescendants", "(Z)V", "mergeDescendants", "I0", "isClearingSemantics", "setClearingSemantics", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "J0", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "setProperties", "(Lkotlin/jvm/functions/Function1;)V", LogKeysKt.PROPERTIES, "getShouldClearDescendantSemantics", "shouldClearDescendantSemantics", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "<init>", "(ZZLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public boolean mergeDescendants;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public boolean isClearingSemantics;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @NotNull
    public Function1<? super SemanticsPropertyReceiver, Unit> properties;

    public CoreSemanticsModifierNode(boolean z10, boolean z11, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.mergeDescendants = z10;
        this.isClearingSemantics = z11;
        this.properties = properties;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @NotNull
    public final Function1<SemanticsPropertyReceiver, Unit> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldClearDescendantSemantics, reason: from getter */
    public boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return this.mergeDescendants;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean z10) {
        this.isClearingSemantics = z10;
    }

    public final void setMergeDescendants(boolean z10) {
        this.mergeDescendants = z10;
    }

    public final void setProperties(@NotNull Function1<? super SemanticsPropertyReceiver, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.properties = function1;
    }
}
