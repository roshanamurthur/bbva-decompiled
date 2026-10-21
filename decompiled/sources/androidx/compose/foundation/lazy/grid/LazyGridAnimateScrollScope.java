package androidx.compose.foundation.lazy.grid;

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
import z.e;

/* JADX INFO: compiled from: LazyGridAnimateScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J<\u0010\u0012\u001a\u00020\b2'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "", FirebaseAnalytics.Param.INDEX, "getTargetItemOffset", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "", "snapToItem", "targetScrollOffset", "", "expectedDistanceTo", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getNumOfItemsForTeleport", "numOfItemsForTeleport", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n116#2,2:123\n33#2,6:125\n118#2:131\n*S KotlinDebug\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n*L\n42#1:123,2\n42#1:125,6\n42#1:131\n*E\n"})
public final class LazyGridAnimateScrollScope implements LazyAnimateScrollScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyGridState f4698a;

    public LazyGridAnimateScrollScope(@NotNull LazyGridState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f4698a = state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int index, int targetScrollOffset) {
        LazyGridState lazyGridState = this.f4698a;
        int slotsPerLine$foundation_release = lazyGridState.getSlotsPerLine$foundation_release();
        LazyGridLayoutInfo layoutInfo = lazyGridState.getLayoutInfo();
        boolean isVertical = lazyGridState.getIsVertical();
        List<LazyGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        e eVar = new e(isVertical, visibleItemsInfo);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i10 >= visibleItemsInfo.size()) {
                break;
            }
            int iIntValue = ((Number) eVar.invoke(Integer.valueOf(i10))).intValue();
            if (iIntValue == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < visibleItemsInfo.size() && ((Number) eVar.invoke(Integer.valueOf(i10))).intValue() == iIntValue) {
                    iMax = Math.max(iMax, isVertical ? IntSize.m4548getHeightimpl(visibleItemsInfo.get(i10).getSize()) : IntSize.m4549getWidthimpl(visibleItemsInfo.get(i10).getSize()));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        int mainAxisItemSpacing = layoutInfo.getMainAxisItemSpacing() + (i11 / i12);
        int firstVisibleItemIndex = (((slotsPerLine$foundation_release - 1) * (index < getFirstVisibleItemIndex() ? -1 : 1)) + (index - getFirstVisibleItemIndex())) / slotsPerLine$foundation_release;
        int iMin = Math.min(Math.abs(targetScrollOffset), mainAxisItemSpacing);
        if (targetScrollOffset < 0) {
            iMin *= -1;
        }
        return ((mainAxisItemSpacing * firstVisibleItemIndex) + iMin) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @NotNull
    public Density getDensity() {
        return this.f4698a.getDensity();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.f4698a.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.f4698a.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.f4698a.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getLastVisibleItemIndex() {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt___CollectionsKt.lastOrNull((List) this.f4698a.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.f4698a.getSlotsPerLine$foundation_release() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @Nullable
    public Integer getTargetItemOffset(int index) {
        LazyGridItemInfo lazyGridItemInfo;
        LazyGridState lazyGridState = this.f4698a;
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridState.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                lazyGridItemInfo = null;
                break;
            }
            lazyGridItemInfo = visibleItemsInfo.get(i10);
            if (lazyGridItemInfo.getIndex() == index) {
                break;
            }
            i10++;
        }
        LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
        if (lazyGridItemInfo2 != null) {
            return Integer.valueOf(lazyGridState.getIsVertical() ? IntOffset.m4508getYimpl(lazyGridItemInfo2.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()) : IntOffset.m4507getXimpl(lazyGridItemInfo2.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()));
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @Nullable
    public Object scroll(@NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objE = o.e(this.f4698a, null, function2, continuation, 1, null);
        return objE == ek.a.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void snapToItem(@NotNull ScrollScope scrollScope, int i10, int i11) {
        Intrinsics.checkNotNullParameter(scrollScope, "<this>");
        this.f4698a.snapToItemIndexInternal$foundation_release(i10, i11);
    }
}
