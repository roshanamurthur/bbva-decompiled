package y;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

/* JADX INFO: compiled from: LazyItemScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Modifier a(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i10 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m4498boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return lazyItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
    }

    public static /* synthetic */ Modifier b(LazyItemScope lazyItemScope, Modifier modifier, float f6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        return lazyItemScope.fillParentMaxHeight(modifier, f6);
    }

    public static /* synthetic */ Modifier c(LazyItemScope lazyItemScope, Modifier modifier, float f6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        return lazyItemScope.fillParentMaxSize(modifier, f6);
    }

    public static /* synthetic */ Modifier d(LazyItemScope lazyItemScope, Modifier modifier, float f6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i10 & 1) != 0) {
            f6 = 1.0f;
        }
        return lazyItemScope.fillParentMaxWidth(modifier, f6);
    }
}
