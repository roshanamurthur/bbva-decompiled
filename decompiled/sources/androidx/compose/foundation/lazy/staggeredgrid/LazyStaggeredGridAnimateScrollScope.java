package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.o;

/* JADX INFO: compiled from: LazyStaggeredGridAnimateScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J<\u0010\u0012\u001a\u00020\b2'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "", FirebaseAnalytics.Param.INDEX, "getTargetItemOffset", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "", "snapToItem", "targetScrollOffset", "", "expectedDistanceTo", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getNumOfItemsForTeleport", "numOfItemsForTeleport", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,73:1\n132#2,3:74\n33#2,4:77\n135#2,2:81\n38#2:83\n137#2:84\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n*L\n55#1:74,3\n55#1:77,4\n55#1:81,2\n55#1:83\n55#1:84\n*E\n"})
public final class LazyStaggeredGridAnimateScrollScope implements LazyAnimateScrollScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyStaggeredGridState f5118a;

    public LazyStaggeredGridAnimateScrollScope(@NotNull LazyStaggeredGridState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f5118a = state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int index, int targetScrollOffset) {
        LazyStaggeredGridState lazyStaggeredGridState = this.f5118a;
        LazyStaggeredGridLayoutInfo layoutInfo = lazyStaggeredGridState.getLayoutInfo();
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int iM4548getHeightimpl = 0;
        for (int i10 = 0; i10 < size; i10++) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = visibleItemsInfo.get(i10);
            iM4548getHeightimpl += lazyStaggeredGridState.getIsVertical() ? IntSize.m4548getHeightimpl(lazyStaggeredGridItemInfo.getSize()) : IntSize.m4549getWidthimpl(lazyStaggeredGridItemInfo.getSize());
        }
        int mainAxisItemSpacing = layoutInfo.getMainAxisItemSpacing() + (iM4548getHeightimpl / visibleItemsInfo.size());
        int laneCount$foundation_release = (index / lazyStaggeredGridState.getLaneCount$foundation_release()) - (getFirstVisibleItemIndex() / lazyStaggeredGridState.getLaneCount$foundation_release());
        int iMin = Math.min(Math.abs(targetScrollOffset), mainAxisItemSpacing);
        if (targetScrollOffset < 0) {
            iMin *= -1;
        }
        return ((mainAxisItemSpacing * laneCount$foundation_release) + iMin) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @NotNull
    public Density getDensity() {
        return this.f5118a.getDensity();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.f5118a.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.f5118a.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.f5118a.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getLastVisibleItemIndex() {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo = (LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.lastOrNull((List) this.f5118a.getLayoutInfo().getVisibleItemsInfo());
        if (lazyStaggeredGridItemInfo != null) {
            return lazyStaggeredGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.f5118a.getLaneCount$foundation_release() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @Nullable
    public Integer getTargetItemOffset(int index) {
        LazyStaggeredGridState lazyStaggeredGridState = this.f5118a;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(lazyStaggeredGridState.getLayoutInfo(), index);
        if (lazyStaggeredGridItemInfoFindVisibleItem == null) {
            return null;
        }
        long j10 = lazyStaggeredGridItemInfoFindVisibleItem.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
        return Integer.valueOf(lazyStaggeredGridState.getIsVertical() ? IntOffset.m4508getYimpl(j10) : IntOffset.m4507getXimpl(j10));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @Nullable
    public Object scroll(@NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objE = o.e(this.f5118a, null, function2, continuation, 1, null);
        return objE == ek.a.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void snapToItem(@NotNull ScrollScope scrollScope, int i10, int i11) {
        Intrinsics.checkNotNullParameter(scrollScope, "<this>");
        this.f5118a.snapToItemInternal$foundation_release(scrollScope, i10, i11);
    }
}
