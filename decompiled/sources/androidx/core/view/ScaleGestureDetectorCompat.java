package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleGestureDetectorCompat {

    @RequiresApi(19)
    public static class a {
        @DoNotInline
        public static boolean a(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @DoNotInline
        public static void b(ScaleGestureDetector scaleGestureDetector, boolean z10) {
            scaleGestureDetector.setQuickScaleEnabled(z10);
        }
    }

    @Deprecated
    public static boolean isQuickScaleEnabled(Object obj) {
        return isQuickScaleEnabled((ScaleGestureDetector) obj);
    }

    @Deprecated
    public static void setQuickScaleEnabled(Object obj, boolean z10) {
        setQuickScaleEnabled((ScaleGestureDetector) obj, z10);
    }

    public static boolean isQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector) {
        return a.a(scaleGestureDetector);
    }

    public static void setQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector, boolean z10) {
        a.b(scaleGestureDetector, z10);
    }
}
