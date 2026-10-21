package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineBlockElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "create", "node", "", "update", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "b", "Lkotlin/jvm/functions/Function1;", "getBlock", "()Lkotlin/jvm/functions/Function1;", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class WithAlignmentLineBlockElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineBlockNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Measured, Integer> block;

    /* JADX WARN: Multi-variable type inference failed */
    public WithAlignmentLineBlockElement(@NotNull Function1<? super Measured, Integer> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.block = block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        WithAlignmentLineBlockElement withAlignmentLineBlockElement = other instanceof WithAlignmentLineBlockElement ? (WithAlignmentLineBlockElement) other : null;
        if (withAlignmentLineBlockElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.block, withAlignmentLineBlockElement.block);
    }

    @NotNull
    public final Function1<Measured, Integer> getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @NotNull
    public SiblingsAlignedNode.WithAlignmentLineBlockNode create() {
        return new SiblingsAlignedNode.WithAlignmentLineBlockNode(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@NotNull SiblingsAlignedNode.WithAlignmentLineBlockNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setBlock(this.block);
    }
}
