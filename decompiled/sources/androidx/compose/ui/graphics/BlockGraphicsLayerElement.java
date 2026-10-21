package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Ly0/b;", "ui_release"}, k = 1, mv = {1, 8, 0})
final /* data */ class BlockGraphicsLayerElement extends ModifierNodeElement<y0.b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<GraphicsLayerScope, Unit> f15596b;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(@NotNull Function1<? super GraphicsLayerScope, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f15596b = block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        Function1<GraphicsLayerScope, Unit> layerBlock = this.f15596b;
        Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
        y0.b bVar = new y0.b();
        bVar.H0 = layerBlock;
        return bVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && Intrinsics.areEqual(this.f15596b, ((BlockGraphicsLayerElement) obj).f15596b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f15596b.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "<this>", "graphicsLayer").set("block", this.f15596b);
    }

    @NotNull
    public final String toString() {
        return ci.a.c(new StringBuilder("BlockGraphicsLayerElement(block="), this.f15596b, RootService.CLOSE_BRACKET);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        y0.b node2 = (y0.b) node;
        Intrinsics.checkNotNullParameter(node2, "node");
        node2.getClass();
        Function1<GraphicsLayerScope, Unit> function1 = this.f15596b;
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        node2.H0 = function1;
        NodeCoordinator wrapped = DelegatableNodeKt.m3653requireCoordinator64DMado(node2, NodeKind.m3725constructorimpl(2)).getWrapped();
        if (wrapped != null) {
            wrapped.updateLayerBlock(node2.H0, true);
        }
    }
}
