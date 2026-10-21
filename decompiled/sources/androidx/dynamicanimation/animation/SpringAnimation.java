package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes2.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {
    public SpringForce m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f21217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21218o;

    public SpringAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.m = null;
        this.f21217n = Float.MAX_VALUE;
        this.f21218o = false;
    }

    public void animateToFinalPosition(float f6) {
        if (isRunning()) {
            this.f21217n = f6;
            return;
        }
        if (this.m == null) {
            this.m = new SpringForce(f6);
        }
        this.m.setFinalPosition(f6);
        start();
    }

    public boolean canSkipToEnd() {
        return this.m.f21220b > 0.0d;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final boolean d(long j10) {
        if (this.f21218o) {
            float f6 = this.f21217n;
            if (f6 != Float.MAX_VALUE) {
                this.m.setFinalPosition(f6);
                this.f21217n = Float.MAX_VALUE;
            }
            this.f21198b = this.m.getFinalPosition();
            this.f21197a = 0.0f;
            this.f21218o = false;
            return true;
        }
        if (this.f21217n != Float.MAX_VALUE) {
            this.m.getFinalPosition();
            long j11 = j10 / 2;
            DynamicAnimation.p pVarA = this.m.a(this.f21198b, this.f21197a, j11);
            this.m.setFinalPosition(this.f21217n);
            this.f21217n = Float.MAX_VALUE;
            DynamicAnimation.p pVarA2 = this.m.a(pVarA.f21210a, pVarA.f21211b, j11);
            this.f21198b = pVarA2.f21210a;
            this.f21197a = pVarA2.f21211b;
        } else {
            DynamicAnimation.p pVarA3 = this.m.a(this.f21198b, this.f21197a, j10);
            this.f21198b = pVarA3.f21210a;
            this.f21197a = pVarA3.f21211b;
        }
        float fMax = Math.max(this.f21198b, this.f21204h);
        this.f21198b = fMax;
        float fMin = Math.min(fMax, this.f21203g);
        this.f21198b = fMin;
        if (!this.m.isAtEquilibrium(fMin, this.f21197a)) {
            return false;
        }
        this.f21198b = this.m.getFinalPosition();
        this.f21197a = 0.0f;
        return true;
    }

    public SpringForce getSpring() {
        return this.m;
    }

    public SpringAnimation setSpring(SpringForce springForce) {
        this.m = springForce;
        return this;
    }

    public void skipToEnd() {
        if (!canSkipToEnd()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f21202f) {
            this.f21218o = true;
        }
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void start() {
        SpringForce springForce = this.m;
        if (springForce == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double finalPosition = springForce.getFinalPosition();
        if (finalPosition > this.f21203g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (finalPosition < this.f21204h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        SpringForce springForce2 = this.m;
        double d2 = this.f21206j * 0.75f;
        springForce2.getClass();
        double dAbs = Math.abs(d2);
        springForce2.f21222d = dAbs;
        springForce2.f21223e = dAbs * 62.5d;
        super.start();
    }

    public <K> SpringAnimation(K k10, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k10, floatPropertyCompat);
        this.m = null;
        this.f21217n = Float.MAX_VALUE;
        this.f21218o = false;
    }

    public <K> SpringAnimation(K k10, FloatPropertyCompat<K> floatPropertyCompat, float f6) {
        super(k10, floatPropertyCompat);
        this.m = null;
        this.f21217n = Float.MAX_VALUE;
        this.f21218o = false;
        this.m = new SpringForce(f6);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final void c(float f6) {
    }
}
