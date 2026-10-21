package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import h1.c;
import i1.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BringIntoView.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R(\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058D@BX\u0084\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewChildNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "onPlaced", "<set-?>", "I0", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "getParent", "()Landroidx/compose/foundation/relocation/BringIntoViewParent;", "parent", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBringIntoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoView.kt\nandroidx/compose/foundation/relocation/BringIntoViewChildNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public abstract class BringIntoViewChildNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {

    @NotNull
    public final BringIntoViewParent H0 = BringIntoViewResponder_androidKt.defaultBringIntoViewParent(this);

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @Nullable
    public LayoutCoordinates layoutCoordinates;

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public final /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return c.a(this, modifierLocal);
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    @NotNull
    public final BringIntoViewParent getParent() {
        BringIntoViewParent bringIntoViewParent = (BringIntoViewParent) getCurrent(BringIntoViewKt.getModifierLocalBringIntoViewParent());
        return bringIntoViewParent == null ? this.H0 : bringIntoViewParent;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return c.b(this);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.layoutCoordinates = coordinates;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public final /* synthetic */ void mo457onRemeasuredozmzZPI(long j10) {
        i.b(this, j10);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        c.c(this, modifierLocal, obj);
    }
}
