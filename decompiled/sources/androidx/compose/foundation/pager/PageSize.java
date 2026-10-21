package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PageSize;", "", "calculateMainAxisPageSize", "", "Landroidx/compose/ui/unit/Density;", "availableSpace", "pageSpacing", "Fill", "Fixed", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PageSize {

    /* JADX INFO: compiled from: Pager.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fill;", "Landroidx/compose/foundation/pager/PageSize;", "()V", "calculateMainAxisPageSize", "", "Landroidx/compose/ui/unit/Density;", "availableSpace", "pageSpacing", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ExperimentalFoundationApi
    public static final class Fill implements PageSize {
        public static final int $stable = 0;

        @NotNull
        public static final Fill INSTANCE = new Fill();

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(@NotNull Density density, int i10, int i11) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return i10;
        }
    }

    /* JADX INFO: compiled from: Pager.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\f\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016R \u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/pager/PageSize$Fixed;", "Landroidx/compose/foundation/pager/PageSize;", "Landroidx/compose/ui/unit/Density;", "", "availableSpace", "pageSpacing", "calculateMainAxisPageSize", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getPageSize-D9Ej5fM", "()F", "pageSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @ExperimentalFoundationApi
    public static final class Fixed implements PageSize {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float pageSize;

        public Fixed(float f6, DefaultConstructorMarker defaultConstructorMarker) {
            this.pageSize = f6;
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(@NotNull Density density, int i10, int i11) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return density.mo413roundToPx0680j_4(this.pageSize);
        }

        /* JADX INFO: renamed from: getPageSize-D9Ej5fM, reason: not valid java name and from getter */
        public final float getPageSize() {
            return this.pageSize;
        }
    }

    int calculateMainAxisPageSize(@NotNull Density density, int i10, int i11);
}
