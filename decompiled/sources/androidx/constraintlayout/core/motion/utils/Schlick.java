package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class Schlick extends Easing {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f18893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f18894d;

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d2) {
        double d3 = this.f18894d;
        double d7 = this.f18893c;
        if (d2 < d3) {
            return (d3 * d2) / (((d3 - d2) * d7) + d2);
        }
        return ((d2 - 1.0d) * (1.0d - d3)) / ((1.0d - d2) - ((d3 - d2) * d7));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d2) {
        double d3 = this.f18894d;
        double d7 = this.f18893c;
        if (d2 < d3) {
            double d10 = d7 * d3 * d3;
            double d11 = ((d3 - d2) * d7) + d2;
            return d10 / (d11 * d11);
        }
        double d12 = d3 - 1.0d;
        double d13 = (((d3 - d2) * (-d7)) - d2) + 1.0d;
        return ((d12 * d7) * d12) / (d13 * d13);
    }
}
