package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"lazyStaggeredGridBeyondBoundsModifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,75:1\n76#2:76\n36#3:77\n83#3,3:84\n1097#4,6:78\n1097#4,6:87\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n*L\n38#1:76\n39#1:77\n42#1:84,3\n39#1:78,6\n42#1:87,6\n*E\n"})
public final class LazyStaggeredGridBeyondBoundsModifierKt {
    @Composable
    @NotNull
    public static final Modifier lazyStaggeredGridBeyondBoundsModifier(@NotNull Modifier modifier, @NotNull LazyStaggeredGridState state, boolean z10, @NotNull Orientation orientation, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        composer.startReplaceableGroup(-1763226771);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763226771, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.lazyStaggeredGridBeyondBoundsModifier (LazyStaggeredGridBeyondBoundsModifier.kt:32)");
        }
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(state);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridBeyondBoundsState(state);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        LazyStaggeredGridBeyondBoundsState lazyStaggeredGridBeyondBoundsState = (LazyStaggeredGridBeyondBoundsState) objRememberedValue;
        Object[] objArr = {lazyStaggeredGridBeyondBoundsState, state, Boolean.valueOf(z10), layoutDirection, orientation};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged2 = false;
        for (int i11 = 0; i11 < 5; i11++) {
            zChanged2 |= composer.changed(objArr[i11]);
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new LazyLayoutBeyondBoundsModifierLocal(lazyStaggeredGridBeyondBoundsState, state.getBeyondBoundsInfo(), z10, layoutDirection, orientation);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier modifierThen = modifier.then((Modifier) objRememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }
}
