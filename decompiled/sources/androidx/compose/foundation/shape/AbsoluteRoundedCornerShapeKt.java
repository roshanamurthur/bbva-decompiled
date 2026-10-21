package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbsoluteRoundedCornerShape.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u000e\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"AbsoluteRoundedCornerShape", "Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "AbsoluteRoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "topLeft", "topRight", "bottomRight", "bottomLeft", "AbsoluteRoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "", "percent", "", "topLeftPercent", "topRightPercent", "bottomRightPercent", "bottomLeftPercent", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbsoluteRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,195:1\n154#2:196\n154#2:197\n154#2:198\n154#2:199\n*S KotlinDebug\n*F\n+ 1 AbsoluteRoundedCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteRoundedCornerShapeKt\n*L\n142#1:196\n143#1:197\n144#1:198\n145#1:199\n*E\n"})
public final class AbsoluteRoundedCornerShapeKt {
    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(@NotNull CornerSize corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new AbsoluteRoundedCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f6, float f10, float f11, float f12, int i10, Object obj) {
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
        return AbsoluteRoundedCornerShape(f6, f10, f11, f12);
    }

    @NotNull
    /* JADX INFO: renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m474AbsoluteRoundedCornerShape0680j_4(float f6) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.m478CornerSize0680j_4(f6));
    }

    @NotNull
    /* JADX INFO: renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final AbsoluteRoundedCornerShape m475AbsoluteRoundedCornerShapea9UjIt4(float f6, float f10, float f11, float f12) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.m478CornerSize0680j_4(f6), CornerSizeKt.m478CornerSize0680j_4(f10), CornerSizeKt.m478CornerSize0680j_4(f11), CornerSizeKt.m478CornerSize0680j_4(f12));
    }

    /* JADX INFO: renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ AbsoluteRoundedCornerShape m476AbsoluteRoundedCornerShapea9UjIt4$default(float f6, float f10, float f11, float f12, int i10, Object obj) {
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
        return m475AbsoluteRoundedCornerShapea9UjIt4(f6, f10, f11, f12);
    }

    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f6) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f6));
    }

    public static /* synthetic */ AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
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
        return AbsoluteRoundedCornerShape(i10, i11, i12, i13);
    }

    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i10) {
        return AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i10));
    }

    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f6, float f10, float f11, float f12) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(f6), CornerSizeKt.CornerSize(f10), CornerSizeKt.CornerSize(f11), CornerSizeKt.CornerSize(f12));
    }

    @NotNull
    public static final AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i10, int i11, int i12, int i13) {
        return new AbsoluteRoundedCornerShape(CornerSizeKt.CornerSize(i10), CornerSizeKt.CornerSize(i11), CornerSizeKt.CornerSize(i12), CornerSizeKt.CornerSize(i13));
    }
}
