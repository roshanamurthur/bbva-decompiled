package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0003\b\t\nJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "", "calculateCrossAxisCellSizes", "", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "Adaptive", "Fixed", "FixedSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GridCells {

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Adaptive;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "Landroidx/compose/ui/unit/Dp;", "minSize", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,557:1\n154#2:558\n1#3:559\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n298#1:558\n*E\n"})
    public static final class Adaptive implements GridCells {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f4694a;

        public Adaptive(float f6, DefaultConstructorMarker defaultConstructorMarker) {
            this.f4694a = f6;
            if (Dp.m4388compareTo0680j_4(f6, Dp.m4389constructorimpl(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided min size " + ((Object) Dp.m4400toStringimpl(f6)) + " should be larger than zero.").toString());
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        @NotNull
        public List<Integer> calculateCrossAxisCellSizes(@NotNull Density density, int i10, int i11) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return LazyGridDslKt.access$calculateCellsCrossAxisSizeImpl(i10, Math.max((i10 + i11) / (density.mo413roundToPx0680j_4(this.f4694a) + i11), 1), i11);
        }

        public boolean equals(@Nullable Object other) {
            if (other instanceof Adaptive) {
                if (Dp.m4394equalsimpl0(this.f4694a, ((Adaptive) other).f4694a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Dp.m4395hashCodeimpl(this.f4694a);
        }
    }

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "count", "<init>", "(I)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,557:1\n1#2:558\n*E\n"})
    public static final class Fixed implements GridCells {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4695a;

        public Fixed(int i10) {
            this.f4695a = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Provided count ", i10, " should be larger than zero").toString());
            }
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        @NotNull
        public List<Integer> calculateCrossAxisCellSizes(@NotNull Density density, int i10, int i11) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return LazyGridDslKt.access$calculateCellsCrossAxisSizeImpl(i10, this.f4695a, i11);
        }

        public boolean equals(@Nullable Object other) {
            if (other instanceof Fixed) {
                if (this.f4695a == ((Fixed) other).f4695a) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return -this.f4695a;
        }
    }

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$FixedSize;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "Landroidx/compose/ui/unit/Dp;", "size", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,557:1\n154#2:558\n1#3:559\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n*L\n331#1:558\n*E\n"})
    public static final class FixedSize implements GridCells {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f4696a;

        public FixedSize(float f6, DefaultConstructorMarker defaultConstructorMarker) {
            this.f4696a = f6;
            if (Dp.m4388compareTo0680j_4(f6, Dp.m4389constructorimpl(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided size " + ((Object) Dp.m4400toStringimpl(f6)) + " should be larger than zero.").toString());
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        @NotNull
        public List<Integer> calculateCrossAxisCellSizes(@NotNull Density density, int i10, int i11) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            int iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(this.f4696a);
            int i12 = iMo413roundToPx0680j_4 + i11;
            int i13 = i11 + i10;
            if (i12 >= i13) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i10));
                return arrayList;
            }
            int i14 = i13 / i12;
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList2.add(Integer.valueOf(iMo413roundToPx0680j_4));
            }
            return arrayList2;
        }

        public boolean equals(@Nullable Object other) {
            if (other instanceof FixedSize) {
                if (Dp.m4394equalsimpl0(this.f4696a, ((FixedSize) other).f4696a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Dp.m4395hashCodeimpl(this.f4696a);
        }
    }

    @NotNull
    List<Integer> calculateCrossAxisCellSizes(@NotNull Density density, int i10, int i11);
}
