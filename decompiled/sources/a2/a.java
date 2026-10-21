package a2;

import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

/* JADX INFO: compiled from: Motion.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements DifferentialInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Easing f165b;

    public a(Easing easing) {
        this.f165b = easing;
    }

    @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
    public final float getInterpolation(float f6) {
        this.f164a = f6;
        return (float) this.f165b.get(f6);
    }

    @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
    public final float getVelocity() {
        return (float) this.f165b.getDiff(this.f164a);
    }
}
