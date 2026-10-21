package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class PathInterpolatorCompat {

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static Interpolator a(float f6, float f10) {
            return new PathInterpolator(f6, f10);
        }

        @DoNotInline
        public static Interpolator b(float f6, float f10, float f11, float f12) {
            return new PathInterpolator(f6, f10, f11, f12);
        }

        @DoNotInline
        public static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @NonNull
    public static Interpolator create(@NonNull Path path) {
        return a.c(path);
    }

    @NonNull
    public static Interpolator create(float f6, float f10) {
        return a.a(f6, f10);
    }

    @NonNull
    public static Interpolator create(float f6, float f10, float f11, float f12) {
        return a.b(f6, f10, f11, f12);
    }
}
