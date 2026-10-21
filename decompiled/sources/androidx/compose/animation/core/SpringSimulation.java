package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0011J\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J0\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "", "lastDisplacement", "lastVelocity", "getAcceleration", "", "timeElapsed", "Landroidx/compose/animation/core/Motion;", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "updateValues", "a", "F", "getFinalPosition", "()F", "setFinalPosition", "(F)V", "finalPosition", "value", "g", "getDampingRatio", "setDampingRatio", "dampingRatio", "getStiffness", "setStiffness", "stiffness", "<init>", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class SpringSimulation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float finalPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f3047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f3048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f3049f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f3045b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public float dampingRatio = 1.0f;

    public SpringSimulation(float f6) {
        this.finalPosition = f6;
    }

    public final float getAcceleration(float lastDisplacement, float lastVelocity) {
        float f6 = lastDisplacement - this.finalPosition;
        double d2 = this.f3045b;
        return (float) (((-(d2 * d2)) * ((double) f6)) - (((d2 * 2.0d) * ((double) this.dampingRatio)) * ((double) lastVelocity)));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d2 = this.f3045b;
        return (float) (d2 * d2);
    }

    public final void setDampingRatio(float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f6;
        this.f3046c = false;
    }

    public final void setFinalPosition(float f6) {
        this.finalPosition = f6;
    }

    public final void setStiffness(float f6) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f3045b = Math.sqrt(f6);
        this.f3046c = false;
    }

    /* JADX INFO: renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m94updateValuesIJZedt4$animation_core_release(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dCos;
        double dExp;
        if (!this.f3046c) {
            if (this.finalPosition == SpringSimulationKt.getUNSET()) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f6 = this.dampingRatio;
            double d2 = f6;
            double d3 = d2 * d2;
            if (f6 > 1.0f) {
                double d7 = this.f3045b;
                double d10 = d3 - ((double) 1);
                this.f3047d = (Math.sqrt(d10) * d7) + (((double) (-f6)) * d7);
                double d11 = -this.dampingRatio;
                double d12 = this.f3045b;
                this.f3048e = (d11 * d12) - (Math.sqrt(d10) * d12);
            } else if (f6 >= 0.0f && f6 < 1.0f) {
                this.f3049f = Math.sqrt(((double) 1) - d3) * this.f3045b;
            }
            this.f3046c = true;
        }
        float f10 = lastDisplacement - this.finalPosition;
        double d13 = timeElapsed / 1000.0d;
        float f11 = this.dampingRatio;
        if (f11 > 1.0f) {
            double d14 = f10;
            double d15 = this.f3048e;
            double d16 = lastVelocity;
            double d17 = this.f3047d;
            double d18 = d14 - (((d15 * d14) - d16) / (d15 - d17));
            double d19 = ((d14 * d15) - d16) / (d15 - d17);
            dExp = (Math.exp(this.f3047d * d13) * d19) + (Math.exp(d15 * d13) * d18);
            double d20 = this.f3048e;
            double dExp2 = Math.exp(d20 * d13) * d18 * d20;
            double d21 = this.f3047d;
            dCos = (Math.exp(d21 * d13) * d19 * d21) + dExp2;
        } else if (f11 == 1.0f) {
            double d22 = this.f3045b;
            double d23 = f10;
            double d24 = (d22 * d23) + ((double) lastVelocity);
            double d25 = (d24 * d13) + d23;
            dExp = Math.exp((-d22) * d13) * d25;
            double dExp3 = Math.exp((-this.f3045b) * d13) * d25;
            double d26 = this.f3045b;
            dCos = (Math.exp((-d26) * d13) * d24) + (dExp3 * (-d26));
        } else {
            double d27 = ((double) 1) / this.f3049f;
            double d28 = this.f3045b;
            double d29 = f10;
            double d30 = ((((double) f11) * d28 * d29) + ((double) lastVelocity)) * d27;
            double dExp4 = Math.exp(((double) (-f11)) * d28 * d13) * ((Math.sin(this.f3049f * d13) * d30) + (Math.cos(this.f3049f * d13) * d29));
            double d31 = this.f3045b;
            float f12 = this.dampingRatio;
            double d32 = (-d31) * dExp4 * ((double) f12);
            double dExp5 = Math.exp(((double) (-f12)) * d31 * d13);
            double d33 = this.f3049f;
            double dSin = Math.sin(d33 * d13) * (-d33) * d29;
            double d34 = this.f3049f;
            dCos = (((Math.cos(d34 * d13) * d30 * d34) + dSin) * dExp5) + d32;
            dExp = dExp4;
        }
        return SpringSimulationKt.Motion((float) (dExp + ((double) this.finalPosition)), (float) dCos);
    }
}
