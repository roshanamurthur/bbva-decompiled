package pe;

import android.graphics.RectF;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.camera.camera2.internal.compat.u;

/* JADX INFO: compiled from: TransitionUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f92677a = new RectF();

    public static View a(@IdRes int i10, View view) {
        String resourceName = view.getResources().getResourceName(i10);
        while (view != null) {
            if (view.getId() != i10) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(u.f(resourceName, " is not a valid ancestor"));
    }

    public static RectF b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new RectF(i10, i11, view.getWidth() + i10, view.getHeight() + i11);
    }

    public static float c(float f6, float f10, float f11) {
        return androidx.datastore.preferences.protobuf.e.a(f10, f6, f11, f6);
    }

    public static float d(float f6, float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @FloatRange(from = 0.0d) float f13, boolean z10) {
        if (z10 && (f13 < 0.0f || f13 > 1.0f)) {
            return c(f6, f10, f13);
        }
        if (f13 < f11) {
            return f6;
        }
        return f13 > f12 ? f10 : c(f6, f10, (f13 - f11) / (f12 - f11));
    }

    public static int e(@FloatRange(from = 0.0d, to = 1.0d) float f6, int i10, int i11, @FloatRange(from = 0.0d, to = 1.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        if (f11 < f6) {
            return i10;
        }
        return f11 > f10 ? i11 : (int) c(i10, i11, (f11 - f6) / (f10 - f6));
    }
}
