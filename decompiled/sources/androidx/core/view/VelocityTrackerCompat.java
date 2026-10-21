package androidx.core.view;

import android.os.Build;
import android.view.VelocityTracker;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class VelocityTrackerCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface VelocityTrackableMotionEventAxis {
    }

    @RequiresApi(34)
    public static class a {
        @DoNotInline
        public static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }

        @DoNotInline
        public static float b(VelocityTracker velocityTracker, int i10, int i11) {
            return velocityTracker.getAxisVelocity(i10, i11);
        }

        @DoNotInline
        public static boolean c(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.isAxisSupported(i10);
        }
    }

    public static float getAxisVelocity(@NonNull VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        return 0.0f;
    }

    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getXVelocity(i10);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i10) {
        return velocityTracker.getYVelocity(i10);
    }

    public static boolean isAxisSupported(@NonNull VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.c(velocityTracker, i10);
        }
        return i10 == 0 || i10 == 1;
    }

    public static float getAxisVelocity(@NonNull VelocityTracker velocityTracker, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.b(velocityTracker, i10, i11);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity(i11);
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity(i11);
        }
        return 0.0f;
    }
}
