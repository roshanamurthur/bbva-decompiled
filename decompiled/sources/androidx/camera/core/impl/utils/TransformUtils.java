package androidx.camera.core.impl.utils;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.g0;
import androidx.core.util.Preconditions;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class TransformUtils {
    public static final RectF NORMALIZED_RECT = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private TransformUtils() {
    }

    @NonNull
    public static Matrix getExifTransform(int i10, int i11, int i12) {
        Matrix matrix = new Matrix();
        float f6 = i11;
        float f10 = i12;
        RectF rectF = new RectF(0.0f, 0.0f, f6, f10);
        RectF rectF2 = NORMALIZED_RECT;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF2, scaleToFit);
        switch (i10) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f10, f6);
                break;
            case 6:
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f10, f6);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                rectF = new RectF(0.0f, 0.0f, f10, f6);
                break;
            case 8:
                matrix.postRotate(270.0f);
                rectF = new RectF(0.0f, 0.0f, f10, f6);
                break;
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    @NonNull
    public static Matrix getNormalizedToBuffer(@NonNull Rect rect) {
        return getNormalizedToBuffer(new RectF(rect));
    }

    @NonNull
    public static Matrix getRectToRect(@NonNull RectF rectF, @NonNull RectF rectF2, int i10) {
        return getRectToRect(rectF, rectF2, i10, false);
    }

    public static boolean hasCropping(@NonNull Rect rect, @NonNull Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean is90or270(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException(g0.c("Invalid rotation degrees: ", i10));
    }

    public static boolean isAspectRatioMatchingWithRoundingError(@NonNull Size size, boolean z10, @NonNull Size size2, boolean z11) {
        float width;
        float width2;
        float width3;
        float f6;
        if (z10) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z11) {
            width3 = size2.getWidth() / size2.getHeight();
            f6 = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f6 = width4;
        }
        return width >= width3 && f6 >= width2;
    }

    public static float max(float f6, float f10, float f11, float f12) {
        return Math.max(Math.max(f6, f10), Math.max(f11, f12));
    }

    public static float min(float f6, float f10, float f11, float f12) {
        return Math.min(Math.min(f6, f10), Math.min(f11, f12));
    }

    @NonNull
    public static Size rectToSize(@NonNull Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    @NonNull
    public static String rectToString(@NonNull Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    @NonNull
    public static float[] rectToVertices(@NonNull RectF rectF) {
        float f6 = rectF.left;
        float f10 = rectF.top;
        float f11 = rectF.right;
        float f12 = rectF.bottom;
        return new float[]{f6, f10, f11, f10, f11, f12, f6, f12};
    }

    @NonNull
    public static Size reverseSize(@NonNull Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    @NonNull
    public static Size rotateSize(@NonNull Size size, int i10) {
        Preconditions.checkArgument(i10 % 90 == 0, "Invalid rotation degrees: " + i10);
        return is90or270(within360(i10)) ? reverseSize(size) : size;
    }

    @NonNull
    public static Rect sizeToRect(@NonNull Size size) {
        return sizeToRect(size, 0, 0);
    }

    @NonNull
    public static RectF sizeToRectF(@NonNull Size size) {
        return sizeToRectF(size, 0, 0);
    }

    @NonNull
    public static float[] sizeToVertices(@NonNull Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    @NonNull
    public static Matrix updateSensorToBufferTransform(@NonNull Matrix matrix, @NonNull Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    @NonNull
    public static RectF verticesToRect(@NonNull float[] fArr) {
        return new RectF(min(fArr[0], fArr[2], fArr[4], fArr[6]), min(fArr[1], fArr[3], fArr[5], fArr[7]), max(fArr[0], fArr[2], fArr[4], fArr[6]), max(fArr[1], fArr[3], fArr[5], fArr[7]));
    }

    public static int within360(int i10) {
        return ((i10 % 360) + 360) % 360;
    }

    @NonNull
    public static Matrix getNormalizedToBuffer(@NonNull RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    @NonNull
    public static Matrix getRectToRect(@NonNull RectF rectF, @NonNull RectF rectF2, int i10, boolean z10) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i10);
        if (z10) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(getNormalizedToBuffer(rectF2));
        return matrix;
    }

    @NonNull
    public static Rect sizeToRect(@NonNull Size size, int i10, int i11) {
        return new Rect(i10, i11, size.getWidth() + i10, size.getHeight() + i11);
    }

    @NonNull
    public static RectF sizeToRectF(@NonNull Size size, int i10, int i11) {
        return new RectF(i10, i11, size.getWidth() + i10, size.getHeight() + i11);
    }
}
