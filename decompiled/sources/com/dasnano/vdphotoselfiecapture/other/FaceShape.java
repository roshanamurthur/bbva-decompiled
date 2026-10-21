package com.dasnano.vdphotoselfiecapture.other;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class FaceShape extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Paint f39688p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RectF f39689q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Path f39690r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f39691s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f39692t0;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FaceShape.this.invalidate();
        }
    }

    public FaceShape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39688p0 = new Paint();
        this.f39689q0 = null;
        this.f39690r0 = new Path();
        this.f39691s0 = true;
        this.f39692t0 = -1;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        boolean z10 = this.f39691s0;
        Paint paint = this.f39688p0;
        if (z10) {
            canvas.drawOval(this.f39689q0, paint);
            return;
        }
        float fWidth = this.f39689q0.width();
        float f6 = (4.0f * fWidth) / 3.0f;
        float width = (getWidth() - fWidth) / 2.0f;
        float height = (getHeight() - f6) / 2.0f;
        Path path = new Path();
        this.f39690r0 = path;
        float f10 = width + fWidth;
        float f11 = (0.37f * f6) + height;
        path.moveTo(f10, f11);
        float f12 = (0.718f * f6) + height;
        float f13 = height + f6;
        this.f39690r0.cubicTo(f10, f12, (0.776f * fWidth) + width, f13, (0.5f * fWidth) + width, f13);
        this.f39690r0.cubicTo((0.224f * fWidth) + width, f13, width, f12, width, f11);
        float f14 = (f6 * 0.022f) + height;
        this.f39690r0.cubicTo(width, f14, (0.234f * fWidth) + width, height, (0.51f * fWidth) + width, height);
        this.f39690r0.cubicTo((fWidth * 0.786f) + width, height, f10, f14, f10, f11);
        canvas.drawPath(this.f39690r0, paint);
    }

    public int getColor() {
        return this.f39692t0;
    }

    public void setIsFaceShapeOval(boolean z10) {
        this.f39691s0 = z10;
    }

    public void setRect(int i10, Rect rect, int i11) {
        int i12 = this.f39692t0;
        this.f39692t0 = i10;
        Paint paint = this.f39688p0;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((i11 / 1080.0f) * 20.0f);
        this.f39689q0 = new RectF(rect);
        int i13 = this.f39692t0;
        if (i13 != i12 || i13 == -1) {
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(paint, "color", new ArgbEvaluator(), Integer.valueOf(i12), Integer.valueOf(this.f39692t0));
            objectAnimatorOfObject.setDuration(500L);
            objectAnimatorOfObject.addUpdateListener(new a());
            objectAnimatorOfObject.start();
        }
    }
}
