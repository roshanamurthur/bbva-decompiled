package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ScatterMapKt;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c extends Drawable implements Animatable2Compat {
    public static final a E0 = new a(Float.class, "growFraction");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f45057p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BaseProgressIndicatorSpec f45058q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ValueAnimator f45060s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ValueAnimator f45061t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList f45062u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f45063w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @IntRange(from = 0, to = ScatterMapKt.Sentinel)
    public int f45065y0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Paint f45064x0 = new Paint();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AnimatorDurationScaleProvider f45059r0 = new AnimatorDurationScaleProvider();

    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class a extends Property<c, Float> {
        @Override // android.util.Property
        public final Float get(c cVar) {
            return Float.valueOf(cVar.b());
        }

        @Override // android.util.Property
        public final void set(c cVar, Float f6) {
            c cVar2 = cVar;
            float fFloatValue = f6.floatValue();
            if (cVar2.f45063w0 != fFloatValue) {
                cVar2.f45063w0 = fFloatValue;
                cVar2.invalidateSelf();
            }
        }
    }

    public c(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.f45057p0 = context;
        this.f45058q0 = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    public final float b() {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f45058q0;
        if (baseProgressIndicatorSpec.isShowAnimationEnabled() || baseProgressIndicatorSpec.isHideAnimationEnabled()) {
            return this.f45063w0;
        }
        return 1.0f;
    }

    public boolean c(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator = this.f45060s0;
        a aVar = E0;
        if (valueAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.f45060s0 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f45060s0.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ValueAnimator valueAnimator2 = this.f45060s0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f45060s0 = valueAnimator2;
            valueAnimator2.addListener(new le.c(this));
        }
        if (this.f45061t0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f, 0.0f);
            this.f45061t0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f45061t0.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ValueAnimator valueAnimator3 = this.f45061t0;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f45061t0 = valueAnimator3;
            valueAnimator3.addListener(new le.d(this));
        }
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator4 = z10 ? this.f45060s0 : this.f45061t0;
        ValueAnimator valueAnimator5 = z10 ? this.f45061t0 : this.f45060s0;
        if (!z12) {
            if (valueAnimator5.isRunning()) {
                boolean z13 = this.v0;
                this.v0 = true;
                valueAnimator5.cancel();
                this.v0 = z13;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z14 = this.v0;
                this.v0 = true;
                valueAnimator4.end();
                this.v0 = z14;
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator4.isRunning()) {
            return false;
        }
        boolean z15 = !z10 || super.setVisible(z10, false);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f45058q0;
        if (z10 ? baseProgressIndicatorSpec.isShowAnimationEnabled() : baseProgressIndicatorSpec.isHideAnimationEnabled()) {
            if (z11 || !valueAnimator4.isPaused()) {
                valueAnimator4.start();
            } else {
                valueAnimator4.resume();
            }
            return z15;
        }
        boolean z16 = this.v0;
        this.v0 = true;
        valueAnimator4.end();
        this.v0 = z16;
        return z15;
    }

    public void clearAnimationCallbacks() {
        this.f45062u0.clear();
        this.f45062u0 = null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f45065y0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.f45061t0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean isRunning() {
        return isShowing() || isHiding();
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.f45060s0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (this.f45062u0 == null) {
            this.f45062u0 = new ArrayList();
        }
        if (this.f45062u0.contains(animationCallback)) {
            return;
        }
        this.f45062u0.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        this.f45065y0 = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f45064x0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return setVisible(z10, z11, true);
    }

    public void start() {
        c(true, true, false);
    }

    public void stop() {
        c(false, true, false);
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        ArrayList arrayList = this.f45062u0;
        if (arrayList == null || !arrayList.contains(animationCallback)) {
            return false;
        }
        this.f45062u0.remove(animationCallback);
        if (!this.f45062u0.isEmpty()) {
            return true;
        }
        this.f45062u0 = null;
        return true;
    }

    public boolean setVisible(boolean z10, boolean z11, boolean z12) {
        return c(z10, z11, z12 && this.f45059r0.getSystemAnimatorDurationScale(this.f45057p0.getContentResolver()) > 0.0f);
    }
}
