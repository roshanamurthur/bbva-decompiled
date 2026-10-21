package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int P0 = 0;
    public final int E0;
    public final float F0;
    public final Paint G0;
    public final RectF H0;

    @Px
    public final int I0;
    public float J0;
    public boolean K0;
    public OnActionUpListener L0;
    public double M0;
    public int N0;
    public int O0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f45723p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeInterpolator f45724q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ValueAnimator f45725r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f45726s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f45727t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f45728u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f45729w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f45730x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final ArrayList f45731y0;

    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0d, to = 360.0d) float f6, boolean z10);
    }

    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, to = 360.0d) float f6, boolean z10);
    }

    public class a extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public final int a(float f6, float f10) {
        int degrees = (int) Math.toDegrees(Math.atan2(f10 - (getHeight() / 2), f6 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    @Dimension
    public final int b(int i10) {
        return i10 == 2 ? Math.round(this.N0 * 0.66f) : this.N0;
    }

    public final void c(@FloatRange(from = 0.0d, to = 360.0d) float f6, boolean z10) {
        float f10 = f6 % 360.0f;
        this.J0 = f10;
        this.M0 = Math.toRadians(f10 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fB = b(this.O0);
        float fCos = (((float) Math.cos(this.M0)) * fB) + width;
        float fSin = (fB * ((float) Math.sin(this.M0))) + height;
        RectF rectF = this.H0;
        float f11 = this.E0;
        rectF.set(fCos - f11, fSin - f11, fCos + f11, fSin + f11);
        Iterator it = this.f45731y0.iterator();
        while (it.hasNext()) {
            ((OnRotateListener) it.next()).onRotate(f10, z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iB = b(this.O0);
        float f6 = width;
        float f10 = iB;
        float fCos = (((float) Math.cos(this.M0)) * f10) + f6;
        float f11 = height;
        float fSin = (f10 * ((float) Math.sin(this.M0))) + f11;
        Paint paint = this.G0;
        paint.setStrokeWidth(0.0f);
        int i10 = this.E0;
        canvas.drawCircle(fCos, fSin, i10, paint);
        double dSin = Math.sin(this.M0);
        double d2 = iB - i10;
        paint.setStrokeWidth(this.I0);
        canvas.drawLine(f6, f11, width + ((int) (Math.cos(this.M0) * d2)), height + ((int) (d2 * dSin)), paint);
        canvas.drawCircle(f6, f11, this.F0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f45725r0.isRunning()) {
            return;
        }
        setHandRotation(this.J0);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        OnActionUpListener onActionUpListener;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y7 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i10 = (int) (x4 - this.f45727t0);
                int i11 = (int) (y7 - this.f45728u0);
                this.v0 = (i11 * i11) + (i10 * i10) > this.f45729w0;
                z12 = this.K0;
                z11 = actionMasked == 1;
                if (this.f45730x0) {
                    this.O0 = MathUtils.dist((float) (getWidth() / 2), (float) (getHeight() / 2), x4, y7) > ((float) b(2)) + ViewUtils.dpToPx(getContext(), 12) ? 1 : 2;
                }
                z10 = false;
            } else {
                z11 = false;
                z10 = false;
                z12 = false;
            }
        } else {
            this.f45727t0 = x4;
            this.f45728u0 = y7;
            this.v0 = true;
            this.K0 = false;
            z10 = true;
            z11 = false;
            z12 = false;
        }
        boolean z14 = this.K0;
        float fA = a(x4, y7);
        boolean z15 = this.J0 != fA;
        if (z10 && z15) {
            z13 = true;
        } else if (z15 || z12) {
            if (z11 && this.f45726s0) {
                z13 = true;
            }
            setHandRotation(fA, z13);
            z13 = true;
        }
        boolean z16 = z13 | z14;
        this.K0 = z16;
        if (z16 && z11 && (onActionUpListener = this.L0) != null) {
            onActionUpListener.onActionUp(a(x4, y7), this.v0);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.f45726s0 = z10;
    }

    public void setCircleRadius(@Dimension int i10) {
        this.N0 = i10;
        invalidate();
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f6) {
        setHandRotation(f6, false);
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.L0 = onActionUpListener;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f6, boolean z10) {
        ValueAnimator valueAnimator = this.f45725r0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            c(f6, false);
            return;
        }
        float f10 = this.J0;
        if (Math.abs(f10 - f6) > 180.0f) {
            if (f10 > 180.0f && f6 < 180.0f) {
                f6 += 360.0f;
            }
            if (f10 < 180.0f && f6 > 180.0f) {
                f10 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f10), Float.valueOf(f6));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.f45723p0);
        valueAnimator.setInterpolator(this.f45724q0);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i10 = ClockHandView.P0;
                ClockHandView clockHandView = this.f45769a;
                clockHandView.getClass();
                clockHandView.c(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new a());
        valueAnimator.start();
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45725r0 = new ValueAnimator();
        this.f45731y0 = new ArrayList();
        Paint paint = new Paint();
        this.G0 = paint;
        this.H0 = new RectF();
        this.O0 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i10, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f45723p0 = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.f45724q0 = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.N0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.I0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.F0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.f45729w0 = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
