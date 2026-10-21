package x;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Modifier.Node implements ParentDataModifierNode {

    @NotNull
    public Alignment H0;
    public boolean I0;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object modifyParentData(Density density, Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this;
    }
}
