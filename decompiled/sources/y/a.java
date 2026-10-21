package y;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends DelegatingNode implements ParentDataModifierNode {

    @NotNull
    public final LazyLayoutAnimateItemModifierNode J0;

    public a(@NotNull FiniteAnimationSpec<IntOffset> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.J0 = (LazyLayoutAnimateItemModifierNode) delegate(new LazyLayoutAnimateItemModifierNode(animationSpec));
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @NotNull
    public final Object modifyParentData(@NotNull Density density, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        return this.J0;
    }
}
