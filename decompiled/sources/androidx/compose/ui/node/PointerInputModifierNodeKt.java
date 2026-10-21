package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"isAttached", "", "Landroidx/compose/ui/node/PointerInputModifierNode;", "(Landroidx/compose/ui/node/PointerInputModifierNode;)Z", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "(Landroidx/compose/ui/node/PointerInputModifierNode;)Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointerInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputModifierNode.kt\nandroidx/compose/ui/node/PointerInputModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,127:1\n78#2:128\n*S KotlinDebug\n*F\n+ 1 PointerInputModifierNode.kt\nandroidx/compose/ui/node/PointerInputModifierNodeKt\n*L\n126#1:128\n*E\n"})
public final class PointerInputModifierNodeKt {
    @NotNull
    public static final LayoutCoordinates getLayoutCoordinates(@NotNull PointerInputModifierNode pointerInputModifierNode) {
        Intrinsics.checkNotNullParameter(pointerInputModifierNode, "<this>");
        return DelegatableNodeKt.m3653requireCoordinator64DMado(pointerInputModifierNode, NodeKind.m3725constructorimpl(16));
    }

    public static final boolean isAttached(@NotNull PointerInputModifierNode pointerInputModifierNode) {
        Intrinsics.checkNotNullParameter(pointerInputModifierNode, "<this>");
        return pointerInputModifierNode.getNode().getIsAttached();
    }
}
