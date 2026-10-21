package h3;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ViewUtilsApi21.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public class t extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f69345d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f69346e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f69347f = true;

    /* JADX INFO: compiled from: ViewUtilsApi21.java */
    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        @DoNotInline
        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        @DoNotInline
        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @SuppressLint({"NewApi"})
    public void d(@NonNull View view, @Nullable Matrix matrix) {
        if (f69345d) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f69345d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void e(@NonNull View view, @NonNull Matrix matrix) {
        if (f69346e) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f69346e = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void f(@NonNull View view, @NonNull Matrix matrix) {
        if (f69347f) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f69347f = false;
            }
        }
    }
}
