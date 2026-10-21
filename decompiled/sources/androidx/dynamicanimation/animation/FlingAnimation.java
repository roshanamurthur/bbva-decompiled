package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;

/* JADX INFO: loaded from: classes2.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    public final a m;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f21213b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f21212a = -4.2f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DynamicAnimation.p f21214c = new DynamicAnimation.p();
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        a aVar = new a();
        this.m = aVar;
        aVar.f21213b = this.f21206j * 0.75f * 62.5f;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final void c(float f6) {
        this.m.f21213b = f6 * 62.5f;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final boolean d(long j10) {
        float f6 = this.f21198b;
        float f10 = this.f21197a;
        float f11 = j10;
        a aVar = this.m;
        double dExp = Math.exp((f11 / 1000.0f) * aVar.f21212a);
        DynamicAnimation.p pVar = aVar.f21214c;
        pVar.f21211b = (float) (dExp * ((double) f10));
        float f12 = aVar.f21212a;
        float f13 = f10 / f12;
        pVar.f21210a = (float) ((Math.exp((f12 * f11) / 1000.0f) * ((double) f13)) + ((double) (f6 - f13)));
        if (Math.abs(pVar.f21211b) < aVar.f21213b) {
            pVar.f21211b = 0.0f;
        }
        float f14 = pVar.f21210a;
        this.f21198b = f14;
        float f15 = pVar.f21211b;
        this.f21197a = f15;
        float f16 = this.f21204h;
        if (f14 < f16) {
            this.f21198b = f16;
            return true;
        }
        float f17 = this.f21203g;
        if (f14 <= f17) {
            return f14 >= f17 || f14 <= f16 || Math.abs(f15) < aVar.f21213b;
        }
        this.f21198b = f17;
        return true;
    }

    public float getFriction() {
        return this.m.f21212a / (-4.2f);
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.m.f21212a = f6 * (-4.2f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMaxValue(float f6) {
        super.setMaxValue(f6);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMinValue(float f6) {
        super.setMinValue(f6);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setStartVelocity(float f6) {
        super.setStartVelocity(f6);
        return this;
    }

    public <K> FlingAnimation(K k10, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k10, floatPropertyCompat);
        a aVar = new a();
        this.m = aVar;
        aVar.f21213b = this.f21206j * 0.75f * 62.5f;
    }
}
