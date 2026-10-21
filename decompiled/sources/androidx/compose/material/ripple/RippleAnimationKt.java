package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RippleAnimation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u000b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "size", "", "getRippleStartRadius-uvyYCjk", "(J)F", "getRippleStartRadius", "Landroidx/compose/ui/unit/Density;", "", "bounded", "getRippleEndRadius-cSwnlzA", "(Landroidx/compose/ui/unit/Density;ZJ)F", "getRippleEndRadius", "material-ripple_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,194:1\n154#2:195\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimationKt\n*L\n189#1:195\n*E\n"})
public final class RippleAnimationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8973a = Dp.m4389constructorimpl(10);

    /* JADX INFO: renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m895getRippleEndRadiuscSwnlzA(@NotNull Density getRippleEndRadius, boolean z10, long j10) {
        Intrinsics.checkNotNullParameter(getRippleEndRadius, "$this$getRippleEndRadius");
        float fM2273getDistanceimpl = Offset.m2273getDistanceimpl(OffsetKt.Offset(Size.m2344getWidthimpl(j10), Size.m2341getHeightimpl(j10))) / 2.0f;
        return z10 ? fM2273getDistanceimpl + getRippleEndRadius.mo415toPx0680j_4(f8973a) : fM2273getDistanceimpl;
    }

    /* JADX INFO: renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m896getRippleStartRadiusuvyYCjk(long j10) {
        return Math.max(Size.m2344getWidthimpl(j10), Size.m2341getHeightimpl(j10)) * 0.3f;
    }
}
