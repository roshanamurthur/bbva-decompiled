package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.f;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyListMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0080\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020100\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u00109\u001a\u00020\u0016\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\u0006\u0010<\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004ø\u0001\u0002¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u001e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR$\u0010\u0006\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b\u000e\u0010\u0015R\u001a\u0010'\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0015R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0015R\u0011\u0010/\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010\u0015\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "", FirebaseAnalytics.Param.INDEX, "", "getParentData", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "", "position", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-Bjo55l4", "(I)J", "getOffset", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "place", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex", "()I", "", "c", "Z", "isVertical", "()Z", "l", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "m", "getContentType", "contentType", "<set-?>", "n", "o", "getSize", "size", "p", "getSizeWithSpacings", "sizeWithSpacings", "q", "getCrossAxisSize", "crossAxisSize", "getPlaceablesCount", "placeablesCount", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "visualOffset", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,171:1\n168#1:186\n33#2,6:172\n69#2,6:178\n1#3:184\n86#4:185\n86#4:187\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n152#1:186\n84#1:172,6\n110#1:178,6\n142#1:185\n156#1:187\n*E\n"})
public final class LazyListMeasuredItem implements LazyListItemInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Placeable> f4623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Alignment.Horizontal f4625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Alignment.Vertical f4626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f4627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f4632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object key;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final Object contentType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int offset;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final int sizeWithSpacings;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final int crossAxisSize;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4640t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final int[] f4641u;

    public LazyListMeasuredItem() {
        throw null;
    }

    @ExperimentalFoundationApi
    public LazyListMeasuredItem(int i10, List placeables, boolean z10, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z11, int i11, int i12, int i13, long j10, Object key, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(key, "key");
        this.index = i10;
        this.f4623b = placeables;
        this.isVertical = z10;
        this.f4625d = horizontal;
        this.f4626e = vertical;
        this.f4627f = layoutDirection;
        this.f4628g = z11;
        this.f4629h = i11;
        this.f4630i = i12;
        this.f4631j = i13;
        this.f4632k = j10;
        this.key = key;
        this.contentType = obj;
        this.f4638r = Integer.MIN_VALUE;
        int size = placeables.size();
        int height = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Placeable placeable = (Placeable) placeables.get(i14);
            height += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        this.sizeWithSpacings = c.coerceAtLeast(getSize() + this.f4631j, 0);
        this.crossAxisSize = iMax;
        this.f4641u = new int[this.f4623b.size() * 2];
    }

    public final int a(long j10) {
        return this.isVertical ? IntOffset.m4508getYimpl(j10) : IntOffset.m4507getXimpl(j10);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @Nullable
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long m370getOffsetBjo55l4(int index) {
        int i10 = index * 2;
        int[] iArr = this.f4641u;
        return IntOffsetKt.IntOffset(iArr[i10], iArr[i10 + 1]);
    }

    @Nullable
    public final Object getParentData(int index) {
        return this.f4623b.get(index).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.f4623b.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.f4638r == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            Placeable placeable = this.f4623b.get(i10);
            int i11 = this.f4639s;
            boolean z10 = this.isVertical;
            int height = i11 - (z10 ? placeable.getHeight() : placeable.getWidth());
            int i12 = this.f4640t;
            long jM370getOffsetBjo55l4 = m370getOffsetBjo55l4(i10);
            Object parentData = getParentData(i10);
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null;
            if (lazyLayoutAnimateItemModifierNode != null) {
                long jM396getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m396getPlacementDeltanOccac();
                long jB = f.b(jM396getPlacementDeltanOccac, IntOffset.m4508getYimpl(jM370getOffsetBjo55l4), IntOffset.m4507getXimpl(jM396getPlacementDeltanOccac) + IntOffset.m4507getXimpl(jM370getOffsetBjo55l4));
                if ((a(jM370getOffsetBjo55l4) <= height && a(jB) <= height) || (a(jM370getOffsetBjo55l4) >= i12 && a(jB) >= i12)) {
                    lazyLayoutAnimateItemModifierNode.cancelAnimation();
                }
                jM370getOffsetBjo55l4 = jB;
            }
            if (this.f4628g) {
                int iM4507getXimpl = IntOffset.m4507getXimpl(jM370getOffsetBjo55l4);
                if (!z10) {
                    iM4507getXimpl = (this.f4638r - iM4507getXimpl) - (z10 ? placeable.getHeight() : placeable.getWidth());
                }
                jM370getOffsetBjo55l4 = IntOffsetKt.IntOffset(iM4507getXimpl, z10 ? (this.f4638r - IntOffset.m4508getYimpl(jM370getOffsetBjo55l4)) - (z10 ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m4508getYimpl(jM370getOffsetBjo55l4));
            }
            int iM4507getXimpl2 = IntOffset.m4507getXimpl(jM370getOffsetBjo55l4);
            long j10 = this.f4632k;
            long jB2 = f.b(j10, IntOffset.m4508getYimpl(jM370getOffsetBjo55l4), IntOffset.m4507getXimpl(j10) + iM4507getXimpl2);
            if (z10) {
                Placeable.PlacementScope.m3614placeWithLayeraW9wM$default(scope, placeable, jB2, 0.0f, null, 6, null);
            } else {
                Placeable.PlacementScope.m3613placeRelativeWithLayeraW9wM$default(scope, placeable, jB2, 0.0f, null, 6, null);
            }
        }
    }

    public final void position(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        boolean z10 = this.isVertical;
        this.f4638r = z10 ? layoutHeight : layoutWidth;
        List<Placeable> list = this.f4623b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = list.get(i10);
            int i11 = i10 * 2;
            int[] iArr = this.f4641u;
            if (z10) {
                Alignment.Horizontal horizontal = this.f4625d;
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iArr[i11] = horizontal.align(placeable.getWidth(), layoutWidth, this.f4627f);
                iArr[i11 + 1] = offset;
                width = placeable.getHeight();
            } else {
                iArr[i11] = offset;
                int i12 = i11 + 1;
                Alignment.Vertical vertical = this.f4626e;
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iArr[i12] = vertical.align(placeable.getHeight(), layoutHeight);
                width = placeable.getWidth();
            }
            offset = width + offset;
        }
        this.f4639s = -this.f4629h;
        this.f4640t = this.f4638r + this.f4630i;
    }
}
