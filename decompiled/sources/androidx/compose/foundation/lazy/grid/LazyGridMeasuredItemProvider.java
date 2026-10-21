package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridMeasuredItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ@\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "", "", FirebaseAnalytics.Param.INDEX, "mainAxisSpacing", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getAndMeasure-3p2s80s", "(IIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getAndMeasure", "key", "contentType", "crossAxisSize", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "defaultMainAxisSpacing", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;I)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public abstract class LazyGridMeasuredItemProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyGridItemProvider f4832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyLayoutMeasureScope f4833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4834c;

    @ExperimentalFoundationApi
    public LazyGridMeasuredItemProvider(@NotNull LazyGridItemProvider itemProvider, @NotNull LazyLayoutMeasureScope measureScope, int i10) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        this.f4832a = itemProvider;
        this.f4833b = measureScope;
        this.f4834c = i10;
    }

    /* JADX INFO: renamed from: getAndMeasure-3p2s80s$default, reason: not valid java name */
    public static /* synthetic */ LazyGridMeasuredItem m390getAndMeasure3p2s80s$default(LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i10, int i11, long j10, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-3p2s80s");
        }
        if ((i12 & 2) != 0) {
            i11 = lazyGridMeasuredItemProvider.f4834c;
        }
        return lazyGridMeasuredItemProvider.m391getAndMeasure3p2s80s(i10, i11, j10);
    }

    @NotNull
    public abstract LazyGridMeasuredItem createItem(int index, @NotNull Object key, @Nullable Object contentType, int crossAxisSize, int mainAxisSpacing, @NotNull List<? extends Placeable> placeables);

    @NotNull
    /* JADX INFO: renamed from: getAndMeasure-3p2s80s, reason: not valid java name */
    public final LazyGridMeasuredItem m391getAndMeasure3p2s80s(int index, int mainAxisSpacing, long constraints) {
        int iM4358getMinHeightimpl;
        LazyGridItemProvider lazyGridItemProvider = this.f4832a;
        Object key = lazyGridItemProvider.getKey(index);
        Object contentType = lazyGridItemProvider.getContentType(index);
        List<Placeable> listMo403measure0kLqBqw = this.f4833b.mo403measure0kLqBqw(index, constraints);
        if (Constraints.m4355getHasFixedWidthimpl(constraints)) {
            iM4358getMinHeightimpl = Constraints.m4359getMinWidthimpl(constraints);
        } else {
            if (!Constraints.m4354getHasFixedHeightimpl(constraints)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            iM4358getMinHeightimpl = Constraints.m4358getMinHeightimpl(constraints);
        }
        return createItem(index, key, contentType, iM4358getMinHeightimpl, mainAxisSpacing, listMo403measure0kLqBqw);
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f4832a.getKeyIndexMap();
    }
}
