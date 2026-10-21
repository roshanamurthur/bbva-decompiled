package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class MatrixExt {
    private static final float[] sTemp = new float[16];

    private MatrixExt() {
    }

    private static void denormalize(float[] fArr, float f6, float f10) {
        Matrix.translateM(fArr, 0, -f6, -f10, 0.0f);
    }

    private static void normalize(float[] fArr, float f6, float f10) {
        Matrix.translateM(fArr, 0, f6, f10, 0.0f);
    }

    public static void postRotate(@NonNull float[] fArr, float f6, float f10, float f11) {
        float[] fArr2 = sTemp;
        synchronized (fArr2) {
            Matrix.setIdentityM(fArr2, 0);
            normalize(fArr2, f10, f11);
            Matrix.rotateM(fArr2, 0, f6, 0.0f, 0.0f, 1.0f);
            denormalize(fArr2, f10, f11);
            Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    public static void preRotate(@NonNull float[] fArr, float f6, float f10, float f11) {
        normalize(fArr, f10, f11);
        Matrix.rotateM(fArr, 0, f6, 0.0f, 0.0f, 1.0f);
        denormalize(fArr, f10, f11);
    }

    public static void setRotate(@NonNull float[] fArr, float f6, float f10, float f11) {
        Matrix.setIdentityM(fArr, 0);
        preRotate(fArr, f6, f10, f11);
    }

    @NonNull
    public static String toString(@NonNull float[] fArr, int i10) {
        return String.format(Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", Float.valueOf(fArr[i10]), Float.valueOf(fArr[i10 + 4]), Float.valueOf(fArr[i10 + 8]), Float.valueOf(fArr[i10 + 12]), Float.valueOf(fArr[i10 + 1]), Float.valueOf(fArr[i10 + 5]), Float.valueOf(fArr[i10 + 9]), Float.valueOf(fArr[i10 + 13]), Float.valueOf(fArr[i10 + 2]), Float.valueOf(fArr[i10 + 6]), Float.valueOf(fArr[i10 + 10]), Float.valueOf(fArr[i10 + 14]), Float.valueOf(fArr[i10 + 3]), Float.valueOf(fArr[i10 + 7]), Float.valueOf(fArr[i10 + 11]), Float.valueOf(fArr[i10 + 15]));
    }
}
