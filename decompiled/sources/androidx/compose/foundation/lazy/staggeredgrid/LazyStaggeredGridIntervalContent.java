package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B \u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\r¢\u0006\u0004\b&\u0010'JK\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J¹\u0001\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112#\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t21\u0010\u0017\u001a-\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000b0\u0016¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", AnalyticsConstants.Key.ITEM, "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function2;", "itemContent", FirebaseAnalytics.Param.ITEMS, "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "a", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "b", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridIntervalContent.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class LazyStaggeredGridIntervalContent extends LazyLayoutIntervalContent<LazyStaggeredGridInterval> implements LazyStaggeredGridScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntervalList<LazyStaggeredGridInterval> intervals;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyStaggeredGridSpanProvider spanProvider;

    /* JADX INFO: compiled from: LazyStaggeredGridIntervalContent.kt */
    public static final class a extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f5176p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.f5176p0 = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f5176p0;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridIntervalContent.kt */
    public static final class b extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f5177p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.f5177p0 = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f5177p0;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridIntervalContent.kt */
    public static final class c extends Lambda implements Function1<Integer, StaggeredGridItemSpan> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StaggeredGridItemSpan f5178p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StaggeredGridItemSpan staggeredGridItemSpan) {
            super(1);
            this.f5178p0 = staggeredGridItemSpan;
        }

        @Override // kotlin.jvm.functions.Function1
        public final StaggeredGridItemSpan invoke(Integer num) {
            num.intValue();
            return this.f5178p0;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridIntervalContent.kt */
    public static final class d extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<LazyStaggeredGridItemScope, Composer, Integer, Unit> f5179p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function3<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, Unit> function3) {
            super(4);
            this.f5179p0 = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            LazyStaggeredGridItemScope items = lazyStaggeredGridItemScope;
            num.intValue();
            Composer composer2 = composer;
            int iIntValue = num2.intValue();
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(items) ? 4 : 2;
            }
            if ((iIntValue & 651) == 130 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(657818596, iIntValue, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent.item.<anonymous> (LazyStaggeredGridIntervalContent.kt:47)");
                }
                this.f5179p0.invoke(items, composer2, Integer.valueOf(iIntValue & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public LazyStaggeredGridIntervalContent(@NotNull Function1<? super LazyStaggeredGridScope, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.intervals = new MutableIntervalList<>();
        this.spanProvider = new LazyStaggeredGridSpanProvider(getIntervals());
        content.invoke(this);
    }

    @NotNull
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void item(@Nullable Object key, @Nullable Object contentType, @Nullable StaggeredGridItemSpan span, @NotNull Function3<? super LazyStaggeredGridItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        items(1, key != null ? new a(key) : null, new b(contentType), span != null ? new c(span) : null, ComposableLambdaKt.composableLambdaInstance(657818596, true, new d(content)));
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope
    public void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @NotNull Function1<? super Integer, ? extends Object> contentType, @Nullable Function1<? super Integer, StaggeredGridItemSpan> span, @NotNull Function4<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        getIntervals().addInterval(count, new LazyStaggeredGridInterval(key, contentType, span, itemContent));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @NotNull
    public MutableIntervalList<LazyStaggeredGridInterval> getIntervals() {
        return this.intervals;
    }
}
