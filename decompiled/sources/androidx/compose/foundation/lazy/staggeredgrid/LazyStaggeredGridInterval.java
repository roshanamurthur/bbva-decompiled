package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composer;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u009a\u0001\u0012#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012#\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\"\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001e\u0010\u001fR7\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR7\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR4\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bR3\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridInterval;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent$Interval;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "", "a", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "key", "b", "getType", "type", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "c", "getSpan", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "d", "Lkotlin/jvm/functions/Function4;", "getItem", "()Lkotlin/jvm/functions/Function4;", AnalyticsConstants.Key.ITEM, "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyStaggeredGridInterval implements LazyLayoutIntervalContent.Interval {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<Integer, Object> key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Integer, Object> type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<Integer, StaggeredGridItemSpan> span;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> item;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridInterval(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> type, @Nullable Function1<? super Integer, StaggeredGridItemSpan> function2, @NotNull Function4<? super LazyStaggeredGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> item) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        this.key = function1;
        this.type = type;
        this.span = function2;
        this.item = item;
    }

    @NotNull
    public final Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @Nullable
    public Function1<Integer, Object> getKey() {
        return this.key;
    }

    @Nullable
    public final Function1<Integer, StaggeredGridItemSpan> getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    @NotNull
    public Function1<Integer, Object> getType() {
        return this.type;
    }
}
