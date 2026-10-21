package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.mastercard.sonic.androidsvg.SVGParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CornerBasedShape.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0013\u0012\u0006\u0010\u000e\u001a\u00020\u0013\u0012\u0006\u0010\u000f\u001a\u00020\u0013\u0012\u0006\u0010\u0010\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJE\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0010\u001a\u00020\u0013H&J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0013R\u0017\u0010\r\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "topStart", "topEnd", "bottomEnd", "bottomStart", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/foundation/shape/CornerSize;", "copy", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "a", "Landroidx/compose/foundation/shape/CornerSize;", "getTopStart", "()Landroidx/compose/foundation/shape/CornerSize;", "b", "getTopEnd", "c", "getBottomEnd", "d", "getBottomStart", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CornerSize topStart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CornerSize topEnd;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CornerSize bottomEnd;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CornerSize bottomStart;

    public CornerBasedShape(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart) {
        Intrinsics.checkNotNullParameter(topStart, "topStart");
        Intrinsics.checkNotNullParameter(topEnd, "topEnd");
        Intrinsics.checkNotNullParameter(bottomEnd, "bottomEnd");
        Intrinsics.checkNotNullParameter(bottomStart, "bottomStart");
        this.topStart = topStart;
        this.topEnd = topEnd;
        this.bottomEnd = bottomEnd;
        this.bottomStart = bottomStart;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i10 & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i10 & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i10 & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @NotNull
    public final CornerBasedShape copy(@NotNull CornerSize all) {
        Intrinsics.checkNotNullParameter(all, "all");
        return copy(all, all, all, all);
    }

    @NotNull
    public abstract CornerBasedShape copy(@NotNull CornerSize topStart, @NotNull CornerSize topEnd, @NotNull CornerSize bottomEnd, @NotNull CornerSize bottomStart);

    @NotNull
    /* JADX INFO: renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo470createOutlineLjSzlW0(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, @NotNull LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final Outline mo157createOutlinePq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float fMo477toPxTmRCtEA = this.topStart.mo477toPxTmRCtEA(size, density);
        float fMo477toPxTmRCtEA2 = this.topEnd.mo477toPxTmRCtEA(size, density);
        float fMo477toPxTmRCtEA3 = this.bottomEnd.mo477toPxTmRCtEA(size, density);
        float fMo477toPxTmRCtEA4 = this.bottomStart.mo477toPxTmRCtEA(size, density);
        float fM2343getMinDimensionimpl = Size.m2343getMinDimensionimpl(size);
        float f6 = fMo477toPxTmRCtEA + fMo477toPxTmRCtEA4;
        if (f6 > fM2343getMinDimensionimpl) {
            float f10 = fM2343getMinDimensionimpl / f6;
            fMo477toPxTmRCtEA *= f10;
            fMo477toPxTmRCtEA4 *= f10;
        }
        float f11 = fMo477toPxTmRCtEA4;
        float f12 = fMo477toPxTmRCtEA2 + fMo477toPxTmRCtEA3;
        if (f12 > fM2343getMinDimensionimpl) {
            float f13 = fM2343getMinDimensionimpl / f12;
            fMo477toPxTmRCtEA2 *= f13;
            fMo477toPxTmRCtEA3 *= f13;
        }
        if (fMo477toPxTmRCtEA >= 0.0f && fMo477toPxTmRCtEA2 >= 0.0f && fMo477toPxTmRCtEA3 >= 0.0f && f11 >= 0.0f) {
            return mo470createOutlineLjSzlW0(size, fMo477toPxTmRCtEA, fMo477toPxTmRCtEA2, fMo477toPxTmRCtEA3, f11, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fMo477toPxTmRCtEA + ", topEnd = " + fMo477toPxTmRCtEA2 + ", bottomEnd = " + fMo477toPxTmRCtEA3 + ", bottomStart = " + f11 + ")!").toString());
    }

    @NotNull
    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    @NotNull
    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @NotNull
    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    @NotNull
    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
