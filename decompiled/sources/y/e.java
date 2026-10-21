package y;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListInterval;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.LazyListItemProvider;
import androidx.compose.foundation.lazy.LazyListState;
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
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyListItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class e implements LazyListItemProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyListState f94690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyListIntervalContent f94691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LazyItemScopeImpl f94692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LazyLayoutKeyIndexMap f94693d;

    /* JADX INFO: compiled from: LazyListItemProvider.kt */
    @SourceDebugExtension({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderImpl$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,106:1\n57#2,3:107\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderImpl$Item$1\n*L\n78#1:107,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f94695q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f94695q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-824725566, iIntValue, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:76)");
                }
                e eVar = e.this;
                IntervalList intervals = eVar.f94691b.getIntervals();
                int i10 = this.f94695q0;
                IntervalList.Interval interval = intervals.get(i10);
                int startIndex = i10 - interval.getStartIndex();
                ((LazyListInterval) interval.getValue()).getItem().invoke(eVar.f94692c, Integer.valueOf(startIndex), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyListItemProvider.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f94697q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Object f94698r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f94699s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, Object obj, int i11) {
            super(2);
            this.f94697q0 = i10;
            this.f94698r0 = obj;
            this.f94699s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f94699s0 | 1);
            int i10 = this.f94697q0;
            Object obj = this.f94698r0;
            e.this.Item(i10, obj, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public e(@NotNull LazyListState state, @NotNull LazyListIntervalContent intervalContent, @NotNull LazyItemScopeImpl itemScope, @NotNull NearestRangeKeyIndexMap keyIndexMap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(intervalContent, "intervalContent");
        Intrinsics.checkNotNullParameter(itemScope, "itemScope");
        Intrinsics.checkNotNullParameter(keyIndexMap, "keyIndexMap");
        this.f94690a = state;
        this.f94691b = intervalContent;
        this.f94692c = itemScope;
        this.f94693d = keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public final void Item(int i10, @NotNull Object key, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        Composer composerStartRestartGroup = composer.startRestartGroup(-462424778);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-462424778, i11, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key, i10, this.f94690a.getPinnedItems(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -824725566, true, new a(i10)), composerStartRestartGroup, ((i11 << 3) & 112) | 3592);
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
        return Intrinsics.areEqual(this.f94691b, ((e) obj).f94691b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Nullable
    public final Object getContentType(int i10) {
        return this.f94691b.getContentType(i10);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @NotNull
    public final List<Integer> getHeaderIndexes() {
        return this.f94691b.getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f94693d.getIndex(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.f94691b.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @NotNull
    public final LazyItemScopeImpl getItemScope() {
        return this.f94692c;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public final Object getKey(int i10) {
        Object key = this.f94693d.getKey(i10);
        return key == null ? this.f94691b.getKey(i10) : key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f94693d;
    }

    public final int hashCode() {
        return this.f94691b.hashCode();
    }
}
