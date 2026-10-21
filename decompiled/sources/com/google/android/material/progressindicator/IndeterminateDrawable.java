package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ScatterMapKt;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.R;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends c {
    public final DrawingDelegate<S> F0;
    public d<ObjectAnimator> G0;
    public Drawable H0;

    public IndeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate, @NonNull d<ObjectAnimator> dVar) {
        super(context, baseProgressIndicatorSpec);
        this.F0 = drawingDelegate;
        this.G0 = dVar;
        dVar.f45066a = this;
    }

    @NonNull
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawable = new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, new a(circularProgressIndicatorSpec), new b(circularProgressIndicatorSpec));
        indeterminateDrawable.setStaticDummyDrawable(VectorDrawableCompat.create(context.getResources(), R.drawable.indeterminate_static, null));
        return indeterminateDrawable;
    }

    @NonNull
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, new e(linearProgressIndicatorSpec), linearProgressIndicatorSpec.indeterminateAnimationType == 0 ? new f(linearProgressIndicatorSpec) : new g(context, linearProgressIndicatorSpec));
    }

    @Override // com.google.android.material.progressindicator.c
    public final boolean c(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean zC = super.c(z10, z11, z12);
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f45059r0;
        if (animatorDurationScaleProvider != null && animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.f45057p0.getContentResolver()) == 0.0f && (drawable = this.H0) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.G0.a();
        }
        if (z10 && z12) {
            this.G0.f();
        }
        return zC;
    }

    @Override // com.google.android.material.progressindicator.c, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            AnimatorDurationScaleProvider animatorDurationScaleProvider = this.f45059r0;
            boolean z10 = animatorDurationScaleProvider != null && animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.f45057p0.getContentResolver()) == 0.0f;
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.f45058q0;
            if (z10 && (drawable = this.H0) != null) {
                drawable.setBounds(getBounds());
                DrawableCompat.setTint(this.H0, baseProgressIndicatorSpec.indicatorColors[0]);
                this.H0.draw(canvas);
                return;
            }
            canvas.save();
            DrawingDelegate<S> drawingDelegate = this.F0;
            Rect bounds = getBounds();
            float fB = b();
            boolean zIsShowing = isShowing();
            boolean zIsHiding = isHiding();
            drawingDelegate.f45034a.a();
            drawingDelegate.a(canvas, bounds, fB, zIsShowing, zIsHiding);
            int i10 = baseProgressIndicatorSpec.indicatorTrackGapSize;
            int alpha = getAlpha();
            Paint paint = this.f45064x0;
            if (i10 == 0) {
                this.F0.d(canvas, paint, 0.0f, 1.0f, baseProgressIndicatorSpec.trackColor, alpha, 0);
            } else {
                DrawingDelegate.ActiveIndicator activeIndicator = (DrawingDelegate.ActiveIndicator) this.G0.f45067b.get(0);
                DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) androidx.appcompat.view.menu.b.b(this.G0.f45067b, 1);
                DrawingDelegate<S> drawingDelegate2 = this.F0;
                if (drawingDelegate2 instanceof e) {
                    drawingDelegate2.d(canvas, paint, 0.0f, activeIndicator.f45035a, baseProgressIndicatorSpec.trackColor, alpha, i10);
                    this.F0.d(canvas, paint, activeIndicator2.f45036b, 1.0f, baseProgressIndicatorSpec.trackColor, alpha, i10);
                } else {
                    alpha = 0;
                    drawingDelegate2.d(canvas, paint, activeIndicator2.f45036b, activeIndicator.f45035a + 1.0f, baseProgressIndicatorSpec.trackColor, 0, i10);
                }
            }
            for (int i11 = 0; i11 < this.G0.f45067b.size(); i11++) {
                DrawingDelegate.ActiveIndicator activeIndicator3 = (DrawingDelegate.ActiveIndicator) this.G0.f45067b.get(i11);
                this.F0.c(canvas, paint, activeIndicator3, getAlpha());
                if (i11 > 0 && i10 > 0) {
                    this.F0.d(canvas, paint, ((DrawingDelegate.ActiveIndicator) this.G0.f45067b.get(i11 - 1)).f45036b, activeIndicator3.f45035a, baseProgressIndicatorSpec.trackColor, alpha, i10);
                }
            }
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

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Drawable getStaticDummyDrawable() {
        return this.H0;
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

    @Override // com.google.android.material.progressindicator.c, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setStaticDummyDrawable(@Nullable Drawable drawable) {
        this.H0 = drawable;
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
