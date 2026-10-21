package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class VelocityMatrix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18961f;

    public void applyTransform(float f6, float f10, int i10, int i11, float[] fArr) {
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = (f6 - 0.5f) * 2.0f;
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = f11 + this.f18958c;
        float f16 = f12 + this.f18959d;
        float f17 = (this.f18956a * f13) + f15;
        float f18 = (this.f18957b * f14) + f16;
        float radians = (float) Math.toRadians(this.f18961f);
        float radians2 = (float) Math.toRadians(this.f18960e);
        double d2 = radians;
        double d3 = i11 * f14;
        float fSin = (((float) ((Math.sin(d2) * ((double) ((-i10) * f13))) - (Math.cos(d2) * d3))) * radians2) + f17;
        float fCos = (radians2 * ((float) ((Math.cos(d2) * ((double) (i10 * f13))) - (Math.sin(d2) * d3)))) + f18;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void clear() {
        this.f18960e = 0.0f;
        this.f18959d = 0.0f;
        this.f18958c = 0.0f;
        this.f18957b = 0.0f;
        this.f18956a = 0.0f;
    }

    public void setRotationVelocity(SplineSet splineSet, float f6) {
        if (splineSet != null) {
            this.f18960e = splineSet.getSlope(f6);
            this.f18961f = splineSet.get(f6);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f6) {
        if (splineSet != null) {
            this.f18956a = splineSet.getSlope(f6);
        }
        if (splineSet2 != null) {
            this.f18957b = splineSet2.getSlope(f6);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f6) {
        if (splineSet != null) {
            this.f18958c = splineSet.getSlope(f6);
        }
        if (splineSet2 != null) {
            this.f18959d = splineSet2.getSlope(f6);
        }
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f6) {
        if (keyCycleOscillator != null) {
            this.f18960e = keyCycleOscillator.getSlope(f6);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f6) {
        if (keyCycleOscillator != null) {
            this.f18956a = keyCycleOscillator.getSlope(f6);
        }
        if (keyCycleOscillator2 != null) {
            this.f18957b = keyCycleOscillator2.getSlope(f6);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f6) {
        if (keyCycleOscillator != null) {
            this.f18958c = keyCycleOscillator.getSlope(f6);
        }
        if (keyCycleOscillator2 != null) {
            this.f18959d = keyCycleOscillator2.getSlope(f6);
        }
    }
}
