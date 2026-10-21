package androidx.camera.core.internal;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.g0;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ViewPorts {
    private ViewPorts() {
    }

    @NonNull
    public static Map<UseCase, Rect> calculateViewPortRects(@NonNull Rect rect, boolean z10, @NonNull Rational rational, @IntRange(from = 0, to = 359) int i10, int i11, int i12, @NonNull Map<UseCase, Size> map) {
        Preconditions.checkArgument(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<UseCase, Size> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getWidth(), entry.getValue().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF scaledRect = getScaledRect(rectF2, ImageUtil.getRotatedAspectRatio(i10, rational), i11, z10, i12, i10);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((UseCase) entry2.getKey(), rect2);
        }
        return map3;
    }

    private static RectF correctStartOrEnd(boolean z10, @IntRange(from = 0, to = 359) int i10, RectF rectF, RectF rectF2) {
        boolean z11 = false;
        boolean z12 = i10 == 0 && !z10;
        boolean z13 = i10 == 90 && z10;
        if (z12 || z13) {
            return rectF2;
        }
        boolean z14 = i10 == 0 && z10;
        boolean z15 = i10 == 270 && !z10;
        if (z14 || z15) {
            return flipHorizontally(rectF2, rectF.centerX());
        }
        boolean z16 = i10 == 90 && !z10;
        boolean z17 = i10 == 180 && z10;
        if (z16 || z17) {
            return flipVertically(rectF2, rectF.centerY());
        }
        boolean z18 = i10 == 180 && !z10;
        if (i10 == 270 && z10) {
            z11 = true;
        }
        if (z18 || z11) {
            return flipHorizontally(flipVertically(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z10 + " rotation " + i10);
    }

    private static RectF flipHorizontally(RectF rectF, float f6) {
        return new RectF(flipX(rectF.right, f6), rectF.top, flipX(rectF.left, f6), rectF.bottom);
    }

    private static RectF flipVertically(RectF rectF, float f6) {
        return new RectF(rectF.left, flipY(rectF.bottom, f6), rectF.right, flipY(rectF.top, f6));
    }

    private static float flipX(float f6, float f10) {
        return (f10 + f10) - f6;
    }

    private static float flipY(float f6, float f10) {
        return (f10 + f10) - f6;
    }

    @NonNull
    @SuppressLint({"SwitchIntDef"})
    public static RectF getScaledRect(@NonNull RectF rectF, @NonNull Rational rational, int i10, boolean z10, int i11, @IntRange(from = 0, to = 359) int i12) {
        if (i10 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i10 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i10 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(g0.c("Unexpected scale type: ", i10));
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return correctStartOrEnd(shouldMirrorStartAndEnd(z10, i11), i12, rectF, rectF3);
    }

    private static boolean shouldMirrorStartAndEnd(boolean z10, int i10) {
        return z10 ^ (i10 == 1);
    }
}
