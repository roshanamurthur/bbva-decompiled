package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RoundedCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0011\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\b\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t\u001a;\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a.\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b\u001a.\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t\"\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/shape/CornerSize;", "corner", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "RoundedCornerShape", "Landroidx/compose/ui/unit/Dp;", "size", "RoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "", "", "percent", "topStart", "topEnd", "bottomEnd", "bottomStart", "RoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "a", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCircleShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CircleShape", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,200:1\n154#2:201\n154#2:202\n154#2:203\n154#2:204\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n147#1:201\n148#1:202\n149#1:203\n150#1:204\n*E\n"})
public final class RoundedCornerShapeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final RoundedCornerShape f5635a = RoundedCornerShape(50);

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(@NotNull CornerSize corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new RoundedCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f12 = 0.0f;
        }
        return RoundedCornerShape(f6, f10, f11, f12);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final RoundedCornerShape m482RoundedCornerShape0680j_4(float f6) {
        return RoundedCornerShape(CornerSizeKt.m478CornerSize0680j_4(f6));
    }

    @NotNull
    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final RoundedCornerShape m483RoundedCornerShapea9UjIt4(float f6, float f10, float f11, float f12) {
        return new RoundedCornerShape(CornerSizeKt.m478CornerSize0680j_4(f6), CornerSizeKt.m478CornerSize0680j_4(f10), CornerSizeKt.m478CornerSize0680j_4(f11), CornerSizeKt.m478CornerSize0680j_4(f12));
    }

    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m484RoundedCornerShapea9UjIt4$default(float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f11 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f12 = Dp.m4389constructorimpl(0);
        }
        return m483RoundedCornerShapea9UjIt4(f6, f10, f11, f12);
    }

    @NotNull
    public static final RoundedCornerShape getCircleShape() {
        return f5635a;
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(float f6) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(f6));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return RoundedCornerShape(i10, i11, i12, i13);
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(int i10) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i10));
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(float f6, float f10, float f11, float f12) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(f6), CornerSizeKt.CornerSize(f10), CornerSizeKt.CornerSize(f11), CornerSizeKt.CornerSize(f12));
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(int i10, int i11, int i12, int i13) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(i10), CornerSizeKt.CornerSize(i11), CornerSizeKt.CornerSize(i12), CornerSizeKt.CornerSize(i13));
    }
}
