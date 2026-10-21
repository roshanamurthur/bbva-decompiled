package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MeasuredPage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Bd\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "", "position", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "place", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex", "()I", FirebaseAnalytics.Param.INDEX, "b", "getSize", "size", "", "e", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "k", "getCrossAxisSize", "crossAxisSize", "<set-?>", "m", "getOffset", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "reverseLayout", "<init>", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,119:1\n115#1:133\n33#2,6:120\n69#2,6:126\n1#3:132\n86#4:134\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n98#1:133\n52#1:120,6\n76#1:126,6\n102#1:134\n*E\n"})
public final class MeasuredPage implements PageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Placeable> f5364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object key;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Alignment.Horizontal f5367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Alignment.Vertical f5368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f5369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int crossAxisSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final int[] f5373l;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int offset;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5374n;

    public MeasuredPage() {
        throw null;
    }

    public MeasuredPage(int i10, int i11, List placeables, long j10, Object key, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.index = i10;
        this.size = i11;
        this.f5364c = placeables;
        this.f5365d = j10;
        this.key = key;
        this.f5367f = horizontal;
        this.f5368g = vertical;
        this.f5369h = layoutDirection;
        this.f5370i = z10;
        this.f5371j = orientation == Orientation.Vertical;
        int size = placeables.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Placeable placeable = (Placeable) placeables.get(i12);
            iMax = Math.max(iMax, !this.f5371j ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = iMax;
        this.f5373l = new int[this.f5364c.size() * 2];
        this.f5374n = Integer.MIN_VALUE;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    @NotNull
    public final Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.f5374n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        List<Placeable> list = this.f5364c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = list.get(i10);
            int i11 = i10 * 2;
            int[] iArr = this.f5373l;
            long jIntOffset = IntOffsetKt.IntOffset(iArr[i11], iArr[i11 + 1]);
            boolean z10 = this.f5370i;
            boolean z11 = this.f5371j;
            if (z10) {
                int iM4507getXimpl = IntOffset.m4507getXimpl(jIntOffset);
                if (!z11) {
                    iM4507getXimpl = (this.f5374n - iM4507getXimpl) - (z11 ? placeable.getHeight() : placeable.getWidth());
                }
                jIntOffset = IntOffsetKt.IntOffset(iM4507getXimpl, z11 ? (this.f5374n - IntOffset.m4508getYimpl(jIntOffset)) - (z11 ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m4508getYimpl(jIntOffset));
            }
            int iM4507getXimpl2 = IntOffset.m4507getXimpl(jIntOffset);
            long j10 = this.f5365d;
            long jB = androidx.databinding.f.b(j10, IntOffset.m4508getYimpl(jIntOffset), IntOffset.m4507getXimpl(j10) + iM4507getXimpl2);
            if (z11) {
                Placeable.PlacementScope.m3614placeWithLayeraW9wM$default(scope, placeable, jB, 0.0f, null, 6, null);
            } else {
                Placeable.PlacementScope.m3613placeRelativeWithLayeraW9wM$default(scope, placeable, jB, 0.0f, null, 6, null);
            }
        }
    }

    public final void position(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        boolean z10 = this.f5371j;
        this.f5374n = z10 ? layoutHeight : layoutWidth;
        List<Placeable> list = this.f5364c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = list.get(i10);
            int i11 = i10 * 2;
            int[] iArr = this.f5373l;
            if (z10) {
                Alignment.Horizontal horizontal = this.f5367f;
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iArr[i11] = horizontal.align(placeable.getWidth(), layoutWidth, this.f5369h);
                iArr[i11 + 1] = offset;
                width = placeable.getHeight();
            } else {
                iArr[i11] = offset;
                int i12 = i11 + 1;
                Alignment.Vertical vertical = this.f5368g;
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iArr[i12] = vertical.align(placeable.getHeight(), layoutHeight);
                width = placeable.getWidth();
            }
            offset = width + offset;
        }
    }
}
