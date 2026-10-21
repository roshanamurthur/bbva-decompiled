package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AutoScrollHelper implements View.OnTouchListener {
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    public static final int L0 = ViewConfiguration.getTapTimeout();
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    public final float[] E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final a f20414p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AccelerateInterpolator f20415q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final View f20416r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f20417s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final float[] f20418t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final float[] f20419u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f20420w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final float[] f20421x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final float[] f20422y0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f20425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f20426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f20428f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f20429g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f20430h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20431i;

        public final float a(long j10) {
            long j11 = this.f20427e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f20429g;
            if (j12 < 0 || j10 < j12) {
                return AutoScrollHelper.b((j10 - j11) / this.f20423a, 0.0f, 1.0f) * 0.5f;
            }
            float f6 = this.f20430h;
            return (AutoScrollHelper.b((j10 - j12) / this.f20431i, 0.0f, 1.0f) * f6) + (1.0f - f6);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AutoScrollHelper autoScrollHelper = AutoScrollHelper.this;
            if (autoScrollHelper.I0) {
                boolean z10 = autoScrollHelper.G0;
                a aVar = autoScrollHelper.f20414p0;
                if (z10) {
                    autoScrollHelper.G0 = false;
                    aVar.getClass();
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f20427e = jCurrentAnimationTimeMillis;
                    aVar.f20429g = -1L;
                    aVar.f20428f = jCurrentAnimationTimeMillis;
                    aVar.f20430h = 0.5f;
                }
                if ((aVar.f20429g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f20429g + ((long) aVar.f20431i)) || !autoScrollHelper.e()) {
                    autoScrollHelper.I0 = false;
                    return;
                }
                boolean z11 = autoScrollHelper.H0;
                View view = autoScrollHelper.f20416r0;
                if (z11) {
                    autoScrollHelper.H0 = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (aVar.f20428f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = aVar.a(jCurrentAnimationTimeMillis2);
                long j10 = jCurrentAnimationTimeMillis2 - aVar.f20428f;
                aVar.f20428f = jCurrentAnimationTimeMillis2;
                float f6 = j10 * ((fA * 4.0f) + ((-4.0f) * fA * fA));
                autoScrollHelper.scrollTargetBy((int) (aVar.f20425c * f6), (int) (f6 * aVar.f20426d));
                ViewCompat.postOnAnimation(view, this);
            }
        }
    }

    public AutoScrollHelper(@NonNull View view) {
        a aVar = new a();
        aVar.f20427e = Long.MIN_VALUE;
        aVar.f20429g = -1L;
        aVar.f20428f = 0L;
        this.f20414p0 = aVar;
        this.f20415q0 = new AccelerateInterpolator();
        this.f20418t0 = new float[]{0.0f, 0.0f};
        this.f20419u0 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f20421x0 = new float[]{0.0f, 0.0f};
        this.f20422y0 = new float[]{0.0f, 0.0f};
        this.E0 = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f20416r0 = view;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = (int) ((1575.0f * f6) + 0.5f);
        setMaximumVelocity(f10, f10);
        float f11 = (int) ((f6 * 315.0f) + 0.5f);
        setMinimumVelocity(f11, f11);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(L0);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    public static float b(float f6, float f10, float f11) {
        if (f6 > f11) {
            return f11;
        }
        return f6 < f10 ? f10 : f6;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f6, float f10, float f11, int i10) {
        float fB;
        float interpolation;
        float fB2 = b(this.f20418t0[i10] * f10, 0.0f, this.f20419u0[i10]);
        float fC = c(f10 - f6, fB2) - c(f6, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f20415q0;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f12 = this.f20421x0[i10];
            float f13 = this.f20422y0[i10];
            float f14 = this.E0[i10];
            float f15 = f12 * f11;
            return fB > 0.0f ? b(fB * f15, f13, f14) : -b((-fB) * f15, f13, f14);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f16 = this.f20421x0[i10];
        float f17 = this.f20422y0[i10];
        float f18 = this.E0[i10];
        float f19 = f16 * f11;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f6, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.v0;
        if (i10 == 0 || i10 == 1) {
            if (f6 < f10) {
                if (f6 >= 0.0f) {
                    return 1.0f - (f6 / f10);
                }
                if (this.I0 && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f6 < 0.0f) {
            return f6 / (-f10);
        }
        return 0.0f;
    }

    public abstract boolean canTargetScrollHorizontally(int i10);

    public abstract boolean canTargetScrollVertically(int i10);

    public final void d() {
        int i10 = 0;
        if (this.G0) {
            this.I0 = false;
            return;
        }
        a aVar = this.f20414p0;
        aVar.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f20427e);
        int i12 = aVar.f20424b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f20431i = i10;
        aVar.f20430h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f20429g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        a aVar = this.f20414p0;
        float f6 = aVar.f20426d;
        int iAbs = (int) (f6 / Math.abs(f6));
        float f10 = aVar.f20425c;
        int iAbs2 = (int) (f10 / Math.abs(f10));
        return (iAbs != 0 && canTargetScrollVertically(iAbs)) || (iAbs2 != 0 && canTargetScrollHorizontally(iAbs2));
    }

    public boolean isEnabled() {
        return this.J0;
    }

    public boolean isExclusive() {
        return this.K0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        if (!this.J0) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    d();
                }
            }
            return this.K0 && this.I0;
        }
        this.H0 = true;
        this.F0 = false;
        float x4 = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.f20416r0;
        float fA = a(x4, width, view2.getWidth(), 0);
        float fA2 = a(motionEvent.getY(), view.getHeight(), view2.getHeight(), 1);
        a aVar = this.f20414p0;
        aVar.f20425c = fA;
        aVar.f20426d = fA2;
        if (!this.I0 && e()) {
            if (this.f20417s0 == null) {
                this.f20417s0 = new b();
            }
            this.I0 = true;
            this.G0 = true;
            if (this.F0 || (i10 = this.f20420w0) <= 0) {
                this.f20417s0.run();
            } else {
                ViewCompat.postOnAnimationDelayed(view2, this.f20417s0, i10);
            }
            this.F0 = true;
        }
        if (this.K0) {
            return false;
        }
    }

    public abstract void scrollTargetBy(int i10, int i11);

    @NonNull
    public AutoScrollHelper setActivationDelay(int i10) {
        this.f20420w0 = i10;
        return this;
    }

    @NonNull
    public AutoScrollHelper setEdgeType(int i10) {
        this.v0 = i10;
        return this;
    }

    public AutoScrollHelper setEnabled(boolean z10) {
        if (this.J0 && !z10) {
            d();
        }
        this.J0 = z10;
        return this;
    }

    public AutoScrollHelper setExclusive(boolean z10) {
        this.K0 = z10;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumEdges(float f6, float f10) {
        float[] fArr = this.f20419u0;
        fArr[0] = f6;
        fArr[1] = f10;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMaximumVelocity(float f6, float f10) {
        float[] fArr = this.E0;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setMinimumVelocity(float f6, float f10) {
        float[] fArr = this.f20422y0;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampDownDuration(int i10) {
        this.f20414p0.f20424b = i10;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRampUpDuration(int i10) {
        this.f20414p0.f20423a = i10;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeEdges(float f6, float f10) {
        float[] fArr = this.f20418t0;
        fArr[0] = f6;
        fArr[1] = f10;
        return this;
    }

    @NonNull
    public AutoScrollHelper setRelativeVelocity(float f6, float f10) {
        float[] fArr = this.f20421x0;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f10 / 1000.0f;
        return this;
    }
}
