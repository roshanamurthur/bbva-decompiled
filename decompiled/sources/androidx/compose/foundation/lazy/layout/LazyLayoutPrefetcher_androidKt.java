package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPrefetcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"LazyLayoutPrefetcher", "", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "subcomposeLayoutState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,312:1\n76#2:313\n67#3,3:314\n66#3:317\n1097#4,6:318\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n*L\n41#1:313\n42#1:314,3\n42#1:317\n42#1:318,6\n*E\n"})
public final class LazyLayoutPrefetcher_androidKt {

    /* JADX INFO: compiled from: LazyLayoutPrefetcher.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutPrefetchState f5030p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutItemContentFactory f5031q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SubcomposeLayoutState f5032r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f5033s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LazyLayoutPrefetchState lazyLayoutPrefetchState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, int i10) {
            super(2);
            this.f5030p0 = lazyLayoutPrefetchState;
            this.f5031q0 = lazyLayoutItemContentFactory;
            this.f5032r0 = subcomposeLayoutState;
            this.f5033s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f5033s0 | 1);
            LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.f5031q0;
            SubcomposeLayoutState subcomposeLayoutState = this.f5032r0;
            LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(this.f5030p0, lazyLayoutItemContentFactory, subcomposeLayoutState, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ExperimentalFoundationApi
    public static final void LazyLayoutPrefetcher(@NotNull LazyLayoutPrefetchState prefetchState, @NotNull LazyLayoutItemContentFactory itemContentFactory, @NotNull SubcomposeLayoutState subcomposeLayoutState, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1113453182);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1113453182, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:35)");
        }
        View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composerStartRestartGroup.startReplaceableGroup(1618982084);
        boolean zChanged = composerStartRestartGroup.changed(subcomposeLayoutState) | composerStartRestartGroup.changed(prefetchState) | composerStartRestartGroup.changed(view);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(new LazyLayoutPrefetcher(prefetchState, subcomposeLayoutState, itemContentFactory, view));
        }
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(prefetchState, itemContentFactory, subcomposeLayoutState, i10));
    }
}
