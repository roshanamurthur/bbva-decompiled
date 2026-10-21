package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "width", "height", "", "setMaxSize", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillParentMaxSize", "fillParentMaxWidth", "fillParentMaxHeight", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "animationSpec", "animateItemPlacement", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyItemScopeImpl implements LazyItemScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableIntState f4554a = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableIntState f4555b = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @ExperimentalFoundationApi
    @NotNull
    public Modifier animateItemPlacement(@NotNull Modifier modifier, @NotNull FiniteAnimationSpec<IntOffset> animationSpec) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return modifier.then(new AnimateItemPlacementElement(animationSpec));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxHeight(@NotNull Modifier modifier, float f6) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(new ParentSizeElement(f6, null, this.f4555b, "fillParentMaxHeight", 2));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxSize(@NotNull Modifier modifier, float f6) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(new ParentSizeElement(f6, this.f4554a, this.f4555b, "fillParentMaxSize"));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxWidth(@NotNull Modifier modifier, float f6) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier.then(new ParentSizeElement(f6, this.f4554a, null, "fillParentMaxWidth", 4));
    }

    public final void setMaxSize(int width, int height) {
        this.f4554a.setIntValue(width);
        this.f4555b.setIntValue(height);
    }
}
