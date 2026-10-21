package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OnPlacedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Modifier.Node implements LayoutAwareModifierNode {

    @NotNull
    public Function1<? super LayoutCoordinates, Unit> H0;

    public p() {
        throw null;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.H0.invoke(coordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public final /* synthetic */ void mo457onRemeasuredozmzZPI(long j10) {
        i1.i.b(this, j10);
    }
}
