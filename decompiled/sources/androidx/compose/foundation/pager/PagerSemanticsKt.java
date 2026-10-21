package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PagerSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"rememberPagerSemanticState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "reverseScrolling", "", "isVertical", "(Landroidx/compose/foundation/pager/PagerState;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPagerSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSemantics.kt\nandroidx/compose/foundation/pager/PagerSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,34:1\n67#2,3:35\n66#2:38\n1097#3,6:39\n*S KotlinDebug\n*F\n+ 1 PagerSemantics.kt\nandroidx/compose/foundation/pager/PagerSemanticsKt\n*L\n31#1:35,3\n31#1:38\n31#1:39,6\n*E\n"})
public final class PagerSemanticsKt {
    @Composable
    @NotNull
    public static final LazyLayoutSemanticState rememberPagerSemanticState(@NotNull PagerState state, boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(352210115);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(352210115, i10, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:25)");
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        Boolean boolValueOf2 = Boolean.valueOf(z11);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(boolValueOf) | composer.changed(state) | composer.changed(boolValueOf2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = LazyLayoutSemanticStateKt.LazyLayoutSemanticState(state, z11);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyLayoutSemanticState;
    }
}
