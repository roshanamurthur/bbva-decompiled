package h3;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ImageViewUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f69312a = true;

    /* JADX INFO: compiled from: ImageViewUtils.java */
    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static void a(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    public static void a(@NonNull ImageView imageView, @Nullable Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (f69312a) {
            try {
                a.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f69312a = false;
            }
        }
    }
}
