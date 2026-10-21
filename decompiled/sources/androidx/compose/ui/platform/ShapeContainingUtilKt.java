package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShapeContainingUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/Outline;", "outline", "", "x", "y", "Landroidx/compose/ui/graphics/Path;", "tmpTouchPointPath", "tmpOpPath", "", "isInOutline", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class ShapeContainingUtilKt {
    public static final boolean a(Path path, float f6, float f10, Path path2, Path path3) {
        Rect rect = new Rect(f6 - 0.005f, f10 - 0.005f, f6 + 0.005f, f10 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.addRect(rect);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo2409opN5in7k0(path, path2, PathOperation.INSTANCE.m2758getIntersectb3I0S0c());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    public static final boolean b(float f6, float f10, float f11, float f12, long j10) {
        float f13 = f6 - f11;
        float f14 = f10 - f12;
        float fM2250getXimpl = CornerRadius.m2250getXimpl(j10);
        float fM2251getYimpl = CornerRadius.m2251getYimpl(j10);
        return ((f14 * f14) / (fM2251getYimpl * fM2251getYimpl)) + ((f13 * f13) / (fM2250getXimpl * fM2250getXimpl)) <= 1.0f;
    }

    public static final boolean isInOutline(@NotNull Outline outline, float f6, float f10, @Nullable Path path, @Nullable Path path2) {
        boolean zB;
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (!(outline instanceof Outline.Rectangle)) {
            if (!(outline instanceof Outline.Rounded)) {
                if (outline instanceof Outline.Generic) {
                    return a(((Outline.Generic) outline).getPath(), f6, f10, path, path2);
                }
                throw new NoWhenBranchMatchedException();
            }
            RoundRect roundRect = ((Outline.Rounded) outline).getRoundRect();
            if (f6 < roundRect.getLeft() || f6 >= roundRect.getRight() || f10 < roundRect.getTop() || f10 >= roundRect.getBottom()) {
                return false;
            }
            if (CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) <= roundRect.getWidth()) {
                if (CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) + CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getWidth()) {
                    if (CornerRadius.m2251getYimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight()) {
                        if (CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs()) + CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs()) <= roundRect.getHeight()) {
                            float left = roundRect.getLeft() + CornerRadius.m2250getXimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs());
                            float top = roundRect.getTop() + CornerRadius.m2251getYimpl(roundRect.m2325getTopLeftCornerRadiuskKHJgLs());
                            float right = roundRect.getRight() - CornerRadius.m2250getXimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs());
                            float top2 = roundRect.getTop() + CornerRadius.m2251getYimpl(roundRect.m2326getTopRightCornerRadiuskKHJgLs());
                            float right2 = roundRect.getRight() - CornerRadius.m2250getXimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs());
                            float bottom = roundRect.getBottom() - CornerRadius.m2251getYimpl(roundRect.m2324getBottomRightCornerRadiuskKHJgLs());
                            float bottom2 = roundRect.getBottom() - CornerRadius.m2251getYimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs());
                            float left2 = roundRect.getLeft() + CornerRadius.m2250getXimpl(roundRect.m2323getBottomLeftCornerRadiuskKHJgLs());
                            if (f6 < left && f10 < top) {
                                zB = b(f6, f10, left, top, roundRect.m2325getTopLeftCornerRadiuskKHJgLs());
                            } else if (f6 < left2 && f10 > bottom2) {
                                zB = b(f6, f10, left2, bottom2, roundRect.m2323getBottomLeftCornerRadiuskKHJgLs());
                            } else if (f6 > right && f10 < top2) {
                                zB = b(f6, f10, right, top2, roundRect.m2326getTopRightCornerRadiuskKHJgLs());
                            } else if (f6 > right2 && f10 > bottom) {
                                zB = b(f6, f10, right2, bottom, roundRect.m2324getBottomRightCornerRadiuskKHJgLs());
                            }
                            return zB;
                        }
                    }
                }
            }
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect(roundRect);
            return a(Path, f6, f10, path, path2);
        }
        Rect rect = ((Outline.Rectangle) outline).getRect();
        if (rect.getLeft() > f6 || f6 >= rect.getRight() || rect.getTop() > f10 || f10 >= rect.getBottom()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f6, float f10, Path path, Path path2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            path = null;
        }
        if ((i10 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f6, f10, path, path2);
    }
}
