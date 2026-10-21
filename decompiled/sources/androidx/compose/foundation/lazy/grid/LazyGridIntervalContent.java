package androidx.compose.foundation.lazy.grid;

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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B \u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b/\u00100J_\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\b\u000e¢\u0006\u0002\b\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J¸\u0001\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122#\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u001f\u0010\n\u001a\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017¢\u0006\u0002\b\t2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000621\u0010\u0018\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u000e¢\u0006\u0002\b\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "content", AnalyticsConstants.Key.ITEM, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function2;", "itemContent", FirebaseAnalytics.Param.ITEMS, "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "a", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "b", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "", "c", "Z", "getHasCustomSpans$foundation_release", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "hasCustomSpans", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridIntervalContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridIntervalContent.kt\nandroidx/compose/foundation/lazy/grid/LazyGridIntervalContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f4754d = a.f4758p0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyGridSpanLayoutProvider spanLayoutProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntervalList<LazyGridInterval> intervals;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean hasCustomSpans;

    /* JADX INFO: compiled from: LazyGridIntervalContent.kt */
    public static final class a extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4758p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            num.intValue();
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return GridItemSpan.m374boximpl(LazyGridSpanKt.GridItemSpan(1));
        }
    }

    /* JADX INFO: compiled from: LazyGridIntervalContent.kt */
    public static final class b extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f4759p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.f4759p0 = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f4759p0;
        }
    }

    /* JADX INFO: compiled from: LazyGridIntervalContent.kt */
    public static final class c extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<LazyGridItemSpanScope, GridItemSpan> f4760p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super LazyGridItemSpanScope, GridItemSpan> function1) {
            super(2);
            this.f4760p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            LazyGridItemSpanScope lazyGridItemSpanScope2 = lazyGridItemSpanScope;
            num.intValue();
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope2, "$this$null");
            return GridItemSpan.m374boximpl(this.f4760p0.invoke(lazyGridItemSpanScope2).getF4697a());
        }
    }

    /* JADX INFO: compiled from: LazyGridIntervalContent.kt */
    public static final class d extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f4761p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj) {
            super(1);
            this.f4761p0 = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f4761p0;
        }
    }

    /* JADX INFO: compiled from: LazyGridIntervalContent.kt */
    public static final class e extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<LazyGridItemScope, Composer, Integer, Unit> f4762p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> function3) {
            super(4);
            this.f4762p0 = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            LazyGridItemScope $receiver = lazyGridItemScope;
            num.intValue();
            Composer composer2 = composer;
            int iIntValue = num2.intValue();
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed($receiver) ? 4 : 2;
            }
            if ((iIntValue & 651) == 130 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-34608120, iIntValue, -1, "androidx.compose.foundation.lazy.grid.LazyGridIntervalContent.item.<anonymous> (LazyGridIntervalContent.kt:49)");
                }
                this.f4762p0.invoke($receiver, composer2, Integer.valueOf(iIntValue & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public LazyGridIntervalContent(@NotNull Function1<? super LazyGridScope, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
        this.intervals = new MutableIntervalList<>();
        content.invoke(this);
    }

    /* JADX INFO: renamed from: getHasCustomSpans$foundation_release, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    @NotNull
    /* JADX INFO: renamed from: getSpanLayoutProvider$foundation_release, reason: from getter */
    public final LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.spanLayoutProvider;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(@Nullable Object key, @Nullable Function1<? super LazyGridItemSpanScope, GridItemSpan> span, @Nullable Object contentType, @NotNull Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        getIntervals().addInterval(1, new LazyGridInterval(key != null ? new b(key) : null, span != null ? new c(span) : f4754d, new d(contentType), ComposableLambdaKt.composableLambdaInstance(-34608120, true, new e(content))));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @Nullable Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        getIntervals().addInterval(count, new LazyGridInterval(key, span == null ? f4754d : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z10) {
        this.hasCustomSpans = z10;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @NotNull
    public MutableIntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }
}
