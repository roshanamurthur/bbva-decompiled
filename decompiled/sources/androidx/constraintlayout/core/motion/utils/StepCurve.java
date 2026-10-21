package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class StepCurve extends Easing {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MonotonicCurveFit f18911c;

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d2) {
        return this.f18911c.getPos(d2, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d2) {
        return this.f18911c.getSlope(d2, 0);
    }
}
