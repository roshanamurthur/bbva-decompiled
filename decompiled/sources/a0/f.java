package a0;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

/* JADX INFO: compiled from: LazyStaggeredGridItemScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Modifier a(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return lazyStaggeredGridItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
    }
}
