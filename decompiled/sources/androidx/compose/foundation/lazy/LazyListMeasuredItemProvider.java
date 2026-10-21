package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyListMeasuredItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B,\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J0\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&R \u0010\u0011\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getAndMeasure", "key", "contentType", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem", "Landroidx/compose/ui/unit/Constraints;", "c", "J", "getChildConstraints-msEJaDk", "()J", "childConstraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "<init>", "(JZLandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public abstract class LazyListMeasuredItemProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyListItemProvider f4642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyLayoutMeasureScope f4643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long childConstraints;

    @ExperimentalFoundationApi
    public LazyListMeasuredItemProvider(long j10, boolean z10, LazyListItemProvider itemProvider, LazyLayoutMeasureScope measureScope, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        this.f4642a = itemProvider;
        this.f4643b = measureScope;
        this.childConstraints = ConstraintsKt.Constraints$default(0, z10 ? Constraints.m4357getMaxWidthimpl(j10) : Integer.MAX_VALUE, 0, !z10 ? Constraints.m4356getMaxHeightimpl(j10) : Integer.MAX_VALUE, 5, null);
    }

    @NotNull
    public abstract LazyListMeasuredItem createItem(int index, @NotNull Object key, @Nullable Object contentType, @NotNull List<? extends Placeable> placeables);

    @NotNull
    public final LazyListMeasuredItem getAndMeasure(int index) {
        LazyListItemProvider lazyListItemProvider = this.f4642a;
        return createItem(index, lazyListItemProvider.getKey(index), lazyListItemProvider.getContentType(index), this.f4643b.mo403measure0kLqBqw(index, this.childConstraints));
    }

    /* JADX INFO: renamed from: getChildConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f4642a.getKeyIndexMap();
    }
}
