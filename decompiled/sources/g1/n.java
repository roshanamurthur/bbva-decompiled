package g1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OnGloballyPositionedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Modifier.Node implements GlobalPositionAwareModifierNode {

    @NotNull
    public Function1<? super LayoutCoordinates, Unit> H0;

    public n() {
        throw null;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.H0.invoke(coordinates);
    }
}
