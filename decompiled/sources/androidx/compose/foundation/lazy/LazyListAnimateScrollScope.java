package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
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

/* JADX INFO: compiled from: LazyListAnimateScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J<\u0010\u0012\u001a\u00020\b2'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0014\u0010$\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "", FirebaseAnalytics.Param.INDEX, "getTargetItemOffset", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "", "snapToItem", "targetScrollOffset", "", "expectedDistanceTo", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNumOfItemsForTeleport", "()I", "numOfItemsForTeleport", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "getFirstVisibleItemIndex", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n116#2,2:68\n33#2,6:70\n118#2:76\n132#2,3:77\n33#2,4:80\n135#2,2:84\n38#2:86\n137#2:87\n*S KotlinDebug\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n*L\n44#1:68,2\n44#1:70,6\n44#1:76\n56#1:77,3\n56#1:80,4\n56#1:84,2\n56#1:86\n56#1:87\n*E\n"})
public final class LazyListAnimateScrollScope implements LazyAnimateScrollScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyListState f4558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int numOfItemsForTeleport;

    public LazyListAnimateScrollScope(@NotNull LazyListState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f4558a = state;
        this.numOfItemsForTeleport = 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int index, int targetScrollOffset) {
        LazyListLayoutInfo layoutInfo = this.f4558a.getLayoutInfo();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            size2 += visibleItemsInfo.get(i10).getSize();
        }
        int mainAxisItemSpacing = layoutInfo.getMainAxisItemSpacing() + (size2 / visibleItemsInfo.size());
        int firstVisibleItemIndex = index - getFirstVisibleItemIndex();
        int iMin = Math.min(Math.abs(targetScrollOffset), mainAxisItemSpacing);
        if (targetScrollOffset < 0) {
            iMin *= -1;
        }
        return ((mainAxisItemSpacing * firstVisibleItemIndex) + iMin) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @NotNull
    public Density getDensity() {
        return this.f4558a.getDensity();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.f4558a.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.f4558a.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.f4558a.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getLastVisibleItemIndex() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt___CollectionsKt.lastOrNull((List) this.f4558a.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.numOfItemsForTeleport;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @Nullable
    public Integer getTargetItemOffset(int index) {
        LazyListItemInfo lazyListItemInfo;
        List<LazyListItemInfo> visibleItemsInfo = this.f4558a.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                lazyListItemInfo = null;
                break;
            }
            lazyListItemInfo = visibleItemsInfo.get(i10);
            if (lazyListItemInfo.getIndex() == index) {
                break;
            }
            i10++;
        }
        LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
        if (lazyListItemInfo2 != null) {
            return Integer.valueOf(lazyListItemInfo2.getOffset());
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @Nullable
    public Object scroll(@NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objE = o.e(this.f4558a, null, function2, continuation, 1, null);
        return objE == ek.a.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void snapToItem(@NotNull ScrollScope scrollScope, int i10, int i11) {
        Intrinsics.checkNotNullParameter(scrollScope, "<this>");
        this.f4558a.snapToItemIndexInternal$foundation_release(i10, i11);
    }
}
