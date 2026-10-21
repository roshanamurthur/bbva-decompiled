package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u0000\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"useMinimumTouchTarget", "", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUseMinimumTouchTarget", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "invalidateSemantics", "", "Landroidx/compose/ui/node/SemanticsModifierNode;", "touchBoundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,106:1\n76#2:107\n76#2:108\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n102#1:107\n105#1:108\n*E\n"})
public final class SemanticsModifierNodeKt {
    public static final boolean getUseMinimumTouchTarget(@NotNull SemanticsConfiguration semanticsConfiguration) {
        Intrinsics.checkNotNullParameter(semanticsConfiguration, "<this>");
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final void invalidateSemantics(@NotNull SemanticsModifierNode semanticsModifierNode) {
        Intrinsics.checkNotNullParameter(semanticsModifierNode, "<this>");
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui_release();
    }

    @NotNull
    public static final Rect touchBoundsInRoot(@NotNull Modifier.Node node, boolean z10) {
        Intrinsics.checkNotNullParameter(node, "<this>");
        if (node.getNode().getIsAttached()) {
            return !z10 ? LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m3653requireCoordinator64DMado(node, NodeKind.m3725constructorimpl(8))) : DelegatableNodeKt.m3653requireCoordinator64DMado(node, NodeKind.m3725constructorimpl(8)).touchBoundsInRoot();
        }
        return Rect.INSTANCE.getZero();
    }
}
