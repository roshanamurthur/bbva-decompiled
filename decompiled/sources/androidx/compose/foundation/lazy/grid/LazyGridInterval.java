package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0097\u0001\u0012#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u001d\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010\u0012#\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012\"\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\r¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u0010ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R7\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR1\u0010\u0015\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u00108\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R7\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR3\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\r¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "", "a", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function2;", "getSpan", "()Lkotlin/jvm/functions/Function2;", "span", "c", "getType", "type", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "d", "Lkotlin/jvm/functions/Function4;", "getItem", "()Lkotlin/jvm/functions/Function4;", AnalyticsConstants.Key.ITEM, "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyGridInterval implements LazyLayoutIntervalContent.Interval {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> span;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Integer, Object> type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> item;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridInterval(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span, @NotNull Function1<? super Integer, ? extends Object> type, @NotNull Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> item) {
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        this.key = function1;
        this.span = span;
        this.type = type;
        this.item = item;
    }

    @NotNull
    public final Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @Nullable
    public Function1<Integer, Object> getKey() {
        return this.key;
    }

    @NotNull
    public final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @NotNull
    public Function1<Integer, Object> getType() {
        return this.type;
    }
}
