package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    public static final int HIDE_ESCAPE = 3;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    public static final int I0 = R.style.Widget_MaterialComponents_ProgressIndicator;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    public final a E0;
    public final b F0;
    public final c G0;
    public final d H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final S f45021p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f45022q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f45023r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f45024s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f45025t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f45026u0;
    public long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public AnimatorDurationScaleProvider f45027w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f45028x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f45029y0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ShowAnimationBehavior {
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = BaseProgressIndicator.SHOW_NONE;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f45026u0 > 0) {
                baseProgressIndicator.v0 = SystemClock.uptimeMillis();
            }
            baseProgressIndicator.setVisibility(0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = BaseProgressIndicator.SHOW_NONE;
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            ((com.google.android.material.progressindicator.c) baseProgressIndicator.getCurrentDrawable()).setVisible(false, false, true);
            if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                baseProgressIndicator.setVisibility(4);
            }
            baseProgressIndicator.v0 = -1L;
        }
    }

    public class c extends Animatable2Compat.AnimationCallback {
        public c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setIndeterminate(false);
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f45022q0, baseProgressIndicator.f45023r0);
        }
    }

    public class d extends Animatable2Compat.AnimationCallback {
        public d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (baseProgressIndicator.f45028x0) {
                return;
            }
            baseProgressIndicator.setVisibility(baseProgressIndicator.f45029y0);
        }
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, I0), attributeSet, i10);
        this.v0 = -1L;
        this.f45028x0 = false;
        this.f45029y0 = 4;
        this.E0 = new a();
        this.F0 = new b();
        this.G0 = new c();
        this.H0 = new d();
        Context context2 = getContext();
        this.f45021p0 = (S) a(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.BaseProgressIndicator, i10, i11, new int[0]);
        this.f45025t0 = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.f45026u0 = Math.min(typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.f45027w0 = new AnimatorDurationScaleProvider();
        this.f45024s0 = true;
    }

    @Nullable
    private DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().F0;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().F0;
    }

    public abstract S a(@NonNull Context context, @NonNull AttributeSet attributeSet);

    public void applyNewVisibility(boolean z10) {
        if (this.f45024s0) {
            ((com.google.android.material.progressindicator.c) getCurrentDrawable()).setVisible(b(), false, z10);
        }
    }

    public final boolean b() {
        if (ViewCompat.isAttachedToWindow(this) && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                    }
                } else if (parent instanceof View) {
                    view = (View) parent;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f45021p0.hideAnimationBehavior;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f45021p0.indicatorColors;
    }

    @Px
    public int getIndicatorTrackGapSize() {
        return this.f45021p0.indicatorTrackGapSize;
    }

    public int getShowAnimationBehavior() {
        return this.f45021p0.showAnimationBehavior;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f45021p0.trackColor;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.f45021p0.trackCornerRadius;
    }

    @Px
    public int getTrackThickness() {
        return this.f45021p0.trackThickness;
    }

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.E0);
            return;
        }
        b bVar = this.F0;
        removeCallbacks(bVar);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.v0;
        long j10 = this.f45026u0;
        if (jUptimeMillis >= j10) {
            bVar.run();
        } else {
            postDelayed(bVar, j10 - jUptimeMillis);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().G0.d(this.G0);
        }
        DeterminateDrawable<S> progressDrawable = getProgressDrawable();
        d dVar = this.H0;
        if (progressDrawable != null) {
            getProgressDrawable().registerAnimationCallback(dVar);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(dVar);
        }
        if (b()) {
            if (this.f45026u0 > 0) {
                this.v0 = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.F0);
        removeCallbacks(this.E0);
        ((com.google.android.material.progressindicator.c) getCurrentDrawable()).hideNow();
        IndeterminateDrawable<S> indeterminateDrawable = getIndeterminateDrawable();
        d dVar = this.H0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(dVar);
            getIndeterminateDrawable().G0.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        try {
            DrawingDelegate<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        applyNewVisibility(i10 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        applyNewVisibility(false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.f45027w0 = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f45059r0 = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f45059r0 = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f45021p0.hideAnimationBehavior = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            com.google.android.material.progressindicator.c cVar = (com.google.android.material.progressindicator.c) getCurrentDrawable();
            if (cVar != null) {
                cVar.hideNow();
            }
            super.setIndeterminate(z10);
            com.google.android.material.progressindicator.c cVar2 = (com.google.android.material.progressindicator.c) getCurrentDrawable();
            if (cVar2 != null) {
                cVar2.setVisible(b(), false, false);
            }
            if ((cVar2 instanceof IndeterminateDrawable) && b()) {
                ((IndeterminateDrawable) cVar2).G0.f();
            }
            this.f45028x0 = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof IndeterminateDrawable)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((com.google.android.material.progressindicator.c) drawable).hideNow();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f45021p0.indicatorColors = iArr;
        getIndeterminateDrawable().G0.c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(@Px int i10) {
        S s4 = this.f45021p0;
        if (s4.indicatorTrackGapSize != i10) {
            s4.indicatorTrackGapSize = i10;
            s4.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i10, false);
    }

    public void setProgressCompat(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f45022q0 = i10;
            this.f45023r0 = z10;
            this.f45028x0 = true;
            if (!getIndeterminateDrawable().isVisible() || this.f45027w0.getSystemAnimatorDurationScale(getContext().getContentResolver()) == 0.0f) {
                this.G0.onAnimationEnd(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().G0.e();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof DeterminateDrawable)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.hideNow();
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f45021p0.showAnimationBehavior = i10;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i10) {
        S s4 = this.f45021p0;
        if (s4.trackColor != i10) {
            s4.trackColor = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i10) {
        S s4 = this.f45021p0;
        if (s4.trackCornerRadius != i10) {
            s4.trackCornerRadius = Math.min(i10, s4.trackThickness / 2);
            invalidate();
        }
    }

    public void setTrackThickness(@Px int i10) {
        S s4 = this.f45021p0;
        if (s4.trackThickness != i10) {
            s4.trackThickness = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f45029y0 = i10;
    }

    public void show() {
        a aVar = this.E0;
        int i10 = this.f45025t0;
        if (i10 <= 0) {
            aVar.run();
        } else {
            removeCallbacks(aVar);
            postDelayed(aVar, i10);
        }
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
