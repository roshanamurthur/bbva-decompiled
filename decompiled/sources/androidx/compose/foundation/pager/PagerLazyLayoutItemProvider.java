package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.i;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0011\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "", FirebaseAnalytics.Param.INDEX, "", "key", "", "Item", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "getKey", "getIndex", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "getItemCount", "()I", "itemCount", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/pager/PagerIntervalContent;", "intervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class PagerLazyLayoutItemProvider implements LazyLayoutItemProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PagerState f5427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyLayoutIntervalContent<PagerIntervalContent> f5428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LazyLayoutKeyIndexMap f5429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PagerScopeImpl f5430d;

    /* JADX INFO: compiled from: LazyLayoutPager.kt */
    @SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider$Item$1\n+ 2 LazyLayoutIntervalContent.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent\n*L\n1#1,282:1\n57#2,3:283\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider$Item$1\n*L\n190#1:283,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f5432q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(2);
            this.f5432q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1142237095, iIntValue, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:188)");
                }
                PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider = PagerLazyLayoutItemProvider.this;
                IntervalList intervals = pagerLazyLayoutItemProvider.f5428b.getIntervals();
                int i10 = this.f5432q0;
                IntervalList.Interval interval = intervals.get(i10);
                ((PagerIntervalContent) interval.getValue()).getItem().invoke(pagerLazyLayoutItemProvider.f5430d, Integer.valueOf(i10 - interval.getStartIndex()), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyLayoutPager.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f5434q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Object f5435r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f5436s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, Object obj, int i11) {
            super(2);
            this.f5434q0 = i10;
            this.f5435r0 = obj;
            this.f5436s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f5436s0 | 1);
            int i10 = this.f5434q0;
            Object obj = this.f5435r0;
            PagerLazyLayoutItemProvider.this.Item(i10, obj, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public PagerLazyLayoutItemProvider(@NotNull PagerState state, @NotNull LazyLayoutIntervalContent<PagerIntervalContent> intervalContent, @NotNull LazyLayoutKeyIndexMap keyIndexMap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(intervalContent, "intervalContent");
        Intrinsics.checkNotNullParameter(keyIndexMap, "keyIndexMap");
        this.f5427a = state;
        this.f5428b = intervalContent;
        this.f5429c = keyIndexMap;
        this.f5430d = PagerScopeImpl.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(int i10, @NotNull Object key, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(key, "key");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1201380429);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1201380429, i11, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:187)");
        }
        LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key, i10, this.f5427a.getPinnedPages(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1142237095, true, new a(i10)), composerStartRestartGroup, ((i11 << 3) & 112) | 3592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(i10, key, i11));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagerLazyLayoutItemProvider)) {
            return false;
        }
        return Intrinsics.areEqual(this.f5428b, ((PagerLazyLayoutItemProvider) other).f5428b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final /* synthetic */ Object getContentType(int i10) {
        return i.a(this, i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f5429c.getIndex(key);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.f5428b.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @NotNull
    public Object getKey(int index) {
        Object key = this.f5429c.getKey(index);
        return key == null ? this.f5428b.getKey(index) : key;
    }

    public int hashCode() {
        return this.f5428b.hashCode();
    }
}
