package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.ShapeableDelegate;
import fe.g;
import w4.q;

/* JADX INFO: loaded from: classes10.dex */
public class MaskableFrameLayout extends FrameLayout implements g, Shapeable {
    public static final /* synthetic */ int v0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f44205p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final RectF f44206q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public OnMaskChangedListener f44207r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public ShapeAppearanceModel f44208s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ShapeableDelegate f44209t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public Boolean f44210u0;

    public MaskableFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public final void b() {
        if (this.f44205p0 != -1.0f) {
            float fLerp = AnimationUtils.lerp(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f44205p0);
            setMaskRectF(new RectF(fLerp, 0.0f, getWidth() - fLerp, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f44209t0.maybeClip(canvas, new hc.a(this));
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.f44206q0;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @NonNull
    public RectF getMaskRectF() {
        return this.f44206q0;
    }

    @Deprecated
    public float getMaskXPercentage() {
        return this.f44205p0;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f44208s0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f44210u0;
        if (bool != null) {
            this.f44209t0.setForceCompatClippingEnabled(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ShapeableDelegate shapeableDelegate = this.f44209t0;
        this.f44210u0 = Boolean.valueOf(shapeableDelegate.isForceCompatClippingEnabled());
        shapeableDelegate.setForceCompatClippingEnabled(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f44205p0 != -1.0f) {
            b();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f44206q0;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z10) {
        this.f44209t0.setForceCompatClippingEnabled(this, z10);
    }

    @Override // fe.g
    public void setMaskRectF(@NonNull RectF rectF) {
        RectF rectF2 = this.f44206q0;
        rectF2.set(rectF);
        this.f44209t0.onMaskChanged(this, rectF2);
        OnMaskChangedListener onMaskChangedListener = this.f44207r0;
        if (onMaskChangedListener != null) {
            onMaskChangedListener.onMaskChanged(rectF2);
        }
    }

    @Deprecated
    public void setMaskXPercentage(float f6) {
        float fClamp = MathUtils.clamp(f6, 0.0f, 1.0f);
        if (this.f44205p0 != fClamp) {
            this.f44205p0 = fClamp;
            b();
        }
    }

    public void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener) {
        this.f44207r0 = onMaskChangedListener;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        ShapeAppearanceModel shapeAppearanceModelWithTransformedCornerSizes = shapeAppearanceModel.withTransformedCornerSizes(new q());
        this.f44208s0 = shapeAppearanceModelWithTransformedCornerSizes;
        this.f44209t0.onShapeAppearanceChanged(this, shapeAppearanceModelWithTransformedCornerSizes);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44205p0 = -1.0f;
        this.f44206q0 = new RectF();
        this.f44209t0 = ShapeableDelegate.create(this);
        this.f44210u0 = null;
        setShapeAppearanceModel(ShapeAppearanceModel.builder(context, attributeSet, i10, 0, 0).build());
    }
}
