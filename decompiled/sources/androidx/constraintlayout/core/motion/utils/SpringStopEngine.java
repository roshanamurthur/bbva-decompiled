package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class SpringStopEngine implements StopEngine {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f18903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f18904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18909h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f18902a = 0.5d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18910i = 0;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f6) {
        return null;
    }

    public float getAcceleration() {
        double d2 = this.f18903b;
        return ((float) (((-d2) * (((double) this.f18906e) - this.f18904c)) - (this.f18902a * ((double) this.f18907f)))) / this.f18908g;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f6) {
        SpringStopEngine springStopEngine;
        float f10;
        SpringStopEngine springStopEngine2 = this;
        double d2 = f6 - springStopEngine2.f18905d;
        if (d2 <= 0.0d) {
            springStopEngine = springStopEngine2;
            f10 = f6;
        } else {
            double d3 = springStopEngine2.f18903b;
            double d7 = springStopEngine2.f18902a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d3 / ((double) springStopEngine2.f18908g)) * d2) * 4.0d)) + 1.0d);
            double d10 = d2 / ((double) iSqrt);
            int i10 = 0;
            while (i10 < iSqrt) {
                float f11 = springStopEngine2.f18906e;
                double d11 = f11;
                double d12 = springStopEngine2.f18904c;
                int i11 = iSqrt;
                int i12 = i10;
                double d13 = (-d3) * (d11 - d12);
                float f12 = springStopEngine2.f18907f;
                double d14 = d3;
                double d15 = f12;
                double d16 = springStopEngine2.f18908g;
                double d17 = ((((d13 - (d7 * d15)) / d16) * d10) / 2.0d) + d15;
                double d18 = ((((-((((d10 * d17) / 2.0d) + d11) - d12)) * d14) - (d17 * d7)) / d16) * d10;
                float f13 = f12 + ((float) d18);
                this.f18907f = f13;
                float f14 = f11 + ((float) (((d18 / 2.0d) + d15) * d10));
                this.f18906e = f14;
                int i13 = this.f18910i;
                if (i13 > 0) {
                    if (f14 < 0.0f && (i13 & 1) == 1) {
                        this.f18906e = -f14;
                        this.f18907f = -f13;
                    }
                    float f15 = this.f18906e;
                    if (f15 > 1.0f && (i13 & 2) == 2) {
                        this.f18906e = 2.0f - f15;
                        this.f18907f = -this.f18907f;
                    }
                }
                i10 = i12 + 1;
                springStopEngine2 = this;
                iSqrt = i11;
                d3 = d14;
            }
            springStopEngine = springStopEngine2;
            f10 = f6;
        }
        springStopEngine.f18905d = f10;
        if (isStopped()) {
            springStopEngine.f18906e = (float) springStopEngine.f18904c;
        }
        return springStopEngine.f18906e;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d2 = ((double) this.f18906e) - this.f18904c;
        double d3 = this.f18903b;
        double d7 = this.f18907f;
        return Math.sqrt((((d3 * d2) * d2) + ((d7 * d7) * ((double) this.f18908g))) / d3) <= ((double) this.f18909h);
    }

    public void springConfig(float f6, float f10, float f11, float f12, float f13, float f14, float f15, int i10) {
        this.f18904c = f10;
        this.f18902a = f14;
        this.f18906e = f6;
        this.f18903b = f13;
        this.f18908g = f12;
        this.f18909h = f15;
        this.f18910i = i10;
        this.f18905d = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f6) {
        return this.f18907f;
    }
}
