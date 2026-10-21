package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f23741a;

    /* JADX INFO: compiled from: TransitionUtils.java */
    @RequiresApi(28)
    public static class a {
        @DoNotInline
        public static Bitmap a(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    /* JADX INFO: compiled from: TransitionUtils.java */
    public static class b implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float[] f23742a = new float[9];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f23743b = new float[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f23744c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f6, Matrix matrix, Matrix matrix2) {
            float[] fArr = this.f23742a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f23743b;
            matrix2.getValues(fArr2);
            for (int i10 = 0; i10 < 9; i10++) {
                float f10 = fArr2[i10];
                float f11 = fArr[i10];
                fArr2[i10] = e.a(f10, f11, f6, f11);
            }
            Matrix matrix3 = this.f23744c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    static {
        f23741a = Build.VERSION.SDK_INT >= 28;
    }
}
