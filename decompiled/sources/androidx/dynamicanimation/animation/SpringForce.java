package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public final class SpringForce {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f21219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f21220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f21222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f21223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f21224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f21225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f21226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f21227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DynamicAnimation.p f21228j;

    public SpringForce() {
        this.f21219a = Math.sqrt(1500.0d);
        this.f21220b = 0.5d;
        this.f21221c = false;
        this.f21227i = Double.MAX_VALUE;
        this.f21228j = new DynamicAnimation.p();
    }

    public final DynamicAnimation.p a(double d2, double d3, long j10) {
        double dCos;
        double dPow;
        if (!this.f21221c) {
            if (this.f21227i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d7 = this.f21220b;
            if (d7 > 1.0d) {
                double d10 = this.f21219a;
                this.f21224f = (Math.sqrt((d7 * d7) - 1.0d) * d10) + ((-d7) * d10);
                double d11 = this.f21220b;
                double d12 = this.f21219a;
                this.f21225g = ((-d11) * d12) - (Math.sqrt((d11 * d11) - 1.0d) * d12);
            } else if (d7 >= 0.0d && d7 < 1.0d) {
                this.f21226h = Math.sqrt(1.0d - (d7 * d7)) * this.f21219a;
            }
            this.f21221c = true;
        }
        double d13 = j10 / 1000.0d;
        double d14 = d2 - this.f21227i;
        double d15 = this.f21220b;
        if (d15 > 1.0d) {
            double d16 = this.f21225g;
            double d17 = this.f21224f;
            double d18 = d14 - (((d16 * d14) - d3) / (d16 - d17));
            double d19 = ((d14 * d16) - d3) / (d16 - d17);
            dPow = (Math.pow(2.718281828459045d, this.f21224f * d13) * d19) + (Math.pow(2.718281828459045d, d16 * d13) * d18);
            double d20 = this.f21225g;
            double dPow2 = Math.pow(2.718281828459045d, d20 * d13) * d18 * d20;
            double d21 = this.f21224f;
            dCos = (Math.pow(2.718281828459045d, d21 * d13) * d19 * d21) + dPow2;
        } else if (d15 == 1.0d) {
            double d22 = this.f21219a;
            double d23 = (d22 * d14) + d3;
            double d24 = (d23 * d13) + d14;
            double dPow3 = Math.pow(2.718281828459045d, (-d22) * d13) * d24;
            double dPow4 = Math.pow(2.718281828459045d, (-this.f21219a) * d13) * d24;
            double d25 = this.f21219a;
            dCos = (Math.pow(2.718281828459045d, (-d25) * d13) * d23) + (dPow4 * (-d25));
            dPow = dPow3;
        } else {
            double d26 = 1.0d / this.f21226h;
            double d27 = this.f21219a;
            double d28 = ((d15 * d27 * d14) + d3) * d26;
            double dSin = ((Math.sin(this.f21226h * d13) * d28) + (Math.cos(this.f21226h * d13) * d14)) * Math.pow(2.718281828459045d, (-d15) * d27 * d13);
            double d29 = this.f21219a;
            double d30 = this.f21220b;
            double d31 = (-d29) * dSin * d30;
            double dPow5 = Math.pow(2.718281828459045d, (-d30) * d29 * d13);
            double d32 = this.f21226h;
            double dSin2 = Math.sin(d32 * d13) * (-d32) * d14;
            double d33 = this.f21226h;
            dCos = (((Math.cos(d33 * d13) * d28 * d33) + dSin2) * dPow5) + d31;
            dPow = dSin;
        }
        float f6 = (float) (dPow + this.f21227i);
        DynamicAnimation.p pVar = this.f21228j;
        pVar.f21210a = f6;
        pVar.f21211b = (float) dCos;
        return pVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f6, float f10) {
        float finalPosition = f6 - getFinalPosition();
        double d2 = this.f21219a;
        return (float) (((-(d2 * d2)) * ((double) finalPosition)) - (((d2 * 2.0d) * this.f21220b) * ((double) f10)));
    }

    public float getDampingRatio() {
        return (float) this.f21220b;
    }

    public float getFinalPosition() {
        return (float) this.f21227i;
    }

    public float getStiffness() {
        double d2 = this.f21219a;
        return (float) (d2 * d2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f6, float f10) {
        return ((double) Math.abs(f10)) < this.f21223e && ((double) Math.abs(f6 - getFinalPosition())) < this.f21222d;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f21220b = f6;
        this.f21221c = false;
        return this;
    }

    public SpringForce setFinalPosition(float f6) {
        this.f21227i = f6;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f21219a = Math.sqrt(f6);
        this.f21221c = false;
        return this;
    }

    public SpringForce(float f6) {
        this.f21219a = Math.sqrt(1500.0d);
        this.f21220b = 0.5d;
        this.f21221c = false;
        this.f21228j = new DynamicAnimation.p();
        this.f21227i = f6;
    }
}
