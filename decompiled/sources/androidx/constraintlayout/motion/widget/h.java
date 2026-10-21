package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

/* JADX INFO: compiled from: ViewTransition.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Easing f19627a;

    public h(Easing easing) {
        this.f19627a = easing;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        return (float) this.f19627a.get(f6);
    }
}
