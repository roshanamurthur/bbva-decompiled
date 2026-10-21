package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ScatterMapKt;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class DeterminateDrawable<S extends BaseProgressIndicatorSpec> extends c {
    public static final a K0 = new a("indicatorLevel");
    public final DrawingDelegate<S> F0;
    public final SpringForce G0;
    public final SpringAnimation H0;
    public final DrawingDelegate.ActiveIndicator I0;
    public boolean J0;

    public class a extends FloatPropertyCompat<DeterminateDrawable<?>> {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(DeterminateDrawable<?> determinateDrawable) {
            return determinateDrawable.I0.f45036b * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(DeterminateDrawable<?> determinateDrawable, float f6) {
            DeterminateDrawable<?> determinateDrawable2 = determinateDrawable;
            a aVar = DeterminateDrawable.K0;
            determinateDrawable2.I0.f45036b = f6 / 10000.0f;
            determinateDrawable2.invalidateSelf();
        }
    }

    public DeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate) {
        super(context, baseProgressIndicatorSpec);
        this.J0 = false;
        this.F0 = drawingDelegate;
        this.I0 = new DrawingDelegate.ActiveIndicator();
        SpringForce springForce = new SpringForce();
        this.G0 = springForce;
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, K0);
        this.H0 = springAnimation;
        springAnimation.setSpring(springForce);
        if (this.f45063w0 != 1.0f) {
            this.f45063w0 = 1.0f;
            invalidateSelf();
        }
    }

    @NonNull
    public static DeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, circularProgressIndicatorSpec, new com.google.android.material.progressindicator.a(circularProgressIndicatorSpec));
    }

    @NonNull
    public static DeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new DeterminateDrawable<>(context, linearProgressIndicatorSpec, new e(linearProgressIndicatorSpec));
    }

    public void addSpringAnimationEndListener(@NonNull DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.H0.addEndListener(onAnimationEndListener);
    }

    @Override // com.google.android.material.progressindicator.c
    public final boolean c(boolean z10, boolean z11, boolean z12) {
        boolean zC = super.c(z10, z11, z12);
        float systemAnimatorDurationScale = this.f45059r0.getSystemAnimatorDurationScale(this.f45057p0.getContentResolver());
        if (systemAnimatorDurationScale == 0.0f) {
            this.J0 = true;
        } else {
            this.J0 = false;
            this.G0.setStiffness(50.0f / systemAnimatorDurationScale);
        }
        return zC;
    }

    @Override // com.google.android.material.progressindicator.c, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            DrawingDelegate<S> drawingDelegate = this.F0;
            Rect bounds = getBounds();
            float fB = b();
            boolean zIsShowing = isShowing();
            boolean zIsHiding = isHiding();
            drawingDelegate.f45034a.a();
            drawingDelegate.a(canvas, bounds, fB, zIsShowing, zIsHiding);
            Paint paint = this.f45064x0;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f45058q0;
            int i10 = baseProgressIndicatorSpec.indicatorColors[0];
            DrawingDelegate.ActiveIndicator activeIndicator = this.I0;
            activeIndicator.f45037c = i10;
            int iClamp = baseProgressIndicatorSpec.indicatorTrackGapSize;
            if (iClamp > 0) {
                if (!(this.F0 instanceof e)) {
                    iClamp = (int) ((MathUtils.clamp(activeIndicator.f45036b, 0.0f, 0.01f) * iClamp) / 0.01f);
                }
                this.F0.d(canvas, paint, activeIndicator.f45036b, 1.0f, baseProgressIndicatorSpec.trackColor, getAlpha(), iClamp);
            } else {
                this.F0.d(canvas, paint, 0.0f, 1.0f, baseProgressIndicatorSpec.trackColor, getAlpha(), 0);
            }
            this.F0.c(canvas, paint, activeIndicator, getAlpha());
            this.F0.b(canvas, paint, baseProgressIndicatorSpec.indicatorColors[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.F0.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.F0.f();
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.H0.skipToEnd();
        this.I0.f45036b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        boolean z10 = this.J0;
        DrawingDelegate.ActiveIndicator activeIndicator = this.I0;
        SpringAnimation springAnimation = this.H0;
        if (!z10) {
            springAnimation.setStartValue(activeIndicator.f45036b * 10000.0f);
            springAnimation.animateToFinalPosition(i10);
            return true;
        }
        springAnimation.skipToEnd();
        activeIndicator.f45036b = i10 / 10000.0f;
        invalidateSelf();
        return true;
    }

    @Override // com.google.android.material.progressindicator.c, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    public void removeSpringAnimationEndListener(@NonNull DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.H0.removeEndListener(onAnimationEndListener);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.c, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.c
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11, boolean z12) {
        return super.setVisible(z10, z11, z12);
    }
}
