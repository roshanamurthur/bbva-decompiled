package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

/* JADX INFO: compiled from: MotionController.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Easing f19592a;

    public c(Easing easing) {
        this.f19592a = easing;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        return (float) this.f19592a.get(f6);
    }
}
