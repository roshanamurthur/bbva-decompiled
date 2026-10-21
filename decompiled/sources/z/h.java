package z;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.grid.LazyGridInterval;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemProvider;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
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

/* JADX INFO: compiled from: LazyGridItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class h implements LazyGridItemProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyGridState f94901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyGridIntervalContent f94902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LazyLayoutKeyIndexMap f94903c;

    /* JADX INFO: compiled from: LazyGridItemProvider.kt */
    @SourceDebugExtension({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,101:1\n57#2,3:102\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderImpl$Item$1\n*L\n77#1:102,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f94905q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f94905q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(726189336, iIntValue, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:75)");
                }
                IntervalList intervals = h.this.f94902b.getIntervals();
                int i10 = this.f94905q0;
                IntervalList.Interval interval = intervals.get(i10);
                ((LazyGridInterval) interval.getValue()).getItem().invoke(LazyGridItemScopeImpl.INSTANCE, Integer.valueOf(i10 - interval.getStartIndex()), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyGridItemProvider.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f94907q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Object f94908r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f94909s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, Object obj, int i11) {
            super(2);
            this.f94907q0 = i10;
            this.f94908r0 = obj;
            this.f94909s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f94909s0 | 1);
            int i10 = this.f94907q0;
            Object obj = this.f94908r0;
            h.this.Item(i10, obj, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public h(@NotNull LazyGridState state, @NotNull LazyGridIntervalContent intervalContent, @NotNull NearestRangeKeyIndexMap keyIndexMap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(intervalContent, "intervalContent");
        Intrinsics.checkNotNullParameter(keyIndexMap, "keyIndexMap");
        this.f94901a = state;
        this.f94902b = intervalContent;
        this.f94903c = keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public final void Item(int i10, @NotNull Object key, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        Composer composerStartRestartGroup = composer.startRestartGroup(1493551140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1493551140, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key, i10, this.f94901a.getPinnedItems(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 726189336, true, new a(i10)), composerStartRestartGroup, ((i11 << 3) & 112) | 3592);
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
        if (!(obj instanceof h)) {
            return false;
        }
        return Intrinsics.areEqual(this.f94902b, ((h) obj).f94902b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Nullable
    public final Object getContentType(int i10) {
        return this.f94902b.getContentType(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f94903c.getIndex(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.f94902b.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public final Object getKey(int i10) {
        Object key = this.f94903c.getKey(i10);
        return key == null ? this.f94902b.getKey(i10) : key;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f94903c;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    @NotNull
    public final LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.f94902b.getSpanLayoutProvider();
    }

    public final int hashCode() {
        return this.f94902b.hashCode();
    }
}
