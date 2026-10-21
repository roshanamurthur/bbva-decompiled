package a0;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridInterval;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScopeImpl;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSpanProvider;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements LazyStaggeredGridItemProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyStaggeredGridState f151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyStaggeredGridIntervalContent f152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LazyLayoutKeyIndexMap f153c;

    /* JADX INFO: compiled from: LazyStaggeredGridItemProvider.kt */
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,99:1\n57#2,3:100\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderImpl$Item$1\n*L\n79#1:100,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f155q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f155q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(608834466, iIntValue, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item.<anonymous> (LazyStaggeredGridItemProvider.kt:77)");
                }
                IntervalList intervals = e.this.f152b.getIntervals();
                int i10 = this.f155q0;
                IntervalList.Interval interval = intervals.get(i10);
                ((LazyStaggeredGridInterval) interval.getValue()).getItem().invoke(LazyStaggeredGridItemScopeImpl.INSTANCE, Integer.valueOf(i10 - interval.getStartIndex()), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridItemProvider.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f157q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Object f158r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f159s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, Object obj, int i11) {
            super(2);
            this.f157q0 = i10;
            this.f158r0 = obj;
            this.f159s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f159s0 | 1);
            int i10 = this.f157q0;
            Object obj = this.f158r0;
            e.this.Item(i10, obj, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public e(@NotNull LazyStaggeredGridState state, @NotNull LazyStaggeredGridIntervalContent intervalContent, @NotNull NearestRangeKeyIndexMap keyIndexMap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(intervalContent, "intervalContent");
        Intrinsics.checkNotNullParameter(keyIndexMap, "keyIndexMap");
        this.f151a = state;
        this.f152b = intervalContent;
        this.f153c = keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public final void Item(int i10, @NotNull Object key, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        Composer composerStartRestartGroup = composer.startRestartGroup(89098518);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(89098518, i11, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl.Item (LazyStaggeredGridItemProvider.kt:76)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key, i10, this.f151a.getPinnedItems(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 608834466, true, new a(i10)), composerStartRestartGroup, ((i11 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, key, i11));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f152b, ((e) obj).f152b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Nullable
    public final Object getContentType(int i10) {
        return this.f152b.getContentType(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f153c.getIndex(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.f152b.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public final Object getKey(int i10) {
        Object key = this.f153c.getKey(i10);
        return key == null ? this.f152b.getKey(i10) : key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f153c;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    @NotNull
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.f152b.getSpanProvider();
    }

    public final int hashCode() {
        return this.f152b.hashCode();
    }
}
