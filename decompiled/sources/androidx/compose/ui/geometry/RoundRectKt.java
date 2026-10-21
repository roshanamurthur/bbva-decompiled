package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adobe.marketing.mobile.EventDataKeys;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a#\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aC\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a;\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001f\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "translate", TypedValues.CycleType.S_WAVE_OFFSET, "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f6, float f10, float f11, float f12, float f13, float f14) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f13, f14);
        return new RoundRect(f6, f10, f11, f12, jCornerRadius, jCornerRadius, jCornerRadius, jCornerRadius, null);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m2327RoundRectZAM2FJo(@NotNull Rect rect, long j10, long j11, long j12, long j13) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j10, j11, j12, j13, null);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m2329RoundRectgG7oq9Y(float f6, float f10, float f11, float f12, long j10) {
        return RoundRect(f6, f10, f11, f12, CornerRadius.m2250getXimpl(j10), CornerRadius.m2251getYimpl(j10));
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m2330RoundRectsniSvfs(@NotNull Rect rect, long j10) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect, CornerRadius.m2250getXimpl(j10), CornerRadius.m2251getYimpl(j10));
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return OffsetKt.Offset((roundRect.getWidth() / 2.0f) + roundRect.getLeft(), (roundRect.getHeight() / 2.0f) + roundRect.getTop());
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        float fMax = Math.max(CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()));
        float fMax2 = Math.max(CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()));
        return new Rect((fMax * 0.29289323f) + roundRect.getLeft(), (fMax2 * 0.29289323f) + roundRect.getTop(), roundRect.getRight() - (Math.max(CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()), CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m2251getYimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) && ((double) roundRect.getWidth()) <= ((double) CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs())) * 2.0d && ((double) roundRect.getHeight()) <= ((double) CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs())) * 2.0d;
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        float left = roundRect.getLeft();
        if (!Float.isInfinite(left) && !Float.isNaN(left)) {
            float top = roundRect.getTop();
            if (!Float.isInfinite(top) && !Float.isNaN(top)) {
                float right = roundRect.getRight();
                if (!Float.isInfinite(right) && !Float.isNaN(right)) {
                    float bottom = roundRect.getBottom();
                    if (!Float.isInfinite(bottom) && !Float.isNaN(bottom)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return (CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == 0.0f) && (CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) == 0.0f) && ((CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m2251getYimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) && (CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) == 0.0f || CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) == 0.0f));
    }

    public static final boolean isSimple(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) && CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) && CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) && CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) && CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m2251getYimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs());
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect start, @NotNull RoundRect stop, float f6) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new RoundRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f6), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f6), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f6), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f6), CornerRadiusKt.m2261lerp3Ry4LBc(start.m2325getTopLeftCornerRadiuskKHJgLs(), stop.m2325getTopLeftCornerRadiuskKHJgLs(), f6), CornerRadiusKt.m2261lerp3Ry4LBc(start.m2326getTopRightCornerRadiuskKHJgLs(), stop.m2326getTopRightCornerRadiuskKHJgLs(), f6), CornerRadiusKt.m2261lerp3Ry4LBc(start.m2324getBottomRightCornerRadiuskKHJgLs(), stop.m2324getBottomRightCornerRadiuskKHJgLs(), f6), CornerRadiusKt.m2261lerp3Ry4LBc(start.m2323getBottomLeftCornerRadiuskKHJgLs(), stop.m2323getBottomLeftCornerRadiuskKHJgLs(), f6), null);
    }

    @NotNull
    /* JADX INFO: renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m2331translateUv8p0NA(@NotNull RoundRect translate, long j10) {
        Intrinsics.checkNotNullParameter(translate, "$this$translate");
        return new RoundRect(translate.getLeft() + Offset.m2275getXimpl(j10), translate.getTop() + Offset.m2276getYimpl(j10), translate.getRight() + Offset.m2275getXimpl(j10), translate.getBottom() + Offset.m2276getYimpl(j10), translate.m2325getTopLeftCornerRadiuskKHJgLs(), translate.m2326getTopRightCornerRadiuskKHJgLs(), translate.m2324getBottomRightCornerRadiuskKHJgLs(), translate.m2323getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f6, float f10) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f6, f10);
    }
}
